package pacotePrincial;

public class Pessoa2 {

String nome;
int idade;
String CPF;
DadosEndereco endereco;

Pessoa2() {// é o construtor da classe pessoa/ a primeira coisa que acontece é passar por aqui;
endereco = new DadosEndereco();	

}
Pessoa2(String name, int age, String id){
nome = name;
idade = age;
CPF = id;
endereco = new DadosEndereco();		

}

Pessoa2(String name, int age, String id, String street, int number,
			String compl, String city, String UF, String code){
nome = name;
idade = age;
CPF = id;
endereco = new DadosEndereco();	
endereco.logradouro = street;
endereco.numero = number;
endereco.complemento = compl;
endereco.cidade = city;
endereco.estado = UF;
endereco.CEP = code;

}

String imprimirDadosPessoa(char imprimirEndereco) {// tem que passar um char para perguntar se vai imprimir o endereço;
	if(imprimirEndereco == 'N' || imprimirEndereco == 'n')
	return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF;

	else  
		return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF + endereco.imprimirDadosEndereco();
}
}
