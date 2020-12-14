package test05;

import java.util.Scanner;

public class ScnaTest3 {
//손흥민과 비슷한 값을 쳤을때 손흥민을 검색하신건가요? 가 뜨게 끔 하기.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가장 좋아하는 축구 선수는 : ");
		String player = scan.nextLine();

		String[] names = { "송흥민", "손흔민", "송흥밍", "손날두" };
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(player)) {
				System.out.println("손흥민을 검색하신건가요?");
			}
		}
		System.out.println(names[0].equals(player)); // names str배열 names[0]
														// 데이터 배열 str

	}

}
