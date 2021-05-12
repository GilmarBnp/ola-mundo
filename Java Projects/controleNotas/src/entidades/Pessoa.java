package entidades;

public abstract class Pessoa {
	//private String nome;
	protected String nome; //permite que os filhosque extenderem a classe possam usar  a String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
