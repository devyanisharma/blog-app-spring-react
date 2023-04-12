package com.myblog.backend.repositories;

import com.myblog.backend.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
List<PostEntity> findByCategory(String category);
}
