//double para valor fracion�rio;
//int para valor inteiro;
//println quebra a linha;
//%s � o coringa do String;
//%d � o coringa do int;
//%.2f float ou double com duas casas decimais, %.4f com quatro casas decimais;
//%b � o coringa do boolean;
//%c � o coringa do caractere(Char);
//printf: trabalha com o conceito de coringa,



package pacotePrimeiroPrograma;

public class printPrintlnPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int idade = 30;
	double altura = 1.79;	
	String nome = "Joaquin Jos� da Silva";
	boolean estudante = true;
	char sexo = 'M';//s� aceita um caracter;
	//System.out.print("idade"); com aspas " " ele procura o nome "idade" sem aspas procura a vari�vel, e se colacar algo que n�o existe no
	//programa, tipo "altura" ele vai dar erro;
	
	
	//System.out.print("idade: " + idade);
	//System.out.print("altura: " + altura);
	
	//System.out.println("idade: " + idade);
	//System.out.println("altura: " + altura);
	
	System.out.printf("A idade � %d e a altura � %.2f.\n o nome � %s.\n � estudante? %b.\n sexo %c", idade, altura, nome, estudante, sexo);
	// os coringas tem que est� na ordem certa: idade, altura, nome, estudante, sexo;
	// \n para quebrar linha;
	}

}
