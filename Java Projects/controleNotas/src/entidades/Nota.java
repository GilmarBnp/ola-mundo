package entidades;

public class Nota {
	private Materia materia;
	private double nota;
	//n�o precisa criar private aluno, porque j� tem na classe aluno, um ArrayList de notas, ex: na classe Aluno, tem o objeto Jo�ozinho e l�
	//tem um ArrayList contendo todas as notas de Jo�ozinho
	//mas poderia ter modelado de forma diferente, colocando o nome dos alunos na classe Nota
	
	public String toString() {//sempre que imprimir uma nota , vai sair desse jeito
		return materia.getNome() + " - " + nota;
	}
	
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

}
