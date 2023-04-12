package com.myblog.backend.services;

import com.myblog.backend.entities.PostEntity;
import com.myblog.backend.repositories.PostRepository;
import com.myblog.backend.utils.Date;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository repository;
    private final Date date;



    public PostService(PostRepository repository,Date date) {
        this.repository = repository;
        this.date = date;



    }

    public void createPostDetail(String category,String heading, String desc,String authorId,String author){
        PostEntity post = new PostEntity();
        post.setCategory(category);
        post.setHeading(heading);
        post.setDesc(desc);
        post.setAuthorId(authorId);
        post.setCreatedDate(date.getSystemDate());
        post.setUpdatedDate(date.getSystemDate());
        post.setPublishDate(date.getSystemDate());
        post.setPublishStatus("T");
        post.setAuthorName(author);
        System.out.println("saved request" + post);
        this.repository.save(post);
    }

   public List<PostEntity> getAllPosts(){
        List<PostEntity> posts = new ArrayList<>();
        this.repository.findAll().forEach(PostEntity ->posts.add(PostEntity));
        return posts;
    }

    public Optional<PostEntity> getPostById(long id){
        return this.repository.findById(id);
    }

    public List<PostEntity> getPostByCategory(String category){
        return this.repository.findByCategory(category);
    }


    public void updatePostById(long id,String category,String heading,String desc,String authorId,String author){
        if(this.repository.existsById(id)){
            PostEntity post = new PostEntity();
            post.setId(id);
            post.setCategory(category);
            post.setHeading(heading);
            post.setDesc(desc);
            post.setCreatedDate(this.repository.findById(id).get().getCreatedDate());
            post.setPublishStatus(this.repository.findById(id).get().getPublishStatus());
            post.setPublishDate(this.repository.findById(id).get().getPublishDate());
            post.setUpdatedDate(date.getSystemDate());
            post.setAuthorId(authorId);
            post.setAuthorName(author);
            System.out.println("updated request" + post);
            this.repository.save(post);

        }
    }
    public void deleteAllPosts() {
        this.repository.deleteAll();
    }
    public void deletePostById(long id){
        this.repository.deleteById(id);
    }


}
