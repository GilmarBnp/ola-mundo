package pacotePrimeiroPrograma;

import java.util.Scanner;

public class praticaIntegradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Criar um programa que ler diversos números e toma certas decisões a parti deles;
	// estou usando o do while porque eu quero que o menu apareça pelo menos uma vez, nem que seja para o usuário sair;	
	// case = caso;	
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumero = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000]; //para coletar os números; numeros inteiros;
		int i = 0, somatorio = 0, contaPares = 0;
		double media  = 0; // porque recebe divisão, pode receber números fracionários;
		
		do {
			System.out.printf("Menu de opções.\n" + "D - para digitar novos números.\n" + "Z - para apresentar somatório dos números.\n"
		     + "V - para visualizar todos números digitados.\n" + "P - para a quantidade de números digitados.\n" 
			 + "M - para a média simples dos números digitados.\n" + "Q - para a quantidade de pares.\n + S - para sair.\n");
			operacao = entCaracter.nextLine().charAt(0);
		
		switch (operacao) {
		case 'D': 
			System.out.println("Digite o número desejado.");
			numeros[i] = entNumero.nextInt();
			i++;// digitou um número ai inclementa, para ficar sempre na próxima posição;
			break;
		
		case 'Z':
			for (int j = 0; j < i; j++) {
			somatorio = somatorio + numeros[j];
			System.out.printf("O somatório dos números é: %d\n", somatorio);
		
			}
			break;
			
		
		case 'V':
		for (int j = 0; j < i; j++) {
			System.out.printf("%d\n", numeros[j]);
			
		}
		break;
		
		case 'P':
			System.out.printf("Foram digitados %d números.\n", i);// porque i guarda sempre a posição do próximo número, que está vazio, começa no "0"
			break;                                             // Estava i-1 mas estava mostrando um número a menos, dos números que foram digitados;
		                                                       // O "i" esta armazenando todos os números digitados, cada posição é um número; i[0],i[1] etc...
		case 'M':                                              // O "i" já começa no 0;
			for (int j = 0; j < i; j++) {
			somatorio = somatorio + numeros[j];
			media = somatorio / (i-1);// o i está sempre uma posição a frente do que foi digitado;
			System.out.printf("A média é: %.2f\n", media); // %.2f, %d da erro, %.2f é para mostrar números fracionários; 
			
		}
			break;
			
		
		case 'Q':
			for (int j = 0; j < i; j++) {
				if (numeros [j] % 2 == 0)//significa que o número é par;
					contaPares = contaPares + 1;
			}
			System.out.printf("A quantidade de números pares é: %d.\n", contaPares);
		
		case 'S':
			break;
		
		default:
		System.out.printf("Opção invalida.");	
		
		}
		
		
			
		} while (operacao != 'S'); // Enquanto for diferente de 'S' o programa vai ficar repetindo;
	
		System.out.println("Fim da execução.");
	 
	}

}