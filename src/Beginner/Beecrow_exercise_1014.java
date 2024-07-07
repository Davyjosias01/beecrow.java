package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int distance;
		double fuel, media;
		
		distance = sc.nextInt();
		fuel = sc.nextDouble();
		
		media = distance/fuel;
		
		System.out.printf("%.3f km/l\n", media);
		
		sc.close();
	}

}
