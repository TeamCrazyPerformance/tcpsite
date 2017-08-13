package com.tcp.home.api.exception;

public class MemberException extends RuntimeException{

    private static final long serialVersionUID = 1061919912158221790L;
    
    private String errorMessage;
    
    public MemberException(String message){
        //TODO: need error message format 
        this.errorMessage=message;
    }
}
