package com.tcp.home.api.domain.board;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tcp.home.api.domain.member.Members;

@Entity(name="tcp_board_reply")
public class BoardReply implements Serializable {

    private static final long serialVersionUID = 4789114357190581939L;
    
    @Id
    @Column(name="reply_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long replyId;
    
    @ManyToOne(targetEntity=BoardInfo.class, fetch=FetchType.EAGER)
    @JoinColumn(name="board_id", nullable=false)
    private BoardInfo board;
    
    @ManyToOne(targetEntity=BoardPosts.class, fetch=FetchType.EAGER)
    @JoinColumn(name="post_id", nullable=false)
    private BoardPosts post;
    
    @ManyToOne(targetEntity=Members.class, fetch=FetchType.EAGER)
    @JoinColumn(name="member_id", nullable=false)
    private Members member;
    
    @Column(name="reply_contents", length=400)
    private String contents;

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public BoardInfo getBoard() {
        return board;
    }

    public void setBoard(BoardInfo board) {
        this.board = board;
    }

    public BoardPosts getPost() {
        return post;
    }

    public void setPost(BoardPosts post) {
        this.post = post;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
