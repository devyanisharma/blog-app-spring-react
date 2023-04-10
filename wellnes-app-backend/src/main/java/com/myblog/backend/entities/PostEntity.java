package com.myblog.backend.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Entity
public class PostEntity {
    @Column(name = "POST_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "POST_HEADING")
    private String heading;

    @Column(name = "POST_DESC")
    private String desc;


    @Column(name = "POST_DATE")
    private String postDate;

    @Column(name = "UPDATED_DATE")
    private String updatedDate;

    @Column(name="POST_AUTHOR")
    private String authorName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", desc='" + desc + '\'' +
                ", postDate=" + postDate +
                ", updatedDate=" + updatedDate +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
