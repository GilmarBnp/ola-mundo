package orientaçãoObjetos2;

public class Carro {

private int nportas;// se estiver no private, não public pode atribuir valores com Get e recuperar valores com SET
private String marca;
private String modelo;
private int nCavalos;

public int getnportas() { //pega o private que não aparece nas sugestões e recupera ele; 
	return nportas;

}

public void setnportas(int nportas) {
	
	this.nportas = nportas;// this é "reservado", quando tem dois nomes iguais sendo usados; nportas do construtor = nportas do private;
}

}
