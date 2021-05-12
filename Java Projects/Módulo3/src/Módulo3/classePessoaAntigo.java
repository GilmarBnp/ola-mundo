package Módulo3;

public class classePessoaAntigo {
	

	public class Aluno {
		private String nome;
		private String cpf;
		private String telefone;
		private String endereco;
		private Integer matricula;
		
		public Aluno() {
			
		}
		
		public Aluno(String nome) {
			this.nome = nome;
		}
		
		public Aluno(String nome, String cpf, String telefone, String endereco, Integer matricula) {//esse é o construtor da classe Aluno
			this.nome = nome;
			this.cpf = cpf;
			this.telefone = telefone;
			this.endereco = endereco;
			this.matricula = matricula;
			
		}
		
		
		//cria getters e setters para poder usar o private em outras classes, criar automáticamente: Source, generate getters e setters
		
		public String getNome() {// =o nome vai ser usado a partir do getNome(), getCpf etc
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
		public Integer getMatricula() {
			return matricula;
		}
		public void setMatricula(Integer matricula) {
			this.matricula = matricula;
		}

		
	}

}
