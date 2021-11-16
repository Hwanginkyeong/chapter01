package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int wage = sc.nextInt();
		
		System.out.println("임금은 " + wage + " 입니다.");
		
		
		sc.close();
	}
}
