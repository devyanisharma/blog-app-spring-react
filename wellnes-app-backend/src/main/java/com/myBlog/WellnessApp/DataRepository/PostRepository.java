package com.myBlog.WellnessApp.DataRepository;

import com.myBlog.WellnessApp.Data.PostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostEntity,Long> {
}
