package com.myBlog.WellnessApp.Services;

import com.myBlog.WellnessApp.Data.PostEntity;
import com.myBlog.WellnessApp.DataRepository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private final PostRepository repository;


    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public void savePostDetail(String heading, String desc, Date date,String author){
        PostEntity post = new PostEntity();
        post.setHeading(heading);
        post.setDesc(desc);
        post.setPostDate(date);
        post.setAuthorName(author);
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


    public void updatePostById(long id,String heading,String desc,Date date,String author){
        if(this.repository.existsById(id)){

            Optional<PostEntity> post = this.repository.findById(id);
            System.out.println("Update post object" + post);
            post.get().setPostDate(date);
            post.get().setHeading(heading);
            post.get().setDesc(desc);
            post.get().setAuthorName(author);

        }
    }
    public void deletePostById(long id){
        this.repository.deleteById(id);
    }

}
