package com.makunpeng.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {

	public static int random(int min,int max) {

		Random random1=new Random();

		return random1.nextInt((max-min+1)+min);
	}
	public static int[] subRandom (int min, int max, int subs){
		//创建无须不可重复集合
		//泛型为Integer （泛型填int类型的包装类）
		Set<Integer> set=new HashSet<Integer>();
		while (set.size()!=subs) {
			set.add(random(min, max));
		}
		int arr[]= new int[subs];
		int i=0;
		for (Integer integer : set) {
			arr[i]=integer;
			i++;
		}
		return arr;
	}
		//TODO 实现代码
	

}
