package pacotePrimeiroPrograma;

import java.util.Scanner;

public class ifElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if-else-if;
		// Um if dentro do outro;
		
	//if (Condição 1) Se vc está com um camisa azul;
		//instrução1; acontece tal coisa;
	//else if (Condição2)(Se não): Se vc está com uma camisa preta;
		//instrução2; acontece tal coisa;
	//else if (Condição3)(Se não): Se vc está com uma camisa branca;
		//instrução3;acontece tal coisa;
		//.
		//.
		//.
		//else
	    //instrução_n;
	
	// Pode ter 1 ou nenhum Else; Pode ter no mínimo 1 if e no máximo 1 if; Else if pode ter no mínimo 0 else if e no máximo quandos precisar;
	// As expressões são avaliadas de cima para baixo;
	// Quando uma condição verdadeira é encontrada a instrução associada é executada e o resto é ignorado;
	// Se nenhuma das condições for verdadeira o else final vai ser executado;
	// Se nenhuma das condições for verdadeira e não houver else final, nenhuma ação será feita;
		
		
		double peso, altura, imc;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o peso");
		peso = entrada.nextFloat();//float aceita números fracionários;
		
		System.out.println("Digite a altura");
		altura = entrada.nextFloat();
	
		imc = peso / (altura * altura);
	
		System.out.printf("Seu IMC está: %.2f.\n", imc);//%.2f para mostrar número fracionário;
		
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
