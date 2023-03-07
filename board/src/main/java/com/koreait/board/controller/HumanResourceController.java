package com.koreait.board.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koreait.board.dto.request.humanResource.PostHumanResourceRequestDto;
import com.koreait.board.dto.response.ResponseDto;
import com.koreait.board.dto.response.humanResource.GetHumanResourceResponseDto;
import com.koreait.board.dto.response.humanResource.PostHumanResourceResponseDto;
import com.koreait.board.service.HumanResourceService;

@RestController
@RequestMapping("/apis/hr")
public class HumanResourceController {
    
    @Autowired private HumanResourceService humanResourceService;

    @PostMapping("/")
    //? POST http://localhost:4040/apis/hr/
    public ResponseDto<PostHumanResourceResponseDto> postHumanResource(@Valid @RequestBody PostHumanResourceRequestDto requestBody){
        ResponseDto<PostHumanResourceResponseDto> response = 
            humanResourceService.postHumanResource(requestBody);
        return response;
    }
    //? GET http://localhost:4040/apis/hr/사번
    @GetMapping("/{employeeNumber}")
    public ResponseDto<GetHumanResourceResponseDto> getHumanResource(@PathVariable("employeeNumber") int employeeNumber){
        ResponseDto<GetHumanResourceResponseDto> response =
            humanResourceService.getHumanResource(employeeNumber);
        return response;
    }

}
