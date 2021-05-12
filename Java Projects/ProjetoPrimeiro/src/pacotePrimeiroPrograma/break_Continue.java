package pacotePrimeiroPrograma;

import java.util.Scanner;

public class break_Continue {

	public static void main(String[] args) {
		
		/* O break � usado para sair de um la�o;
		 * Quando um comando break � encontrado, imediatamente encerra o la�o, e o comando posterior � executado imediatamente;
		 * O continue � usado para for�ar uma itera��o antecipada do la�o;
		 * Ignora sua estrutura de controle normal; 
		 * while significa "Enquanto";
		 */
		
		
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio =0;
		
		System.out.println("Digite o n�mero desejado: ");	
		numero = entrada.nextInt();	
		
		while (numero > 0) {
		
		somatorio = somatorio + numero;
		System.out.println("Digite o n�mero desejado: ");	
		numero = entrada.nextInt();		
		
		if (numero == 18) // Se digitar 18 o programa para;
			break;
		
		}
		
		System.out.printf("A somat�rio foi: %d. ", somatorio);
		
		
		
	}

}
