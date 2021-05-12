package M�dulo3;
import java.util.LinkedList;
import java.util.Queue;
public class Fila {

public static void main(String[] args) {
	
	Queue<String> fila = new LinkedList<>();// n�o d� pra inst�nciar porque Queue � uma interface, n�o d� para colocar fila = new Queue<>();
	// a implementa��o do Queue est� sendo atrav�s do LinkedList

	//adicionando elemento na fila
	
	fila.add("Pessoa 1");
	fila.add("Pessoa 2");
	fila.add("Pessoa 3");
	fila.add("Pessoa 4");
	fila.add("Pessoa 5");

	System.out.println(fila);

	//remo��o elemento da fila, remove o primeiro elemento da fila
	System.out.println("Elemento removido" + fila.remove());

	System.out.println(fila);
	
	//verifica o primeiro elemento da fila
	
	System.out.println("Elemento verificado" + fila.peek());
	
	//procurar elemento est� numa fila � retorna um true ou false
	
	System.out.println(fila.contains("Pessoa 3"));
	
	//retornar tamanho da fila
	
	System.out.println(fila.size());
	
	//verifica se a fila est� vazia, retorna true ou false
	System.out.println(fila.isEmpty());
	
	//limpar fila
	fila.clear();
	System.out.println(fila.isEmpty());
	
	


}

}
