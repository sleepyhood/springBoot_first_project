package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

// DTO는 데이터를 받을 수 잇는 그릇과도 같다.
public class ArticleForm     {
    private  String title;
    private  String content;

    // 생성자
    public ArticleForm(String title, String content) {
        //생성자
        this.title = title;
        this.content = content;
    }
    // P.106


    // 데이터 받았는지 확인->toString()

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        // public Article(Long id, String title, String content)
        // 에서 생성자로 선언된 파라미터를 반환
        return new Article(null, title, content);
    }
    // P. 107
}
