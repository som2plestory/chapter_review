package com.javastudy.basic;

import java.util.Scanner;
	
	public class While {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			/* while 반복문 : 조건이 true 일 때, 거짓일때까지 계속해서 반복 실행 */
			
			/*
			 * int i = 0; 
			 * while (조건식) { 
			 * 조건식이 true이면 실행되는 영역 
			 * i++; 
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
			while(n<=m) {
				sum += n;
				n++;
			}
			System.out.println(sum + " 입니다.");
			
			sc.close();
			}
	}
