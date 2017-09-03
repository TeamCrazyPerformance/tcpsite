package com.tcp.home.api.domain.study;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tcp.home.api.domain.board.PostType;
import com.tcp.home.api.domain.member.Members;

@Entity(name="tcp_study_posts")
public class StudyPosts implements Serializable {
    private static final long serialVersionUID = -4077500246846345829L;

    @Id
    @Column(name="study_post_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long postId;
    
    @ManyToOne(targetEntity=StudyInfo.class, fetch=FetchType.EAGER)
    @JoinColumn(name="study_info_id", nullable=false)
    private StudyInfo study;
    
    @ManyToOne(targetEntity=Members.class, fetch=FetchType.EAGER)
    @JoinColumn(name="member_id", nullable=false)
    private Members member;
    
    @Enumerated(EnumType.STRING)
    @Column(name="study_post_type")
    private StudyPostType postType;
    
    @Column(name="post_title")
    private String title;
    
    @Column(name="post_constants")
    private String constants;
    
    @Enumerated(EnumType.STRING)
    @Column(name="post_type")
    private PostType boardType;
    
    @Temporal(TemporalType.DATE)
    @Column(name="post_create_date")
    private Date createDate;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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

    public StudyPostType getPostType() {
        return postType;
    }

    public void setPostType(StudyPostType postType) {
        this.postType = postType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConstants() {
        return constants;
    }

    public void setConstants(String constants) {
        this.constants = constants;
    }

    public PostType getBoardType() {
        return boardType;
    }

    public void setBoardType(PostType boardType) {
        this.boardType = boardType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
