package ed;
public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedro");
		Aluno a2 = new Aluno("Joao");
		Aluno a3 = new Aluno("Ricardo");
		
		Vetor lista = new Vetor();

		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista);
		
//		lista.remove(2);
//		System.out.println(lista);
//		System.out.println(lista);
//		System.out.println("o tamanho do array é: " + lista.tamanho());
//		System.out.println(lista.contem(a1));
//		System.out.println(lista.contem(a3));
//		System.out.println(lista.pega(0));
//		System.out.println(lista.pega(101));
		
		for(int i = 0; i < 300; i++) {
			Aluno y = new Aluno("Joao " + i);
			lista.adiciona(y);
		}
		
		System.out.println(lista);
		
		
	}

}
