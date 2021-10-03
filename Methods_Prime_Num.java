package Assignments_Regex;
import java.util.Scanner;

public class Methods_Prime_Num {
	public static void Prime_Num(int n) {
		int count= 0 , i;
		for (i=2;i<=n/2;i++)
			if(n%i==0) {
				count++;
		        break; }
		if (count==0) {
		System.out.println(n+" Is Prime");}
		
		else 
			
		System.out.println(n+" Is Not Prime");
	}

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number To Check it is Prime or Not :");
	int num= sc.nextInt();
	
	
	new Methods_Prime_Num().Prime_Num(num);
	sc.close();
    }

    }	


			
		
		
	