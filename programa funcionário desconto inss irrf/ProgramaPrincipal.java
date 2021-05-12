package desafioFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("1- Adicionar funcionário: \n");
		sb.append("2- Ver funcionários \n");
		sb.append("3- Imprimir Contracheque \n");
		sb.append("4- Excluir funcionário \n");
		sb.append("5- Adicionar funcionário CLT: \n");
		sb.append("0- Digite 0  para sair \n");
		System.out.println(sb.toString());
		return scanner.nextLine();	
	}
	
	public void iniciar() {
		String opcao = mostrarMenu();
		
		while(!opcao.equals(0)) {
			
			switch(opcao) {	
			
			case "1":
				inserir();
				opcao = mostrarMenu();
				break;		
			
			case "2":
				consultar();
				opcao = mostrarMenu();
				break;
			
			case "3":
				consultarExtrato();
				opcao = mostrarMenu();
				break;	
			
			
			case "4":
				excluir();
				opcao = mostrarMenu();
				break;
				
			case "5":
				inserirZerado();
				opcao = mostrarMenu();
				break;
			
			}			
		}
	}
		public void inserir() {
		System.out.println("Digite o nome e o salário: ");
		System.out.println("nome: ");
		String nome = scanner.nextLine();
		System.out.println("salário: ");
		double salario = Double.parseDouble(scanner.nextLine());
		Funcionario funcionario = new Funcionario(nome, salario);
		funcionarios.add(funcionario);
		System.out.println(funcionario);
		}					
	
		public void inserirZerado() {
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o salário: ");
		double salario = Double.parseDouble(scanner.nextLine());
		Funcionario funcionarioZerado = new FuncionarioZerado(nome, salario);
		funcionarios.add(funcionarioZerado);//inserirZerado adiciona para a lista "funcionarios" do mesmo jeito do "inserir", só que para outra classe, no caso FuncionarioZerado
		System.out.println(funcionarioZerado);//ele pegou FuncionarioZerado e adicionou com funcionarios.add, para a lista funcionarios 
		}				
		
		public void excluir() {
		System.out.println("Qual o indice do funcionário que você quer apagar?");
		int indiceExcluir = Integer.parseInt(scanner.nextLine());
		funcionarios.remove(indiceExcluir);
		}
		
		public void consultar() {
		System.out.println(funcionarios);		
		
		}
		
		public void consultarExtrato() {
		System.out.println("Qual o indice do funcionario?");
		int indiceFuncionario = Integer.parseInt(scanner.nextLine());
		String nomeAbrev = funcionarios.get(indiceFuncionario).getNome();
		Double salarioAbrev1 = funcionarios.get(indiceFuncionario).getSalario();
		Double salarioAbrev2 = funcionarios.get(indiceFuncionario).getSalarioDesc();
		Double salarioAbrev3 = funcionarios.get(indiceFuncionario).getInss();
		Double salarioAbrev4 = funcionarios.get(indiceFuncionario).getIrrf();
		Double salarioAbrev5 = funcionarios.get(indiceFuncionario).getSalarioLiquido();
			
		System.out.printf("Funcionário: %s\n"  + (" ") + "Salário bruto: R$ %.2f\n" + (" ")  + "Salário Líquido: R$ %.2f\n" + (" ") 
		+ "Desconto do INSS: R$ %.2f\n"+ (" ") + "Desconto do IRFF: R$ %.2f\n"  
		+ (" ") + "salarioDesc: R$ %.2f\n", nomeAbrev,salarioAbrev1,salarioAbrev5, salarioAbrev3, salarioAbrev4, salarioAbrev2);
		
		}

}

