package entidades;

public class Aluno extends Pessoa {//modo antigo de Aluno.java se encontra em M�dulo3 classePessoaAntiga
	//public final class Aluno extends Pessoa, pode herdar da classe Pessoa, mas ningu�m pode herdar da classe Aluno, por causa do "final"
	private Integer matricula;//pode fazer getters e setters j� que est� declarado aqui
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	
	public Aluno(String nome, String cpf, String telefone, String endereco, Integer matricula) {//esse � o construtor da classe Aluno
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.matricula = matricula;
		
	}


	public String enderecoCompleto() {
		return "Sobreescrevi o m�todo";//sobreescrevendo o que herdou da classe Pessoa
	}
	
	
	public String informaTipo() {
		return "Meu tipo � Aluno";
	}
	
	
	//cria getters e setters para poder usar o private em outras classes, criar autom�ticamente: Source, generate getters e setters
	
	

	
}
