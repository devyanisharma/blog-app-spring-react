package com.myblog.backend.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AUTHOR_ID")
    private long id;

    @Column(name="AUTHOR_NAME")
    private String authorName;

    @Column(name = "AUTHOR_MOBILE_NO")
    private int authorMobileNo;

    @Column(name = "AUTHOR_EMAIL")
    private String authorEmail;

    @Column(name = "AUTHOR_PROFESSION")
    private String authorProfession;

    @Column(name = "ACTIVE_STATUS")
    private String activeStatus;

    @Column(name = "CREATED_DATE")
    private String createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorMobileNo() {
        return authorMobileNo;
    }

    public void setAuthorMobileNo(int authorMobileNo) {
        this.authorMobileNo = authorMobileNo;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorProfession() {
        return authorProfession;
    }

    public void setAuthorProfession(String authorProfession) {
        this.authorProfession = authorProfession;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", authorMobileNo=" + authorMobileNo +
                ", authorEmail='" + authorEmail + '\'' +
                ", authorProfession='" + authorProfession + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
