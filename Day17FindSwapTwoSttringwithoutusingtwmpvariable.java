package main1;

public class Day17FindSwapTwoSttringwithoutusingtwmpvariable {
	public static void main(String[] args) {
		
		String s1="Today",s2="Tomorrow";
		System.out.println("String Before Swapping: "+s1+" "+s2);
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println(" after Swapping: "+s1 +" "+s2);
		
	}

}
