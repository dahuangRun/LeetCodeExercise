package array;

/**
 * 求数组的逆序
 * @author Xia
 *
 */
public class ArrayReverse {
	public static  void reverse(int[] a){
		int len = a.length;
		int mid = len/2-1;
		int i = 0;
		int j = len-1;
		while (i <= mid) {
			int temp = a[i];
			a[i]  = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2]+ " ");
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		reverse(a);
	}
}