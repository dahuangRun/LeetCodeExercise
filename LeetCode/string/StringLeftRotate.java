package string;


/**
 * 题目：将字符串循环左移k位
 * 比如：对于字符串 s = "abcXYZdef"  循环左移三位(k=3)变成s' = "XYZdefabc"。
 * 令  M = abc   N = XYZdef ，最后结果变成：NM <—— (M.T N.T).T
 * 因此我们可以由上面的原理得到结论：只需要对上面的字符串做三次不同的翻转即可。
 * 注意：左移k位和左移(len+k)是一个意思。
 * 
 * 当然：我们可以借助java中StringBuilder.
 * @author Xia
 *
 */
public class StringLeftRotate {
	public String LeftRotateString(String str,int n) {
		int len = str.length();
		if (len == 0) {
			return "";
		}
		//内部编写字符串翻转的函数，首先将其转化为字符数组(当然这里可以利用StringBuffer的revers())
		
		char[] strc = str.toCharArray();
		n %= len;
		reverse(strc,0,n-1);
		reverse(strc,n,len-1);
		reverse(strc, 0, len-1);
		return new String(strc);
	}

	private void reverse(char[] strc, int i, int j) {
		char temp;
		while (i < j) {
			temp = strc[j];
			strc[j] = strc[i];
			strc[i] = temp;
			i++;
			j--;
		}
	}
	public String LeftRotateString2(String str,int n) {
        int len = str.length();
        if(n > len){
            return "";
        }
        StringBuilder sbx = new StringBuilder(str.substring(0,n));
        StringBuilder sby = new StringBuilder(str.substring(n));
        sbx = sbx.reverse();
        sby = sby.reverse();
        StringBuilder res = sbx.append(sby);
        return res.reverse().toString();
    }

}
