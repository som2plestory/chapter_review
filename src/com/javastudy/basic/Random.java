package com.javastudy.basic;

public class Random {
	
	public static void main(String[] args) {

		/* ﻿랜덤으로 정수값 생성 */
		
		/*
		 * int num = (int)(Math.random()*최대값)+최소값;
		 */
		
		
		//랜덤으로 주사위 값 뽑기
		int num = (int)(Math.random()*6+1);
		System.out.println(num);
		
	}
}
