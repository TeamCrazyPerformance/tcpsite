package com.tcp.home.api.message.client.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.tcp.home.api.message.client.ClientJsonMessage;
import com.tcp.home.api.message.client.ClientMessageType.ReqValues;

@JsonTypeName(ReqValues.REQ_MEM_REGISTER)
public class ClientMemberRegisterMessage extends ClientJsonMessage{

    @JsonProperty("email")
    private String email;
    
    @JsonProperty("passwd")
    private String passwd;
    
    @JsonProperty("confirmPasswd")
    private String confirmPasswd;
    
    @JsonProperty("mem_name")
    private String name;
    
    @JsonProperty("mem_grade")
    private int grade;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getConfirmPasswd() {
        return confirmPasswd;
    }

    public void setConfirmPasswd(String confirmPasswd) {
        this.confirmPasswd = confirmPasswd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getEmail(), this.getPasswd(), this.getName(),
                this.getConfirmPasswd(), this.getGrade());
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }
        
        ClientMemberRegisterMessage target = (ClientMemberRegisterMessage)obj;

        return Objects.equal(this.getEmail(), target.getEmail()) &&
                Objects.equal(this.getName(), target.getName()) &&
                Objects.equal(this.getGrade(), target.getGrade()) &&
                Objects.equal(this.getPasswd(), target.getPasswd()) &&
                Objects.equal(this.getConfirmPasswd(), target.getConfirmPasswd());
        
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("email", this.getEmail())
                .add("name", this.getName())
                .add("grade", this.getGrade())
                .toString();
    }
}
