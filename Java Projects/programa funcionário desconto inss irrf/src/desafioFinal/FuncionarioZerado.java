package desafioFinal;

public class FuncionarioZerado extends Funcionario {

	public FuncionarioZerado(String nome, double salario) {
		super(nome, salario);
	}
//ele está herdando da classe Funcionario, o que colocar aqui vai sobrescrever Funcionario
//se apagar o getIrrf() aqui, irá usar o getIrrf da classe Funcionario	
	@Override
	public double getIrrf() {
		return 0;
	}

	@Override
	public double getSalarioLiquido() {
		return 0;
	}

}
