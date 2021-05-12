package pacotePrimeiroPrograma;

import java.util.Scanner;

public class praticaIntegradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Criar um programa que ler diversos n�meros e toma certas decis�es a parti deles;
	// estou usando o do while porque eu quero que o menu apare�a pelo menos uma vez, nem que seja para o usu�rio sair;	
	// case = caso;	
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumero = new Scanner(System.in);
		char operacao = ' ';
		int[] numeros = new int[1000]; //para coletar os n�meros; numeros inteiros;
		int i = 0, somatorio = 0, contaPares = 0;
		double media  = 0; // porque recebe divis�o, pode receber n�meros fracion�rios;
		
		do {
			System.out.printf("Menu de op��es.\n" + "D - para digitar novos n�meros.\n" + "Z - para apresentar somat�rio dos n�meros.\n"
		     + "V - para visualizar todos n�meros digitados.\n" + "P - para a quantidade de n�meros digitados.\n" 
			 + "M - para a m�dia simples dos n�meros digitados.\n" + "Q - para a quantidade de pares.\n + S - para sair.\n");
			operacao = entCaracter.nextLine().charAt(0);
		
		switch (operacao) {
		case 'D': 
			System.out.println("Digite o n�mero desejado.");
			numeros[i] = entNumero.nextInt();
			i++;// digitou um n�mero ai inclementa, para ficar sempre na pr�xima posi��o;
			break;
		
		case 'Z':
			for (int j = 0; j < i; j++) {
			somatorio = somatorio + numeros[j];
			System.out.printf("O somat�rio dos n�meros �: %d\n", somatorio);
		
			}
			break;
			
		
		case 'V':
		for (int j = 0; j < i; j++) {
			System.out.printf("%d\n", numeros[j]);
			
		}
		break;
		
		case 'P':
			System.out.printf("Foram digitados %d n�meros.\n", i);// porque i guarda sempre a posi��o do pr�ximo n�mero, que est� vazio, come�a no "0"
			break;                                             // Estava i-1 mas estava mostrando um n�mero a menos, dos n�meros que foram digitados;
		                                                       // O "i" esta armazenando todos os n�meros digitados, cada posi��o � um n�mero; i[0],i[1] etc...
		case 'M':                                              // O "i" j� come�a no 0;
			for (int j = 0; j < i; j++) {
			somatorio = somatorio + numeros[j];
			media = somatorio / (i-1);// o i est� sempre uma posi��o a frente do que foi digitado;
			System.out.printf("A m�dia �: %.2f\n", media); // %.2f, %d da erro, %.2f � para mostrar n�meros fracion�rios; 
			
		}
			break;
			
		
		case 'Q':
			for (int j = 0; j < i; j++) {
				if (numeros [j] % 2 == 0)//significa que o n�mero � par;
					contaPares = contaPares + 1;
			}
			System.out.printf("A quantidade de n�meros pares �: %d.\n", contaPares);
		
		case 'S':
			break;
		
		default:
		System.out.printf("Op��o invalida.");	
		
		}
		
		
			
		} while (operacao != 'S'); // Enquanto for diferente de 'S' o programa vai ficar repetindo;
	
		System.out.println("Fim da execu��o.");
	 
	}

}