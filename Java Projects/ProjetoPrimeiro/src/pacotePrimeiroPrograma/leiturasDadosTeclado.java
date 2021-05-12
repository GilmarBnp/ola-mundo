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
	
	System.out.print("Digite um caracter para a situação do aluno(O --> OK; P --> Pendência: ");
	statusAluno = entradaCaractere.nextLine().charAt(0); //char at (0) para aceitar só um caractere, já que o char só aceita um caractere;
	
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
	
	//System.out.printf("%s\n", nomeAluno);//%s é o coringa do string;
	System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%. A situação do(a) aluno(a) é %c.\n"
			+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia, statusAluno, Aprovado);
	
	
	//%c é o coringa do char;
	//%s é o coringa do string;
	//%b é o coringa do boolean;
	
	}

}
