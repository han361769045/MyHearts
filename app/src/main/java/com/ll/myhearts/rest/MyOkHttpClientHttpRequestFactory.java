package com.ll.myhearts.rest;

import android.content.Context;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;

import java.lang.reflect.Field;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;


@EBean(scope = EBean.Scope.Singleton)
public class MyOkHttpClientHttpRequestFactory extends OkHttp3ClientHttpRequestFactory {

    @RootContext
    Context context;

    MyOkHttpClientHttpRequestFactory() {

    }

    @AfterInject
    void afterInject() {
        try {
            Field client = OkHttp3ClientHttpRequestFactory.class.getDeclaredField("client");
            client.setAccessible(true);
            OkHttpClient okHttpClient = new OkHttpClient().newBuilder().sslSocketFactory(MySSLSocketFactory.getSocketFactory(context)).build();
            okHttpClient.newBuilder().proxy(null);
            client.set(this, okHttpClient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setConnectTimeout(30 * 1000);
        this.setReadTimeout(30 * 1000);
        this.setWriteTimeout(30 * 1000);
    }


    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final javax.net.ssl.SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            return builder.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
