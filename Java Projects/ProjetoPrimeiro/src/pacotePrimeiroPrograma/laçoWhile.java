package pacotePrimeiroPrograma;

import java.util.Scanner;

public class laçoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Estrutura de repetiçao;
	// Repetição de um bloco de código;
	// Laço While: quantidade de repetição desconhecida;
	// Possui apenas a condição;
	// Enquanto a condição for verdadeira o laço continua repetindo;
	// A condição vem logo no início;	
		
		char saida = 'N';
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0, contaNumeros = 0;
		
		// enquanto saída for diferente de 'S' fica em loop, saída está igual a 'N', ou seja diferente de 'S';
		while (saida != 'S') {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			entrada.nextLine(); // se usar o mesmo Scanner para número e letra dá erro, então coloca isso para limpar o Scanner;
			System.out.println("Gostaria de sair? (S -sim. N - Não)?");
			saida = entrada.nextLine().charAt(0);
			somatorio = somatorio + numero;	
			contaNumeros++;
		}
	
		System.out.printf("O somatorio é %d.", somatorio);
		System.out.printf("Foram digitados %d números.", contaNumeros);
	}

}
