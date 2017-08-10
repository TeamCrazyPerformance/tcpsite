package com.tcp.home.api.domain.member;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tcp_members")
public class Members implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="mem_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long memberId;
    
    @Column(name="mem_name", length = 256)
    private String memberName;
    
    @Column(name="mem_grade")
    private int memberGrade;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(int memberGrade) {
        this.memberGrade = memberGrade;
    }
}
