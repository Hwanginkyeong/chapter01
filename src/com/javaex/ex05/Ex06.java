package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {25,35,45};
		
		if(leftArray.length == rightArray.length) {//배열의 크기가 같니?
			//각 방의 값이 같은가 검사
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {
					System.out.println(i + "번째가 다릅니다");
				}
			}
			
		}else { //배열의 크기가 다른 경우
			System.out.println("배열의 크기가 다릅니다");
		}
	
		

	}

}
