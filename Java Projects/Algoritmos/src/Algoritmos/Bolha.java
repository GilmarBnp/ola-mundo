package Algoritmos;

import java.util.ArrayList;

public class Bolha {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(6);
		lista.add(7);
		lista.add(4);
		lista.add(5);
		lista.add(2);
		System.out.println(lista);

			for (int i = 0; i < lista.size(); i++) {//o primeiro "for" vai fazer a comparação nos itens do Array lista, vai olhar todos os elementos
				for (int j = 0; j < lista.size() -1 ; j++) {//o segundo "for" vai fazer a comparação dos números dois a dois
					if (lista.get(j) > lista.get(j + 1)) {// tem que começar na posição -1 já que o j já começou j + 1 e se não colocar o -1 ele não vai ter com quem comparar
						//nesse if ele está comparando ex: 1 > 4 um é maior que quatro? j + 1, já que está comparando de 2 em 2 
						//troca elementos de posicao
						Integer aux = lista.get(j);
						lista.set(j, lista.get(j + 1));
						lista.set(j + 1, aux);
					}
				}
				System.out.println(lista);
			}
		
	}		


}		


