package chapter01;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		// 제어문 (조건문) if
		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요. : ");
//		int age = sc.nextInt();
//		if (age > 19) {
//			System.out.println("성인입니다.");
//		} else {
//		System.out.println("미성년자입니다.");
//		}
		
		
//		System.out.println("숫자를 입력해주세요. : ");
//		int number = sc.nextInt();
//		 하나의 조건이 달성하면 하위 조건은 무시하고 출력한다.
//		 조건중 가장 상세한 조건을 먼저 따지고 점점 넓은 조건을 넣는식으로 if문을 짠다.
//		if (number > 0) {
//			System.out.println("양수입니다.");
//		} else if (number >= 0 ) {
//			System.out.println("0보다 크거나 같습니다."); 
//		} else if (number < 0) {
//			System.out.println("음수입니다.");
//		} else {
//			System.out.println("0입니다.");
//		}
		
		// 0이 아닐경우에만 연산을 실행해라.
		// 0이면 0이다 라고 출력
		int inputValue = sc.nextInt();
		
		
//		if (inputValue != 0) {
//		
//		int a = 10 / inputValue;
//		int b = a * inputValue;
//		b++;
//		System.out.println(a * b);
//		} else {
//			System.out.println("0입니다.");
//		}
//		
		if (inputValue == 0) {
			System.out.println("0입니다.");
			return;
		}
		
		if (inputValue >= 100) {
			System.out.println("100 이상입니다.");
			return;
		}
		
		int a = 10 / inputValue;
		int b = a * inputValue;
		b++;
		System.out.println(a * b);
		
		if (a * b ==110) System.out.println("110");
		
		//검증 하는 코드를 먼저 작성하는 습관
		
		
		
	}//main end

}
