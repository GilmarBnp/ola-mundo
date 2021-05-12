package pacotePrimeiroPrograma;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Fornece uma ramificação com vários caminhos;
	// Permite que o programa escolha entre vários caminhos;
	// O valor de uma expressão é verificado em uma lista de constantes;
	// Quando uma ocorrência é encontrada, as instruções associadas a essa ocorrência são executadas;
	
	char operacao = ' ';
	Scanner ent = new Scanner(System.in);
	double n1 = 0, n2 = 0, total = 0;
	
	System.out.println("Digite o valor do primeiro número: ");
	n1 = ent.nextInt();
	
	System.out.println("Digite o valor do segundo número: ");
	n2 = ent.nextInt();
	
	ent.nextLine();// usadp para não dar um erro, assim limpa a entrada
	System.out.println("Digite a operação desejada (+,-,/,*,%): ");
	operacao = ent.nextLine().charAt(0);
	
	switch (operacao) {
		case '+':
		total = n1 + n2;
		break; // sair do switch case;
	
		case '-':
			total = n1 - n2;
			break; 
	
		case '*':
			total = n1 * n2;
			break; 
	
		case '/':
			total = n1 / n2;
			break; 
	
		case '%':
			total = n1 % n2;
			break; 
			default:// caractere desconhecido;
			System.out.println("Operação desconhecida");
			

	
	}
	// temos que declarar as variáveis, ex total = 0 se não dá erro;
	System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);// %.2f ponto flutuante, %c caracter, ponto flutuante, ponto flutuante. 
	
	}

}
