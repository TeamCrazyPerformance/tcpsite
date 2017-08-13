package com.tcp.home.api.service.member;

import java.io.InvalidClassException;

import org.springframework.stereotype.Service;

import com.tcp.home.api.exception.MemberException;
import com.tcp.home.api.message.api.ApiJsonMessage;
import com.tcp.home.api.message.client.ClientJsonMessage;
import com.tcp.home.api.message.client.member.ClientMemberRegisterMessage;

@Service
public class MemberServiceImpl implements MemberService{

    @Override
    public ApiJsonMessage registerUser(ClientJsonMessage message) {
        
        if(message instanceof ClientMemberRegisterMessage){
            throw new MemberException("This Message not match in process");
        }
        
        //TODO: process for user register 
        
        return null;
    }

}
