package pacotePrimeiroPrograma;

import java.util.Scanner;

public class utilizandoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String permite voc� armazenar qualquer tipo de caracteres seja numero ou texto;
//Int permite armazenar n�meros inteiros;
//Double O tipo de dados double � usado quando precisamos armazenar n�meros de ponto-flutuante (com parte fracion�ria) na 
//possui precis�o de 14 ou 15 d�gitos significativos.	
//Float O tipo de dados float � usado quando precisamos armazenar n�meros de ponto-flutuante (com parte fracion�ria) na
//possui precis�o de 6 ou 7 d�gitos significativos.	
		
		double n1, n2, n3, total, mediaAvaliacoes, frequencia;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota: ");
	n1 = entrada.nextDouble();
	
	
	System.out.println("Digite a segunda nota: ");
	n2 = entrada.nextDouble();
	
	System.out.println("Digite a terceira nota: ");
	n3 = entrada.nextDouble();
	
	total = n1 + n2 + n3;
	mediaAvaliacoes = total / 3; //ou (n1 + n2 + n3)/3;
	
	System.out.println("Digite a frequ�ncia do aluno: ");
	
	frequencia = entrada.nextDouble();
	
	String situacao;
	
	if (total >= 70 && frequencia >= 75)// se o if e o else if der falso entra no else (reprovado);
		situacao = "Aprovado";
	
	else if (total >= 40 && total < 70 && frequencia >=75)//se o aluno tiver nota maior ou igual a 40 e menor igual a 70 e frequencia maior igual
	situacao = "Prova final";//70, o aluno entrar na prova final; tem que atender as tr�s condi��es;
	
	else 
    situacao = "Reprovado";
	System.out.printf("O aluno obteve nota total de %.2f e m�dia por avalia��es de %.2f e frequ�ncia de %.2f. Com isso o aluno est� %s ", total,
	mediaAvaliacoes, frequencia, situacao);
	
	}

}             //%.2f porque � um float, um ponto flutuante;
