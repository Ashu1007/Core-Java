package pattern_programming;

import java.util.Scanner;

public class StarSquar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		printStarSquar(n);
		sc.close();
	}
	public static void printStarSquar(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
