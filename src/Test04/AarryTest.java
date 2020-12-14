package Test04; //폴더
//예약어는 변수명 x
public class AarryTest {// 값으로 방번호를 구함

	public static void main(String[] args) {
		int[] ints = new int [5];
		for(int i = 100; i<=500; i+=100) {
		int idx = i/100 -1;
		ints [idx] = i;
		}
		for(int i =0; i<ints.length;i++) {
			System.out.println(i);
		}
	}

}
