package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단:");
		int dan = sc.nextInt();
		
		int i = 1;
		
		while (i<10) {
			System.out.println( dan +" * " +i+ " = " + dan*i);
			i=i+1; //i++; 같은 표현이다. 이건 1씩밖에 못올리지만 앞에 식은 올리고 싶은 숫자를 대입할 수 있음
			
		}
		
		
		
		
	
	
		sc.close();
		
		
		
		
	}

}
