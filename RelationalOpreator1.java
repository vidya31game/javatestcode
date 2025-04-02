package javapackage;

public class RelationalOpreator1 {
	public static void main(String[] args) {
		int a=300;
		int b=300;
		
		if(a!=b) {
			System.out.println("a is not equal to b");
		}else {
			System.out.println("a is equal to be");
		}
		String p="HELLO";
		String q="hello";
		
		//string comparison 1st way-case sensetive
		if(p==q) {
			System.out.println("p and q are equal in 1st way");
		}else {
			System.out.println("p and q are not equal in 1st way ");
		}
		
		//string comparison 2nd way-case sensetive
		if(p.equals(q)) {
			System.out.println("p and q are equal for second way");
		}else {
			System.out.println("p and q are not equal for second way");
		}
		
		//string comparison 3rd way-case sensetive
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		}else {
			System.out.println("p and q are not equal for 3rd way");
		}
			
	}

}
