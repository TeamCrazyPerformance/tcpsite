package com.tcp.home.api.domain.issue;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="tcp_issues")
public class Issues implements Serializable {
    private static final long serialVersionUID = 8716596354772472173L;
    
    @Id
    @Column(name="issue_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long issueId;
    
    @ManyToOne(targetEntity=IssueCategory.class, fetch=FetchType.EAGER)
    @JoinColumn(name="issue_category_id", nullable=false)
    private IssueCategory issueCategory;
}
