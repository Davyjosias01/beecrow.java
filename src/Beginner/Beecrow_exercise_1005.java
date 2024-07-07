package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble() * 3.5;
		double y = sc.nextDouble() * 7.5;
		double media = (x + y) / 11; // calculo de média baseado na soma dos pesos

		System.out.printf("MEDIA = %.5f\n", media);

		sc.close();
	}
}
