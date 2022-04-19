package com.javastudy.basic;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		/* ﻿switch-case 조건문 :  if-else 조건문에서 조건이 모두 등식(==)일 때 사용 */
		
		/*
		 * switch(변수){ 
		 * 	case 값1: 
		 * 	case 값2: 
		 * 	case 값3: 
		 * 		변수값이 값1, 값2, 값3일 때 실행내용; 
		 * 		break; 
		 * 	case 값4: 
		 * 		변수값이 값4일 때 실행내용; 
		 * 		break; 
		 * 	default :
		 * 		해당내용이 없을 때 실행내용 
		 * 		break; 
		 * }
		 */
		
		
		/* 입력한 월의 일수를 출력 */
		System.out.print("월: ");
		int month = sc.nextInt();
		switch(month){
			case 2:
				System.out.println("days=28");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("days=30");
				break;
			default:
				System.out.println("days=31");
				break;
		}
		sc.close();
	}
}
