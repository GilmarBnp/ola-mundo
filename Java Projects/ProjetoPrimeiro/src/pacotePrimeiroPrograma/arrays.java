package pacotePrimeiroPrograma;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {

		
		// Arrays ou vetores;
		// Uma lista de vari�veis relacionadas;
		// A vari�vel possui muitos valores;
		// Em compartimentos;
		// Esses compartimentos s�o referenciados por �ndices;
		// Valores contiguos na mem�ria;
		// � como uma gaveta com v�rios compartimentos;
		// S� podem armazenar vari�veis do mesmo tipo;
		// Tem que usar indices que come�a no "0";
		
		//tipo[] nome = new tipo[tamanho];
		  int[] numeros = new int[10];  //Quer que armazene 5 valores;
		  int total = 0, i = 0;
		//numeros = 10; N�o d� mais pra fazer assim, porque numeros agora � um array, � preciso falar qual � a posi��o, j� que agora temos 5 posi��es;
		Scanner entrada = new Scanner(System.in);
		
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Digite o %d n�mero.", i + 1);// n�o est� dando atribui��o, s� se fosse =i+1; s� para  come�ar "Digite o n�mero pelo 1"
			numeros[i]= entrada.nextInt();  //o i++ adiciona +1 para a vari�vel "numeros";
			total = total + numeros[i];
			System.out.printf("Total parcial: %d\n", total);
		
		}
		
		
		System.out.printf("O valor de total �: %d.", total); //%d inteiro;
		
		
		/* Modo mais d�ficil de fazer:
		   
		System.out.println("Digite o primeiro n�mero.");
		numeros[0]= entrada.nextInt();  
		//sempre come�a no "0";
		
		System.out.println("Digite o segundo n�mero.");
		numeros[1]= entrada.nextInt();  
		
		System.out.println("Digite o terceiro n�mero.");
		numeros[2]= entrada.nextInt();  
	
		System.out.println("Digite o quarto n�mero.");
		numeros[3]= entrada.nextInt(); 
		
		System.out.println("Digite o quinto n�mero.");
		numeros[4]= entrada.nextInt(); 
		
		total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
		
		System.out.printf("O valor de total �: %d.", total); //%d inteiro;
		
		*/
		
		
	
	}

}
