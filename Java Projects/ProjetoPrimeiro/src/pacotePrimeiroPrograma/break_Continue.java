package pacotePrimeiroPrograma;

import java.util.Scanner;

public class break_Continue {

	public static void main(String[] args) {
		
		/* O break é usado para sair de um laço;
		 * Quando um comando break é encontrado, imediatamente encerra o laço, e o comando posterior é executado imediatamente;
		 * O continue é usado para forçar uma iteração antecipada do laço;
		 * Ignora sua estrutura de controle normal; 
		 * while significa "Enquanto";
		 */
		
		
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio =0;
		
		System.out.println("Digite o número desejado: ");	
		numero = entrada.nextInt();	
		
		while (numero > 0) {
		
		somatorio = somatorio + numero;
		System.out.println("Digite o número desejado: ");	
		numero = entrada.nextInt();		
		
		if (numero == 18) // Se digitar 18 o programa para;
			break;
		
		}
		
		System.out.printf("A somatório foi: %d. ", somatorio);
		
		
		
	}

}
