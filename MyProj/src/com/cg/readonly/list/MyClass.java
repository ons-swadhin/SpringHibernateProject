package com.cg.readonly.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		
		System.out.println(list.size());
		
		list.clear();
		
		System.out.println(list.size());

	}

}
