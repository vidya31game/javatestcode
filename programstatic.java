package javapackage;

public class programstatic {
	int b=100;
	static int a=1000;
	public static void main(String args[])
	{
		//int a=10;
		System.out.println(a);//can call staic variable directly
		
		//create object of class to call non static variable
		programstatic obj=new programstatic();
		System.out.println(obj.b);
		
		//calling static method directly
		a();
		
		obj.b();
		
	}
	public static void a()
	{
		int c=20;
		System.out.println(c);
	}
	public void b()
	{
		int d=30;
		System.out.println(d);
	}

}
