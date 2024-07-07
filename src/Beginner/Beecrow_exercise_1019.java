package Beginner;

import java.util.Scanner;

public class Beecrow_exercise_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sec, min, hour;
		sec = sc.nextInt();

		hour = sec / 3600;
		sec -= hour * 3600;
		min = sec / 60;
		sec -= min * 60;

		System.out.printf("%d:%d:%d\n", hour, min, sec);

		sc.close();
	}

}
