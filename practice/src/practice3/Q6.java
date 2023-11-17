package practice3;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {15,7,2,9,10,12,17,11,20,5};
		int tempValue = 0;
		int tempJ = 0;
		for(int i=0; i<arr.length; i++) { //배열을 처음부터 끝까지 실행하기 위한 반복문
			int min = Integer.MAX_VALUE; // 정수형 int의 가장 큰 숫자
			for(int j=i; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j]; // 7 5
					tempJ = j;    // 1 9
				}
			}
			tempValue = arr[i]; //원래 값을 저장하는 변수 7
			arr[i] = arr[tempJ]; //5
			arr[tempJ] = tempValue; //7
		}
		System.out.println(Arrays.toString(arr));
		
		int [] arr2 = {15,7,2,9,10,12,17,11,20,5};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}

}






