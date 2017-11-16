package com.rdayala.sortingsearching.selectionsort;

import java.util.Arrays;

import com.rdayala.utils.ArrayUtil;

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		
		SelectionSorter.sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
