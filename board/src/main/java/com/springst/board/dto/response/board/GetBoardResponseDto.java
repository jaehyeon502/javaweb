package com.springst.board.dto.response.board;

import java.util.List;

import com.springst.board.entity.BoardEntity;
import com.springst.board.entity.CommentEntity;
import com.springst.board.entity.LikyEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardResponseDto {
    private BoardEntity board;
    private List<CommentEntity> commentList;
    private List<LikyEntity> likeList;

}
