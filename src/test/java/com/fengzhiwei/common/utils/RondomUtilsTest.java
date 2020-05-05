package com.fengzhiwei.common.utils;

import org.junit.Test;

public class RondomUtilsTest {

	@Test
	public void testRandom() {
		int i = RandomUtils.random(1, 3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtils.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtils.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtils.randomString(4);
		System.out.println(randomString);
	}

}
