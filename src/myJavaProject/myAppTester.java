 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  
	  myTestMethod("1234321");
	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }

	// add your test method in this space then remove the block comment symbols
	public static void myTestMethod(String str) {
	
		int i = 0;
	    for (; i < str.length() / 2; i++)
	    	if (str.charAt(i) != str.charAt(str.length() - 1 - i))
	    		break;
	    
	    if (i == str.length() / 2)
	    	System.out.println("String is a palindrome");
	    else
	    	System.out.println("String is not a palindrome");
	
	}
	 
	   

}
