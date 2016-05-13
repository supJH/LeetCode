package leet045.jump;

public class Leet45Best {

	public static void main(String... args) {

		Leet45Best l = new Leet45Best();
		int[] nums = new int[] { 2,3,1,1,4,5,1,2,1,1,2,4};
		int step = l.jump(nums);
		System.out.println(step);

	}

	public int jump(int[] nums) {
		// int[] miniStep =new int[]{};
		int step = 1;
		int length = nums.length;
		if (length <= 1)
			return 0;

		int lc = nums[0];// 当前jump能到达的最远距离
		int ln = nums[0];// 下一jump能到达的最远距离

		for (int i = 1; i < length - 1; i++) {

			if (i > lc) {
				lc = ln;
				step++;
			}
			if (i + nums[i] > ln) {
				ln = i + nums[i];
			}

			if (lc >= length - 1)
				return step;

		}

		return step;
	}
}
