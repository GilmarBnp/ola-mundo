// String � orientado a objeto, aceita mais de um character ex "Jos�"; usa aspas dupla;
// char s� aceita um charactere ex "jos�" no char s� aceita o "j" e usa aspas simples;
// char aceita ex char tipo = 'Z'; ele esta considerando o 'Z', s� um character;
// String n�o � uma vari�vel primitiva
// Primitivas : char, boolean , double, float;
// boolean s� aceita true ou false;

package pacotePrimeiroPrograma;

public class nnnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nome, nome2;
		nome = "Jos� da Silva Costa";
		nome2 = "Maria Clara Almeida";
		
		System.out.println(nome);
		System.out.println(nome2);
		
	
	int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
	
	System.out.println("A vari�vel nome tem " + tamanhoDoNome + " caracteres.");
	System.out.println("A vari�vel nome2 tem " + tamanhoDoNome2 + " caracteres.");
	int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
	System.out.println("O n�mero total de caracteres da vari�vel nome e nome 2 �: " + totalCaracteres);
	
	String nomesConcatenados = nome.concat(nome2);
	
	System.out.println(nomesConcatenados);
	
	String nome1e2SemAeb = nome.replace('a', '9') + nome2.replace('a', '8');
	System.out.println(nome1e2SemAeb);
	
	String somenteNome = nome2.substring(0, 11); //o 0 significa que come�a do inicio "M" de Maria e vai at� o caracter 11 e apaga depois do 11, apagou Almeida;
	System.out.println(somenteNome);
	
	String nomeTudoMaiusculo = nome.toUpperCase();
	System.out.println(nomeTudoMaiusculo);
	
	String nomeTudoMaiusculo2 = nome2.toUpperCase();
	System.out.println(nomeTudoMaiusculo2);
	
	
	}

}
