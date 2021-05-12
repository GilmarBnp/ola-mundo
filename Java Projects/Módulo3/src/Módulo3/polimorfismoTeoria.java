package Módulo3;

public class polimorfismoTeoria {

	/*-Polimorfismo diz respeito a possibilidade de um objeto se comportar de formas diferentes de acordo com a situação
	No polimorfismo duas caracteríscas estão muito presentes, a sobrescrita e sobrecarga de métodos
	
	Sobrescrita
	-Quando uma classe herda uma outra classe, ela herda seus atributos e métodos
	-Nesse momento essa classe tem a opção de realizar uma sobrescrita de alguns métodos, substituindo o código herdado pelo que o programador definir
	-Para que isso ocorra , o novo método precisa ter o mesmo nome, tipo de retorno e parâmetros
	-Fornece nova implementação e não novo método
	
	-Muda o atributo que herdou da classe, nesse caso da classe "Pessoa", dentro da própria classe "Aluno" foi feita essa modificação
	de atributo.
	
	(classe Pessoa)
	public String enderecoCompleto() {
		return endereco + ", " + numero;
	}
	
	(classe Aluno)
	public String enderecoCompleto() {
		return "Sobreescrevi o método";//sobreescrevendo o que herdou da classe Pessoa
	}
	
	Sobrecarga
	-Sobrecarga ocorre quando a classe filha que estiver herdando os métodos de uma outra classe optar por criar um novo método com o mesmo nome
	da que foi herdada, variando somente a quantidade de parâmetros ou o tipo de alguns deles
	-Assinatura diferente, o método a ser executado dependerá dos parâmetros fornecidos
	-Exemplo: construtores no java
	
	-esse é o construtor default, se não usar nenhum parametro no construtor, então ira usar esse automáticamente
	
	public Aluno() {
	
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	-O construtor Aluno lá em cima só tem a String nome, já essa de baixo tem nome, cpf, telefone, endereço, matricula
	
	public Aluno(String nome, String cpf, String telefone, String endereco, Integer matricula) {//esse é o construtor da classe Aluno
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.matricula = matricula;
		
	}
	
	*/
}
