package entidades;

import java.util.ArrayList;
//ctrl + shift + O importa tudo que precisa
public class Controle {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private ArrayList<Diretor> diretores = new ArrayList<>();
	private ArrayList<Professor> professores = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void iniciar() {
		Aluno aluno1 = new Aluno();//(Isso é um objeto da classe aluno)(quando se cria um construtor, não pode deixar ele vazio, tipo new Aluno() ou então cria um construtor vazio, ai resolve o problema 
		aluno1.setNome("João Silva");//não dá pra fazer aluno1.nome porque não pode acessar diretamente uma classe private, então usa .setNome
		aluno1.setCpf("122548965849");//Isso é uma instância da classe aluno
		aluno1.setTelefone("(83)99688-4401");
		aluno1.setEndereco("Rua X");
		aluno1.setNumero("10");
		aluno1.setMatricula(123456);
		
		Aluno aluno2 = new Aluno("Maria Sousa", "01548548850", 
				"(83)9859-8596", "Rua Y", 12575858);
	//da pra ter vários construtores em uma mesma classe, tipo, um construtor com nome, outro com nome, cpf, numero telefone, endereço, matricula, e por ai vai...
		Aluno aluno3 = new Aluno("José Rocha");//ele entrou no construtor que só tem a String nome, na classe Aluno
		aluno3.setCpf("369658585");
		aluno3.setTelefone("(83)9696-4785");//dá pra adicionar informações tanto pelo construtor, quanto manualmente pelo aluno3.set
		aluno3.setEndereco("Rua H");
		aluno3.setMatricula(2145875);
	
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		Professor professor1 = new Professor();
		professor1.setNome("Henrique Souza");
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Diretor Girafales");
		
		pessoas.add(aluno1);
		pessoas.add(professor1);
		pessoas.add(diretor1);
	
		System.out.println(aluno1.enderecoCompleto());
		System.out.println(aluno1.informaTipo());
		System.out.println(professor1.informaTipo());
		System.out.println(diretor1.informaTipo());
		
		aluno1.atualizarDadosPessoais("Nome de teste");
		aluno1.atualizarDadosPessoais("Nome de teste2", "12485588585");
		System.out.println(aluno1.getNome());
		
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		
		//Pessoa pessoa = new Pessoa(); não dá para criar um novo objeto de uma classe abstract, o abstract é usado quando quer apenas que as classes herdem seus atributos, ex: classe "Pessoa"
		//a classe Aluno herda da classe Pessoa, então dá pra adicionar aluno1 para a string pessoa, mas não dá para adicionar Pessoa para a classe Aluno
	
	}

}
