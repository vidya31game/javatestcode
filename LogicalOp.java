package javapackage;

public class LogicalOp {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b && a<c); //first condition is false so not check second condition directly false
		System.out.println(a<b & a<c);//first condition false  then check second condition its true so (false & True=false) so return false
	}

}
