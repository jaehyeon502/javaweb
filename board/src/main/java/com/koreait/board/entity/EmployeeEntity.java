package com.koreait.board.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// employee_number INT AUTO_INCREMENT PRIMARY KEY COMMENT '사번',
//     position VARCHAR(10) NOT NULL COMMENT '직책',
//     name VARCHAR(20) NOT NULL COMMENT '이름',
//     age INT NOT NULL COMMENT '나이',
//     gender VARCHAR(10) NOT NULL COMMENT '성별',
//     academic_ablility VARCHAR(20) NOT NULL COMMENT '학력',
//     birth DATE NOT NULL COMMENT '생년월일', 
//     tel_number VARCHAR(15) NOT NULL UNIQUE COMMENT '휴대전화번호',
//     adress TEXT NOT NULL COMMENT '주소',
//     adress_detail TEXT NOT NULL COMMENT '상세주소',
//     join_date DATE NOT NULL COMMENT '입사일',
//     resignation_date DATE COMMENT '퇴사일',
//     department VARCHAR(5) COMMENT '부서',
//     annual_income INT NOT NULL COMMENT '연봉',
//     note TEXT COMMENT '비고'

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Employee")
@Table(name="Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //? 사원
    private int employeeNumber;
    //? 직책
    private String position;
    //? 이름
    private String name;
    //? 나이
    private int age;
    //? 성별
    private String gender;
    //? 학력
    private String academicAbility;
    //? 생년월일
    private String birth;
    //? 휴대전화 번호
    private String telNumber;
    //? 주소
    private String adress;
    //? 상세 주소
    private String adressDetail;
    //? 입사일
    private String joinDate;
    //? 퇴사일
    private String resignationDate;
    //? 부서코드
    private String department;
    //? 연봉
    private int annualIncome;
    //? 비고
    private String note;
}
