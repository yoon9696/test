package test05;

import java.util.Scanner;

public class ScanTest211 {

	public static void main(String[] args) {
		/* 학년 : 1-3학년까지만 존재 
		 * 반 :  1-10반 까지 존재
		 * 이름 : 
		 */
		System.out.print("학년 : ");
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		int gradeNum = Integer.parseInt(grade);
		if(gradeNum<1 || gradeNum>3) {
			System.out.println("학년이 잘못되었습니다.");
		
		System.out.print("반 : ");
		String clazz = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.println(grade + "학년" + clazz + "반 " + name + "님 반갑습니다.");
		
	}
	}
}


