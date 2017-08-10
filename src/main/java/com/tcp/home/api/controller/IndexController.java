package com.tcp.home.api.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${spring.datasource.url}")
    private String dataSource;
    
    @GetMapping(value="/" , produces="application/json")
    public String getTextIndex(HttpServletRequest request) throws UnknownHostException{
        
        StringBuffer returnMessage = new StringBuffer();
        
        returnMessage.append("serverName : ");
        returnMessage.append(request.getServerName());
        returnMessage.append("\n");
        returnMessage.append("serverAddress : ");
        returnMessage.append(InetAddress.getByName(request.getServerName()).getHostAddress());
        returnMessage.append("\n");
        returnMessage.append("DBurl : ");
        returnMessage.append(dataSource);
        returnMessage.append("\n");
        returnMessage.append("CurrentTime : ");
        returnMessage.append(new Date());
        returnMessage.append("\n");
        returnMessage.append("Locale : ");
        returnMessage.append(request.getLocale());
        returnMessage.append("\n");
        returnMessage.append("Content : " + dataSource);
        
        return returnMessage.toString();
    }
}
