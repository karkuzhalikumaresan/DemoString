package org.string;

public class StringMethod {
	public static void main(String []ags) {
		String s1 = "Welcome";
		String s2 = "welcome";
		//To check both strings are equal with case sensitive
		boolean equals = s1.equals(s2);
		System.out.println("strings are equal case sensitive:"+equals);
		//To check both strings are equal without case sensitive
		boolean equals1 = s1.equalsIgnoreCase(s2);
		System.out.println("strings are equal without case sensitive:"+equals1);
		//To check the give value is present or not
		boolean contains = s1.contains(s2);
		System.out.println("Both string are equal:"+contains);
		
		String s3 = "Welcome to Java Class";
		//To replace string values
		String replace = s3.replace("Java","Selenium");
		System.out.println("Replaced String:"+replace);
		//To find the string starts with "Welcome"
		boolean startsWith = s3.startsWith("Welcome");
		System.out.println("String Starts with Welcome:"+startsWith);
		//To find the string ends with "class"
		boolean endsWith = s3.endsWith("class");
		System.out.println("String ends with class:"+endsWith);
				
		String s4=" Welcome to Google ";
		//To find string is empty or not
		boolean empty = s4.isEmpty();
		System.out.println("String is empty:"+empty);
		//To remove the unwanted space
		String trim = s4.trim();
		System.out.println("String after removed space"+trim);	
	}
}

