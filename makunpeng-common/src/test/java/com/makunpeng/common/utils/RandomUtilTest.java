package com.makunpeng.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class RandomUtilTest {

	@Test
	public void test() {

			int random = RandomUtil.random(1,10);
			System.out.println(random);
		
	}

	 @Test public void test1() {
	  
	 int[] subRandom = RandomUtil.subRandom(1, 10, 6);
	 for (int i : subRandom) {
	  System.out.println(i); 
	  }
	  
	}
	 

}
