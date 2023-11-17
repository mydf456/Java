package practice3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {50000,10000,5000,1000,500,100,50,10,5,1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해주세요.>>");
		int money = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"원권 "+money/arr[i]+"매, ");
			money %= arr[i];
		}
	}

}












