package com.tcp.home.api.message.client;

public enum ClientMessageType {

    REQ_REGISTER(ReqValues.REQ_MEM_REGISTER);
    
    private String type;
    
    private ClientMessageType(String type){
        this.type=type;
    }
    
    public static class ReqValues{
        public static final String REQ_MEM_REGISTER="register";
    }
}
