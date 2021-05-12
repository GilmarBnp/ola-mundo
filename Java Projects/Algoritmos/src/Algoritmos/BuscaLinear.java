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
		for (int i = 0; i < lista.size(); i++) {//o if vai verificar se o elemento do indice i o int i, o que est� iterando � igual ao elemento buscado
			if (lista.get(i).equals(elementoBuscado)) {//como est� trabalhando com integer � melhor usar o .equals, se fosse o int, poderia usar o diferente !
				System.out.println("O elemento buscado est� no �ndice: " + i);
				elementoEncontrado = true;
				break;// j� que encontrou o elemento, o break faz com que pare de ficar procurando
			}
		}
		if (!elementoEncontrado) {
			System.out.println("O elemento n�o foi encontrado");
		}
	}

}
