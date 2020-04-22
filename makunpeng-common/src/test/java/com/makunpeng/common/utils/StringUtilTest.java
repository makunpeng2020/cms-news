package com.makunpeng.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
	public void test() {
		char c = StringUtil.randomCharacter();
		System.out.println("随机字符为"+c);
	}
	@Test
	public void testString() {
		String c = StringUtil.randomString(5);
		System.out.println("随机字符串为"+c);
	}

	@Test
	public void testStringChineseName() {
		String c = StringUtil.randomChineseString(3);
		System.out.println("随机姓名是"+c);
	}
}
