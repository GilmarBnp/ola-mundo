package Módulo3;

import java.util.ArrayList;

public class lista1 {

	public static void main(String[] args) {
		// Lista também chamada de array;
		// Permite que seja armazendo vários elementos;
		// Podem estar ordenados ou não;
		// Exemplo: lista telefônica, lista de supermercado;
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Palio");
												 
		carros.remove(0);
		carros.remove(1);										 // o int i = 0 é para começar a ler o array(lista) pela posição desejada; 0 é a primeira posição;
		for (int i = 0; i < carros.size(); i++) {// o i++ faz ele sair da posição 0 e ir para as outras, até chegar na 2 que é o palio; 
			System.out.println(carros.get(i));
		
		}

	
	}

}
