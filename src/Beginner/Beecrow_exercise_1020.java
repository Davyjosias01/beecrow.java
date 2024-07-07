package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day, ano, mes;
		
		day = sc.nextInt();
		ano = day/365; 		day -= ano*365;
		mes = day/30; 		day -= mes*30;
		
		System.out.printf("%d ano(s)\n", ano);
		System.out.printf("%d mes(es)\n", mes);
		System.out.printf("%d dia(s)\n", day);
		
		sc.close();
	}

}
