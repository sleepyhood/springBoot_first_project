package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //--------------------------- ➊ 컨트롤러 선언

public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) { //메서드 작성
        // model 객체가 "홍팍" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "홍팍");

        return "greetings"; // greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) { //메서드 작성
        // model 객체가 "홍팍" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("nickname", "홍팍");

        return "goodbye"; // greetings.mustache 파일 반환
    }
}
