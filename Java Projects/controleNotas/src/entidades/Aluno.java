package entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private Integer matricula;
	private ArrayList<Nota> notas;
	
	public Aluno() {
	
	}
	

	public Aluno(String nome, Integer matricula) {//esse � o construtor, com nome e matricula do aluno
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new ArrayList<>();// se n�o notas fica null � da um erro na compila��o, aqui foi dado uma ArrayString vazia para notas
	}
	public String toString() {//para mostrar no console o nome e a matricula, caso n�o fa�a isso, fica assim no console: entidades.Aluno@5d099f62
		return "Aluno:" + nome + " - " + "Matricula: " + matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
