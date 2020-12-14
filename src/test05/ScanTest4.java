package test05;

import java.util.Scanner;

public class ScanTest4 {
//계산기
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		String numStr1 = s.nextLine();
		System.out.print("두번째 숫자 : ");
		String numStr2 = s.nextLine();
		System.out.print("연산자 : ");
		String operator = s.nextLine();
		int num1 = Integer.parseInt(numStr1);//숫자로 바꿔주는거 
		int num2 = Integer.parseInt(numStr2);// "
		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		}else if(operator.equals("-")) {
			System.out.println(num1 - num2);
		}else if(operator.equals("*")) {
			System.out.println(num1 * num2);
		}else if(operator.equals("/"))	{
			System.out.println(num1 / num2);
		}else if(operator.equals("%")) {
			System.out.println(num1 % num2);
		}
	}
}