package com.springst.board.service;

import com.springst.board.dto.request.auth.SignInDto;
import com.springst.board.dto.request.auth.SignUpDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.auth.SignInResponseDto;
import com.springst.board.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    public ResponseDto<SignUpResponseDto> signUp(SignUpDto dto);
    public ResponseDto<SignInResponseDto> signIn(SignInDto dto);
}
