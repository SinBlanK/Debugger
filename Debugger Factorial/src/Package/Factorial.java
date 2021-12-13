package Package;


import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int num = r.nextInt();
		long factorial = 1;
		for (int i = 0; i < num; i++) {
			factorial = factorial * i;
		}System.out.println(factorial);
	}
	
	
	
}
