package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==0 && i%3==0) {
				continue; //6이 나오면 끝내라 6은 안나옴 프린트가 밖에 있어서 
			}
			
			System.out.println(i);
		}//for문의 끝
		

	}

}
