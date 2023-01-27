package chapter02;

class MyMath{
	
	static double getEquilateralTriangleArea(double side){
		// 매개변수 검증
		if (side <= 0) return 0;
		
		
		 double result = (Math.sqrt(3) / 4) * Math.pow(side, 2);
		return result;
	}
	
	// 정삼각형의 높이를 구하는 메서드
	static double getEquilateralTriangleHeight(double side) {
		// 매개변수 검증
		if (side <= 0) return 0;
		
		double EquilateralTriangleHeight = (Math.sqrt(3) / 2) * side;
		return EquilateralTriangleHeight;
	}
	
	// 1증가
	static int increase(int number) {
		number++;
		System.out.println("In of Method");
		System.out.println(number);
		return number;
	}
	
	static void increaseTriangle(Triangle triangle) {
		triangle.base++;
		triangle.height++;
		triangle.diagonal++;
	}
	
}//MyMath end

public class Example03 {

	public static void main(String[] args) {
		
		double side = 10.0;
		double EquilateralTriangleArea = MyMath.getEquilateralTriangleArea(side);
		System.out.println(EquilateralTriangleArea);
		
		double EquilateralTriangleHeight = MyMath.getEquilateralTriangleHeight(-10);
		System.out.println(EquilateralTriangleHeight);
		
		int number = 10;
		int afterNumber = MyMath.increase(number);
		System.out.println("Out of Method");
		System.out.println(number);
		number = MyMath.increase(number);
		
		Triangle triangle = new Triangle();
		triangle.createAndPrint();
		System.out.println(triangle);
		
		MyMath.increaseTriangle(triangle);
		System.out.println(triangle.base);
		System.out.println(triangle);
		
	}//main end

}
