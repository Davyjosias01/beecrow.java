package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = sc.nextInt();
		x = sc.nextInt() * x;
		// x = x * y;
		System.out.printf("PROD = %d\n", x);

		sc.close();
	}
}
