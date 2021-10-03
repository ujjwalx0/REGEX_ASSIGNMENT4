package Assignments_Regex;
import java.util.Scanner;

public class Methods_Is_Odd {
  public static boolean Is_Odd(int n) {
		    if( n%2 != 0)
		    return true;
		    
  return false;	
			
  }		
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a Number To Check it is Odd or Not: ");
	  int num = sc.nextInt();
	  
	  if(Is_Odd(num))
		  System.out.println(num+" Is  an Odd Number");
	  else
		  System.out.println(num+" Is Not an Odd Number");
	  sc.close();
		
			
		}
	}
		
  

	

			
			
		
		
			
		
		
	