package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1010 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod = 0, quant = 0;
		double price = 0, fPrice = 0;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		price = sc.nextDouble();
		fPrice = price * quant;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		price = sc.nextDouble();
		fPrice = fPrice + price * quant;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", fPrice);
		
		sc.close();
	}
}
