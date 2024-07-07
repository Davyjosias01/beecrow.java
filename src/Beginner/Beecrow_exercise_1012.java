package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double rA, rB, rC, rD, rE;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		rA = (c*a)/2;
		rB = 3.14159*Math.pow(c, 2);
		rC = ((a+b)*c)/2;
		rD = b*b;
		rE = a*b;
		
		System.out.printf("TRIANGULO: %.3f\n", rA);
		System.out.printf("CIRCULO: %.3f\n", rB);
		System.out.printf("TRAPEZIO: %.3f\n", rC);
		System.out.printf("QUADRADO: %.3f\n", rD);
		System.out.printf("RETANGULO: %.3f\n", rE);
		
		sc.close();
	}

}
