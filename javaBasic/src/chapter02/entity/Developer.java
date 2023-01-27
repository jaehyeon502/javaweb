package chapter02.entity;

public class Developer {
	

	public String LanguageSkill;
	public String company;
	public String developPosition;
	
	public Developer(){};
//	public Developer (String name, String gender, String company) {
//		// super() : 슈퍼 클래스의 생성자
////		super(name, gender);
//		this.company = company;
//	}
	public void eatBreakfast(int time)/*오버로딩*/ {
//		System.out.println(super.name + "는 "+ time +"시에 아침 밥을 먹습니다.");
	}// 슈퍼클래스의 메서드를 덮어 씌움(오버라이딩)
}
