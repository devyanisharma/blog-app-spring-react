package com.myBlog.WellnessApp.Controller;

import com.myBlog.WellnessApp.Data.PostEntity;
import com.myBlog.WellnessApp.Services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("api/Posts")
public class PostApiController {
    private final PostService service;

    public PostApiController(PostService service) {
        this.service = service;
    }

    @RequestMapping(path="/Create",method = POST)
    public void CreatePost(@RequestParam("heading") String heading,
                           @RequestParam("desc") String desc,
                           @RequestParam("Date") Date date,
                           @RequestParam("author") String author){
        this.service.savePostDetail(heading,desc,date,author);

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
                               @RequestParam("heading")String heading,
                               @RequestParam("desc")String desc,
                               @RequestParam ("date")Date date,
                               @RequestParam("author")String author){
        this.service.updatePostById(id,heading,desc,date,author);

     }

     @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
        public void deletePostById(@PathVariable(name="id")long id){
        this.service.deletePostById(id);
         }


}
