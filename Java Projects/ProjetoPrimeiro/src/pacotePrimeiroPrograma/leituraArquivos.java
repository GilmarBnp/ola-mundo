package pacotePrimeiroPrograma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leituraArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objetos para ler arquivos no disco;

	try {
		FileReader arquivo = new FileReader("C:\\Users\\Emerson\\Documents\\ProjetoPrimeiro\\arquivoDados.txt");
		BufferedReader lerArquivo = new BufferedReader(arquivo);
	
		String linha;
		linha = lerArquivo.readLine();
	
		while (linha != null) {
			String[] dadosCliente = new String[5];
			dadosCliente = linha.split(";");// separar toda vez que tiver um ;1;Paulo Campos;Rua a; 32;BH//dentro da variável linha tem os dados do arquivoDados.txt;
			
			System.out.printf("Código do cliente: %s.\n" +
			           "Nome do cliente: %s.\n" +
			           "Endereço: %s.\n" +
					   "Cidade: %s.\n" +
			           "Estado Cívil: %s.\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3], dadosCliente[5]);
					   
			
			
			
			linha = lerArquivo.readLine();
			System.out.println("");
		
		}
		lerArquivo.close();
		arquivo.close();
	
	}catch (IOException e) {
		System.out.println("Erro lendo dados: " + e.getMessage());
		
	}
		
	
	
	
	
	}
	
	
	}




