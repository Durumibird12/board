package com.example.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor    //final 또는 @NonNull 명령어가 붙으면 객체를 자동으로 붙혀줌
public class BoardController {
    @GetMapping(value = "/")
    public String board(){  //게시판 화면을 보여주는 기능
        return "/board/list";
    }

    @GetMapping("/post")
    public String post() {  //게시글 화면을 보여주는 기능
        return "board/post.html";
    }
}
