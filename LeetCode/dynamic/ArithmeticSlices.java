package dynamic;

/**
 * 求解一个数组中等差数列的个数
 * @author Xia
 *
 */
public class ArithmeticSlices {
	public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        int len = A.length;
        int[] a = new int[len];
        for(int i = 2; i < len; i++){
            if(A[i] - A[i-1] == A[i-1]-A[i-2]){
                a[i] = a[i-1] + 1;
            }
        }
        int sum = 0;
        for(int t: a){
            sum += t;
        }
        return sum;
    }
}
