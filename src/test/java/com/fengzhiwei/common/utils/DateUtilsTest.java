package com.fengzhiwei.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testRandom() {
		Calendar instance = Calendar.getInstance();
		instance.set(2010, 0, 1);
		Date date = DateUtils.random(instance.getTime(), new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String string = format.format(date);
		System.out.println(string);
	}

}
