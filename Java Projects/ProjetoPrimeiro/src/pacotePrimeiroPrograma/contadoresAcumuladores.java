package pacotePrimeiroPrograma;

public class contadoresAcumuladores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Contadores;
	// Normalmente inteira e iniciada com valor zero;
	// Normalmente Incrementada de 1 em 1 a cada vez que uma ocorr�ncia acontece;
	// � uma vari�vel;
	// coringa do int � %d;
	// +=1; incrementa 1
	//Acumuladores;
	//� tamb�m uma vari�vel
    //S�o utilizados na cria��o de somat�rios ou produt�rios;
	//A vari�vel � incrementada baseada no valor de uma outra vari�vel qualquer;
	//ex: acumular um saldo devedor que cada aluno tenha.
	//Contador = ele mesmo + 1 constante; vai contando de 1 em 1 ou 2 em 2 ou mais buscando;
	//Acumulador = ele mesmo + 1 vari�vel; vai recebendo, ex um aluno deve 200, outro aluno deve 300, o acumulador fica 500, e assim por diante;
		
		
	double nota1, nota2, nota3, nota4, frequencia,totalNotas;
	char statusAluno;
	boolean aprovado;
	String nomeAluno;
	
	nomeAluno = "Ana Paula Silva Couto";
	statusAluno = 'M';//de matriculado;
	
	nota1 = 20;
	nota2 = 20;
	nota3 = 30;
	nota4 = 5;
	frequencia = 0.80; //80% de frequ�ncia;
	
	totalNotas = nota1 + nota2 + nota3 + nota4;
	aprovado = totalNotas >= 70 && frequencia >= 0.75; // para passar tem que dar verdadeiro nos dois;
	//%% para imprimir a porcentagem, s� % reconhece como coringa;
	
	System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequ�ncia %.2f%%. A situa��o do(a) aluno(a) � %c.\n Aluno aprovado? %b",nomeAluno, 
	totalNotas, frequencia,statusAluno, aprovado);
	
	
	}

}
