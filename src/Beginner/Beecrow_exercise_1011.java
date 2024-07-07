package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio, volume;

		raio = sc.nextDouble();

		volume = 4.0 / 3.0 * (3.14159 * Math.pow(raio, 3));

		System.out.printf("VOLUME = %.3f\n", volume);

		sc.close();
	}
}
