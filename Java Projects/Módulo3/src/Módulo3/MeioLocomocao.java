package Módulo3;

public interface MeioLocomocao {
	public default void acelerar() {
	//se tiver uma implementação default, não é preciso implementar obrigatóriamente os métodos da interface, na classe que estiver usando a interface
	}
	//public void acelerar();
	public void frear();
	
}
