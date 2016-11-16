package com.ll.myhearts.model;

/**
 * Created by Leo on 2015/3/9.
 */

import java.lang.reflect.Type;

/**
 * 无返回数据的操作结果类
 */
public class BaseModel {

    private int errorCode = -1;

    private String errorStr;

    private int resultCount;

    private int score;

    private double balance;

    private Type mType;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorStr() {
        return errorStr;
    }

    public void setErrorStr(String errorStr) {
        this.errorStr = errorStr;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Type getType() {
        return mType;
    }

    public void setType(Type type) {
        mType = type;
    }
}
