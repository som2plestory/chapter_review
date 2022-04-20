package com.javastudy.basic;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* for 반복문 : 조건이 true 일 때, 거짓일때까지 계속해서 반복 실행 */

		/*
		 * for( 초기화; 조건식; 증감식) { 
		 * 조건식이 true이면 실행되는 영역
		 * }
		 */
		
		/* n부터 m까지의 합 구하기 */
		
		System.out.println("n부터 m까지의 합 구하기");
		System.out.print("n: ");
		int n = sc.nextInt();
		System.out.print("m: ");
		int m = sc. nextInt();
		int sum = 0;
		System.out.print(n+"부터 "+m+"까지의 정수의 합은 ");
		for (int i=n; i<=m; i++) {
			sum += i;
		}
		System.out.println(sum + " 입니다.");
		
		sc.close();
	}
}
