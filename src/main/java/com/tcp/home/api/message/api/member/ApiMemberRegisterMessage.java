package com.tcp.home.api.message.api.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.tcp.home.api.message.api.ApiJsonMessage;
import com.tcp.home.api.message.api.MessageType.Values;

/**
 * 
 * <h1>ApiMemberRegisterMessage</h1>
 * <p>
 * <b>Note: This message is for a post-processing </b><br/>
 * response when a client request a register message 
 * @author dklee
 */
@JsonTypeName(Values.MEMBER_REGISTER)
public class ApiMemberRegisterMessage extends ApiJsonMessage{

    @JsonProperty("userId")
    private long userId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        
        ApiMemberRegisterMessage target = (ApiMemberRegisterMessage)obj;
        
        return Objects.equal(this.getUserId(), target.getUserId());
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getUserId());
    }
    
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userId", getUserId())
                .toString();
    }
}
