package dynamic;

/**
 * 可以利用动态规划的思路来解答。
 * @author Xia
 *
 */
public class Stock {
	public int maxProfit(int[] prices) {
	       int len = prices.length;
	       if(len == 0){
	           return 0;
	       }
	        int[][] a = new int[len][2];
	        a[0][0] = 0;
	        a[0][1] = prices[0];
	        for(int i = 1 ; i < len ; i++){
	            a[i][0] = Math.max(a[i-1][0],prices[i] - a[i-1][1]);
	            a[i][1] = Math.min(prices[i],a[i-1][1]);
	        }
	        return a[len-1][0];
	    }
}
