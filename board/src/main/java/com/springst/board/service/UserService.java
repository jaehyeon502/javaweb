package com.springst.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springst.board.common.constant.ResponseMessage;
import com.springst.board.dto.request.user.PatchProfileDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.user.PatchProfileResponseDto;
import com.springst.board.entity.UserEntity;
import com.springst.board.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired UserRepository userRepository;

    public ResponseDto<PatchProfileResponseDto> patchProfile(String email, PatchProfileDto dto) {
        
        PatchProfileResponseDto data = null;

        String profile = dto.getProfile();
        
        try{

            UserEntity userEntity = userRepository.findByEmail(email);
            if (userEntity == null) return ResponseDto.setFailed(ResponseMessage.NOT_EXIST_USER);

            userEntity.setProfile(profile);
            userRepository.save(userEntity);

            data = new PatchProfileResponseDto(userEntity);

        }catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }
            return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);

    }

}
