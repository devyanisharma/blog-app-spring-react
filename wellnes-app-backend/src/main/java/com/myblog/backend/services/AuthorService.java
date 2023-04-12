package com.myblog.backend.services;

import com.myblog.backend.repositories.AuthorRepository;
import com.myblog.backend.utils.Date;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private AuthorRepository repository;
    Date date;

    public AuthorService(AuthorRepository repository){
        this.repository = repository;
    }
}
