package AulaOO2;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// se fizer s� o m�todo "get" n�o tem como atribuir valor para essa vari�vel, fica somente leitura;
	
	Carro c1 = new Carro();
	c1.setnportas(4); //se quiser gravar dados  usa "set"
	c1.setMarca("Willys");
	c1.setModelo("Jipe 4x4");
	c1.setnCavalos(70);
	
	System.out.printf("Marca: %s.\nModelo: %s.\n"
			+ "N�meros de portas %d.\nQuantidade de cavalos %d.\n", c1.getMarca(), c1.getModelo(), c1.getnportas(), c1.getnCavalos());
	
	}

}
