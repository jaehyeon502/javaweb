package com.springst.board.dto.response.board;

import java.util.List;

import com.springst.board.entity.BoardEntity;
import com.springst.board.entity.CommentEntity;
import com.springst.board.entity.LikyEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="특정 게시물 가져오기 Response Body - data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBoardResponseDto {
    @ApiModelProperty(value="게시물 Entity", required=true)
    private BoardEntity board;

    @ApiModelProperty(value="댓글 Entity list", required=true)
    private List<CommentEntity> commentList;

    @ApiModelProperty(value="좋아요 Entity list", required=true)
    private List<LikyEntity> likeList;

}
