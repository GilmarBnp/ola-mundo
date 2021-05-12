package ListaCompras;
import java.util.ArrayList;
import java.util.Scanner;
//public void: para poder se acessada de outros arquivos;
/*
 * Digite o comando desejado:
 * 1 - Ver a lista
 * 2 - adicionar item na lista // perguntar qual item gostaria de adicionar
 * 3 - remover item da lista 
 * 4 - limpar lista
 * 5 - sair
 */

public class ListaCompras {
	// a classe só poderá ser acessada na classe lista compras
	private ArrayList<String> lista = new ArrayList<String>();
	private Scanner scannerMenu = new Scanner(System.in);
	//Menu com opções
	//colocar aqui porque o menu irá ser apresentado várias vezes;
	private String mostrarMenu() {
		StringBuilder sbMenu = new StringBuilder();
		sbMenu.append("Digite o comando desejado: \n");
		sbMenu.append("1 - ver a lista \n");
		sbMenu.append("2 - adicionar item na lista \n");
		sbMenu.append("3 - remover item da lista \n");
		sbMenu.append("4 - limpar lista \n");
		sbMenu.append("5 - sair \n");
		System.out.println(sbMenu.toString());
		
		return scannerMenu.nextLine();
	}
	
	private String opcao;
	public void iniciar() {
	// nextLine porque pode ser uma palavra composta, tipo leite em pó, se botar só next, só pegaria a palavra leite
	
	// enquanto a String opcao for diferente de 5, !opcao
	String opcao = mostrarMenu();// tem que nomear String opcao = mostrarMenu() para chamar o while !opcao.equals
	while (!opcao.equals("5")) {
		//break, se não vai entrando em todas condições
		switch (opcao) {
		case "1":
			System.out.println(lista);// se não tiver nada na lista, mostra ela vazia []
			opcao = mostrarMenu();
			break;
		case "2":
			System.out.println("Digite o item que deseja colocar na lista");
			String item = scannerMenu.nextLine();//string item para guardar os itens adicionados, usar nextLine para pegar palavras compostas
			lista.add(item);
			System.out.println(lista);
			
			opcao = mostrarMenu();
			break;
		case "3":
			System.out.println("Digite o índice do item para remover da lista:");
			int indice = Integer.valueOf(scannerMenu.nextLine());// integer.valueOf recebe um string e converte em inteiro
			lista.remove(indice);
			//mostrarMenu(); mostra as opções do menu do String mostrarMenu
			opcao = mostrarMenu();// o programa vai sair no break e voltar para o while com as opções do menu
			break;
		case "4":
			lista.clear();
			System.out.println(lista);
			System.out.println("Lista limpa");
			opcao = mostrarMenu();
			break;
		case "5":
			break;
		default:
			System.out.println("Opção inválida.");	
				opcao = mostrarMenu();
		}
	}
	scannerMenu.close();
	System.out.println("Programa finalizado");
	}
	
	
}
