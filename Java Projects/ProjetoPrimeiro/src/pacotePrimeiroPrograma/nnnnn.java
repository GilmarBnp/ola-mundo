// String é orientado a objeto, aceita mais de um character ex "José"; usa aspas dupla;
// char só aceita um charactere ex "josé" no char só aceita o "j" e usa aspas simples;
// char aceita ex char tipo = 'Z'; ele esta considerando o 'Z', só um character;
// String não é uma variável primitiva
// Primitivas : char, boolean , double, float;
// boolean só aceita true ou false;

package pacotePrimeiroPrograma;

public class nnnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nome, nome2;
		nome = "José da Silva Costa";
		nome2 = "Maria Clara Almeida";
		
		System.out.println(nome);
		System.out.println(nome2);
		
	
	int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
	
	System.out.println("A variável nome tem " + tamanhoDoNome + " caracteres.");
	System.out.println("A variável nome2 tem " + tamanhoDoNome2 + " caracteres.");
	int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
	System.out.println("O número total de caracteres da variável nome e nome 2 é: " + totalCaracteres);
	
	String nomesConcatenados = nome.concat(nome2);
	
	System.out.println(nomesConcatenados);
	
	String nome1e2SemAeb = nome.replace('a', '9') + nome2.replace('a', '8');
	System.out.println(nome1e2SemAeb);
	
	String somenteNome = nome2.substring(0, 11); //o 0 significa que começa do inicio "M" de Maria e vai até o caracter 11 e apaga depois do 11, apagou Almeida;
	System.out.println(somenteNome);
	
	String nomeTudoMaiusculo = nome.toUpperCase();
	System.out.println(nomeTudoMaiusculo);
	
	String nomeTudoMaiusculo2 = nome2.toUpperCase();
	System.out.println(nomeTudoMaiusculo2);
	
	
	}

}
