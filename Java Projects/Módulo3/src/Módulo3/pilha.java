package M�dulo3;

import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();// n�o precisa botar estring no meio do <>
		Stack<String> stackVazia = new Stack<>();
		// Exemplo: pilha de livro
		// LIFO: last in, first out
		// O �ltimo a sair � o primeiro a entrar
		// Na estrutura tipo pilha, inseri o elemento pelo topo e retira pelo topo

	// adicionando elementos na pilha
		stack.add("Livro 1");
		stack.add("Livro 2");
		stack.add("Livro 3");
		stack.add("Livro 4");
		stack.add("Livro 5");
	
		System.out.println(stack);
		
		//removento elemento da pilha
		
	System.out.println("Elemento removido = " + stack.pop());// removeu o livro 5, que foi o �ltimo a ser colocado
	System.out.println(stack);// aqui j� mostra o println com o livro 5 removido
	
	//peek: verificar elemento no topo da pilha, mas sem remover
	stack.peek();
	System.out.println("Elemento no topo = " + stack.peek());
	System.out.println(stack);
	
	//procurar elemento na pilha
	System.out.println(stack.search("Livro 1"));
	// verifica se a pilha est� vazia, retorna um true ou false
	
	System.out.println("A pilha est� vazia? " + stack.isEmpty ());
	System.out.println("A pilha est� vazia? " + stackVazia.isEmpty ());
	
	
	}



}
