package Módulo3;

import java.util.ArrayList;

public class controleInterface {

	public static void main(String[] args) {
		ArrayList<MeioLocomocao> lista = new ArrayList<MeioLocomocao>();
		Caminhao caminhao = new Caminhao();
		carroInterface carro = new carroInterface();
		
		//MeioLocomocao m = new MeioLocomocao(); não pode fazer isso, porque é uma interface, não pode instaciar, pode instaciar classes que usam uma interface
		carro.acelerar();
		
		
		lista.add(carro);
		lista.add(caminhao);
		//for (MeioLocomocao m : lista) { se criar uma lista a partir da Interface, só vai poder usar os métodos dentro da interface
			//m.acelerar();
		
	}
	

}
