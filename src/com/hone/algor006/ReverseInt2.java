package com.hone.algor006;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转
 * 这个是参考官方提供的方法，当然这个方法的在时间复杂度上面是有很大提升的
 * 效果：时间复杂度： O(log(x))   空间复杂度：O(1)O(1)
 * @author Xia
 *
 */
public class ReverseInt2 {

	public static void main(String[] args) {
		int a = -51;
		int result = new ReverseInt2().reverse(a);
		System.out.println(result);
	}

	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;

	}

}
