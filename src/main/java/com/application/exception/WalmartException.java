package com.application.exception;

import java.util.Arrays;

/**
 * created by Jialor Cheung on 6/6/18
 */

public class WalmartException extends Exception {

    String[] errors;
    String message;

    public WalmartException(String message, String[] errors) {
        this.errors = errors;
        this.message = message;
    }

    public WalmartException(String message) {
        this.errors = new String[0];
        this.message = message;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WalmartException{" +
                "errors=" + Arrays.toString(errors) +
                ", message='" + message + '\'' +
                '}';
    }
}
