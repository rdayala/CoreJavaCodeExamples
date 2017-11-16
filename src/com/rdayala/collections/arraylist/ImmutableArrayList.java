package com.rdayala.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// http://www.baeldung.com/java-immutable-list
public class ImmutableArrayList {

	public static void main(String[] args) {

		try {
			
			List<String> immutableList = givenUsingTheJdk_whenUnmodifiableListIsCreated_thenNotModifiable();
			System.out.println(immutableList.toString());
			System.out.println("Adding a new element to immutable list...");
			immutableList.add("four");
			
		} catch (UnsupportedOperationException ex) {
			System.out.println("Unsupported operation. The list is unmodifiable!!");
		}
	}

	public static List<String> givenUsingTheJdk_whenUnmodifiableListIsCreated_thenNotModifiable() {
		
		List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three"));
		
		// creating unmodifiable list
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		
		return unmodifiableList;
	}

}
