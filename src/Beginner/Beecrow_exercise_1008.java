package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num, hour;
		double pHour;

		num = sc.nextInt();
		hour = sc.nextInt();
		pHour = sc.nextDouble();

		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f\n", pHour * hour);

		sc.close();
	}
}
