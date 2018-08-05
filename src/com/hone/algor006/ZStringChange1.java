package com.hone.algor006;

import java.util.ArrayList;
import java.util.List;

/**
 * 按照特定的格式翻转字符串 核心思路： 
 * 第一种：按照行来排序 
 * 第二种：按照行来访问，寻找每个元素所在的索引值
 * 
 * @author Xia
 *
 */
public class ZStringChange1 {
	
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		System.out.println(new ZStringChange1().convert(s, numRows));
	}
	
	
	public String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		// 定义一个集合用于存储每一行字符
		List<StringBuilder> rows = new ArrayList<>();
		for (int i = 0; i < Math.min(numRows, s.length()); i++) {
			rows.add(new StringBuilder());
		}

		int curRow = 0;
		Boolean goingDown = false;

		for (char c : s.toCharArray()) {
			rows.get(curRow).append(c);
			
			//如果移动到最上方或者最下方时，就会改变方向
			if (curRow == 0 || curRow == numRows - 1) {
				goingDown = !goingDown;
			}

			curRow += goingDown ? 1 : -1;

		}

		StringBuilder ret = new StringBuilder();
		for (StringBuilder row : rows)
			ret.append(row);
		return ret.toString();
	}
}
