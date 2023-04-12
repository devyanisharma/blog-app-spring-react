package com.myblog.backend.entities;


import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENT_ID")
    private long id;

    @Column(name = "POST_ID")
    private long postId;

    @Column(name= "COMMENT_DESC")
    private String commentDesc;

    @Column(name = "COMMENT_DATE")
    private String commentDate;

    @Column(name= "COMMENTER_NAME")
    private String commenterName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getCommentDesc() {
        return commentDesc;
    }

    public void setCommentDesc(String commentDesc) {
        this.commentDesc = commentDesc;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "id=" + id +
                ", postId=" + postId +
                ", commentDesc='" + commentDesc + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", commenterName='" + commenterName + '\'' +
                '}';
    }
}
