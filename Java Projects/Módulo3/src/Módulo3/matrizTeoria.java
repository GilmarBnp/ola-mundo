package Módulo3;

import java.util.ArrayList;
import java.util.Arrays;

public class matrizTeoria {

	public static void main(String[] args) {
		//uma arraylist de uma arraylist de doubles, uma representa as linhas e a outra as colunas
		ArrayList<ArrayList<Double>> matriz = new ArrayList<ArrayList<Double>>();
		// está usando double porque as notas podem ser quebradas, se usasse int, só aceitaria números inteiros
		ArrayList<Double> linha1 = new ArrayList<>();
		
		linha1.add(8.0);
		linha1.add(10.0);
		linha1.add(7.0);
		linha1.add(6.5);
		matriz.add(linha1);
	
		ArrayList<Double> linha2 = new ArrayList<Double>(Arrays.asList(7.0,9.0,5.0,4.0));	
		
		ArrayList<Double> linha3 = new ArrayList<Double>(Arrays.asList(4.0,8.0,6.0,9.0));
		
		matriz.add(linha2);
		matriz.add(linha3);
	
		System.out.println(matriz);
	//o get(1) está pegando a linha2, já que começa pelo "0" e o get(2) está pegando o terceiro elemento da linha, o número 5.0
		//System.out.println(matriz.get(1).get(2));
	
	//alterando elemento de uma matriz
	matriz.get(1).set(2, 10.5);
	System.out.println(matriz.get(1).get(2));
	
	//cada array é uma linha
	
	for (int i = 0; i < matriz.size(); i++) {
		ArrayList<Double> linha = matriz.get(i); //transformou matriz.get em "linha"
		System.out.println(linha);
		
		for (int j = 0; j < linha.size(); j++) {
			System.out.println(linha.get(j));
		}
		
	}
	}

}
