package com.koreait.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koreait.board.service.HumanResourceService;

@RestController
@RequestMapping("/apis/hr")
public class HumanResourceController {
    
    @Autowired private HumanResourceService humanResourceService;

    @PostMapping("/")
    public ? postHumanResource(){
        return;
    }

}
