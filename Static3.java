package javapackage;

public class Static3 {
	int roll;
	String name;
	static String college="IIT Bombay";
	
	//constructor
	Static3(int r,String n){
		roll=r;
		name=n;
		
	}
	
	public void getResult() {
		System.out.println(roll+"  "+name+"  "+college);
	}
	
	

}
