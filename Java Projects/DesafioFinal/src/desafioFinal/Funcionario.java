package desafioFinal;

import interfaces.Empregado;
//implementa a interface Empregado, com implements
public class Funcionario implements Empregado {

	private String nome;
	private double salario;

	@Override
	public double getInss() {
		double inss = 0;
		
		if (salario == 1045) {
			inss =  78.38;
				
		}

		if (salario >= 1045.1 && salario <= 2089.60){
			inss = 78.38 + ((salario - 1045)*0.09);	

		}

		if (salario >= 2089.61 && salario <= 3134.40){
			inss = 78.38 + 94.01 + ((salario - 2089.61)*0.12);
	
		}


		if (salario > 3134.41 && salario <= 6101.06){
			inss = 78.38 + 94.01 + 125.38 + ((salario - 3134.40)*0.14);
		
		}

		if (salario > 6101.06){
			inss = 713.10;
			
		}
		return inss;

	}

	public double getSalarioDesc() {
		double salarioDesc = 0;	
		double descInss = 0;
		
		if (salario == 1045) {
			descInss =  78.38;
			salarioDesc = salario - descInss;		
		}

		if (salario >= 1045.1 && salario <= 2089.60){
			descInss = 78.38 + ((salario - 1045)*0.09);
			salarioDesc = salario - descInss;
		
		}
		
		if (salario >= 2089.61 && salario <= 3134.40){
			descInss = 78.38 + 94.01 + ((salario - 2089.61)*0.12);
			salarioDesc = salario - descInss;
			
		}
		
		if (salario > 3134.41 && salario <= 6101.06){
			descInss = 78.38 + 94.01 + 125.38 + ((salario - 3134.40)*0.14);									 
			salarioDesc = salario - descInss;
		}
		
		if (salario > 6101.06){
			descInss = 713.10;
			salarioDesc = salario - descInss;
		}

		return salarioDesc;
	}

	public double getSalarioLiquido() {

		double salarioLiquido = salario - getInss() - getIrrf();

		return salarioLiquido;
	}

	public double getIrrf() {
		double salarioDesc = getSalarioDesc();
		double irrf = 0;
		
		if (salarioDesc <= 1903.98) {
			irrf = 0;
			
		}

		if (salarioDesc >= 1903.99 && salarioDesc <= 2826.65 ) {
			irrf = (salarioDesc * 0.075) - 142.80;
		
		}

		if (salarioDesc >= 2826.66 && salarioDesc <= 3751.05 ) {
			irrf = (salarioDesc * 0.15) - 354.80;
			
		}

		if (salarioDesc >= 3751.06 && salarioDesc <= 4664.68 ) {
			irrf = (salarioDesc * 0.225) - 636.13;
		
		}

		if (salarioDesc > 4664.69 ) {
			irrf = (salarioDesc * 0.275) - 869.36;
			
		}

		return irrf;

	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String toString() {
		return "Nome: " + nome + "  " + "Salário: " + salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


}
