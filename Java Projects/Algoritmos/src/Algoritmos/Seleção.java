package Algoritmos;

import java.util.ArrayList;

public class Sele��o {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(6);
		lista.add(7);
		lista.add(4);
		lista.add(5);
		lista.add(2);
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			int menor = i; //esse int menor � pra procurar quem � o menor elemento
			
			for (int j = menor + 1; j < lista.size(); j++) {//int j =  menor +1 porque ele j� sabe que o int menor j� � o menor n�mero
				
				if (lista.get(j) < lista.get(menor)) {
					menor = j;
				}
			}
			if (menor != i) {
				int temp = lista.get(i);
				lista.set(i, lista.get(menor));
				lista.set(menor,  temp);
		}
		}
		System.out.println(lista);
	
	}
}