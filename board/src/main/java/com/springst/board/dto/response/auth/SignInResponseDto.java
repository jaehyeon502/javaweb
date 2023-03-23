package com.springst.board.dto.response.auth;

import com.springst.board.entity.UserEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="로그인 Response Body - data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInResponseDto {
    @ApiModelProperty(value="사용자 이메일", example="wogus502@daum.net", required=true)
    private String email;
    @ApiModelProperty(value="사용자 닉네임", example="jaehyeon", required=true)
    private String nickname;
    @ApiModelProperty(value="사용자 휴대폰 번호", example="010-1234-5678", required=true)
    private String telNumber;
    @ApiModelProperty(value="사용자 주소", example="부산광역시 남구", required=true)
    private String address;
    @ApiModelProperty(value="사용자 프로필 사진 URL", example="http://~", required=true)
    private String profile;
    @ApiModelProperty(value="JWT", example="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJxd2VAcXdlLmNvbSIsImlhdCI6MTY3OTU1MDM0MiwiZXhwIjoxNjc5NTUzOTQyfQ.Cvdm7jpRfAKdst99Elo35yW-XLygzI2kMBz5VfwtJf0", required=true)
    private String token;
    @ApiModelProperty(value="토큰 만료 기간", example="3600000", required=true)
    private int expiredTime;

    public SignInResponseDto(UserEntity userEntity, String token) {
        this.email = userEntity.getEmail();
        this.nickname = userEntity.getNickname();
        this.telNumber = userEntity.getTelNumber();
        this.address = userEntity.getAddress();
        this.profile = userEntity.getProfile();
        this.token = token;
        this.expiredTime = 3600000*4;
    }
}
