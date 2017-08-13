package com.tcp.home.api.message.api;

public enum MessageType {
    
    REGISTER(Values.MEMBER_REGISTER);
    
    private String type;
    
    private MessageType(String type){
        this.type=type;
    }
    
    public String getType() {
        return type;
    }
    public static class Values{
        public static final String MEMBER_REGISTER="register";
    }
}
