package com.tcp.home.api.domain.log;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="tcp_member_log")
public class MemberLog implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="log_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long logId;
    
    @Column(name="log_event_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logEventDate;

    @Column(name="log_message")
    private String logMessage;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Date getLogEventDate() {
        return logEventDate;
    }

    public void setLogEventDate(Date logEventDate) {
        this.logEventDate = logEventDate;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }
}
