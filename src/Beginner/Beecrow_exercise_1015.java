package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double result, x1,y1, x2, y2;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		result = Math.sqrt( Math.pow( (x2-x1), 2 ) + Math.pow( (y2-y1), 2 ) );
		
		System.out.printf("%.4f\n", result);
				
		sc.close();
	}

}
