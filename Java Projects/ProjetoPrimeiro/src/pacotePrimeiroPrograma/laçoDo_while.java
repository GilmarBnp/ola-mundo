package pacotePrimeiroPrograma;

import java.util.Scanner;

public class la�oDo_while {

	public static void main(String[] args) {

	// Estrutura de repeti��o
	// Repeti��o de um bloco de c�digo;
	// Diferente do for e do While. A condi��o n�o � testada no �nicio mas sim no final;
	// O do-while ser� sempre executado, pelo menos uma vez;
	
	
		Scanner entrada = new Scanner(System.in);
		char continuar = ' ';
		System.out.println("Deseja continuar (S -Sim. N -N�o?");
		continuar = entrada.nextLine().charAt(0);
		
		/*while (continuar == 'S') {// TESTA ANTES;
			System.out.println("Mensagem");
			System.out.println("Deseja continuar (S -Sim. N -N�o?");
			continuar = entrada.nextLine().charAt(0);
		}*/
		
		do {
			System.out.println("Mensagem");//TESTA DEPOIS
			System.out.println("Deseja continuar (S -Sim. N -N�o?");
			continuar = entrada.nextLine().charAt(0);
		}while (continuar == 'S');
		
		
	}

}
