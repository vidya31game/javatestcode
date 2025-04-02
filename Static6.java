package javapackage;

public class Static6 {
	int x=10;
	static int y=5;
	
	//Non static mathod
	public void a() {
		int z=10;
		System.out.println(z);
	}

	//static variable creation
	static int b=6;
	
	//static method
	public static void b() {
		int a=5;
		System.out.println(a);
	}
	
	public static void main(String[]args)
	{
		Static6 s6=new Static6();
				s6.a();
				System.out.println(s6.b);//inapropriate way to call static member
				System.out.println(Static6.b);//inapropriate way to call static member
				System.out.println(b);//correct way to call static member
				b(); //calling static method directly
	}
}
