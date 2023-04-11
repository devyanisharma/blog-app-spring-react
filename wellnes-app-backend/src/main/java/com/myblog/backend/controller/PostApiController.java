package com.myblog.backend.controller;

import com.myblog.backend.services.PostService;
import com.myblog.backend.entities.PostEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Posts")
public class PostApiController {
    private final PostService service;

    public PostApiController(PostService service) {
        this.service = service;
    }

    @PostMapping(path="/Create")
    public void CreatePost(@RequestParam("category") String category,
                           @RequestParam("heading") String heading,
                           @RequestParam("desc") String desc,
                           @RequestParam("author") String author){
        this.service.createPostDetail(category,heading,desc,author);

    }
     @GetMapping
    public List<PostEntity> getAllPosts(){
       return this.service.getAllPosts();
     }

     @GetMapping(path = "/{id}")
    public Optional<PostEntity> getPostById(@PathVariable (name = "id") long id){
        return this.service.getPostById(id);
     }

     @GetMapping(path="category/{category}")
     public List<PostEntity> getAllPostByCategory(@PathVariable(name="category")String category){
        return this.service.getPostByCategory(category);
     }

     @PutMapping(path="/update/{id}")
    public void updatePostById(@PathVariable(name="id")long id,
                               @RequestParam(value = "category")String category,
                               @RequestParam(value = "heading")String heading ,
                               @RequestParam(value = "desc")String desc,
                               @RequestParam(value = "author")String author){
        this.service.updatePostById(id,category,heading,desc,author);

     }

    @DeleteMapping(path="/delete")
    public void deleteAllPosts(){
        this.service.deleteAllPosts();
    }

    @DeleteMapping(path="/delete/{id}")
        public void deletePostById(@PathVariable(name="id")long id){
        this.service.deletePostById(id);
         }


}
