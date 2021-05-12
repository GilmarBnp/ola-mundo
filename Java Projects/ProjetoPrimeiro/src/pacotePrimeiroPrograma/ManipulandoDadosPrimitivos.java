//a variável só pode ter um valor de cada vez;
// o 20 foi perdido e se tornou 30, o programa é linear;
// Tipos Primitivos: boolean, char, int, double;
package pacotePrimeiroPrograma;

public class ManipulandoDadosPrimitivos {

	public static void main(String[] args) {
		
		int nota = 20;// int de inteiro;
		char tipoAluno = 'B';
		double horasCursadas =2.5;//double de númeroquebrado;
		boolean aprovado = true;
		
		System.out.println("Nota: " + nota);
		System.out.println("Tipo de aluno: " + tipoAluno);
		System.out.println("Horas Cursadas: " + horasCursadas);
		System.out.println("Aprovado: " + aprovado);
	
	nota = 30;
	tipoAluno = 'G';
	horasCursadas = 4.0;
	aprovado = false;
	
	System.out.println("Nota: " + nota);
	System.out.println("Tipo de aluno: " + tipoAluno);
	System.out.println("Horas Cursadas: " + horasCursadas);
	System.out.println("Aprovado: " + aprovado);
	
	
	}

	
}
