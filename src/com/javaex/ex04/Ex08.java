package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i = 0;  //비교할 정수 초기값
	
		while(true) {
			
			i=i+1; //i++;랑 같음
			if(i%6==0 && i%14==0) { //6의 배수이면서 14의 배수 입니까? yes-> 숫자찍고 끝(반복문탈출)
				System.out.println(i);
				break;
			}
			
			
		}

	}

}
