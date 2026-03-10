package FontesAppCalculadora;

import java.util.Scanner;

public class CalculadoraAritmetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double valor1, valor2;
		double opcao = 0;
		
		System.out.println("Valor1: ");
		valor1 = sc.nextInt();
		
		System.out.println("Valor2: ");
		valor2 = sc.nextInt();
		
		System.out.println("Digite sua opção: \n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir");
		
		if (opcao == 1) {
			System.out.println(somar(valor1, valor2)); 
		}else if (opcao == 2) {
			System.out.println(subtrair(valor1, valor2));
		}else if (opcao == 3) {
			System.out.println(multiplicar(valor1, valor2));
		}
		else {
			System.out.println(dividir(valor1, valor2));
		}
		
	}
	
	private int resultadoConta = 0;
	
	public static double somar(double valor1, double valor2) {
		double resultadoConta = valor1 + valor2;
		return resultadoConta;
	}
	
	public static double subtrair(double valor1, double valor2) {
		double resultadoConta = valor1 - valor2;
		return resultadoConta;
	}
	
	public static double multiplicar(double valor1, double valor2) {
		double resultadoConta = valor1 * valor2;
		return resultadoConta;
	}
	
	public static double dividir(double valor1, double valor2) {
		double resultadoConta = valor1 / valor2;
		return resultadoConta;
	}
	

}
