package dynamic;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
        //如果数组为空，或者数组长度为0，则直接返回0
        if(nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int[] a = new int[len];
        Arrays.fill(a,1);
        //利用两层for循环来处理
        for(int i = 1; i < len; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    a[i] = Math.max(a[i],a[j]+1);
                }
            }
        }
        int max = 1;
        for(int i = 0; i < len; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
