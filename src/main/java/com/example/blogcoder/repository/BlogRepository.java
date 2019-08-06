package com.example.blogcoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.blogcoder.model.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {

    List<Blog> findAll();
}
