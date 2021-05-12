package pacotePrincial;
// Não precisou criar public static void porque o programa vai começar na classe princial.java;então não precisa criar o método main;
// Uma classe é criada por métodos e atributos, os atributos são representados por variáveis, nem sempre só por tipos primitivos;


public class pessoa {// isso é só a classe, não tem objetos, é genérico;
	
	// Com essa classe da pra criar N objetos;
	// tudo aqui são propriedades ou atributos representado por variáveis; String não é classe primitivo;
	
	int idade;
	double altura;
	double peso;
	String nome;

	// aqui é o método, vai retornar um string;
	// tem que converter o int e o double em string, se não, não concatena junto com a string;
	
	String imprimeDados() {
		return "Nome: " + nome + "\nIdade" + Integer.toString(idade) + 
			   "\nPeso" + Double.toString(peso) +"\nAltura:" + Double.toString(altura);
	
	
	}

	int rertornarAnoNascimento() {
		return 2020 - idade;
	}

}
