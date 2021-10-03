package Assignments_Regex;
import java.util.Scanner;

public class Method_Odd_Even {
	public static void Odd_Even(int n) {
		if (n%2==0)
			System.out.println(n+" is even Number");
		else
			System.out.println(n+ " is Odd Number");
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number To Check it is Even or Odd :");
		int num=sc.nextInt();
		
		new Method_Odd_Even().Odd_Even(num);
		sc.close();

	}

}
