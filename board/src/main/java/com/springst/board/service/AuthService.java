package com.springst.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springst.board.common.constant.ResponseMessage;
import com.springst.board.dto.request.auth.SignUpDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.repository.UserRepository;

@Service
public class AuthService {
    
    @Autowired private UserRepository userRepository;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public ResponseDto<SignUpDto> signUp(SignUpDto dto) {

        SignUpDto data = null;

        String email = dto.getEmail();
        String telNumber = dto.getTelNumber();
        String password = dto.getPassword();

        try{

            boolean hasEmail = userRepository.existsByEmail(email);
            if (hasEmail) return ResponseDto.setFailed(ResponseMessage.EXIST_EMAIL);

            boolean hasTelNumber = userRepository.existsBytelNumber(telNumber);
            if (hasTelNumber) return ResponseDto.setFailed(ResponseMessage.EXIST_TELNUMBER);

            String encodedPassword = passwordEncoder.encode(password);


        }catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }

        return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
    }

}
