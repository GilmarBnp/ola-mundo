package pacotePrimeiroPrograma;

import java.util.Scanner;

public class instru��oIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//if (condi��o) "se"
		//instru��o1;
		//se a express�o condicional for verdadeira a instru��o1 ser� executada; Caso contr�rio o else ser� executado; nunca ambos ser�o executados;
		
	//else "se n�o"
		//instru��o2;
		
	// A condi��o que controla o if deve produzir um resultado booleano, de true ou false;
	String alfabeto = "abcdefghijklmnopqrstuvwxyt";
	alfabeto.indexOf(0);
	char caractereDigitado, resposta = 'k';
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Tente adivinhar a letra de A at� Z: ");
	caractereDigitado = entrada.nextLine().charAt(0);
	if (caractereDigitado == resposta) System.out.println("Resposta Correta");
	
	else
		System.out.println("Tente novamente");
	
	
	}



}
