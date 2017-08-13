package com.tcp.home.api.message.client;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.tcp.home.api.message.client.member.ClientMemberRegisterMessage;

@JsonTypeInfo(
        use=JsonTypeInfo.Id.NAME,
        include=JsonTypeInfo.As.PROPERTY,
        property="type"
        )
@JsonSubTypes({
    @Type(value=ClientMemberRegisterMessage.class, name=ClientMessageType.ReqValues.REQ_MEM_REGISTER)
})
public abstract class ClientJsonMessage {

}
