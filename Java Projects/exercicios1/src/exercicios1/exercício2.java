package exercicios1;

public class exercício2 {

	public static void main(String[] args) {
	
		/*Fazer um programa que imprima a média aritmética dos números8,9 e 7. A média dos números 4, 5 e 6. 
		   A soma das duas médias. Amédia das médias.
		 */
	int num1 = 8;
	int num2 = 9;
	int num3 = 7;
	int num4 = 4;
	int num5 = 5;
	int num6 = 6;
	
	int media1= (num1 + num2 + num3)/3;
	int media2= (num4 + num5 + num6)/3;
	int mediaMedia= (media1 + media2)/2;
	
	System.out.println("A média do número (7,8,9) é: " + media1);
	System.out.println("A média do número (4,5,6) é: " + media2);
	System.out.println("A média da média é: " + mediaMedia);
	}
	}

