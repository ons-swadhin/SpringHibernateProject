package com.cg.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class MyTest2 {

	public static void main(String[] args) throws ParseException {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Asif", "1"));
		list.add(new Student("Swadhin", "2"));
		list.add(new Student("Aman", "2"));
		list.add(new Student("Aman", "2"));

		List<Student> finalList = new ArrayList<Student>();

		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.size(); j++) {

				if (i == j) {
					continue;
				}

				if (list.get(i).equals(list.get(j))) {
					finalList.add(list.get(i));
				}
			}
		}
		System.out.println("---------------------------");
		for (Student s1 : finalList) {
			System.out.println(s1);
		}

	}

}
