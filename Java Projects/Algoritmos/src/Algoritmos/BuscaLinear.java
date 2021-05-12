package Algoritmos;

import java.util.ArrayList;

public class BuscaLinear {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(6);
		lista.add(7);
		lista.add(4);
		lista.add(5);
		lista.add(2);
		System.out.println(lista);
		
		Integer elementoBuscado = 41;
		boolean elementoEncontrado = false;
		for (int i = 0; i < lista.size(); i++) {//o if vai verificar se o elemento do indice i o int i, o que está iterando é igual ao elemento buscado
			if (lista.get(i).equals(elementoBuscado)) {//como está trabalhando com integer é melhor usar o .equals, se fosse o int, poderia usar o diferente !
				System.out.println("O elemento buscado está no índice: " + i);
				elementoEncontrado = true;
				break;// já que encontrou o elemento, o break faz com que pare de ficar procurando
			}
		}
		if (!elementoEncontrado) {
			System.out.println("O elemento não foi encontrado");
		}
	}

}
