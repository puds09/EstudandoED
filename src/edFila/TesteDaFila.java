package edFila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

	public static void main(String[] args) {
		Fila fila = new Fila();

		fila.adiciona("mauricio");
		fila.adiciona("Pedro");
		
		System.out.println(fila);
		String x1 = fila.remove();
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> FilaDoJava = new LinkedList<String>();
		
	}

}
