package entidades;

public class Materia {
	private String nome;//ex: portugu�s
	private Professor professor;//uma classe professor para representar cada mat�ria
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


}
