package javapackage;

public class Static5 {
	static int z=5;
	int y=1;
	public static void a() {
		z=10;
		System.out.println(z);
	}
	
	public void b() {
		z=15;
		System.out.println(z);
	}
	public static void main(String[]args) {
		System.out.println(z);
		a();
		Static5 s5=new Static5();
		s5.b();
	}
	       

}
