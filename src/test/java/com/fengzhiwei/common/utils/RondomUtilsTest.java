package com.fengzhiwei.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RondomUtilsTest {

	@Test
	public void testRandom() {
		int i = RondomUtils.random(1, 3);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RondomUtils.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RondomUtils.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String randomString = RondomUtils.randomString(4);
		System.out.println(randomString);
	}

}
