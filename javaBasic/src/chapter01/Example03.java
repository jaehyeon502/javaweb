package chapter01;

public class Example03 {

	public static void main(String[] args) {
		
		// 산술 연산자
		
		// 더하기 (+)
		System.out.println(8 + 3);
		
		// 빼기 (-)
		System.out.println(8 - 3);
		
		// 곱하기 (*)
		System.out.println(8 * 3);
		
		// 나누기 (/)
		System.out.println(8 / 3);//기본값이 int로 이루어져 있기때문에 출력값도 int로 출력됨
		System.out.println(8.0 / 3);
		
		// 나머지 (%)
		System.out.println(8 % 3);
		
		// 증가 (++)
		int plus1 = 0;
		System.out.println(plus1++);
		System.out.println(plus1);
		
		int plus2 = 0;
		System.out.println(++plus2);
		//System.out.println(0--); 증감 연산자는 상수에 사용할수 없고 무조건 변수에만 사용가능
		
		// 감소 (--)
		int minus1 = 0;
		System.out.println(minus1--);
		System.out.println(minus1);
		System.out.println("------------------------------------------");
		
		// 대입 연산자
		// =
		int number = 8;
		
		//number = number +3;
		number += 3;
		System.out.println(number);
		
		// number = number -3;
		number -= 3;
		System.out.println(number);
		
		// number = number *3;
		number *= 3;
		System.out.println(number);
		
		// number = number /3;
		number /= 3;
		System.out.println(number);
		
		// number = number %3;
		number %= 3;
		System.out.println(number);
		System.out.println("-----------------------------------------");
		
		// 비교 연산자
		// 같다 (==)
		System.out.println(8 == 3);
		// 다르다 (!=)
		System.out.println(8 != 3);
		// 크다 (>)
		System.out.println(8 > 3);
		// 작다 (<)
		System.out.println(8 < 3);
		// 크거나 같다 (>=)
		System.out.println(8 >= 3);
		// 작거나 같다 (<=)
		System.out.println(8 <= 3);
		System.out.println("------------------------------------------");
		
		
		// 논리 연산자
		
		// and 연산자 (&&) -> *
		// boolean -> 0 == false , 0 != true
		System.out.println(0 * 1); // return 0
		System.out.println(false && true); // return false
		
		// or 연산자 (||) -> +
		// boolean -> 0 == false , 0 != true
		System.out.println(1 + 1); // return 2
		System.out.println(true || true); // return true
		
		// and, or 연산의 규칙
		//  and : 연산 과정 중 false가 존재하면 무조건 false
		// or : 연산 과정 중 true가 존재하면 무조건 true
		// 해당 논리 뒤의 연산은 실행하지 않음
		int a = 0;
		int b = 0;
		System.out.println(false && (a++ > 0));
		System.out.println(a);
		
		// not 연산자 (!)
		System.out.println(!false);
		
		
		
	}

}









