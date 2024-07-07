package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		x = x + y;
		System.out.printf("X = %d\n", x);

		sc.close();
	}
}
