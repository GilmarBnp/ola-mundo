package pacotePrimeiroPrograma;

import java.util.Scanner;

public class instruçãoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//if (condição) "se"
		//instrução1;
		//se a expressão condicional for verdadeira a instrução1 será executada; Caso contrário o else será executado; nunca ambos serão executados;
		
	//else "se não"
		//instrução2;
		
	// A condição que controla o if deve produzir um resultado booleano, de true ou false;
	String alfabeto = "abcdefghijklmnopqrstuvwxyt";
	alfabeto.indexOf(0);
	char caractereDigitado, resposta = 'k';
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Tente adivinhar a letra de A até Z: ");
	caractereDigitado = entrada.nextLine().charAt(0);
	if (caractereDigitado == resposta) System.out.println("Resposta Correta");
	
	else
		System.out.println("Tente novamente");
	
	
	}



}
