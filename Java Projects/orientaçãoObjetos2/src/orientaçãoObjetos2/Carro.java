package orienta��oObjetos2;

public class Carro {

private int nportas;// se estiver no private, n�o public pode atribuir valores com Get e recuperar valores com SET
private String marca;
private String modelo;
private int nCavalos;

public int getnportas() { //pega o private que n�o aparece nas sugest�es e recupera ele; 
	return nportas;

}

public void setnportas(int nportas) {
	
	this.nportas = nportas;// this � "reservado", quando tem dois nomes iguais sendo usados; nportas do construtor = nportas do private;
}

}
