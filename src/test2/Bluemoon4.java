package test2;

import java.util.Scanner;

public class Bluemoon4 {
	// n번째 피보나치수열 구하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(Fibonacci(n - 1));

	}

	public static int Fibonacci(int n) {
		if (n <= 1)
			return 1;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);

	}

}

