package com.myblog.backend.services;

import com.myblog.backend.entities.PostEntity;
import com.myblog.backend.repositories.PostRepository;
import com.myblog.backend.utils.Date;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void savePostDetail(String heading, String desc, String author){
        PostEntity post = new PostEntity();
        post.setHeading(heading);
        post.setDesc(desc);
        post.setPostDate(date.getSystemDate());
        post.setUpdatedDate(date.getSystemDate());
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


    public void updatePostById(long id,String heading,String desc,String author){
        if(this.repository.existsById(id)){
            PostEntity post = new PostEntity();
            if(heading == null){
                post.setHeading(this.repository.findById(id).get().getHeading());

            }
            post.setId(id);
            post.setDesc(desc);
            post.setPostDate(this.repository.findById(id).get().getPostDate());
            post.setUpdatedDate(date.getSystemDate());
            post.setAuthorName(author);
            System.out.println("updated request" + post);
            this.repository.save(post);

        }
    }
    public void deletePostById(long id){
        this.repository.deleteById(id);
    }

}
