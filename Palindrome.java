import java.util.Scanner;
public class Palindrome 
{   
    public static void main(String[] args) {   
       	 //String string = "Kayak";    
      	 boolean flag = true;    
           System.out.println("enter the string to check wheather it is palendrome or not");
           Scanner sc=new Scanner(System.in);
        String string=sc.next();
           	//Converts the given string into lowercase 
       	 string = string.toLowerCase();    
           	 //Iterate the string forward and backward, compare one character at a time     
       	 //till middle of the string is reached    
        	for(int i = 0; i < string.length()/2; i++){    
            	if(string.charAt(i) != string.charAt(string.length()-i-1))
{    
                	flag = false;    
                	break;    
           		 }    
      	  }    
        	if(flag)    
            System.out.println("Given string is palindrome");    
        else    
           	 System.out.println("Given string is not a palindrome"); 
        sc.close();   
    }    
}    
