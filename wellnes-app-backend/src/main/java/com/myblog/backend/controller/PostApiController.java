package com.myblog.backend.controller;

import com.myblog.backend.services.PostService;
import com.myblog.backend.entities.PostEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("api/Posts")
public class PostApiController {
    private final PostService service;

    public PostApiController(PostService service) {
        this.service = service;
    }

    @RequestMapping(path="/Create",method = RequestMethod.POST)
    public void CreatePost(@RequestParam("heading") String heading,
                           @RequestParam("desc") String desc,
                           @RequestParam("author") String author){
        this.service.savePostDetail(heading,desc,author);

    }
     @GetMapping
    public List<PostEntity> getAllPosts(){
       return this.service.getAllPosts();
     }

     @RequestMapping(path = "{id}",method= GET)
    public Optional<PostEntity> getPostById(@PathVariable (name = "id") long id){
        return this.service.getPostById(id);
     }

     @RequestMapping(path="/update/{id}",method = RequestMethod.PUT)
    public void updatePostById(@PathVariable(name="id")long id,
                               @RequestParam(value = "heading",required = false)String heading ,
                               @RequestParam(value = "desc",required = false)String desc,
                               @RequestParam(value = "author",required = false)String author){
        this.service.updatePostById(id,heading,desc,author);

     }

     @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
        public void deletePostById(@PathVariable(name="id")long id){
        this.service.deletePostById(id);
         }


}
