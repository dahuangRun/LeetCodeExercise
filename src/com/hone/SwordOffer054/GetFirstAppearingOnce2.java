package com.hone.SwordOffer054;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 题目：字符串流中的第一个不重复字符
 * 思路：对于两两对应的值，也可以采用HashMap来处理。
 * @author Xia
 *
 */
public class GetFirstAppearingOnce2 {
	HashMap<Character, Integer> map = new HashMap<Character,Integer>();
	ArrayList<Character> list = new ArrayList<Character>();
	
	//Insert one char from stringstream
    public void Insert(char ch){
        if (map.containsKey(ch)) {
			map.put(ch, map.get(ch) + 1);
		}else {
			map.put(ch, 1);
		}
        //后面做遍历使用
        list.add(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	char ch = '#';
    	for (char c : list) {
			if (map.get(c) == 1) {
				ch = c;
				break;
			}
		}
		return ch;
    
    }
}
