package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Materia;
import entidades.Nota;
import entidades.Professor;
import interfaces.ControlesBasicos;
//única coisa que vai pegar dinâmicamente é os alunos e suas notas(adicionar pelo scanner)
public class ControleNotas implements ControlesBasicos {//implements é para usar interface de uma classe
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Aluno> alunos = new ArrayList<>();
	//private ArrayList<Professor> professores = new ArrayList<>(); não precisa criar array de professores já que já tem uma parte dos professores na classe Materia
	private ArrayList<Materia> materias = new ArrayList<>();//esse é o ArrayList das matérias
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Digite o comando desejado: \n");
		sb.append("1 - ver alunos \n");
		sb.append("2 - ver matérias \n");
		sb.append("3 - inserir aluno \n");
		sb.append("4 - inserir nota \n");
		sb.append("5 - excluir nota \n");
		sb.append("6 - consultar notas \n");
		sb.append("0 - sair \n");
		
		System.out.println(sb.toString());
		return scanner.nextLine();
		
	}
	
	public void iniciar() {
		inicializarProfessorMateria();
		String opcao = mostrarMenu();// a String opcao vai receber os comandos do usuário
		
		while(!opcao.equals(0)) {
			switch (opcao) {
			case "1":
				System.out.println(alunos);
				opcao = mostrarMenu();
				break;
			
			case "2":
				System.out.println(materias);
				opcao = mostrarMenu();
				break;
			
			case "3":
				System.out.println("Digite o nome do aluno: ");
				String nome = scanner.nextLine();
				System.out.println("Digite a matrícula do aluno");
				//Integer matricula = scanner.nextInt();
				Integer matricula = Integer.parseInt(scanner.nextLine());//converter Int em String
				//scanner.nextLine(); para limpar o scann caso use o nextLine e nextInt
				Aluno aluno = new Aluno(nome, matricula);//ou cria o construtor de Aluno(nome, matricula) ou seta com setNome e setMatricula
				alunos.add(aluno);
				System.out.println(aluno);
				opcao = mostrarMenu();	
				break;
			
			case "4":
				inserir();
				opcao = mostrarMenu();
				break;
			
			case "5":
				excluir();
				opcao = mostrarMenu();
				break;
			
			case "6":
			consultar();
			opcao = mostrarMenu();
			break;
			
			}
		}
	}
	
		public void inserir() {
		
		System.out.println("Digite o índice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());//converter Int em String
		System.out.println("Digite o índice da matéria: ");
		Integer indiceMateria = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite a nota: ");
		Double valorNota = Double.parseDouble(scanner.nextLine());
		Nota nota = new Nota();
		nota.setNota(valorNota);
		nota.setMateria(materias.get(indiceMateria));
		
		alunos.get(indiceAluno).getNotas().add(nota);//get para pegar as informações do aluno e dpois das notas e depois add nota
		System.out.println(alunos.get(indiceAluno).getNotas());	
	}

	
	public void excluir() {
		System.out.println("Digite o índice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o índice da nota que deseja excluir: ");
		int indiceNota = Integer.parseInt(scanner.nextLine());//pelo integer ele procura um objeto e não um tipo primitivo, então deve-se usar int indiceNota
		alunos.get(indiceAluno).getNotas().remove(indiceNota);
	}

	
	public void consultar() {
		System.out.println("Digite o índice do aluno: ");
		Integer indiceAluno = Integer.parseInt(scanner.nextLine());	
		System.out.println("Aluno: " + alunos + alunos.get(indiceAluno).getNotas());//alunos.get para puxar oelemento do array de alunos
	}
	
	
	

	private void inicializarProfessorMateria() {
		Professor professor1 = new Professor();//poderia ter criado um construtor e ter setado os parametros(nome, matricula, matéria etc)
		professor1.setNome("Professor Girafales");
		
		Materia materia1 = new Materia();
		materia1.setNome("Português");
		materia1.setProfessor(professor1);//na classe Materia o professor1 foi setado como professor
		
		Professor professor2 = new Professor();
		professor2.setNome("Beatriz Melo");
		
		Materia materia2 = new Materia();
		materia2.setNome("Matemática");
		materia2.setProfessor(professor2);
		
		Professor professor3 = new Professor();
		professor3.setNome("Jorge Silva");
		
		Materia materia3 = new Materia();
		materia3.setNome("Ciência");
		materia3.setProfessor(professor3);
		
		Professor professor4 = new Professor();
		professor4.setNome("Everaldo Moíses");
		
		Materia materia4 = new Materia();
		materia4.setNome("História");
		materia4.setProfessor(professor4);
	
		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);
	}

	
	
}
