package com.myblog.backend.services;

import com.myblog.backend.repositories.CommentRepository;
import com.myblog.backend.utils.Date;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private CommentRepository commentRepository;
    private Date date;

    public CommentService(CommentRepository commentRepository,Date date){
        this.commentRepository = commentRepository;
        this.date = date;
    }


}
