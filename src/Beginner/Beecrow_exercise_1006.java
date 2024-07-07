package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1006 {
	public static void main(String[] aargs) {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble() * 2;
		double y = sc.nextDouble() * 3;
		double z = sc.nextDouble() * 5;

		double media = (x + y + z) / 10; // calculo de média baseado na soma dos pesos

		System.out.printf("MEDIA = %.1f\n", media);

		sc.close();
	}
}
