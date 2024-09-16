package pattern_programming;

import java.util.Scanner;

public class StarProgram3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printStar3(n);
		sc.close();
		
	}
	public static void printStar3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				
				System.out.println();
		}
	}

}
