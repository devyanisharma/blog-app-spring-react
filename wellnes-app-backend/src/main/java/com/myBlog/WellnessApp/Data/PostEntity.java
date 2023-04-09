package com.myBlog.WellnessApp.Data;

import jakarta.persistence.*;


import java.util.Date;

@Entity
public class PostEntity {
    @Column(name = "POST_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "POST_HEADING")
    private String Heading;

    @Column(name = "POST_DESC")
    private String Desc;

    @Column(name = "POST_DATE")
    private Date PostDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public Date getPostDate() {
        return PostDate;
    }

    public void setPostDate(Date postDate) {
        PostDate = postDate;
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
                ", Heading='" + Heading + '\'' +
                ", Desc='" + Desc + '\'' +
                ", PostDate=" + PostDate +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Column(name="POST_AUTHOR")
    private String authorName;
}
