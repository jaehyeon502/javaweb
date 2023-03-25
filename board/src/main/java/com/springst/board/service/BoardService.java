package com.springst.board.service;

import java.util.List;

import com.springst.board.dto.request.board.LikeDto;
import com.springst.board.dto.request.board.PatchBoardDto;
import com.springst.board.dto.request.board.PostBoardDto;
import com.springst.board.dto.request.board.PostCommentDto;
import com.springst.board.dto.response.ResponseDto;
import com.springst.board.dto.response.board.DeleteBoardResponseDto;
import com.springst.board.dto.response.board.GetBoardResponseDto;
import com.springst.board.dto.response.board.GetListResponseDto;
import com.springst.board.dto.response.board.GetMyListResponseDto;
import com.springst.board.dto.response.board.GetSearchListResponseDto;
import com.springst.board.dto.response.board.GetTop15RelatedSearchWordResponseDto;
import com.springst.board.dto.response.board.GetTop15SearchWordResponseDto;
import com.springst.board.dto.response.board.GetTop3ListResponseDto;
import com.springst.board.dto.response.board.LikeResponseDto;
import com.springst.board.dto.response.board.PatchBoardResponseDto;
import com.springst.board.dto.response.board.PostBoardResponseDto;
import com.springst.board.dto.response.board.PostCommentResponseDto;

public interface BoardService {
    public ResponseDto<PostBoardResponseDto> postBoard(String email, PostBoardDto dto);
    public ResponseDto<LikeResponseDto> like(String email, LikeDto dto);
    public ResponseDto<PostCommentResponseDto> postComment(String email, PostCommentDto dto);

    public ResponseDto<GetBoardResponseDto> getBoard(int boardNumber);
    public ResponseDto<List<GetListResponseDto>> getList();
    public ResponseDto<List<GetMyListResponseDto>> getMyList(String email);
    public ResponseDto<List<GetSearchListResponseDto>> getSearchList(String searchWord, String previousSearchWord);
    public ResponseDto<List<GetTop3ListResponseDto>> getTop3List();
    public ResponseDto<GetTop15SearchWordResponseDto> getTop15SearchWord();
    public ResponseDto<GetTop15RelatedSearchWordResponseDto> getTop15RelatedSearchWord(String searchWord);

    public ResponseDto<PatchBoardResponseDto> patchBoard(String email, PatchBoardDto dto);
    
    public ResponseDto<DeleteBoardResponseDto> deleteBoard(String email, int boardNumber);
}
