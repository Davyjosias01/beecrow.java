package Examples;
import java.util.Scanner;

public class Char_n_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Capturando várias entradas de uma vez;
		/*
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble(); //As entradas com . ou , dependem da lingua nativa denominada à máquina.
		System.out.println("Informações digitadas: ");
		System.out.printf("%s, %d, %.2f", x, y, z);
		*/
		
		//Capturando uma string por linha
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.printf("Dados: \n%d, \n%s, \n%s, \n%s", x, s1, s2, s3);
		

		
		
		//Função charAt(); captura o char na posição delimitada entre parenteses;
		/*
		char x;
		x = sc.next().charAt(2);
		System.out.println("Valor: " + x);
		*/
		
		
		
		
		sc.close();
	}
	
	
}
