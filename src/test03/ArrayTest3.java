package test03;

public class ArrayTest3 {

	public static void main(String[] args) { // 방번호로 값을 구함
		int[] nums = new int[5];
		for(int i = 0; i<nums.length ; i++) {
		nums[i] = (i+1)*10;
		System.out.println(nums[i]);
		}

	}

}
