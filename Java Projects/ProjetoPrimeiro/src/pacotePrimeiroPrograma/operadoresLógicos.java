package pacotePrimeiroPrograma;

public class operadoresLógicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// || significa "ou"
	// && significa "e" "e" tem precedência;
	// == Igual a;
    // != Diferente de;
	// > Maior que;
	// < Menor que;
	// >= Maior igual a;
	// <= Menor igual a;
	
	boolean ultEmprestimoQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
	
	ultEmprestimoQuitadosPrazo = true;
	possuiRendaComprovada = true;
	clienteDezEstrelas = true;
	restricaoCredito = true;
	// !restricaoCredito falso; ! é falso;
	// concede o empréstimo se os dois primeiros for verdadeiro ou se for cliente 10 estrelas;
	//boolean concederEmprestimo = ultEmprestimoQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas;
	//System.out.printf("Empréstimo concedido? \n%b", concederEmprestimo);
	// esse boolean é para conceder o empréstimo "true" e a variável restricaoCredito tem que está negativo, com !restricaoCredito; 
	//se restricaoCredito estiver positivo, significa que a pessoa está com o nome sujo;
	
	boolean concederEmprestimo = (ultEmprestimoQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
	
	System.out.printf("Empréstimo concedido? \n%b", concederEmprestimo);
	
	
	}

}
