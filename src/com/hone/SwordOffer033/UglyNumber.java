package com.hone.SwordOffer033;

import java.util.ArrayList;

/**
 * 题目: 把只包含质因子2、3和5的数称作丑数（Ugly Number）。 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。 求按从小到大的顺序的第N个丑数。 
 * 思路：下一个丑数是由上一个丑数x乘以2、3、5得到的。有其中最小的数得到的。
 * 		那么我们需要做得是每次将排列中的三个数中的其中一个给提取处理。
 * 		比如第一个  x = [1] ,则下次在(2,3,5)中挑选,下一个选择了2，则x=[1,2]
 * 		下一次在(3,5,4,6,10)中挑选最小的即可。
 * 		依次类推。
 * 
 * @author Xia
 *
 */
public class UglyNumber {
	public int GetUglyNumber_Solution(int index) {
		if (index <= 0) {
			return 0;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		//用三个索引控制每次的取值
		int i2 = 0, i3 = 0, i5 = 0;
		while (list.size() < index)// 循环的条件
		{
			int m2 = list.get(i2) * 2;
			int m3 = list.get(i3) * 3;
			int m5 = list.get(i5) * 5;
			//挑选其中最小的数
			int min = Math.min(m2, Math.min(m3, m5));
			list.add(min);
			if (min == m2)
				i2++;
			if (min == m3)
				i3++;
			if (min == m5)
				i5++;
		}
		return list.get(list.size() - 1);
	}
}
