package com.springst.board.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springst.board.common.constant.ApiPattern;
import com.springst.board.dto.request.user.PatchProfileDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.user.PatchProfileResponseDto;
import com.springst.board.service.UserService;

@RestController
@RequestMapping(ApiPattern.USER)
public class UserController {
    
    @Autowired private UserService userService;

    private final String PATCH_PROFILE = "/profile";

    @PatchMapping(PATCH_PROFILE)
    public ResponseDto<PatchProfileResponseDto> patchProfile(
        @AuthenticationPrincipal String email, 
        @Valid @RequestBody PatchProfileDto requestBody
        ) {
            ResponseDto<PatchProfileResponseDto> response = userService.patchProfile(email, requestBody);
            return response;
    }

}
