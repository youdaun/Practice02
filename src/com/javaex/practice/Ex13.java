package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		double num = sc.nextDouble();
		
		if (num <= 0) {
			double f1 = (num * num * num) - (9 * num) + 2;
			System.out.println("계산결과는 " + f1 + " 입니다.");
		}
		else {
			double f2 = 7 * num + 2;
			System.out.println("계산결과는 " + f2 + " 입니다.");
		}
		
		
		
		sc.close();
	}

}
