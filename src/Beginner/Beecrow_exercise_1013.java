package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maior = (a+b+Math.abs(a-b))/2;
		maior = (maior+c+Math.abs(maior-c))/2;
		
		System.out.printf("%d eh o maior\n", maior);
				
		sc.close();
	}

}
