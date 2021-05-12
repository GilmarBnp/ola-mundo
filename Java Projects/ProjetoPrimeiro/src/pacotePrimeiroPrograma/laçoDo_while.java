package pacotePrimeiroPrograma;

import java.util.Scanner;

public class laçoDo_while {

	public static void main(String[] args) {

	// Estrutura de repetição
	// Repetição de um bloco de código;
	// Diferente do for e do While. A condição não é testada no ínicio mas sim no final;
	// O do-while será sempre executado, pelo menos uma vez;
	
	
		Scanner entrada = new Scanner(System.in);
		char continuar = ' ';
		System.out.println("Deseja continuar (S -Sim. N -Não?");
		continuar = entrada.nextLine().charAt(0);
		
		/*while (continuar == 'S') {// TESTA ANTES;
			System.out.println("Mensagem");
			System.out.println("Deseja continuar (S -Sim. N -Não?");
			continuar = entrada.nextLine().charAt(0);
		}*/
		
		do {
			System.out.println("Mensagem");//TESTA DEPOIS
			System.out.println("Deseja continuar (S -Sim. N -Não?");
			continuar = entrada.nextLine().charAt(0);
		}while (continuar == 'S');
		
		
	}

}
