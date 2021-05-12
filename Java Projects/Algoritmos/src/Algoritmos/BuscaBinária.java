package Algoritmos;

import java.util.ArrayList;

public class BuscaBinária {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		//for (int i = 1; i <= 100; i++) {
			//lista.add(i);
				
		//}
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		int elementoBuscado = 3;
		
		int inicio = 0;
		int fim = lista.size() - 1; //como começa no "0" a lista, coloca -1 para não procurar o "0"
		
		boolean elementoEncontrado = false;
		//array 1 2 3 4 5 vamos dizer que a busca está procurando 4,então a busca cai no 3, então 3 é menor que 4? sim, então ele corta o array e continua procurando no 4 5 
		
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2; // a gente tem o inicio + o fim e divide por dois, nós temos o meio
			
			if (lista.get(meio) < elementoBuscado) {//esse if verifica se o elemento procurado é menor, significa que ele está na segunda parte do Array .get serve para acessar a lista
				inicio = meio + 1;// continua a procurar a partir do meio/ o inicio se torna o meio + 1
				
			}else if (lista.get(meio) > elementoBuscado) {//vamos dizer que está procurando 2, mas caí no 3, ele corta no meio e vai procurar entre 1 2
				fim = meio -1;// o fim se torna o meio -1
			}else {
				System.out.println("Elemento encontrado no índice: " + meio);
				elementoEncontrado = true;
				break;
			}
		}
		if (!elementoEncontrado) {
			System.out.println("Elemento não encontrado");
		}
	}
	
	}


