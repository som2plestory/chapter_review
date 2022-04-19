package com.javastudy.basic;

public class Do_while {

	public static void main(String[] args) {

		/* ﻿do~ while 반복문 : 한 번 먼저 실행 후 조건이 참이면 반복 */

		/*
		 * do { 반복영역 }while(반복조건);
		 */

		int num = 0;
		do {
			System.out.println("I like Java" + num);
			num++;
		} while (num < 5);
		
	}
}
