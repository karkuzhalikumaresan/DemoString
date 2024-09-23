package org.string;

public class Ques11 {
	public static void main(String []args) {
		StringBuffer s1= new StringBuffer("Welcome");
		StringBuffer s2= new StringBuffer("Welcome");
		StringBuffer s3= s1.append(s2);
		
		int i=System.identityHashCode(s1);
		System.out.println(i);
		
		int i1=System.identityHashCode(s2);
		System.out.println(i1);
		
		int i2=System.identityHashCode(s3);
		System.out.println(i2);
	}

}




