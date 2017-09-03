package com.tcp.home.api.domain.member;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="tcp_members")
public class Members implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="mem_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long memberId;
    
    @Column(name="mem_name", length = 50, nullable=false)
    private String memberName;

    @Column(name="mem_email", length=100, nullable=false)
    private String email;
    
    @Column(name="mem_passwd")
    private String password;
    
    @Column(name="mem_nickname", nullable=false)
    private String nickName;
    
    @Column(name="mem_image_path")
    private String profileImagePath;
    
    @Temporal(TemporalType.DATE)
    @Column(name="mem_birth")
    private Date birth;
    
    @Column(name="subscription" , columnDefinition="int default 0")
    private int subscription;
    
    @Temporal(TemporalType.DATE)
    @Column(name="mem_reg_date", nullable=false)
    private Date regDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name="mem_mod_date", nullable=false)
    private Date modDate;
    
    @Column(name="mem_phone", nullable=true)
    private String phone;
    
    @Column(name="student_id", nullable=true)
    private int studentId;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
