package com.javastudy.basic;

import java.util.Scanner;

public class If_else_if_else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* ﻿if-else-if-else 조건문 : if-else를 여러번 반복하여 실행하게 해주는 조건문 */

		/*
		 * if (조건식1){ 
		 * 조건식1이 true이면 실행되는 영역 
		 * }else if (조건식2){ 
		 * 조건식2가 true이면 실행되는 영역 
		 * }else if (조건식3){ 
		 * 조건식3이 true이면 실행되는 영역 
		 * }else{ 
		 * 위의 조건이 모두 false이면 실행되는 영역 
		 * }
		 */
		
		
		//한학기 성적표 만들기
		/* (1) 점수가 90이상이면 등급"A", 80이상 "B", 70이상 "C", 60이상 "D", 60미만 "F" 
		 * (2) 평점은 등급이 A이면: 4, B: 3, C: 2, D: 1, F: 0
		 * (3) 취득학점 : F가 아닌 학점 합계
		 * (4) 평점계 : 합계{과목별 평점*취득학점}
		 * (5) 평점 평균 : 합계{과목별 평점*취득학점} / 총 취득학점
		 * (6) 점수: score, 학점: point, 등급: grade, 평점: gradePoint 
		 * (7) 취득학점: totalPoint, 평점계: sum 평점평균: gradeAverage
		 * 각 과목의 점수와 과목시수를 입력 받아 각 과목의 '등급, 평점' 출력 
		 * 전체 '취득학점, 평점계, 평점평균' 출력 
		 */
		
		
		int totalPoint = 0;
		int sum = 0;
		float gradeAverageF;
		
		System.out.print("수강 과목 수:");
		int n = sc. nextInt();
		
		int i = 0;
		while(i < n) {
			i++;
			
			System.out.println("============");
			System.out.println("과목"+i);
			System.out.print("점수: ");
			int score = sc.nextInt();
			System.out.print("학점: ");
			int point = sc.nextInt();
			
			char grade ; 
			int gradePoint;
			
			if(score>=90){
				grade = 'A'; gradePoint = 4;
			}else if(score>=80){
				grade = 'B'; gradePoint = 3;
			}else if(score>=70){
				grade = 'C'; gradePoint = 2;
			}else if(score>=60){
				grade = 'D'; gradePoint = 1;
			}else{
				grade = 'F'; gradePoint = 0;
			}
	
			System.out.println("등급: " + grade);
			System.out.println("평점: " + gradePoint);
			
			totalPoint += point;
			sum += gradePoint*point;
		}

		if(totalPoint==0) {
			gradeAverageF = 0;
		}else {
			gradeAverageF = (float)sum/totalPoint;
		}
		
		System.out.println("====================");
		System.out.println(  "취득학점	: " + totalPoint);
		System.out.println(  "평점계	: " + sum);
		System.out.println(  "평점평균	: " + gradeAverageF);
			
		
		sc.close();
	}
}
