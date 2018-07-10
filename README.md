﻿# LeetCode刷题笔记
## 每道题目需要注意的地方
1. **两数之和**
	1. 可以用暴力方法
	2. 推荐使用HashMap(key,value)处理
2. **两数相加**
	1. 链表的相加 (✖)
3. 最长子串长度(✖)    
       思路：因为求解字符串中不包含重复字符的最长子串的长度。因为可以利用到java中天然不包含重复元素的结构Set。  
			1. 首先肯定得做原字符串是否是空字符串的判断  
			2. 可以定义两个变量pre(表示子串的前端)、i(表示字符串的当前位置)、maxLength(当前子串最长的长度)  
			3. 开始循环整个字符串，如果遇到了相同的字符，则计算当前子串长度，并且与maxLength做比较,并且pre的位置转移到(i+1)的位置，
				当然，这中间肯定需要再加一层while循环，用于转移pre。   
			4. 最后比较前面循环中的maxLength和最后的(i-pre)之间的大小。

