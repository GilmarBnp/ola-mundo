package jogoVelha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JogoVelha {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
	
	private void imprimeMatriz() {
		for (int i = 0; i < matriz.size(); i++) {
			System.out.println(matriz.get(i));
		}
	}
	
	private String solicitarJogada() {
		imprimeMatriz();
		return scanner.nextLine();
	}
	
	
	
	
	public void iniciar() {
	ArrayList<String> linha1 = new ArrayList<String>(Arrays.asList("_", "_" , "_"));
	ArrayList<String> linha2 = new ArrayList<String>(Arrays.asList("_", "_" , "_"));
	ArrayList<String> linha3 = new ArrayList<String>(Arrays.asList("_", "_" , "_"));
	
	matriz.add(linha1);
	matriz.add(linha2);
	matriz.add(linha3);
	
	boolean vezJogador1 = true;//essa � a jogada do jogador
	boolean houveVencedor = false;
	for (int i = 0; i < 9; i++) {
		String jogada = solicitarJogada();
	//split quebra linha
		Integer linha = Integer.valueOf(jogada.split("-")[0]);//o "1" e o "0" estava com String e precisava estar como n�mero 1 pra poder acessar o �ndice
		Integer coluna = Integer.valueOf(jogada.split("-")[1]);
		
		if (vezJogador1) {
			matriz.get(linha).set(coluna, "X");
		} else {
			matriz.get(linha).set(coluna, "O");
		}
		if (verificarVencedor()) {
			houveVencedor = true;
			String vencedor = vezJogador1 ? "1" : "2";// ? = se a vez jogador 1 for verdadeiro, atribui o n�mero "1" como string
			System.out.println("O jogador " + vencedor + "venceu!");
			break;
		}
		vezJogador1 = !vezJogador1;//est� negando o vezJogador1 tornando o boolean "false" passa a vez para o outro jogador, tornando o vezJogador false
		if (!houveVencedor) {
			imprimeMatriz();
			System.out.println("N�o houve vencedor. ");
		}
		
	}
	
	}
	
	private boolean verificarVencedor() {//boolean come�a sem valor
		for (int i = 0; i < 3; i++) {//i < 3 porque s�o 3 espa�os no tabuleiro/ para o i passar pelas tr�s linhas do programa do jogo da velha
			//vit�ria horinzontal
			String horinzontal1 = matriz.get(i).get(0);//.get para acessar a posi��o espec�fica da matriz para poder comparar
			String horinzontal2 = matriz.get(i).get(1);
			String horinzontal3 = matriz.get(i).get(2);
			
			if (!horinzontal1.equals("_") 
					&& horinzontal1.equals(horinzontal2) 
					&& horinzontal1.equals(horinzontal3)) {//! negar que horinzontal1 seja "_" se n�o ganha o jogo logo de cara
				return true;//se retornar true nem passa para baixo
		
			}
		
		//vit�ria na vertical
			String vertical1 = matriz.get(0).get(i);//come�a a vericar do 0 e vai at� o i, assim verifica toda primeira linha na vertical
			String vertical2 = matriz.get(1).get(i);
			String vertical3 = matriz.get(2).get(i);
			
			if (!vertical1.equals("_") 
					&& vertical1.equals(vertical2) 
					&& vertical1.equals(vertical3)) {
				return true;//se der essa situa��o j� retorna "true"
		
			
			}
		
		}
			String diagonal1 = matriz.get(0).get(0);
			String diagonal2 = matriz.get(1).get(1);
			String diagonal3 = matriz.get(2).get(2);
		
			if (!diagonal1.equals("_") 
					&& diagonal1.equals(diagonal2) 
					&& diagonal1.equals(diagonal3)) {
				return true;	
			}
				
			String diagonalInvertida1 = matriz.get(0).get(2);
			String diagonalInvertida2 = matriz.get(1).get(1);
			String diagonalInvertida3 = matriz.get(2).get(0);		
					
			if (!diagonalInvertida1.equals("_") 
					&& diagonalInvertida1.equals(diagonalInvertida2) 
					&& diagonalInvertida1.equals(diagonalInvertida3)) {
				return true;	
			
			}
			
			return false;
	
	}
}
