package exercicios1;

public class exerc�cio2 {

	public static void main(String[] args) {
	
		/*Fazer um programa que imprima a m�dia aritm�tica dos n�meros8,9 e 7. A m�dia dos n�meros 4, 5 e 6. 
		   A soma das duas m�dias. Am�dia das m�dias.
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
	
	System.out.println("A m�dia do n�mero (7,8,9) �: " + media1);
	System.out.println("A m�dia do n�mero (4,5,6) �: " + media2);
	System.out.println("A m�dia da m�dia �: " + mediaMedia);
	}
	}

