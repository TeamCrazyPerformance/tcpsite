package com.tcp.home.api.domain.board;

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

@Entity(name="tcp_board_info")
public class BoardInfo implements Serializable{

    private static final long serialVersionUID = 2202913706376169488L;
    
    @Id
    @Column(name="board_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long boardId;
    
    @Column(name="board_title", length=50)
    private String title;
    
    @Column(name="board_description", length=255)
    private String desc;
    
    @Temporal(TemporalType.DATE)
    @Column(name="board_create_date")
    private Date createDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name="board_delete_date")
    private Date deleteDate;
    
    @Column(name="board_subscription", columnDefinition="int default 0")
    private int subscription;

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public int getSubscription() {
        return subscription;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }
}
