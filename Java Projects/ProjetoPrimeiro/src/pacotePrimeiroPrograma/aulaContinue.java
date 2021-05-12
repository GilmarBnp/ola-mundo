package pacotePrimeiroPrograma;

import java.util.Scanner;

public class aulaContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numero = 0, somatorio = 0, contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite os números positivos ou zero para sair.");
			numero = entrada.nextInt();
	
			if (numero == 18)
				continue; // o continue não executa o que está para baixo e volta para o "do"; Mas sem sair como fazia o break;
		
		somatorio = somatorio + numero;
			
		} while (numero > 0); // se o número for zero ou que menor que zero, ativa a condição while.
		System.out.printf("O somatório é: %d", somatorio);
	

}

}	
	