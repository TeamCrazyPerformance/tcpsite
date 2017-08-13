package com.tcp.home.api.constants;

/**
 * 
 * <h1>RequstUrls</h1>
 * <p>
 * <b>Note: This class defines a api request url lists </b><br/>
 * <b>all request url defined as a static and feature domain </b><br/>
 * <b>Please fill out the REST API rules</b> 
 * @author dklee
 */
public class RequestUrls {

    public static final String TCP_MEMBER_REGISTER="/api/tcphome/members"; //POST
    public static final String TCP_MEMBER_OAUTH="/api/tcphome/members/oauth"; //POST
    public static final String TCP_MEMBER_LOGIN="/api/tcphome/members/login"; //GET
    public static final String TCP_MEMBER_FINDPASSWD="/api/tcphome/members/find/{email}"; //GET
    
    public static final String TCP_STUDY_GENERATE="/api/tcphome/study"; //POST
    public static final String TCP_STUDY_ACHIEVE="/api/tcphome/study"; //PUT
    public static final String TCP_STUDY_UPDATE="/api/tcphome/study/{studyId}";//PUT
    public static final String TCP_STUDY_INVITE_MEMBER="/api/tcphome/study/invite/{studyId}";//PUT
    
    public static final String TCP_MYINFO_UPDATE="/api/tcphome/myInfo/{memId}";//PUT
    
    //TODO: MYINFO request url for portfolio
    
    //TODO: domain admin request url 
    
    //TODO: domain exam request url
    
    //TODO: domain board request url
    
}
