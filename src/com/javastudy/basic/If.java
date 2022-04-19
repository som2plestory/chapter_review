package com.javastudy.basic;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		/* ﻿if 조건문 : 참/거짓을 판별하면 참일 경우 실행, 거짓일 경우 미실행 */

		/*
		 if (조건식) { 
		 조건식이 true이면 실행되는 영역 
		 }
		*/ 
		
		
		/* 운전면허 2종 보통 필기 합격(60 이상) 출력 */
		System.out.print("운전면허 2종 보통 필기 점수: ");
		int driveWrittenT2 = sc.nextInt();
		if (driveWrittenT2>=60) {
			System.out.println("합격입니다.");
		}
		
		sc.close();
	}

}
