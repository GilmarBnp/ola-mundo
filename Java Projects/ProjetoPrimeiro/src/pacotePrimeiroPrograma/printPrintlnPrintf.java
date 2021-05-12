//double para valor fracionário;
//int para valor inteiro;
//println quebra a linha;
//%s é o coringa do String;
//%d é o coringa do int;
//%.2f float ou double com duas casas decimais, %.4f com quatro casas decimais;
//%b é o coringa do boolean;
//%c é o coringa do caractere(Char);
//printf: trabalha com o conceito de coringa,



package pacotePrimeiroPrograma;

public class printPrintlnPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int idade = 30;
	double altura = 1.79;	
	String nome = "Joaquin José da Silva";
	boolean estudante = true;
	char sexo = 'M';//só aceita um caracter;
	//System.out.print("idade"); com aspas " " ele procura o nome "idade" sem aspas procura a variável, e se colacar algo que não existe no
	//programa, tipo "altura" ele vai dar erro;
	
	
	//System.out.print("idade: " + idade);
	//System.out.print("altura: " + altura);
	
	//System.out.println("idade: " + idade);
	//System.out.println("altura: " + altura);
	
	System.out.printf("A idade é %d e a altura é %.2f.\n o nome é %s.\n é estudante? %b.\n sexo %c", idade, altura, nome, estudante, sexo);
	// os coringas tem que está na ordem certa: idade, altura, nome, estudante, sexo;
	// \n para quebrar linha;
	}

}
