package com.hone.nowcoder;

public class TestDemo {

	public static void main(String[] args) {
		Integer i = 42;
		Long l = 42l;
		Double d = 42.0;
		System.out.println(i.equals(d));
		System.out.println(d.equals(l));
		System.out.println(i.equals(l));
		System.out.println(l.equals(42L));
	}
}