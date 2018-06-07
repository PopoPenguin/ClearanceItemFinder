package com.application.exception;

/**
 * created by Jialor Cheung on 6/6/18
 */

public class UnknownException extends WalmartException {

    String errorMsg;

    public UnknownException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "UnkownException{" +
                "errorMsg='" + message + '\'' +
                '}';
    }

}
