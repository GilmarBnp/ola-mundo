package pacotePrimeiroPrograma;

import java.util.Scanner;

public class utilizandoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String permite você armazenar qualquer tipo de caracteres seja numero ou texto;
//Int permite armazenar números inteiros;
//Double O tipo de dados double é usado quando precisamos armazenar números de ponto-flutuante (com parte fracionária) na 
//possui precisão de 14 ou 15 dígitos significativos.	
//Float O tipo de dados float é usado quando precisamos armazenar números de ponto-flutuante (com parte fracionária) na
//possui precisão de 6 ou 7 dígitos significativos.	
		
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
	
	System.out.println("Digite a frequência do aluno: ");
	
	frequencia = entrada.nextDouble();
	
	String situacao;
	
	if (total >= 70 && frequencia >= 75)// se o if e o else if der falso entra no else (reprovado);
		situacao = "Aprovado";
	
	else if (total >= 40 && total < 70 && frequencia >=75)//se o aluno tiver nota maior ou igual a 40 e menor igual a 70 e frequencia maior igual
	situacao = "Prova final";//70, o aluno entrar na prova final; tem que atender as três condições;
	
	else 
    situacao = "Reprovado";
	System.out.printf("O aluno obteve nota total de %.2f e média por avaliações de %.2f e frequência de %.2f. Com isso o aluno está %s ", total,
	mediaAvaliacoes, frequencia, situacao);
	
	}

}             //%.2f porque é um float, um ponto flutuante;
