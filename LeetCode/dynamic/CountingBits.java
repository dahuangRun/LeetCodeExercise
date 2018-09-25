package dynamic;

/**
 * 题目：比特位计数
 * 
 * @author Xia
 */
public class CountingBits {
	public int[] countBits(int num) {
		int[] a = new int[num + 1];
		for (int i = 1; i <= num; i++) {
			a[i] = a[i & i - 1] + 1;
		}
		return a;
	}
}
