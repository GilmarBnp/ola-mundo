package pacotePrimeiroPrograma;

public class operadoresL�gicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// || significa "ou"
	// && significa "e" "e" tem preced�ncia;
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
	// !restricaoCredito falso; ! � falso;
	// concede o empr�stimo se os dois primeiros for verdadeiro ou se for cliente 10 estrelas;
	//boolean concederEmprestimo = ultEmprestimoQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas;
	//System.out.printf("Empr�stimo concedido? \n%b", concederEmprestimo);
	// esse boolean � para conceder o empr�stimo "true" e a vari�vel restricaoCredito tem que est� negativo, com !restricaoCredito; 
	//se restricaoCredito estiver positivo, significa que a pessoa est� com o nome sujo;
	
	boolean concederEmprestimo = (ultEmprestimoQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
	
	System.out.printf("Empr�stimo concedido? \n%b", concederEmprestimo);
	
	
	}

}
