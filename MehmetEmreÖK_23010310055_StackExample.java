package ödev7;

import java.util.Stack;

public class MehmetEmreÖK_23010310055_StackExample {

	public static void main(String[] args) {

		String [] dataStrings = {"Adana", "Bartın", "Kayseri", "Malatya", "Zonguldak"};
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.isEmpty());
		stack.push("Ankara");
		System.out.println("stack: " + stack);
		for (String string : dataStrings) {
			stack.push(string);
		}
		System.out.println("stack: " + stack);
		System.out.println("stack: " + stack.size());
		System.out.println("stack ( peek ): " + stack.peek());
		System.out.println("stack: " + stack);
		System.out.println("stack ( pop ): " + stack.pop());
		System.out.println("stack (  pop tan sonra ): " + stack);
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		
		}								
	
	}
}
