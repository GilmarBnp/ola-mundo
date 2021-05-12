package desafioModulo2;

import java.util.Random;
import java.util.Scanner;

public class dsafioGerarNumAleatorio {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] valores = new int[1000], repeticoes = new int[1000];
		int limiteSuperior = 100;
		Random random = new Random(); // classe para gerar números aleatórios;
		
		for (int i = 0; i < 1000; i++) {
			repeticoes[valores[i]]++;
			}
		for (int i = 0; i < 100; i++)
			System.out.printf("O número %d repete %d vezes.\n",i, repeticoes[i]);
	}

}
