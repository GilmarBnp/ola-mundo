package pacotePrimeiroPrograma;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class gravaçãoArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// PrintWriter serve para escrever o arquivo;
	// o nome "arquivo" é a variável usada na operação de gravar o arquivo;
	try {
		
		FileWriter arquivo = new FileWriter("C:\\Users\\Emerson\\Documents\\ProjetoPrimeiro\\saidaDados.txt"); 
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		for (int i = 0; i < 1000; i++ ) {// isso é uma condição para i = 0; i menor que 1000;
			gravarArquivo.printf("Valor de i: %d.\n", i); // Isso é o que foi gravado dentro do arquivo;
		}
	
		gravarArquivo.close();
		arquivo.close();
		
	} catch (IOException e) {
		
		System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
		
	}
	System.out.println("Fim da execução.");
	}
	
	
	
	
	
	
	

}
