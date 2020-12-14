package test05;

import java.util.Random;

public class DateType3 {

	public static void main (String[] args) {
		//랜덤
		//1 - 45 까지의 랜덤
		Random ran = new Random();
		System.out.println(ran.nextInt(2));//0부터 2보다 작은숫자 랜덤 나옴
		System.out.println(ran.nextInt(45)+1);//1부터 45까지 숫자 랜덤 나옴
	}
}
