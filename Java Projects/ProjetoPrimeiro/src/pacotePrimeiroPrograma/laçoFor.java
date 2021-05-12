package pacotePrimeiroPrograma;

public class laçoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Laço, loop e estrutura de repetiçao;
	// Repetição de um bloco de código;
	// Laço FOR. Número de repetições determinadas;
	// Possui três partes: Inicialização, Condição, Incremento;
	
	
	//for (inicialização; condição; incremento)
	// normalmente usa a variável 'i' de 'iteração' iteração é a repetição que o for faz;
	
		int i = 0, j = 0, z = 0; //variável de controle; // tudo que estiver no laço {} vai repetir;
		System.out.println("Início. Não vai repetir.");
		
		for (i = 0; i < 10; i++) { //vai executar o laço até chegar no 9, porque só até menor que 10, e não menor igual a 10; vai aumentando de 1 em 1;
		System.out.printf("Valor de i: %d\n", i); //%d é o coringa do inteiro;
			
		
		for (j = 0; j < 3; j++) {
			System.out.printf("	Valor de j: %d\n", j);	
			
			
		
		}
		
		}
		
		System.out.println("Fim. Não vai repetir.");
		
	}

}
