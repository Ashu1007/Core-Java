package pattern_programming_2;

import java.util.Scanner;

public class StarPrint3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the input:");
		int n=sc.nextInt();
		printPattern(n);
		sc.close();
	}
	public static void printPattern(int n) {
		int space=0;
		int star=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			space++;
			star--;
			System.out.println();
		}
	}

}
