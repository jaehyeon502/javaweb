package com.springst.board.dto.response.user;

import com.springst.board.entity.UserEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="유저 프로필 URL 수정 Response Body - data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatchProfileResponseDto {
    @ApiModelProperty(value="사용자 이메일", example="hyesung6516@naver.com", required=true)
    private String email;

    @ApiModelProperty(value="사용자 닉네임", example="jaehyeon", required=true)
    private String nickname;

    @ApiModelProperty(value="사용자 휴대전화번호", example="010-1234-5678", required=true)
    private String telNumber;

    @ApiModelProperty(value="사용자 주소", example="부산광역시 남구", required=true)
    private String address;

    @ApiModelProperty(value="사용자 프로필 URL", example="http://~", required=true)
    private String profile;

    public PatchProfileResponseDto(UserEntity userEntity) {
        this.email = userEntity.getEmail();
        this.nickname = userEntity.getNickname();
        this.telNumber = userEntity.getTelNumber();
        this.address = userEntity.getAddress();
        this.profile = userEntity.getProfile();
    }
}
