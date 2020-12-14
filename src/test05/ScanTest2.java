package test05;

import java.util.Scanner;

public class ScanTest2 {

	public static void main(String[] args) {
		/* 학년 : 
		 * 반 : 
		 * 이름 : 
		 */
		System.out.print("학년 : ");
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		System.out.print("반 : ");
		String clazz = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.println(grade + "학년" + clazz + "반 " + name + "님 반갑습니다.");
		
	}

}
