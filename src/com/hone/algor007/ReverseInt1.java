package com.hone.algor007;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转
 * 逻辑很简单
 * 效果：时间复杂度O(n),空间O(n)
 * @author Xia
 *
 */
public class ReverseInt1 {

	public static void main(String[] args) {
		int a = -51;
		int result = new ReverseInt1().reverse(a);
		System.out.println(result);
	}

	public int reverse(int x) {
		
		int flag = 0;
		if (x == 0 ||x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
			return 0;
		}

		StringBuffer number = new StringBuffer("" + x);
		if (number.charAt(0) == '-') {
			number.deleteCharAt(0);
			flag = 1;
		}
		int i = number.length() - 1;
		while (i >= 0) {
			if (number.charAt(i) == '0') {
				number.deleteCharAt(i);
			} else {
				break;
			}
			i--;
		}

		StringBuffer result = number.reverse();
		
		int res;
		if (flag == 1) {
			res = Integer.parseInt("-"+result.toString());
		}else {
			res = Integer.parseInt(result.toString());
		}

		return res;
	}

}
