package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time, vel;
		double consum, dist;
		
		time = sc.nextInt();
		vel = sc.nextInt();
		
		dist = time*vel;
		
		consum = dist/12;
		
		System.out.printf("%.3f\n", consum);
		
		sc.close();
	}

}
