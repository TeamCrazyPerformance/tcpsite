package com.tcp.home.api.domain.exam;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tcp_post_exams_category")
public class PostExamCategory implements Serializable{
    private static final long serialVersionUID = -957843237343545875L;
    
    @Id
    @Column(name="post_exam_category_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long postExamCategoryId;
    
    @Column(name="exam_subject", length=100)
    private String subject;
    
    @Enumerated(EnumType.STRING)
    @Column(name="exam_type")
    private ExamType examType;
    
    @Column(name="exam_professor")
    private String professorName;
    
    @Column(name="exam_grade" , columnDefinition="int default 1")
    private int grade;

    public Long getPostExamCategoryId() {
        return postExamCategoryId;
    }

    public void setPostExamCategoryId(Long postExamCategoryId) {
        this.postExamCategoryId = postExamCategoryId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
