package com.fengzhiwei.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class StreamUtilsTest {

	@Test
	public void testCloseAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadTextFileInputStream() {
		String path = "C:\\Users\\小冯\\Desktop\\hello.txt";
		try {
			FileInputStream inputStream = new FileInputStream(path);
			String textFile = StreamUtils.readTextFile(inputStream);
			System.out.println(textFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testReadTextFileFile(){
		String path = "C:\\Users\\小冯\\Desktop\\hello.txt";
		String textFile = StreamUtils.readTextFile(new File(path));
		System.out.println(textFile);
	}

	@Test
	public void testReadTextFile2List() {
		String path = "C:\\Users\\小冯\\Desktop\\hello.txt";
		List<String> list = StreamUtils.readTextFile2List(new File(path));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
