package com.springst.board.service;

import com.springst.board.dto.request.user.PatchProfileDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.user.PatchProfileResponseDto;

public interface UserService {
    public ResponseDto<PatchProfileResponseDto> patchProfile(String email, PatchProfileDto dto);
}
