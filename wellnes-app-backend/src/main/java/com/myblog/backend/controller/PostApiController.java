package com.myblog.backend.controller;

import com.myblog.backend.services.PostService;
import com.myblog.backend.entities.PostEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> CreatePost(@RequestParam("category") String category,
                                             @RequestParam("heading") String heading,
                                             @RequestParam("desc") String desc,
                                             @RequestParam("authorId") String authorId,
                                             @RequestParam("author") String author){
        this.service.createPostDetail(category,heading,desc,authorId,author);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("header","my custom header");


        return ResponseEntity.status(HttpStatus.CREATED).body("Post created successfully");

    }
     @GetMapping
    public ResponseEntity<List<PostEntity>> getAllPosts(){
        return ResponseEntity.status(HttpStatus.OK).body(this.service.getAllPosts());
     }

     @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<PostEntity>> getPostById(@PathVariable (name = "id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(this.service.getPostById(id));
     }

     @GetMapping(path="category/{category}")
     public ResponseEntity<List<PostEntity> >getAllPostByCategory(@PathVariable(name="category")String category){
        return ResponseEntity.status(HttpStatus.OK).body(this.service.getPostByCategory(category));
     }

     @PutMapping(path="/update/{id}")
     @ResponseStatus(value = HttpStatus.OK,reason = "Post Updated successfully")
    public void updatePostById(@PathVariable(name="id")long id,
                               @RequestParam(value = "category")String category,
                               @RequestParam(value = "heading")String heading ,
                               @RequestParam(value = "desc")String desc,
                               @RequestParam(value = "author")String author,
                               @RequestParam (value ="authorId")String authorId){
        this.service.updatePostById(id,category,heading,desc,author,authorId);

     }

    @DeleteMapping(path="/delete")
    @ResponseStatus(value = HttpStatus.NO_CONTENT,reason = "All Posts deleted successfully")
    public void deleteAllPosts(){
        this.service.deleteAllPosts();
    }

    @DeleteMapping(path="/delete/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT,reason = "Post deleted successfully")
    public void deletePostById(@PathVariable(name="id")long id){
        this.service.deletePostById(id);
         }


}
