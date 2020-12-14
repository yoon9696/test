package Test04;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 3;

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}// 1byte = 8bit 
//1bit가 표현할수 있는 수는 1과 0뿐이다. 2진수 
//

