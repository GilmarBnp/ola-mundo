package pacotePrimeiroPrograma;

import java.util.Scanner;

public class ifAninhados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Um if dentro do outro;
		
	// S�o muito utilizados, pois permitem uma nova sele��o baseada na sele��o anterior;
		
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		n1 = entrada.nextInt();
	
		System.out.println("Digite o segundo n�mero: ");
		n2 = entrada.nextInt();
	
	if (n1 == n2)
	System.out.println("Os n�meros s�o iguais.");

	else {
		if (n1 > n2)
			System.out.println("N1 � maior que N2.");
		else 
			System.out.println("N2 � maior que N1.");
			
	}
	
	
	}

}
