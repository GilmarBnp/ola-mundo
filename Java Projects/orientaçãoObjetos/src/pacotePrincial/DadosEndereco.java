package pacotePrincial;

public class DadosEndereco {


String logradouro;
int numero;
String complemento;
String cidade;
String estado;
String CEP;


String imprimirDadosEndereco() {
	return "\nRua " + logradouro + ", " + Integer.toString(numero) + ", " + 
    complemento + ". " + "Cidade: " + cidade + ". " + " Estado: " + estado + ". " + " CEP: " + CEP;

}


}
