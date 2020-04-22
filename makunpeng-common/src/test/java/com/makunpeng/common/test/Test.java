package com.makunpeng.common.test;

import java.util.Date;

import com.makunpeng.common.bean.Person;
import com.makunpeng.common.utils.RandomUtil;
import com.makunpeng.common.utils.StringUtil;

public class Test {

	public static void main(String[] args) {
		int count=0;
		for (int i = 0; i <10000; i++) {
			Person p=new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1,120));
			p.setAbout(StringUtil.randomChineseString(99));
			int random = RandomUtil.random(1,1000000000);
			long c=random;
			p.setCreated(new Date(c));
			count++;
			System.out.println(count+""+p);
		}
	}

}
