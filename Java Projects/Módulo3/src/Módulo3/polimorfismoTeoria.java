package M�dulo3;

public class polimorfismoTeoria {

	/*-Polimorfismo diz respeito a possibilidade de um objeto se comportar de formas diferentes de acordo com a situa��o
	No polimorfismo duas caracter�scas est�o muito presentes, a sobrescrita e sobrecarga de m�todos
	
	Sobrescrita
	-Quando uma classe herda uma outra classe, ela herda seus atributos e m�todos
	-Nesse momento essa classe tem a op��o de realizar uma sobrescrita de alguns m�todos, substituindo o c�digo herdado pelo que o programador definir
	-Para que isso ocorra , o novo m�todo precisa ter o mesmo nome, tipo de retorno e par�metros
	-Fornece nova implementa��o e n�o novo m�todo
	
	-Muda o atributo que herdou da classe, nesse caso da classe "Pessoa", dentro da pr�pria classe "Aluno" foi feita essa modifica��o
	de atributo.
	
	(classe Pessoa)
	public String enderecoCompleto() {
		return endereco + ", " + numero;
	}
	
	(classe Aluno)
	public String enderecoCompleto() {
		return "Sobreescrevi o m�todo";//sobreescrevendo o que herdou da classe Pessoa
	}
	
	Sobrecarga
	-Sobrecarga ocorre quando a classe filha que estiver herdando os m�todos de uma outra classe optar por criar um novo m�todo com o mesmo nome
	da que foi herdada, variando somente a quantidade de par�metros ou o tipo de alguns deles
	-Assinatura diferente, o m�todo a ser executado depender� dos par�metros fornecidos
	-Exemplo: construtores no java
	
	-esse � o construtor default, se n�o usar nenhum parametro no construtor, ent�o ira usar esse autom�ticamente
	
	public Aluno() {
	
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	-O construtor Aluno l� em cima s� tem a String nome, j� essa de baixo tem nome, cpf, telefone, endere�o, matricula
	
	public Aluno(String nome, String cpf, String telefone, String endereco, Integer matricula) {//esse � o construtor da classe Aluno
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.matricula = matricula;
		
	}
	
	*/
}
