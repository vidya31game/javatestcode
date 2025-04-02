package javapackage;

public class Unary1 {
	public static void main(String[]args)
	{
		int a=5;
		System.out.println(a); //5
		System.out.println(a++); //5 print 5 then add 1 so 5 ,6
		System.out.println(a); //6
		System.out.println(++a);  // 7  add 1 first then print 7 so 7 7
		System.out.println(a);   // 7
		System.out.println(a--); // 7 then 1 minus so 7 6
		System.out.println(a);   //6
		System.out.println(--a);  //5 minus first thne print so 5 5
	}

}
