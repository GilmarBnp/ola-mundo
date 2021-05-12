package Algoritmos;

import java.util.ArrayList;

public class BuscaBin�ria {

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
		int fim = lista.size() - 1; //como come�a no "0" a lista, coloca -1 para n�o procurar o "0"
		
		boolean elementoEncontrado = false;
		//array 1 2 3 4 5 vamos dizer que a busca est� procurando 4,ent�o a busca cai no 3, ent�o 3 � menor que 4? sim, ent�o ele corta o array e continua procurando no 4 5 
		
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2; // a gente tem o inicio + o fim e divide por dois, n�s temos o meio
			
			if (lista.get(meio) < elementoBuscado) {//esse if verifica se o elemento procurado � menor, significa que ele est� na segunda parte do Array .get serve para acessar a lista
				inicio = meio + 1;// continua a procurar a partir do meio/ o inicio se torna o meio + 1
				
			}else if (lista.get(meio) > elementoBuscado) {//vamos dizer que est� procurando 2, mas ca� no 3, ele corta no meio e vai procurar entre 1 2
				fim = meio -1;// o fim se torna o meio -1
			}else {
				System.out.println("Elemento encontrado no �ndice: " + meio);
				elementoEncontrado = true;
				break;
			}
		}
		if (!elementoEncontrado) {
			System.out.println("Elemento n�o encontrado");
		}
	}
	
	}


