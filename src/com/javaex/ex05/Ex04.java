package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];  //new를 입력함으로써 메모리에 자리를 만들어줌.
		
		arrA[0] =3;  //0번 방 안에 값이 3 
		arrA[1] =6;
		arrA[2] =9;
		
		int[] arrB = arrA;  //arrA를 복사해옴
		
		arrB[1] = 10000;  //같은 방을 쓰고 있으니 값이 같이 바뀜
		
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}

	}

}
