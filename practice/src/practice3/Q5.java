package practice3;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int randomNum = (int)(Math.random()*100)+1; //1~100까지의 랜덤값 저장
			boolean flag = true; //값이 중복되거나 3의 배수가 아닌 경우 한번더 반복시키는 변수
			if(randomNum%10 == 0) { //3의 배수인지 확인하는 if문
				for(int j=0; j<arr.length; j++) { // 배열안의 값이 중복되는 확인하는 반복문
					if(arr[j] == randomNum) { //배열의 값과 랜덤값 비교하는 if문
						flag = false; // 중복되는 숫자가 있으면 false 설정
					}
				}
			}else { // 10으로 나누어 떨어지지 않는 경우 false 설정
				flag = false;
			}
			if(flag == false) { //중복이거나 3의 배수가아니면 다음 반복실행하지 않도록 해주는 if문
				i--;//같은 반복을 계속하도록 i에서 1빼줌
			}else {
				arr[i] = randomNum; //배열에 3의 배수 저장
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
