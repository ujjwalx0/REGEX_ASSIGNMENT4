package Assignments_Regex;
import java.util.Scanner;

public class Methods_Multiplication_Table {
	public static void Multiplication_Table(int n) {
		
		for (int i=1;i<=10;i++)
			System.out.println(n+"*"+i+" = "+ i*n);
			
	}		
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num =sc.nextInt();
		new Methods_Multiplication_Table().Multiplication_Table(num);
			
		
		sc.close();

	
		

	}

}
