package com.koreait.hs;

public class Operator7 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int n3 = 6;
		
		System.out.println((n1 == n2) && (n1 == n3) && (n2 == n3));			//AND연산자
		System.out.println((n1 == n2) || (n1 == n3) || (n2 == n3));			//OR연산자
	}
}
