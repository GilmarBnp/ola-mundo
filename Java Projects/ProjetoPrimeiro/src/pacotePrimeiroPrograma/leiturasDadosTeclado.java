package pacotePrimeiroPrograma;
import java.util.*;
public class leiturasDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	double nota1, nota2, nota3, nota4, frequencia;
	char statusAluno;
	//Scanner serve para adicionar uma entrada com teclado;
	Scanner entradaNotas = new Scanner(System.in);
	Scanner entradaCaractere = new Scanner(System.in);
	
	System.out.print("Digite o nome do aluno: ");
	String nomeAluno = entradaCaractere.nextLine();
	
	System.out.print("Digite um caracter para a situa��o do aluno(O --> OK; P --> Pend�ncia: ");
	statusAluno = entradaCaractere.nextLine().charAt(0); //char at (0) para aceitar s� um caractere, j� que o char s� aceita um caractere;
	
	System.out.print("Digite a primeira nota");
	nota1= entradaNotas.nextDouble();
	
	System.out.print("Digite a segunda nota");
	nota2= entradaNotas.nextDouble();	
	
	System.out.print("Digite a terceira nota");
	nota3= entradaNotas.nextDouble();
	
	System.out.print("Digite a quarta nota");
	nota4= entradaNotas.nextDouble();
	
	System.out.print("Digite a frequencia do aluno");
	frequencia = entradaNotas.nextDouble();
	
	double totalNotas = nota1 + nota2 + nota3 + nota4;
	
	boolean Aprovado = totalNotas >= 70 && frequencia >= 75;
	
	//System.out.printf("%s\n", nomeAluno);//%s � o coringa do string;
	System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequ�ncia %.2f%%. A situa��o do(a) aluno(a) � %c.\n"
			+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia, statusAluno, Aprovado);
	
	
	//%c � o coringa do char;
	//%s � o coringa do string;
	//%b � o coringa do boolean;
	
	}

}
