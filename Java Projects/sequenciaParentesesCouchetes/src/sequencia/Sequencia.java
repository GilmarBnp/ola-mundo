package sequencia;

import java.util.Scanner;
import java.util.Stack;


	public class Sequencia {
	private Scanner scanner = new Scanner(System.in);
	//void n�o retorna nada, private void mostrarMenu()
	private String mostrarMenu() {
		System.out.println("Digite a sequ�ncia para verifica��o" 
				+ "ou digite sair para encerrar");
			return scanner.nextLine();	
	
	}
	public void iniciar() {
		// Sequ�ncias v�lidas: () - [] - (()) - [[]] - [()] - ([]) - [([()])]
		// Sequ�ncias inv�lidas: (( - )) - [[ - ]] - (] - ([)) - ([([(])])
		
		String sequencia = mostrarMenu();
		while (!sequencia.equals("sair")) {
		Stack<String> stack = new Stack<>();
		boolean isSequenciaOK = true;
		for (int i = 0; i < sequencia.length(); i++) {
		if (!isSequenciaOK) {
			break;
		}
		char c = sequencia.charAt(i); // para mostrar o caracter que est� no int i = 0 no n�mero de 0 a ...; 
		
		switch (c) {
		case ')':
			//caso o usu�rio coloque )))), quando ele botou o primeiro parentese a direita ")", j� est� errado, pq tinha que ter um a esquerda "(" primeiro
			if(stack.isEmpty()) {//ent�o se est� vazio
				System.out.println("Sequ�ncia inv�lida.");
				sequencia = mostrarMenu();
				isSequenciaOK = false; 
			//caso n�o esteja vazio
			}else {
				String elemento = stack.pop();//est� desempilhando, tirando o ultimo elemento do topo
				if (!elemento.equals("(")) {
					System.out.println("Sequ�ncia inv�lida.");
					sequencia = mostrarMenu();
					isSequenciaOK = false;
				}
			}
			
			break;// o switch vai parar, mas o for "int i" vai continuar funcionando, ent�o usar boolean "isSequenciaOK" 
			      //para dizer se a sequencia est� correta ou n�o
		
		case ']':
			if(stack.isEmpty()) {//ent�o se est� vazio
				System.out.println("Sequ�ncia inv�lida.");
				sequencia = mostrarMenu();
				isSequenciaOK = false; 
			//caso n�o esteja vazio
			}else {
				String elemento = stack.pop();//est� desempilhando, tirando o ultimo elemento do topo
				if (!elemento.equals("[")) {
					System.out.println("Sequ�ncia inv�lida.");
					sequencia = mostrarMenu();
					isSequenciaOK = false;
				}
		    	}
					break;
		
		default:
			stack.push(String.valueOf(c));// como "c" � um char tem que fazer a convers�o de char para String, j� que "stack" � uma <String>
		
		}
		
		}
		if (stack.isEmpty()) {
			System.out.println("A sequ�ncia est� correta.");// () ou [] porque fechou a sequ�ncia, no inicio n�o tinha como verificar se a sequencia estava
															// correta, porque ainda n�o tinha terminado de verificar toda sequ�ncia
		
		}else {
			System.out.println("A sequ�ncia inv�lida.");
		
		}
		sequencia = mostrarMenu();
		}
	}
	}
		
		
	


