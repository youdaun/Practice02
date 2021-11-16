package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		
		System.out.print("금익: ");
		double pay = sc.nextDouble();
		
		if (0 <= pay && pay <= 1000) {
			System.out.println("소득세는 " + pay * 0.09 + " 입니다.");
		}
		else if (1000 < pay && pay <= 4000) {
			double tax1 = 1000 * 0.09 + 0.18 * (pay - 1000);
			System.out.println("소득세는 " + tax1 + " 입니다.");
		}
		else if (4000 < pay && pay <= 8000) {
			double tax2 = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (pay - 4000);
			System.out.println("소득세는 " + tax2 + " 입니다.");
		}
		else if (8000 < pay) {
			double tax3 = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36* (pay - 8000);
			System.out.println("소득세는 " + tax3 + " 입니다.");
		}
		else {
			System.out.println("절못 입력했습니다.");
		}
		sc.close();

	}

}
