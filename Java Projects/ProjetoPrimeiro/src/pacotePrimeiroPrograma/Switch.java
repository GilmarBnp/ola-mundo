package pacotePrimeiroPrograma;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Fornece uma ramifica��o com v�rios caminhos;
	// Permite que o programa escolha entre v�rios caminhos;
	// O valor de uma express�o � verificado em uma lista de constantes;
	// Quando uma ocorr�ncia � encontrada, as instru��es associadas a essa ocorr�ncia s�o executadas;
	
	char operacao = ' ';
	Scanner ent = new Scanner(System.in);
	double n1 = 0, n2 = 0, total = 0;
	
	System.out.println("Digite o valor do primeiro n�mero: ");
	n1 = ent.nextInt();
	
	System.out.println("Digite o valor do segundo n�mero: ");
	n2 = ent.nextInt();
	
	ent.nextLine();// usadp para n�o dar um erro, assim limpa a entrada
	System.out.println("Digite a opera��o desejada (+,-,/,*,%): ");
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
			System.out.println("Opera��o desconhecida");
			

	
	}
	// temos que declarar as vari�veis, ex total = 0 se n�o d� erro;
	System.out.printf("%.2f %c %.2f = %.2f", n1, operacao, n2, total);// %.2f ponto flutuante, %c caracter, ponto flutuante, ponto flutuante. 
	
	}

}
