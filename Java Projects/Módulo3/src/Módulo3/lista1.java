package M�dulo3;

import java.util.ArrayList;

public class lista1 {

	public static void main(String[] args) {
		// Lista tamb�m chamada de array;
		// Permite que seja armazendo v�rios elementos;
		// Podem estar ordenados ou n�o;
		// Exemplo: lista telef�nica, lista de supermercado;
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("Uno");
		carros.add("Gol");
		carros.add("Palio");
												 
		carros.remove(0);
		carros.remove(1);										 // o int i = 0 � para come�ar a ler o array(lista) pela posi��o desejada; 0 � a primeira posi��o;
		for (int i = 0; i < carros.size(); i++) {// o i++ faz ele sair da posi��o 0 e ir para as outras, at� chegar na 2 que � o palio; 
			System.out.println(carros.get(i));
		
		}

	
	}

}
