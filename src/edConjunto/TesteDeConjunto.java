package edConjunto;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

//import java.util.LinkedList;

public class TesteDeConjunto {

	public static void main(String[] args) {
		
//		Conjunto conjunto = new Conjunto();
//		conjunto.adiciona("Pedrin");
//		System.out.println(conjunto);
//		conjunto.adiciona("mlk");
//		System.out.println(conjunto);
//		conjunto.adiciona("muleke");
//		System.out.println(conjunto);
//		conjunto.remove("Pedrin");
//		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		
		
		conjuntoDoJava.add("oi");
		conjuntoDoJava.add("oi");
		conjuntoDoJava.add("o");
		conjuntoDoJava.add("pedro");
		System.out.println(conjuntoDoJava);		
	}

}
