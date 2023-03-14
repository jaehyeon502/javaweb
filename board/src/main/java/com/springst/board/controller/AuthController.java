package com.springst.board.controller;

import com.springst.board.common.constant.ApiPattern;
import com.springst.board.dto.request.auth.SignUpDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.auth.SignUpResponseDto;
import com.springst.board.service.AuthService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(ApiPattern.AUTH)
public class AuthController {
    
    @Autowired private AuthService authService;

    private final String SIGN_UP = "/sign-up";

    @PostMapping(SIGN_UP)
    public ResponseDto<SignUpResponseDto> signUp(@Valid @RequestBody SignUpDto requestBody) {
        ResponseDto<SignUpResponseDto> response = authService.signUp(requestBody);
        return response;
    }
    

}
