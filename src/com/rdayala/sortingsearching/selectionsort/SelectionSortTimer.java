package com.rdayala.sortingsearching.selectionsort;

import java.util.Scanner;

import com.rdayala.utils.ArrayUtil;
import com.rdayala.utils.StopWatch;

public class SelectionSortTimer {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		
		// Construct random array
		int[] a = ArrayUtil.randomIntArray(n, 100);
		
		// Use stopwatch to time selection sort
		
		StopWatch timer = new StopWatch();
		
		timer.start();
		SelectionSorter.sort(a);
		timer.stop();
		
		System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
		
	}

}
