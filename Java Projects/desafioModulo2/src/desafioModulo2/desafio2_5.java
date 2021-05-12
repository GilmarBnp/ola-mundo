package desafioModulo2;

import java.util.Scanner;

public class desafio2_5 {

	public static void main(String[] args) {
		
	int n = 0, somador = 0;
	Scanner entrada = new Scanner(System.in);
	int i = 0;
	while (i < 10) {
		System.out.println("Digite números");
		n = entrada.nextInt();
		somador = somador + n;
		i++;
		System.out.printf("O valor somado é: %d.", somador);
	
	}
	
	
	}

}
