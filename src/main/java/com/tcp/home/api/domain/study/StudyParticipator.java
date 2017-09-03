package com.tcp.home.api.domain.study;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tcp.home.api.domain.member.Members;

/**
 * 
 * <h1>StudyParticipator</h1>
 * <p>
 * <b>Note:</b> This class is defined domain study participator
 * @author dklee
 */
@Entity(name="tcp_study_participator")
public class StudyParticipator implements Serializable{

    private static final long serialVersionUID = -5159930797724983455L;
    
    @Id
    @Column(name="study_part_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long partiId;
    
    @ManyToOne(targetEntity=StudyInfo.class, fetch=FetchType.EAGER)
    @JoinColumn(name="study_info_id", nullable=false)
    private StudyInfo study;
    
    @ManyToOne(targetEntity=Members.class, fetch=FetchType.EAGER)
    @JoinColumn(name="member_id", nullable=false)
    private Members member;
    
    @Enumerated(EnumType.STRING)
    private StudyMemberType memberType;

    public Long getPartiId() {
        return partiId;
    }

    public void setPartiId(Long partiId) {
        this.partiId = partiId;
    }

    public StudyInfo getStudy() {
        return study;
    }

    public void setStudy(StudyInfo study) {
        this.study = study;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
    }

    public StudyMemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(StudyMemberType memberType) {
        this.memberType = memberType;
    }
}
