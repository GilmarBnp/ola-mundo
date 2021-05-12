package pacotePrimeiroPrograma;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {

		
		// Arrays ou vetores;
		// Uma lista de variáveis relacionadas;
		// A variável possui muitos valores;
		// Em compartimentos;
		// Esses compartimentos são referenciados por índices;
		// Valores contiguos na memória;
		// É como uma gaveta com vários compartimentos;
		// Só podem armazenar variáveis do mesmo tipo;
		// Tem que usar indices que começa no "0";
		
		//tipo[] nome = new tipo[tamanho];
		  int[] numeros = new int[10];  //Quer que armazene 5 valores;
		  int total = 0, i = 0;
		//numeros = 10; Não dá mais pra fazer assim, porque numeros agora é um array, é preciso falar qual é a posição, já que agora temos 5 posições;
		Scanner entrada = new Scanner(System.in);
		
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Digite o %d número.", i + 1);// não está dando atribuição, só se fosse =i+1; só para  começar "Digite o número pelo 1"
			numeros[i]= entrada.nextInt();  //o i++ adiciona +1 para a variável "numeros";
			total = total + numeros[i];
			System.out.printf("Total parcial: %d\n", total);
		
		}
		
		
		System.out.printf("O valor de total é: %d.", total); //%d inteiro;
		
		
		/* Modo mais díficil de fazer:
		   
		System.out.println("Digite o primeiro número.");
		numeros[0]= entrada.nextInt();  
		//sempre começa no "0";
		
		System.out.println("Digite o segundo número.");
		numeros[1]= entrada.nextInt();  
		
		System.out.println("Digite o terceiro número.");
		numeros[2]= entrada.nextInt();  
	
		System.out.println("Digite o quarto número.");
		numeros[3]= entrada.nextInt(); 
		
		System.out.println("Digite o quinto número.");
		numeros[4]= entrada.nextInt(); 
		
		total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
		
		System.out.printf("O valor de total é: %d.", total); //%d inteiro;
		
		*/
		
		
	
	}

}
