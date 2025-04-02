package javapackage;

public class Static7 {
	String a;  //declared global variable
	int b;     //declared global variable
	static int c=4;
	
	//static method
	
	public static void a() {
		System.out.println("Hello Static");
	}
	
	public static void main(String[]args) {
		Static7 s7=new Static7();
		s7.a="Selenium";  //global variable value assign
		s7.b=1;          //global variable value assign
		c=2;             //change the value of static variable
		a();              //calling static method
		System.out.println(s7.a +" "+ s7.b+" " +c);
		
		
	}
	
	
	

}
