package ödev7;

import java.util.Scanner;
import java.util.Stack;

import javax.xml.transform.Source;

public class MehmetEmreÖk_23010310055_StackPalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String girilenString = scanner.nextLine();


		
		Stack<Character> stack = new Stack<Character>();
		 // stack e kelimenin harflerini ekledik
		for (int i = 0; i < girilenString.length(); i++) {
			stack.push(girilenString.charAt(i));
		}
		
		System.out.println(stack);
		String reverseString = "";
		// içi boş reverseString e stack teki char ları sondan başlayarak ekledik
		while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		
		// kontrol
		if (girilenString.equals(reverseString)) {
			System.out.println("Girilen kelime palindromdur!"); ;
		}else {
			System.out.println("Girilen kelime palindrom değildir!");
		}
		 
		System.out.println("ters çevirme işlemi bitti! -> " + reverseString);
	
		
	}

}
