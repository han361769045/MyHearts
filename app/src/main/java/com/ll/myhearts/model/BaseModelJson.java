package com.ll.myhearts.model;

/**
 * Created by Leo on 2015/3/9.
 */

/**
 * 有返回数据的操作结果类
 *
 * @param <T>
 */
public class BaseModelJson<T> extends BaseModel {

    private T results;

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }
}
