package pacotePrincial;
// N�o precisou criar public static void porque o programa vai come�ar na classe princial.java;ent�o n�o precisa criar o m�todo main;
// Uma classe � criada por m�todos e atributos, os atributos s�o representados por vari�veis, nem sempre s� por tipos primitivos;


public class pessoa {// isso � s� a classe, n�o tem objetos, � gen�rico;
	
	// Com essa classe da pra criar N objetos;
	// tudo aqui s�o propriedades ou atributos representado por vari�veis; String n�o � classe primitivo;
	
	int idade;
	double altura;
	double peso;
	String nome;

	// aqui � o m�todo, vai retornar um string;
	// tem que converter o int e o double em string, se n�o, n�o concatena junto com a string;
	
	String imprimeDados() {
		return "Nome: " + nome + "\nIdade" + Integer.toString(idade) + 
			   "\nPeso" + Double.toString(peso) +"\nAltura:" + Double.toString(altura);
	
	
	}

	int rertornarAnoNascimento() {
		return 2020 - idade;
	}

}
