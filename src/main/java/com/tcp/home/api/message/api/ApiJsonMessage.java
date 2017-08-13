package com.tcp.home.api.message.api;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.tcp.home.api.message.api.MessageType.Values;
import com.tcp.home.api.message.api.member.ApiMemberRegisterMessage;

@JsonTypeInfo(
        use=JsonTypeInfo.Id.NAME,
        include=JsonTypeInfo.As.PROPERTY,
        property="type"
        )
@JsonSubTypes({
    @Type(value=ApiMemberRegisterMessage.class, name=Values.MEMBER_REGISTER)
})
public abstract class ApiJsonMessage {
    
    
}
