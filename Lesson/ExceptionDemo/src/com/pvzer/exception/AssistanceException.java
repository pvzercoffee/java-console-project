package com.pvzer.exception;

public class AssistanceException extends Exception{
    private String msg;
    public AssistanceException(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "AssistanceException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

