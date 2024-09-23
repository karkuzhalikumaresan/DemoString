package org.string;

import java.util.Scanner;

public class StringQ4 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your email id:");
		String s1=s.next();
		boolean b=s1.contains("gmail");
		if(b==true) {
			String rep=s1.replace("gmail", "yahoo");
			System.out.println(rep);
		}else {
			System.out.println("gamil isn't present");
		}
		
	}

}
