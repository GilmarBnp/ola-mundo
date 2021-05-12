package desafioModulo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class desafio2_3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNros = 0;
		char continuar = 'S';
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %d número:\n", contaNros+1); 
			numeros[contaNros] = entrada.nextInt();
			contaNros++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números (S - Sim. N - Não)?");
			continuar = entrada.nextLine().charAt(0);		 
		}
		
		try {
			FileWriter arq = new FileWriter("C:\\Users\\Emerson\\Documents\\ProjetoPrimeiro\\saidaDados2.txt"); 
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for (int i = 0; i < contaNros; i++) {
				gravarArquivo.printf("%d\n", numeros[i]);
				arq.close();
				gravarArquivo.close();
				System.out.println("Processo finalizado.");
				
			}
		    }	
				catch (IOException e) {
				System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
			}
		}
			
	}


