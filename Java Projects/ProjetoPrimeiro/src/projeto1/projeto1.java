package projeto1;

import java.util.Scanner;

public class projeto1 {

	//o operador += soma ele mesmo mais algum n�mero ou vari�vel.
	//Por exemplo:
    //x+= 1;
	//� equivalente a fazer:
	//x = x + 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	double n1 = 0, n2 = 0, n3 = 2, resultado;
	System.out.println("Digite o valor para a vari�vel n1: ");
	n1 = entrada.nextDouble();
	
	System.out.println("Digite o valor para a vari�vel n2: ");
	n2 = entrada.nextDouble();
	
	resultado = n1 * n2 % n3;
	System.out.printf("O valor total �:  %.2f",resultado);
	
	
	}

}