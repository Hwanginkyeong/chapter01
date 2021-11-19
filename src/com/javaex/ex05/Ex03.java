package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		int[] intArray = new intArray[3] 
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 13;
		intArray[3] = 55;
		*/
		
		
		//칸의 갯수 적기 대신 대괄호에 값을 넣어주는 간단식도 있음
		int[] intArray = new int[] {3,7,13,55};
		
		//칸의 갯수 적기 대신 대괄호에 값을 넣어주는  간단식도 있음
		//int[] intArray = {3,7,13,55};
		
		
		//System.out.println(intArray[1]);
		
		for(int i=0; i<intArray.length; i++) { //length는 일일이 바꾸지 않고 룸의 개수까지 알아서 인지해줌
			System.out.println(intArray[i]);
		}
		
		
		/*
		System.out.println("==================");
		
		char[] charArray = new char[3];
		
		charArray[0] = 'A';
		charArray[1] = '한';
		charArray[2] = 'z';
		
		for(int i=0; i<3; i++) {
			System.out.println(charArray[i]);
		}*/
		
		
		
		

	}

}
