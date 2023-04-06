package com.springst.board.service;

import com.springst.board.dto.request.user.PatchProfileDto;
import com.springst.board.dto.request.user.ValidateEmailDto;
import com.springst.board.dto.request.user.ValidateNicknameDto;
import com.springst.board.dto.request.user.ValidateTelNumberDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.user.GetUserResponseDto;
import com.springst.board.dto.response.user.PatchProfileResponseDto;
import com.springst.board.dto.response.user.ValidateEmailResponseDto;
import com.springst.board.dto.response.user.ValidateNicknameResponseDto;
import com.springst.board.dto.response.user.ValidateTelNumberResponseDto;

public interface UserService {
    public ResponseDto<PatchProfileResponseDto> patchProfile(String email, PatchProfileDto dto);
    public ResponseDto<GetUserResponseDto> getUser(String email);
    public ResponseDto<ValidateEmailResponseDto> validateEmail(ValidateEmailDto dto); 
    public ResponseDto<ValidateNicknameResponseDto> validateNickname(ValidateNicknameDto dto);
    public ResponseDto<ValidateTelNumberResponseDto> validateTelNumber(ValidateTelNumberDto dto);
}
