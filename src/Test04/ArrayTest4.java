package Test04;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() == 2) {
				System.out.println(strs[i]);
			}//위의 strs 각 방의 값의 길이가 2인것만 출력 
			//토끼
			//고래
			//배열은 메소드가 없다. () x 
		}

	}
}
