package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] argd) {
		
		//자동형변환 
		System.out.println(2+3.4);
		
		double var01 = 2+3.4;  //2.0 + 3.4
		System.out.println(var01);
		
		//자동형변환 (long + float)
		long var02 = 12345L;
		float var03 = 1.1F;
		
		System.out.println(var02+var03); //계산하는 순간에 플롯형으로 바뀜 
		
		float result = var02+var03;
		System.out.println(result);
		
		///////////////////////////////
		
		//강제 형변환
		// double
		
		
		//강제 형변환 --> 확대 형변환
		byte v01 = 10;
		int v02 = (int)v01;
		
		System.out.println(v01);
		System.out.println(v02);
		
		//실수-->정수 :소수부분이 없어짐
		double v07 = 5.57;
		// v08 = (int)v07;
		
		
		
	}

}
