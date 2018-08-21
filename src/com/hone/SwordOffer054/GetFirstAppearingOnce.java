package com.hone.SwordOffer054;

/**
 * 题目：字符串流中的第一个不重复字符
 * 思路：用一个256长度的数组存储每个字符出现次数，初始值默认为-1.
 * 		如果第一次出现，则复制为该字符的下标值。
 * 		如果多次出现，则将数组的值赋值为-2.
 * @author Xia
 *
 */
public class GetFirstAppearingOnce {
	// Insert one char from stringstream
	//设置一个256长度的数组
	private int[] curr = new int[256];
	private int index;
	
	//利用构造函数初始化数组 , 将数组中的所有值设置为-1
	public GetFirstAppearingOnce() {
		for (int i = 0; i < 256; i++) {
			curr[i] = -1;			
		}
		index = 0;
	}
	
	//插入字符
	public void Insert(char ch) {
		//如果从来没有出现过，则将该下标的数组值设置为该下标值。
		if (curr[ch] == -1) {
			curr[ch] = index;
		}
		//如果已经出现一次，则将其设置为-2
		else if (curr[ch] >= 0) {
			curr[ch] = -2;
		}
		index++;
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		 char ch = '\0';
		 //将minIndex设置为第一次出现的
	     int minIndex = Integer.MAX_VALUE;
	     //如果只出现依次，则为正数 ，零次为-1，大于依次为-2
	     for (int i = 0; i < 256; i++) {
			if (curr[i] >= 0&& curr[i] < minIndex) {
				ch = (char)i;
				minIndex = curr[i];
			}
		}
	     if(ch == '\0')
	        return '#';
		return ch;

	}
}
