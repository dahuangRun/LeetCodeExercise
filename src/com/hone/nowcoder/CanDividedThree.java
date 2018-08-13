package com.hone.nowcoder;

import java.util.Scanner;

public class CanDividedThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		if (start > end) {
			System.out.println(0);
			return ;
		}
		int count = 0;
		for (long i = start; i <= end; i++) {
			long r = (i * (5*i-4))%3;
			if (r == 0) 
				count++;
		}
		
		System.out.println(count);
	}
}
