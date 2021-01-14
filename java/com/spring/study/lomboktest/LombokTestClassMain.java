package com.spring.study.lomboktest;

public class LombokTestClassMain {

	public static void main(String[] args) {
		LombokTestClass ltc01 = new LombokTestClass();
		LombokTestClass ltc02 = new LombokTestClass("ha", "jk", 18, 'M', true, 172.5);
		
		System.out.println(ltc01.toString());
		System.out.println(ltc02.toString());
	}
}
