package practice3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<100; i++) {
			boolean a = setFlag(i/10); // 십의 자리 숫자 구하기
			boolean b = setFlag(i%10); // 일의 자리 숫자 구하기
			if(a && b) { //10의자리 1의자리 모두 3,6,9 의 경우
				System.out.println("짝짝");
			}else if(a || b) {//10의자리나 1의자리 중 하나가 3,6,9의 경우
				System.out.println("짝");
			}else {// 3,6,9가 없을 경우
				System.out.println(i);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요.>>");
		int num = sc.nextInt();
		for(Integer i=1; i<=num; i++) {
			System.out.print(i+",");
			String[] strArr = i.toString().split("");
			for(String str : strArr) {
				int number = Integer.parseInt(str);
				if(setFlag(number)) {
					System.out.print("짝");
				}
			}
			System.out.println();
		}
		
		
		
	}
	/*
	 * 매개변수 num 의 숫자가 3,6,9 중에 하나인지 확인하는 메서드
	 */
	public static boolean setFlag(int num) {
		boolean flag = false;
		if(num == 3 || num == 6 || num ==9 ) {
			flag = true;
		}
		return flag;
	}

}









