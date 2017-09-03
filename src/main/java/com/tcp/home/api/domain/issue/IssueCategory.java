package com.tcp.home.api.domain.issue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tcp_issue_category")
public class IssueCategory implements Serializable{
    private static final long serialVersionUID = 10587007292705688L;
    
    @Id
    @Column(name="issue_category_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long categoryId;
    
    @Column(name="issue_field")
    private String field;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
