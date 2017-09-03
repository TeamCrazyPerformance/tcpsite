package com.tcp.home.api.domain.exam;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tcp.home.api.domain.member.Members;

@Entity(name="tcp_post_exams")
public class PostExams implements Serializable{
    private static final long serialVersionUID = -6131595009670837540L;
    
    @Id
    @Column(name="post_exam_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long postExamId;
    
    @ManyToOne(targetEntity=Members.class, fetch=FetchType.EAGER)
    @JoinColumn(name="member_id", nullable=false)
    private Members member;
    
    @ManyToOne(targetEntity=PostExamCategory.class, fetch=FetchType.EAGER)
    @JoinColumn(name="exam_category_id", nullable=false)
    private PostExamCategory examCategory;
    
    @Temporal(TemporalType.DATE)
    @Column(name="exam_generate_date")
    private Date generateDate;
    
    @Column(name="exam_file_paths")
    private String filePaths;

    public Long getPostExamId() {
        return postExamId;
    }

    public void setPostExamId(Long postExamId) {
        this.postExamId = postExamId;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
    }

    public PostExamCategory getExamCategory() {
        return examCategory;
    }

    public void setExamCategory(PostExamCategory examCategory) {
        this.examCategory = examCategory;
    }

    public Date getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
    }

    public String getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(String filePaths) {
        this.filePaths = filePaths;
    }
    
}
