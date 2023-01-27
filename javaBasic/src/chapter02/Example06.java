package chapter02;

import chapter02.entity.BusDriver;
import chapter02.entity.Police;
import chapter02.entity.Developer;


// 상속을 사용하는 이유 


public class Example06 {
	
	public static void main(String[] args) {
		Developer developer = new Developer();
		Police police = new Police();
		BusDriver busdriver = new BusDriver();
		
		// 참조형 변수에서 데이터가 미정인 상태일 때 null
		String str = null;
//		developer = null;
		
		
		developer.LanguageSkill = "";
		System.out.println(developer);
		
//		developer.eatBreakfast();
		developer.eatBreakfast(11);
		police.eatBreakfast();
		busdriver.eatBreakfast();
		
		
		
	}//main end

}//Example06 end
