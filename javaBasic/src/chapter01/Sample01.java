package chapter01;

import java.util.Scanner;

public class Sample01 {
	
	// 로그인 프로세스를 활용해서 조건문 변수 및 조건문 활용법
	// 1. 사용자가 아이디와 비밀번호 입력
	// 2. 아이디와 비밀번호가 모두 입력됐는지 검증
	// 2-1. 만약 하나라도 빈값이 있다면 '모두 입력하세요.' 출력 후 프로그램 종료
	// 3. 메모리에 저장된 아이디와 비밀번호를 확인
	// 3-1. 만약 하나라도 틀리다면 '로그인 정보가 일치하지 않습니다.' 출력 후 프로그램 종료
	// 3-2. 모두 맞다면 '로그인에 성공했습니다.' 출력 후 프로그램 종료
	
	public static void main(String[] args) {
		
		// 변하지않는 저장받는 ID 와 PASSWORD는 상수로 사용
		final String ID = "Java";
		final String PASSWORD = "qwer1234";
		
		// 1. 사용자가 아이디와 비밀번호 입력
		Scanner sc = new Scanner(System.in);
		
		String id, password;
//		String password;
		System.out.println("아이디를 입력하세요. : ");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요. : ");
		password = sc.nextLine();
		
//		System.out.println("id : " + id + " / pw : " + pw);
		
		// 2. 아이디와 비밀번호가 모두 입력됐는지 검증
		// 입력이 되지 않았을 때 문자열은 ""
		
		// 2-1. 만약 하나라도 빈값( == 입력되지 않음 == "")이 있다면 '모두 입력하세요.' 출력 후 프로그램 종료
		if (id == "" || password == "") {
			System.out.println("모두 입력하세요.");
			// main method 종료
			return;
		}
		
		// 3. 메모리에 저장된 아이디와 비밀번호를 확인
		// 3-1. 모두 맞다면 '로그인에 성공했습니다.' 출력 후 프로그램 종료
		System.out.println(id == ID);
		System.out.println(password == PASSWORD);
		if (id.equals(ID) && password.equals(PASSWORD)) {
			System.out.println("로그인에 성공했습니다.");
			return;
		}
		// 3-2. 만약 하나라도 틀리다면 '로그인 정보가 일치하지 않습니다.' 출력 후 프로그램 종료
		/*if (!id.equals(ID) || !password.equals(PASSWORD))*/else {
			System.out.println("로그인 정보가 일치하지 않습니다.");
			return;
		}
		
		//3-1. 만약 하나라도 틀리다면 '로그인 정보가 일치하지 않습니다.' 출력 후 프로그램 종료
		
//		if (!id.equals(ID) || !password.equals(PASSWORD)){
//			System.out.println("로그인 정보가 일치하지 않습니다.");
//			return;
//		}
		
		// 3-2. 모두 맞다면 '로그인에 성공했습니다.' 출력 후 프로그램 종료
//			System.out.println("로그인에 성공했습니다.");
		
		
	}//main end
	
}//class end
