package Projetos;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Escolha uma operação:");
			
			System.out.println("1. Adição (+)");
			System.out.println("2. Subtração (-)");
			System.out.println("3. Multiplicação (*)");
			System.out.println("4. Divisão (/)");
			System.out.println("5. Potência (^)");
			System.out.println("6. Raiz Quadrada (√)");
			System.out.println("7. Sair ");
			
			System.out.print("\nDigite o número da operação desejada: ");
			
			int escolha = entrada.nextInt();
			
			if (escolha == 7) {
				System.out.println("Encerrando a calculadora");
				break;
			}
				
			System.out.print("Digite o primeiro número: ");
			double num1 = entrada.nextDouble();
			
			System.out.print("Digite o segundo número ");
			double num2 = entrada.nextDouble();
			
			double resultado = 0;
			
			// Logica.
			
			switch (escolha) {
			case 1:
				resultado = num1 + num2;
				break;
			
			case 2 :
				resultado = num1 - num2;
				break;
				
			case 3:
				resultado = num1 * num2;
				break;
				
			case 4:
				if (num2 != 0) {
					resultado = num1 / num2;
				} else {
					System.out.println("ERRO: Divisão por zero!");
				}
				break;
				
			case 5:
				resultado = Math.pow(num1, num2);
				break;
				
			case 6:
				resultado = Math.sqrt(num1);
				break;
				
				default:
					System.out.println("Opção invalida");
			}
			
			System.out.println("\nResultado: " + resultado + " \n");
			
		}
		
		entrada.close();
		
	}

}
