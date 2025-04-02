package javapackage;

public class Mor4 extends Mor3{
	public void run() {
		System.out.println("You are runnig");
	}
	public static void main(String[] args) {
		Mor4 m4=new Mor4();
		m4.run();
		
		Mor3 m3=new Mor3();
		m3.run();
	}

}
