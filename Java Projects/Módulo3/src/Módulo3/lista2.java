package M�dulo3;

import java.util.ArrayList;

public class lista2 {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		//add - adiciona elemento no fim do array;
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Palio");
		carros.add(1, "Argo");										 
		
		if (carros.contains("Gol")) {// .contains serve pra ver se um elemento contem no array;
			System.out.println("Existe o elemento Gol no array"); 
				
			} else {
				System.out.println("N�o existe o elemento Gol no array");
			}
			
			carros.set(0, "Novo Uno");// Serve para alterar um elemento no array;
		
		carros.add("Gol");	
		
		int primeiraPosicaoGol = carros.indexOf("Gol");// Ele retorna indice da primeira ocorr�ncia do elemento;
			System.out.println("A primeira posi��o do Gol �: " + primeiraPosicaoGol);
			
			int ultimaPosicaoGol = carros.lastIndexOf("Gol");// Ele retorna indice da ultima ocorr�ncia do elemento;
			System.out.println("A ultima posi��o do Gol �: " + ultimaPosicaoGol);
			//size: retorna o tamanho do arrray
			for (int i = 0; i < carros.size(); i++) { 
			//get: retorna o elemento do indice informado
			System.out.println(carros.get(i));
		
		}
		//remove: remove o elemento do indice informado e puxa os outros elementos para a posi��o atual
		carros.remove(0);
		carros.remove(1);
		
		System.out.println("Ap�s a Remo��o");
		for (int i = 0; i < carros.size(); i++) { 
			System.out.println(carros.get(i));// .get serve para resgatar um elemneto do array;
				
		}
			carros.clear();
			System.out.println("Final: " + carros);
	}

}
