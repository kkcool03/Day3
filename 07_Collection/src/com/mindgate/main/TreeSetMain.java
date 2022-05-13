package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		SortedSet<String> nameSortedSet = new TreeSet<String>();
		
		nameSortedSet.add("kkcool");
		nameSortedSet.add("kadam");
		nameSortedSet.add("ironman");
		nameSortedSet.add("thor");
		nameSortedSet.add("hawkeye");
		nameSortedSet.add("wanda");
		
		System.out.println(nameSortedSet);
		
	}

}
