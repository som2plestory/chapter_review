package com.javastudy.basic;

import java.util.StringTokenizer; // ﻿java.util 패키지에 StringTokenizer 클래스 import

public class Stringtokenizer {
	public static void main(String[] args) {
		// 문자열 생성
		String string = "생각을 코딩하다 Thinking Code";
		System.out.println("문자열 : " + string);
		
		// 문자열을 구분 문자 " "로 분리한 StringTokenizer 객체 생성
		StringTokenizer stringtokenizer = new StringTokenizer(string, " ");
		
		// countTokens() : 분리한 토큰의 수
		System.out.println("분리한 토큰의 수 : " + stringtokenizer.countTokens());
		
		// hasMoreTokens() : 토큰이 존재하면 true 반환
		while(stringtokenizer.hasMoreTokens()) { // 토큰 수만큼 반복
			// nextToken() : 토큰 반환
			System.out.println(stringtokenizer.nextToken());
		}
	}
}