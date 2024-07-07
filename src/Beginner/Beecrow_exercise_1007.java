package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		a = ((a * b) - (c * d)); // calculo da diferença!

		System.out.printf("DIFERENCA = %d\n", a);

		sc.close();
	}

}
