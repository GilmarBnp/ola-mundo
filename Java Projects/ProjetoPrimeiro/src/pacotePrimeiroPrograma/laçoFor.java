package pacotePrimeiroPrograma;

public class la�oFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// La�o, loop e estrutura de repeti�ao;
	// Repeti��o de um bloco de c�digo;
	// La�o FOR. N�mero de repeti��es determinadas;
	// Possui tr�s partes: Inicializa��o, Condi��o, Incremento;
	
	
	//for (inicializa��o; condi��o; incremento)
	// normalmente usa a vari�vel 'i' de 'itera��o' itera��o � a repeti��o que o for faz;
	
		int i = 0, j = 0, z = 0; //vari�vel de controle; // tudo que estiver no la�o {} vai repetir;
		System.out.println("In�cio. N�o vai repetir.");
		
		for (i = 0; i < 10; i++) { //vai executar o la�o at� chegar no 9, porque s� at� menor que 10, e n�o menor igual a 10; vai aumentando de 1 em 1;
		System.out.printf("Valor de i: %d\n", i); //%d � o coringa do inteiro;
			
		
		for (j = 0; j < 3; j++) {
			System.out.printf("	Valor de j: %d\n", j);	
			
			
		
		}
		
		}
		
		System.out.println("Fim. N�o vai repetir.");
		
	}

}
