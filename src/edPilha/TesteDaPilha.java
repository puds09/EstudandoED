package edPilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
//		Pilha pilha = new Pilha();
//		
//		pilha.push("mauricio");
//		System.out.println(pilha);
//		pilha.push("Guilherme");
//		System.out.println(pilha);
//		pilha.pop();
//		System.out.println(pilha);
		
		
		Stack<String> stack = new Stack<String>();
		stack.push("Maumau");
		stack.push("Pedrin");
		System.out.println(stack);
		stack.pop();
//		stack.remove(0);
		System.out.println(stack.peek());
		
	}

}
