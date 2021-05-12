package pacotePrimeiroPrograma;
import java.math.*;
public class operadoresAritmetico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// x^2 + 12x - 13 = 0;
	// 2x^2 - 16x - 18 = 0;
		double a, b, c;
		a = 2;
		b = - 16;
		c = - 18;
		double delta = 0;
		delta = (b * b) - (4 * a * c); //b ao quadrado;
		
		System.out.printf("O valor do delta é: %.0f\n", delta);
	
	
	    double x_linha = 0;
	    x_linha = (-b + Math.sqrt(delta)) / (2*a);
	    System.out.printf("O valor de x é: %.0f\n", x_linha);
	    
	    double x_duasLinhas = 0;
	    x_duasLinhas = (-b - Math.sqrt(delta)) / (2*a);
	    System.out.printf("O valor de x é: %.0f", x_duasLinhas);
	
	    
	
	}

}
