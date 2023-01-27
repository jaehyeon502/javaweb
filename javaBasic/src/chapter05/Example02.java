package chapter05;

abstract class SuperClass{
	abstract void superMethod();
}// SuperClass End

class SubClass extends SuperClass {
	
	@Override
	void superMethod() {
		System.out.println("자손 메서드");
	}
}

public class Example02 {
	// 열거형
	enum EXAMPLE_ENUM {
		FIRST(0), SECOND(1), THIRD(2);

		EXAMPLE_ENUM(int i) {
			
		}	
	};
	
	// 위와같음
	static final int FIRST = 0;
	static final int SECOND = 1;
	static final int THIRD = 2;
	
	
	public static void main(String[] args) {
		System.out.println(EXAMPLE_ENUM.FIRST);	
		
		
	}// main end

}// Example02 end
