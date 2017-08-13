package com.tcp.home.api.controller;

import static com.tcp.home.api.constants.RequestUrls.TCP_MEMBER_REGISTER;

import javax.validation.Valid;

import static com.tcp.home.api.constants.RequestUrls.TCP_MEMBER_FINDPASSWD;
import static com.tcp.home.api.constants.RequestUrls.TCP_MEMBER_LOGIN;
import static com.tcp.home.api.constants.RequestUrls.TCP_MEMBER_OAUTH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcp.home.api.message.api.ApiJsonMessage;
import com.tcp.home.api.message.client.ClientJsonMessage;
import com.tcp.home.api.service.member.MemberService;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;
    
    @PostMapping(produces="application/json", value=TCP_MEMBER_REGISTER)
    public ApiJsonMessage registerUser(@Valid @RequestBody ClientJsonMessage clientRegisterMessage){
        
        return memberService.registerUser(clientRegisterMessage);
    }
   
}
