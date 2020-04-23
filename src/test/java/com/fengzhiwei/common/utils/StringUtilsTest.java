package com.fengzhiwei.common.utils;

import org.junit.Test;




public class StringUtilsTest {

	@Test
	public void testHasLength() {
		String str = " ";
		System.out.println(StringUtils.hasLength(str));
	}

	@Test
	public void testHasText() {
		String str = " ";
		System.out.println(StringUtils.hasText(str));
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtils.randomChineseString(100);
		System.out.println(string);
	}


	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtils.generateChineseName();
			System.out.println(name);
		}
	}

}
