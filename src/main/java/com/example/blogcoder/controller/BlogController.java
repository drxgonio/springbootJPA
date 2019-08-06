package com.example.blogcoder.controller;

import com.example.blogcoder.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.blogcoder.repository.BlogRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class BlogController {
    @Autowired
    private BlogRepository blog;
    @RequestMapping("/a")
    public String test(Model model){
       model.addAttribute("blog",blog.findAll());
        return "blog";
    }
}
