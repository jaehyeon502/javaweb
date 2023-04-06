package com.springst.board.dto.request.user;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="유저 휴대 전화번호 중복 체크 Request Body")
@Data
@NoArgsConstructor
public class ValidateTelNumberDto {
    @ApiModelProperty(value="유저 휴대 전화번호", example="010-1234-5678", required=true)
    @NotBlank
    @Max(13)
    private String telNumber;
}
