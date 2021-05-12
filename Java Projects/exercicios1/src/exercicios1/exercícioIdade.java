package exercicios1;

import java.util.Scanner;

public class exercícioIdade {

	public static void main(String[] args) {
	
		
		System.out.println("Digite sua idade: ");
		Scanner scann = new Scanner(System.in);
		int anos = scann.nextInt();
		
		System.out.println("Digite os meses: ");
		int meses = scann.nextInt();
		
		System.out.println("Digite os dias: ");
		int dias = scann.nextInt();
	
	int diasTotais = anos * 365 + meses * 30 + dias;
	System.out.println("Sua Idade tem: " + diasTotais + " Dias.");
	}
	}

