package sequencia;

import java.util.Scanner;
import java.util.Stack;


	public class Sequencia {
	private Scanner scanner = new Scanner(System.in);
	//void não retorna nada, private void mostrarMenu()
	private String mostrarMenu() {
		System.out.println("Digite a sequência para verificação" 
				+ "ou digite sair para encerrar");
			return scanner.nextLine();	
	
	}
	public void iniciar() {
		// Sequências válidas: () - [] - (()) - [[]] - [()] - ([]) - [([()])]
		// Sequências inválidas: (( - )) - [[ - ]] - (] - ([)) - ([([(])])
		
		String sequencia = mostrarMenu();
		while (!sequencia.equals("sair")) {
		Stack<String> stack = new Stack<>();
		boolean isSequenciaOK = true;
		for (int i = 0; i < sequencia.length(); i++) {
		if (!isSequenciaOK) {
			break;
		}
		char c = sequencia.charAt(i); // para mostrar o caracter que está no int i = 0 no número de 0 a ...; 
		
		switch (c) {
		case ')':
			//caso o usuário coloque )))), quando ele botou o primeiro parentese a direita ")", já está errado, pq tinha que ter um a esquerda "(" primeiro
			if(stack.isEmpty()) {//então se está vazio
				System.out.println("Sequência inválida.");
				sequencia = mostrarMenu();
				isSequenciaOK = false; 
			//caso não esteja vazio
			}else {
				String elemento = stack.pop();//está desempilhando, tirando o ultimo elemento do topo
				if (!elemento.equals("(")) {
					System.out.println("Sequência inválida.");
					sequencia = mostrarMenu();
					isSequenciaOK = false;
				}
			}
			
			break;// o switch vai parar, mas o for "int i" vai continuar funcionando, então usar boolean "isSequenciaOK" 
			      //para dizer se a sequencia está correta ou não
		
		case ']':
			if(stack.isEmpty()) {//então se está vazio
				System.out.println("Sequência inválida.");
				sequencia = mostrarMenu();
				isSequenciaOK = false; 
			//caso não esteja vazio
			}else {
				String elemento = stack.pop();//está desempilhando, tirando o ultimo elemento do topo
				if (!elemento.equals("[")) {
					System.out.println("Sequência inválida.");
					sequencia = mostrarMenu();
					isSequenciaOK = false;
				}
		    	}
					break;
		
		default:
			stack.push(String.valueOf(c));// como "c" é um char tem que fazer a conversão de char para String, já que "stack" é uma <String>
		
		}
		
		}
		if (stack.isEmpty()) {
			System.out.println("A sequência está correta.");// () ou [] porque fechou a sequência, no inicio não tinha como verificar se a sequencia estava
															// correta, porque ainda não tinha terminado de verificar toda sequência
		
		}else {
			System.out.println("A sequência inválida.");
		
		}
		sequencia = mostrarMenu();
		}
	}
	}
		
		
	


