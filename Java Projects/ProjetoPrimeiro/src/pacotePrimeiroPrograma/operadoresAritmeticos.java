// ++ � o operador de inclemento; pode ser qualquer letra, x ou i etc;
// i = i+1; � o mesmo que i++;
// i = i+1; � o mesmo que i++;
// -- � o simbolo de decremento
// i-- = i = i - 1;

package pacotePrimeiroPrograma;

public class operadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// zerar a vari�vel no inicio � uma pr�tica comum;
	
	//int n1 = 0, n2 = 0, total = 0;
	//SOMA
	//n1 = 10;
	//n2 = 20;
	//total = n1 + n2;
	

	//System.out.printf("O resultado de %d + %d = %d", n1, n2, total);
	
	
//int n1 = 0, n2 = 0, total = 0;
	//MULTIPLICA��O
	//n1 = 5;
	//n2 = 3;
	//total = n1 * n2;
	

	//System.out.printf("O resultado de %d x %d = %d", n1, n2, total); //os coringas s�o substitu�dos pelas vari�veis na ordem;
	
	
		//double n1 = 0, n2 = 0, total = 0;
		//DIVIS�O
		//n1 = 45;
		//n2 = 7;
		//total = n1 / n2;
		

		//System.out.printf("O n�mero %.2f dividido %.2f � igual %.4f", n1, n2, total);// 2 e 4 � o n�mero de casas d�cimais
	
	
//double n1 = 0, n2 = 0, total = 0;
		//RESTO
		//n1 = 83; //o resto � at� onde vai a divis�o;
		//n2 = 4;
		//total = n1 % n2; // % � o resto, 15/2 =7  15-14 = 1 sobra 1; um � o resto;
		

		//System.out.printf("O n�mero %.2f dividido por %.2f tem como resto o n�mero %.4f", n1, n2, total);
	
		
	
	//INCREMENTO
		//int i = 0;
		//System.out.printf("Valor de i : %d\n", i);
		//i++;//1
		
		//System.out.printf("Valor de i : %d\n", i);
		//i++;//2
	
		//System.out.printf("Valor de i : %d\n", i);
		//i++;//3
		
		//System.out.printf("Valor de i : %d\n", i);
		//i = i + 2;
	
		//System.out.printf("Valor de i : %d\n", i);
		
	
	//PRECED�NCIA
		double a, b, c, d, resultado;
		a = 10;
		b = 20;
		c = 30;
		d = 10;
	
	//resultado = a + b * c / d;// primeiro a divis�o depois multiplica��o, soma e diminui��o; a menos que use pareteses;
	resultado = (a + b) * c / d;
	System.out.printf("resultado: %.2f", resultado);
	
	
	}

}
