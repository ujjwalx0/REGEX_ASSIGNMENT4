package Assignments_Regex;
import java.util.Scanner;

public class Methods_Factorial {
	public static int factorial (int n) {
		if (n==1)
			return 1;
		else 
			return (n*factorial(n-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Print its Factorial :");
		int num = sc.nextInt();
		
	
		System.out.println("Factorial of "+num+" is "+factorial(num));
		sc.close();
		
	}

}
