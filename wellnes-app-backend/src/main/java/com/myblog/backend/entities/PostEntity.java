package com.myblog.backend.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PostEntity {
    @Column(name = "POST_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="CATEGORY")
    private String category;
    @Column(name = "POST_HEADING")
    private String heading;

    @Column(name = "POST_DESC")
    private String desc;

    @Column(name = "AUTHOR_ID")
    private String authorId;
    @Column(name="AUTHOR")
    private String authorName;

    @Column(name = "CREATED_DATE")
    private String createdDate;
    @Column(name = "UPDATED_DATE")
    private String updatedDate;
    @Column(name="PUBLISH_STATUS")
    private String publishStatus;
    @Column(name = "PUBLISH_DATE")
    private String publishDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String postCategory) {
        this.category = postCategory;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", heading='" + heading + '\'' +
                ", desc='" + desc + '\'' +
                ", authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", publishStatus='" + publishStatus + '\'' +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }
}
