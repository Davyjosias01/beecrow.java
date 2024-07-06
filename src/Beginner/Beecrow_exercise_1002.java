package Beginner;
import java.util.Scanner;

public class Beecrow_exercise_1002 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area;
		raio = sc.nextDouble();
		area = 3.14159*Math.pow(raio, 2); //Math.pow solicita 2 doubles!
		System.out.printf("A=%.4f\n", area);
	
		sc.close();
	}
}
