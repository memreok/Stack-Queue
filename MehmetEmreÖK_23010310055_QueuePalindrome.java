package ödev7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MehmetEmreÖK_23010310055_QueuePalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String girilenString2 = scanner.nextLine();
		

		
		Queue<Character> queue = new LinkedList<Character>();
		 // queue yi sondan başlattık for da
		for (int i = girilenString2.length() - 1; i >= 0 ; i--) {
			queue.add(girilenString2.charAt(i));
		}
		String reverseString = "";
		while(!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if (girilenString2.equals(reverseString)) {
			System.out.println("Girilen kelime palindromdur!");;
		}
		System.out.println("Girilen kelime palindrom değildir!");
	
	}

}
