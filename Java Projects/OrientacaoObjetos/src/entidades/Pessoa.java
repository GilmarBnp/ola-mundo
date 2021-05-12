package entidades;
//uma classe só pode herdar de uma única classe
public abstract class Pessoa {//serve como um rascunho
	protected String nome;//private só a classe tem acesso, então tem que usar aluno1.setNome /protected todos que herdam de "Pessoa" tem acesso
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String numero;
	
	public abstract String informaTipo();
	//tem que colocar em todos que estão herdando da classe Pessoa
	
	public String enderecoCompleto() {
		return endereco + ", " + numero;
	
	}
	public void atualizarDadosPessoais(String nome) {//de vez de ir criando um por um 
		this.nome = nome;								//public void atualizarDadosPessoaisNomeCpf(String nome, String cpf) usasse o sobrecarga: atualizarDadosPessoais(String nome, String cpf)
		this.cpf = cpf;
					
		
	}
	
	public void atualizarDadosPessoais(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
