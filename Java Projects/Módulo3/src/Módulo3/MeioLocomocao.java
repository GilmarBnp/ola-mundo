package M�dulo3;

public interface MeioLocomocao {
	public default void acelerar() {
	//se tiver uma implementa��o default, n�o � preciso implementar obrigat�riamente os m�todos da interface, na classe que estiver usando a interface
	}
	//public void acelerar();
	public void frear();
	
}
