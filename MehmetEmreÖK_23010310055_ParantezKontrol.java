package ödev7;

import java.util.Stack;

public class MehmetEmreÖK_23010310055_ParantezKontrol {

	public static void main(String[] args) {

		String str = "{[()]}";
		if (duzenliMi(str)) {
			System.out.println("İfade düzenli");
		}else {
			System.out.println("İfade düzenli değil");
		}
		
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
