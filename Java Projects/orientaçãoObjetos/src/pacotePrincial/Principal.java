package pacotePrincial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// O que � uma classe? � um modelo que define a forma de um objeto; os objetos s�o inst�ncias de uma classe;
		// A classe � como se fosse a "forma" do objeto; Os objetos s�o inst�ncias da classe; A classe define como os objetos ser�o constru�dos;
		// ex: classe "pessoa": objeto : Ana, paulo, Jo�o etc...Classe "Animal" cachorro, gato, papagaio etc..."Objetos" s�o inst�ncias de uma classe;
		// Podemos ter inumeras inst�ncias em uma classe; Na classe "pessoas" no Brasil, quantos objetos temos na classe pessoa? cerca de 210 milh�es de inst�ncias,pessoas;	
		// Podemos ter uma classe chamada "carro", quantas inst�ncias carro temos no Brasil? muitos; temos as caracter�sticas, tipo cor, largura, pneus etc;	
		// Uma classe � uma abstra��o; S� quando um objeto � inst�nciado(criado) � que existe uma representa��o na mem�ria; Objetos compostos por dados e opera��es;
		// vari�veis e m�todos; 	
		// opera��es no objeto  na classe "carro": ligar, desligar, andar pr� frente, frear etc;
	
	   //Tipo - nome do objeto - atribui(=) - new - construtor(System.in);
		
		
		Pessoa2 p1 = new Pessoa2();
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumero = new Scanner(System.in);
		char imprimirEndereco = ' ';
		
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
	
		System.out.println("Digite a idade: ");
		p1.idade = entNumero.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF = entCaracter.nextLine();	
	
		System.out.println("Digite a rua: ");// tinha dado erro pq estava "Null", a� fez o construtor na classe Pessoa2 e fez "endereco = new DadosEndereco();"
		p1.endereco.logradouro = entCaracter.nextLine();
	
		System.out.println("Digite o n�mero: ");
		p1.endereco.numero = entNumero.nextInt();
	
		System.out.println("Digite o complemento: ");
		p1.endereco.complemento = entCaracter.nextLine();
	
		System.out.println("Digite a cidade: ");
		p1.endereco.cidade = entCaracter.nextLine();
	
		System.out.println("Digite o estado: ");
		p1.endereco.estado = entCaracter.nextLine();
	
		System.out.println("Digite o CEP: ");
		p1.endereco.CEP = entCaracter.nextLine();
	
		System.out.println("Deseja imprimir os dados com o endere�o?");
		imprimirEndereco = entCaracter.nextLine().charAt(0);
		System.out.printf("%s\n",p1.imprimirDadosPessoa(imprimirEndereco));
	
	
		Pessoa2 p2 = new Pessoa2("Carlos Silva", 49, "000.666.888-00");// vai ser criado o p2 com nome, idade, e cpf que passou no construtor;
		p2.endereco.logradouro = "Avenida brasil";
		p2.endereco.numero = 66;
		p2.endereco.complemento = "Centro";
		p2.endereco.cidade = "Manaus";
		p2.endereco.estado = "AM";
		p2.endereco.CEP = "560000000-00"; 
	
		System.out.printf("%s\n", p2.imprimirDadosPessoa('S'));
	
	
		Pessoa2 p3 = new Pessoa2("Maria Joana", 29, "000.985.444-44", 
				"Avenida Sousa", 78, "casa fundos", "Curitiba", "PR", "565858-90");
		System.out.printf("%S\n", p3.imprimirDadosPessoa('S'));
	
	}
		
	
	
}
