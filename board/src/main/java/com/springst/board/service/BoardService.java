package com.springst.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springst.board.common.constant.ResponseMessage;
import com.springst.board.dto.request.board.PostBoardDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.board.PostBoardResponseDto;
import com.springst.board.entity.BoardEntity;
import com.springst.board.entity.UserEntity;
import com.springst.board.repository.BoardRepository;
import com.springst.board.repository.UserRepository;

@Service
public class BoardService {
    
    @Autowired private BoardRepository boardRepository;
    @Autowired private UserRepository userRepository;

    public ResponseDto<PostBoardResponseDto> postBoard(String email, PostBoardDto dto) {
        
        PostBoardResponseDto data = null;

        try{

            UserEntity userEntity = userRepository.findByEmail(email);
            if (userEntity == null) return ResponseDto.setFailed(ResponseMessage.NOT_EXIST_USER);

            BoardEntity boardEntity = new BoardEntity(userEntity, dto);
            boardRepository.save(boardEntity);

            data = new PostBoardResponseDto(boardEntity);

        }catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }

        return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);

    }
}
