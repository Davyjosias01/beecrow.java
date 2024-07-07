package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double val, _100, _50, _20, _10, _5, _2, _1, _05, _025, _01, _005, _001;
		
		val = sc.nextDouble();
		
		_100 = Math.floor(val/100); 	val = val - _100*100;
		_50 = Math.floor(val/50); 		val = val - _50*50;
		_20 = Math.floor(val/20);		val = val - _20*20;
		_10 = Math.floor(val/10);		val = val - _10*10;
		_5 = Math.floor(val/5);			val = val - _5*5;
		_2 = Math.floor(val/2);			val = val - _2*2;
		_1 = Math.floor(val/1);			val = val - _1*1;
		_05 = Math.floor(val/0.5); 		val = val - _05*0.5;
		_025 = Math.floor(val/0.25); 	val = val - _025*0.25;
		_01 = Math.floor(val/0.1); 		val = val - _01*0.1;
		_005 = Math.floor(val/0.05); 	val = val - _005*0.05;
		_001 = (val/0.01); 	val = val - _001*0.01;
		
		
		System.out.println("NOTAS:");
		System.out.printf("%.0f nota(s) de R$ 100.00\n", _100);
		System.out.printf("%.0f nota(s) de R$ 50.00\n", _50);
		System.out.printf("%.0f nota(s) de R$ 20.00\n", _20);
		System.out.printf("%.0f nota(s) de R$ 10.00\n", _10);
		System.out.printf("%.0f nota(s) de R$ 5.00\n", _5);
		System.out.printf("%.0f nota(s) de R$ 2.00\n", _2);

		System.out.println("MOEDAS:");
		System.out.printf("%.0f moeda(s) de R$ 1.00\n", _1);
		System.out.printf("%.0f moeda(s) de R$ 0.50\n", _05);
		System.out.printf("%.0f moeda(s) de R$ 0.25\n", _025);
		System.out.printf("%.0f moeda(s) de R$ 0.10\n", _01);
		System.out.printf("%.0f moeda(s) de R$ 0.05\n", _005);
		System.out.printf("%.0f moeda(s) de R$ 0.01\n", _001);
		
		sc.close();
	}

}
