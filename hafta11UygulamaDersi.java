package hafta11Uygulama;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class hafta11UygulamaDersi {

	public static void main(String[] args) {

		// STACK
		// ------------
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
		System.out.println("stack ( pop ): " + stack.pop());
		System.out.println("stack (  pop tan sonra ): " + stack.peek());
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
//			String string = stack.pop();
//			System.out.println(string);
			
		} // ------------
		// isPalindrom metoduyla ilgili ( stack )
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Bir kelime giriniz: ");
//		String girilenString = scanner.nextLine();
//		System.out.println("Girilen kelimenin palindromluğu: " + isPalindrom(girilenString)) ;
//		
		// --------------------------------
		System.out.println("---------------------");
		
		// QUEUE
		
		String [] sehirleStrings = {"Adana", "Bartın", "Kayseri", "Malatya", "Zonguldak"};
		Queue<String> queue = new  LinkedList<String>();
		System.out.println("Queue; " + queue.isEmpty());
		queue.add("Ankara");
		System.out.println("Queue; " + queue);
		
		for (String string : sehirleStrings) {
			queue.add(string);
		}
		System.out.println("Queue; " + queue);
		System.out.println("Queue: " + queue);
		System.out.println("Queue: " + queue.size());
		System.out.println("Queue ( peek ): " + queue.peek());
		System.out.println("Queue ( pop ): " + queue.remove());
		System.out.println("Queue (  pop tan sonra ): " + queue.peek());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		
		 // Queue ile palindrom örneği
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Bir kelime giriniz: ");
//		String girilenString2 = scanner.nextLine();
//		System.out.println("Girilen kelimenin palindromluğu ( Queue ): " + isPalindromQ(girilenString2)) ;
//		
		// ---------------------------------------
		
		System.out.println("------------------------");
		
		// parantezler doğru mu
		System.out.println(duzenliMi("(){{[[]]}}"));
	}

	// Stack li bir örnek
	public static boolean isPalindrom(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		 // stack e kelimenin harflerini ekledik
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		String reverseString = "";
		// içi boş reverseString e stack teki char ları sondan başlayarak ekledik
		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		
		// kontrol
		if (str.equals(reverseString)) {
			return true;
		}
		return false;
	}
	
	public static boolean isPalindromQ(String str) {
		
		Queue<Character> queue = new LinkedList<Character>();
		 // queue yi sondan başlattık for da
		for (int i = str.length() - 1; i >= 0 ; i--) {
			queue.add(str.charAt(i));
		}
		String reverseString = "";
		while(!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (str.equals(reverseString)) {
			return true;
		}
		return false;
	}
	
	public static boolean duzenliMi(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char check ;
			switch (c) {
			case ')' :  
				check = stack.pop();
				if (check == '{' || check == '[') {
					return false;
				}
				break;
			case '}' :
				check = stack.pop();
				if (check == '(' || check == '[') {
					return false;
				}
				break;
			case ']' : 
				check = stack.pop();
				if (check == '(' || check == '{') {
					return false;
				}
				break;
			default:
			}
		}
		return stack.isEmpty();
	}
	
}
