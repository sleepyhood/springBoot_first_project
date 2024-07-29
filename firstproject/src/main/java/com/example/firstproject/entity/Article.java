package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


// JPA 어노테이션
// DB에 저장 가능한 형태로 변환
@Entity
public class Article {
    @Id //엔티티 대표값(고유키)
    @GeneratedValue // 자동 숫자 기입
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    // 아래 내용은 아티클 컨트롤러에서 호출됨
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
