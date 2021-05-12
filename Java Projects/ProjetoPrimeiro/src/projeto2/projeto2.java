package projeto2;

import java.util.Scanner;

public class projeto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int valor1 = 0, valor2 = 75, valor3 = 0;
	Scanner ent = new Scanner(System.in);
	
	System.out.println("Digite um número inteiro para a variável valor1: ");
	valor1= ent.nextInt();
	valor2 += valor1;
	
	if (valor1 % 2 == 0)
		valor3 = valor1 * 5;
	else if (valor1 % 3 == 0)
		valor3 = valor2 * 9;
	
	else
		valor3 = valor2;
	
	System.out.printf("O valor da variável valor3 é: %d.", valor3);
	System.out.printf("O valor da variável valor2 é: %d.", valor2);
	System.out.printf("O valor da variável valor1 é: %d.", valor1);
	}

}
// A variável valor2 já possui o prévio valor inteiro 75. Na linha 10, esse número será acumulado com o valor 32, 
// presente na variável valor1. O valor final da variável valor2 será 107. valor2 += valor1 = valor2 + valor1; valor2 = 75 + 32;


// No programa da Figura 07, podemos ter uma situação em que nos dá a impressão que o if e o else if deveriam retornar 
// verdadeiro (true) ao mesmo tempo. Isso acontece quando informamos, por exemplo, o valor inteiro 60. Esse valor
// é divisível por 2 e ao mesmo tempo por 3, dando assim a ideia que tanto o if quanto o else if seriam executados. 
// Sabemos que, da forma como o programa 
// está estruturado, isso não é possível. Por que isso acontece?

