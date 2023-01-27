package chapter01;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 데이터 타입
		//
		// 정수형 타입
		// byte (1 byte), short (2 byte), int (4 byte), long (8 byte)
		byte b1 = 0;
		byte b2 = 127;
		byte b3 = -128;
		
		short s1 = 128;
		short s2 = 32767;
		short s3 = -32768;
		
		int i1 = 32768;
		int i2 = 2_147_483_647;
		int i3 = -2_147_483_648;
		//1000단위 기준으로 미국 숫자단위처럼 언더바를 사용하여 보기 편하게 사용가능
		
		//int형태의 리터럴을 기본 리터럴로 인식하기 때문에 초과하게되면 숫자 뒤에 L을 붙여 long형태의 리터럴로 변경시켜서 사용
		long l1 = 2_147_483_648L;
		
		// 실수 타입
		// float (4 byte), double (8 byte)
		// 오차 범위: float - 소숫점 이하 6자리, double - 소숫점 이하 15자리
		
		//double형태의 리터럴을 기본 리터럴로 인식하기 때문에 뒤에 F를 붙여 float형태의 리터럴로 변경시켜 사용
		float f1 = 3.1415F;
		double d1 = 3.1415;
		
		// 논리 타입
		// boolean (1 byte)
		boolean bool1 = true;
		boolean bool2 = false;
		
		// 문자 타입
		// char (2 byte)
		char c1 = 'a';
		char c2 = 97;
//		char c3 = 'abc';
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
		// 입력 (System.in)		
		// java.util.Scanner Scanner 객체
//		Scanner sc = new Scanner(System.in);
//		int inputNumber = sc.nextInt();
//		System.out.println(inputNumber);
//		long inputCharacter = sc.nextLong();
//		System.out.println(inputCharacter);
		
		// 형변환
		// 묵시적 (자동) 형변환
//		byte by1 = 100;
//		int number1 = by1;
//		System.out.println(number1);
//		
//		float float1 = number1;
//		System.out.println(float1);
//		
		// 명시적 (강제) 형변환
		// 사이즈(byte)가 큰 변수에서 작은 변수로 데이터를 저장할 때
		int number2 = 1000;
		byte by2 = (byte) number2;
		System.out.println(by2); //오버플로우 발생으로 인해 출력값이 -24로 나타남
	}

}
