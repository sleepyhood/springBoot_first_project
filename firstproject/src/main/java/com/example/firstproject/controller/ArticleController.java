package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// 주의: 자바 코드가 바뀔 땐 빌드가 아닌 재시작
@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    // 실제로 접속할 URL
    public String newArticleForm(){
        return "articles/new";
    }


    @PostMapping("/articles/create")    // post로 전송
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        // 1. DTO를 엔티티로 변환
        // 2. 리파지터리로 엔티티를 DB에 저장
        Article article = form.toEntity();

        return "";
    }


}
