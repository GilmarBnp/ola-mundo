package filaRestaurante;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaRestaurante {
private Scanner digitarNome = new Scanner(System.in);
private Scanner digitarNumero = new Scanner(System.in);
private Queue<String> fila = new LinkedList<>();

private String mostrarMenu() {
	StringBuilder sb = new StringBuilder();
	sb.append("Digite o comando desejado: \n");
	sb.append("1 - Ver a lista de contatos \n");
	sb.append("2 - Adicionar pessoa a fila \n");
	sb.append("3 - Ordem de entrega do pedido \n");
	sb.append("4 - Remover pedido da fila \n");
	sb.append("5 - Desempilhar pedido \n");
	sb.append("6 - Sair");
	System.out.println(sb.toString());

	return digitarNome.nextLine();
}

public void iniciar() {
	
	String opcao = mostrarMenu();
	while(!opcao.equals("6")) {
		switch (opcao) {
		
		case "1":
			System.out.println("Lista de contatos: " + fila);
			opcao = mostrarMenu();
			break;
		case "2":
			System.out.println("Digite o nome da pessoa que você deseja colocar na fila");
			String contatos = digitarNome.nextLine();
			fila.add(contatos);
			System.out.println("Nome adicionado a fila: " + fila);
			opcao = mostrarMenu();
			break;
			
		case "3":
		System.out.println("Ver ordem dos pedidos: " + fila);	
		opcao = mostrarMenu();
		break;
		
		case"4":
			System.out.println("Digite o número da pessoa que quer remover");
			int i = digitarNumero.nextInt();
			fila.remove(i);
			opcao = mostrarMenu();
			break;
		case"5":
			
		default:
			System.out.println("Comando inválido");
			opcao = mostrarMenu();
			break;
		}
		}
		
	}
}
	


