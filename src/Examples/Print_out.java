package Examples;

import java.util.Locale;

public class Print_out {
	
	public static void main(String[] args) {
		double x = 10.34243;
		int idade = 34;
		float renda = 2571.57f;
		String nome = "Davy";
		
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.print("");
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		//existem duas maneiras de apresentar variáveis em um printf no JAVA
		System.out.println("Resultado = " + x + "metros%n");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos, e ganha R$ %.2f reais mensais.%n", nome, idade, renda);
		
	}
	
}
