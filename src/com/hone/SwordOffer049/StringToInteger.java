package com.hone.SwordOffer049;

/**
 * 将一个字符串转化为整数
 * 思路：首先处理第一个字符，判断是否是+|-,然后在判断字符串是否合法。
 * 		如果字符串合法，则直接按照数据的处理方式进行处理。
 * 		如果不合法，则直接返回0.
 * @author Xia
 *
 */
public class StringToInteger {
	public int StrToInt(String str) {
        int flag = 1;		//如果是1则表示前面有一个+，也就是正数
        //如果是空，则直接返回0
        if (str == null || str.length() == 0) {
			return 0;
		}
        int sum = 0;
        //开始遍历字符串
        for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<= 9)) {
				if (str.charAt(i)=='-') {
					flag = -1;
					continue;
				}
				if (str.charAt(i)=='+') {
					continue;
				}else {
					return 0;
				}
			}else if (str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<= 9) {
				sum = sum*10+(str.charAt(i)-'0');
			}
			
		}
		return sum*flag;
        
    }
}
