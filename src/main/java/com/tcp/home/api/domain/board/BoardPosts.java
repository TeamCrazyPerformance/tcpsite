package com.tcp.home.api.domain.board;

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

import com.tcp.home.api.domain.member.Members;

@Entity(name="tcp_board_posts")
public class BoardPosts implements Serializable{
    private static final long serialVersionUID = 7030868750433543425L;
    
    @Id
    @Column(name="post_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long postId;
    
    @ManyToOne(targetEntity=BoardInfo.class, fetch=FetchType.EAGER)
    @JoinColumn(name="board_id", nullable=false)
    private BoardInfo board;
    
    @ManyToOne(targetEntity=Members.class, fetch=FetchType.EAGER)
    @JoinColumn(name="member_id", nullable=false)
    private Members member;
    
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

    public BoardInfo getBoard() {
        return board;
    }

    public void setBoard(BoardInfo board) {
        this.board = board;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
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
