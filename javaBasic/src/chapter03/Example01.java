package chapter03;

import chapter03.util.UtilExample01;
//import chapter03.util.*; chapter03.util에 있는 모든 클래스를 다 끌어다 쓸 수 있다.
// static 변수 혹은 메서드 import
import static java.lang.Math.PI;
import static java.lang.Math.*;
import static chapter03.util.UtilExample01.NUMBER;

public class Example01 {
	
	public static void main(String[] args) {
		UtilExample01 util = new UtilExample01();
		System.out.println(PI);
		System.out.println(E);
		System.out.println(NUMBER);
	}// main end

}// Example01 end
