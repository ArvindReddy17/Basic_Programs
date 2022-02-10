
import java.io.*;
import java.util.Scanner;

class StringReverse{
		public static void main (String[] args) {
String rstr="";
			char ch;
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the String to reverse");
			String str=sc.next();
	
			System.out.print("Original word: ");
			System.out.println(str); //Example word
	
			for (int i=0; i<str.length(); i++){	
				ch= str.charAt(i); //extracts each character
				rstr= ch+rstr; //adds each character in front of the existing string
}
			System.out.println("Reversed word: "+ rstr);
}}
