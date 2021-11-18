package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
			
			for(int i=1; i<=20; i++) {
		
				if(i%2==0 || i%3==0) {
					continue;  //위 조건에 맞아도 아무일도 안해야함 따라서 컨티뉴
							   //컨티뉴써서 밑으로 못가게 함
								//T면 출력을 안하는 것 브레이크면 멈추는데 컨티뉴라 
								//다른 숫자들은 프린트됨
				
				}
				System.out.println(i); //어쨌든 프린트
			}
				

	}

}
