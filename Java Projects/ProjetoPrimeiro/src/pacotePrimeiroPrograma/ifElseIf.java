package pacotePrimeiroPrograma;

import java.util.Scanner;

public class ifElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if-else-if;
		// Um if dentro do outro;
		
	//if (Condi��o 1) Se vc est� com um camisa azul;
		//instru��o1; acontece tal coisa;
	//else if (Condi��o2)(Se n�o): Se vc est� com uma camisa preta;
		//instru��o2; acontece tal coisa;
	//else if (Condi��o3)(Se n�o): Se vc est� com uma camisa branca;
		//instru��o3;acontece tal coisa;
		//.
		//.
		//.
		//else
	    //instru��o_n;
	
	// Pode ter 1 ou nenhum Else; Pode ter no m�nimo 1 if e no m�ximo 1 if; Else if pode ter no m�nimo 0 else if e no m�ximo quandos precisar;
	// As express�es s�o avaliadas de cima para baixo;
	// Quando uma condi��o verdadeira � encontrada a instru��o associada � executada e o resto � ignorado;
	// Se nenhuma das condi��es for verdadeira o else final vai ser executado;
	// Se nenhuma das condi��es for verdadeira e n�o houver else final, nenhuma a��o ser� feita;
		
		
		double peso, altura, imc;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o peso");
		peso = entrada.nextFloat();//float aceita n�meros fracion�rios;
		
		System.out.println("Digite a altura");
		altura = entrada.nextFloat();
	
		imc = peso / (altura * altura);
	
		System.out.printf("Seu IMC est�: %.2f.\n", imc);//%.2f para mostrar n�mero fracion�rio;
		
		if (imc <= 19)
		System.out.println("Abaixo do peso");
		
		else if (imc > 19 && imc <= 25)
			System.out.println("Peso ideal");	
			
		else if (imc > 25 && imc <= 30)
			System.out.println("Acima do peso");		
			
		else if (imc > 30 && imc <= 35)
			System.out.println("Obesidade leve");	
	
		else 
			System.out.println("Obesidade");		
	
	}

}
