package org.string;

public class StringQ2 {
	public static void main(String []ags) {
		//Find the last index of o
		String s1="GreensTechnology";
			int last=s1.lastIndexOf('o');
			System.out.println(last);
			
		//Find the index of o
		String s2="SeleniumAutomationtool";
			int index=s2.indexOf('o');
			System.out.println(index);
			
		//Find the index of n	
		String s3="velmurugan";
			int index1=s3.indexOf('n');
			System.out.println(index1);
			
		//Find the last index of  (emptyspace)	
		String s4="j a v a p r o g r a m";
			int index2=s4.lastIndexOf(" ");
			System.out.println(index2);
			
		//Find the index of 8	
		String s5="9095484678";
			int index3=s5.indexOf("8");
			System.out.println(index3);
			
			//To find out the length
			int length = s1.length();
			System.out.println("Length of String:"+length);
			
			//To convert the string into uppercase
			String upperCase = s1.toUpperCase();
			System.out.println("Coverted String:"+upperCase);
			
			
			//To convert the string into lowercase
			String lowerCase = s1.toLowerCase();
			System.out.println("Coverted String:"+lowerCase);
			
			//index of J
			int indexOf = s1.indexOf('a');
			System.out.println("Index of a:"+indexOf);
			
			//Last index of a
			int lastIndexOf = s1.lastIndexOf('a');
			System.out.println("Last index of a:"+lastIndexOf);
			
			//charAt of 11
			char charAt = s1.charAt(11);
			System.out.println("Index position of 11:"+charAt);
		
	}

}
