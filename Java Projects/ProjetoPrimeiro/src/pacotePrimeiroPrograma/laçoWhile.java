package pacotePrimeiroPrograma;

import java.util.Scanner;

public class la�oWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Estrutura de repeti�ao;
	// Repeti��o de um bloco de c�digo;
	// La�o While: quantidade de repeti��o desconhecida;
	// Possui apenas a condi��o;
	// Enquanto a condi��o for verdadeira o la�o continua repetindo;
	// A condi��o vem logo no in�cio;	
		
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contaNumeros = 0;
		
		// enquanto sa�da for diferente de 'S' fica em loop, sa�da est� igual a 'N', ou seja diferente de 'S';
		while (saida != 'S') {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			entrada.nextLine(); // se usar o mesmo Scanner para n�mero e letra d� erro, ent�o coloca isso para limpar o Scanner;
			System.out.println("Gostaria de sair? (S -sim. N - N�o)?");
			saida = entrada.nextLine().charAt(0);
			somatorio = somatorio + numero;	
			contaNumeros++;
		}
	
		System.out.printf("O somatorio � %d.", somatorio);
		System.out.printf("Foram digitados %d n�meros.", contaNumeros);
	}

}
