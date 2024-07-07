package Beginner;

import java.util.Scanner;

public class Beecrowd_exercise_1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, delta, x1, x2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = (b*b)-(4*a*c);
		
		if((2*a == 0) || (delta < 0)){
			System.out.println("Impossivel calcular");	
		} else {
			delta = Math.sqrt(delta);
			
			x1 = ((b*-1)+delta)/(2*a);
			x2 = ((b*-1)-delta)/(2*a);
			
			System.out.printf("R1 = %.5f\n", x1);
			System.out.printf("R2 = %.5f\n", x2);
		}
		
		sc.close();
	}

}
