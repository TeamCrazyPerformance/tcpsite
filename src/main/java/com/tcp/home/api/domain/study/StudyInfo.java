package com.tcp.home.api.domain.study;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * <h1>StudyInfo </h1>
 * <p>
 * <b>Note: </b><br/>
 * This Class is defines the study information domain<br/>
 * This Table is the basic information of the tcp study
 * @author dklee
 */
@Entity(name="tcp_study_info")
public class StudyInfo implements Serializable{
    private static final long serialVersionUID = -2018332877368287967L;

    @Id
    @Column(name="study_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long studyId;
    
    @Column(name="study_name", nullable=false)
    private String studyName;
    
    @Column(name="study_desc", nullable=true)
    private String desc;
    
    @Enumerated(EnumType.STRING)
    @Column(name="study_class_type", nullable=false)
    private StudyClassType classType;

    @Temporal(TemporalType.DATE)
    @Column(name="study_create_date")
    private Date createDate;
    
    @Column(name="study_recruit_num", nullable=false)
    private int recruitNum;

    public long getStudyId() {
        return studyId;
    }

    public void setStudyId(long studyId) {
        this.studyId = studyId;
    }

    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudyClassType getClassType() {
        return classType;
    }

    public void setClassType(StudyClassType classType) {
        this.classType = classType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getRecruitNum() {
        return recruitNum;
    }

    public void setRecruitNum(int recruitNum) {
        this.recruitNum = recruitNum;
    }
}
