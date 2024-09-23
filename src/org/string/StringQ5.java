package org.string;

import java.util.List;
import java.util.Scanner;

public class StringQ5 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your phone number:");
		String s1=s.next();
		int l=s1.length();
		if(l>10) {
			System.out.println("Invalid Phone Number");
		}
		else {
			System.out.println("Valid Phone Number");
		}
		}

}
