package edListaLigada;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeço("Pedro");
		System.out.println(lista);
		lista.adicionaNoComeço("Guilherme");
		System.out.println(lista);
		lista.adicionaNoComeço("Joao");
		System.out.println(lista);
		
		lista.adiciona("Pedin mlk doido");
		System.out.println(lista);		
		
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);		
		
		lista.removeDoComeco();
		System.out.println(lista);		
		System.out.println(lista.tamanho());
	}

}
