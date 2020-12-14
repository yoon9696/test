package test05;

import java.util.Scanner;

public class ScnaTest {

	public static void main(String[] args) {
		//scan : 뭔가를 스캔하는거 QR코드 스캐너 
		//입력 !!!
		// I/O 입력과 출력                            입력
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.print("니나이 :" + str);
		int age = Integer.parseInt(str);
		if(age>=1 && age<200) {
			System.out.println("정상입력");
			
		}else {
			System.out.println("아 쫌");
		}
		str = scan.nextLine();
		System.out.println("니가 쓴글 : " + str);
		
		
	}
}
