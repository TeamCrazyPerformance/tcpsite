package com.tcp.home.api.service.member;

import com.tcp.home.api.message.api.ApiJsonMessage;
import com.tcp.home.api.message.client.ClientJsonMessage;

public interface MemberService {

    public ApiJsonMessage registerUser(ClientJsonMessage message);
}
