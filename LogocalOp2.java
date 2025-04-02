package javapackage;

public class LogocalOp2 {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b && a++ < c); //first condition is false so not check second condition directly false
		//a not increment bcs first condition is false so not check second condition this is logical opreator
		System.out.println(a); //10
		
		System.out.println(a<b & a++ < c);//first condition false  then check second condition its true so (false & True=false) so return false
	    //a increment bcs first condition is false but bitwise opreator check second condition at any cost first condition is true or false no matter
		System.out.println(a);
	}

}
