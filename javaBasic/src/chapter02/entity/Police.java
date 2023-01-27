package chapter02.entity;

public class Police extends People {


	// 관할
	public String jurisdiction;
	// 직책
	public String officePosition;
	
	public Police() {
		super("John doe", "man");
	}

}
