package practice3;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char[] ch = {'H','E','L','L','O'};
		System.out.println("소문자 알파벳 하나를 입력하시오>>");
		String str = sc.next();
		char end = str.charAt(0);
		for(int i=end; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}











