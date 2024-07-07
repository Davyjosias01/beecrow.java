package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int val, _100, _50, _20, _10, _5, _2, _1;
		
		val = sc.nextInt();
		
		System.out.printf("%d\n", val);
		
		_100 = val / 100; 	val = val - _100*100;
		_50 = val/50; 		val = val - _50*50;
		_20 = val/20;		val = val - _20*20;
		_10 = val/10;		val = val - _10*10;
		_5 = val/5;		val = val - _5*5;
		_2 = val/2;		val = val - _2*2;
		_1 = val/1;		val = val - _1*1;
		
		
		System.out.printf("%d nota(s) de R$ 100,00\n", _100);
		System.out.printf("%d nota(s) de R$ 50,00\n", _50);
		System.out.printf("%d nota(s) de R$ 20,00\n", _20);
		System.out.printf("%d nota(s) de R$ 10,00\n", _10);
		System.out.printf("%d nota(s) de R$ 5,00\n", _5);
		System.out.printf("%d nota(s) de R$ 2,00\n", _2);
		System.out.printf("%d nota(s) de R$ 1,00\n", _1);
		
		sc.close();
	}

}
