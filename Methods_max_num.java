package Assignments_Regex;
import java.util.Scanner;

public class Methods_max_num {
	public static int Max(int n1, int n2 , int n3) {
		
		int largest = (n1>n2) ? (n1>n3? n1:n3) :(n2>n3? n2:n3);
		
		return largest;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number :");
		int x=sc.nextInt();
		System.out.println("Enter The Second Number :");
		int y=sc.nextInt();
		System.out.println("Enter The Third Number :");
		int z=sc.nextInt();
		System.out.println("The Largest Number is:  "+Max(x,y,z));
		sc.close();
	}

}
