package projeto2;

import java.util.Scanner;

public class projeto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int valor1 = 0, valor2 = 75, valor3 = 0;
	Scanner ent = new Scanner(System.in);
	
	System.out.println("Digite um n�mero inteiro para a vari�vel valor1: ");
	valor1= ent.nextInt();
	valor2 += valor1;
	
	if (valor1 % 2 == 0)
		valor3 = valor1 * 5;
	else if (valor1 % 3 == 0)
		valor3 = valor2 * 9;
	
	else
		valor3 = valor2;
	
	System.out.printf("O valor da vari�vel valor3 �: %d.", valor3);
	System.out.printf("O valor da vari�vel valor2 �: %d.", valor2);
	System.out.printf("O valor da vari�vel valor1 �: %d.", valor1);
	}

}
// A vari�vel valor2 j� possui o pr�vio valor inteiro 75. Na linha 10, esse n�mero ser� acumulado com o valor 32, 
// presente na vari�vel valor1. O valor final da vari�vel valor2 ser� 107. valor2 += valor1 = valor2 + valor1; valor2 = 75 + 32;


// No programa da Figura 07, podemos ter uma situa��o em que nos d� a impress�o que o if e o else if deveriam retornar 
// verdadeiro (true) ao mesmo tempo. Isso acontece quando informamos, por exemplo, o valor inteiro 60. Esse valor
// � divis�vel por 2 e ao mesmo tempo por 3, dando assim a ideia que tanto o if quanto o else if seriam executados. 
// Sabemos que, da forma como o programa 
// est� estruturado, isso n�o � poss�vel. Por que isso acontece?

