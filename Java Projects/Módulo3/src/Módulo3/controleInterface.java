package M�dulo3;

import java.util.ArrayList;

public class controleInterface {

	public static void main(String[] args) {
		ArrayList<MeioLocomocao> lista = new ArrayList<MeioLocomocao>();
		Caminhao caminhao = new Caminhao();
		carroInterface carro = new carroInterface();
		
		//MeioLocomocao m = new MeioLocomocao(); n�o pode fazer isso, porque � uma interface, n�o pode instaciar, pode instaciar classes que usam uma interface
		carro.acelerar();
		
		
		lista.add(carro);
		lista.add(caminhao);
		//for (MeioLocomocao m : lista) { se criar uma lista a partir da Interface, s� vai poder usar os m�todos dentro da interface
			//m.acelerar();
		
	}
	

}
