package com.rdayala.collections.listpartition;

import java.util.ArrayList;
import java.util.List;

public class MyPartitionTest {
    
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        list.add("twelve");
        list.add("thirteen");
        
        List<List<String>> partition = MyPartition.partition(list, 1);
        System.out.println(partition.size()); // returns 13 sublists, each of size 1        
        System.out.println(partition.get(0).size()); // size : 1
        System.out.println(partition.get(2).size()); // size : 1
        
        // -------------------------------------------
        partition = MyPartition.partition(list, 7); // partition the list by size 7
        System.out.println("total partitions, if each sublist can hold 7 elements : " + partition.size()); // total 11 elements, so returns 2 sublists
        System.out.println(partition.get(0).size()); // first sublist of size : 7
        System.out.println(partition.get(1).size()); // second sublist of size : 4

        // now let assume you want to have x number of buckets
        // How many elements must placed in a list?
        // Take x as 3

        int buckets = 3;
        int divide = list.size() / buckets;
        if (list.size() % buckets !=0){
            divide ++;
        }        
        partition = MyPartition.partition(list, divide );
        System.out.println("Number of buckets : " + partition.size()); // 3 buckets needed for storing 11 elements each with 4 elements
        System.out.println("Max. number of element in each bucket " + divide);
        
        System.out.println(partition.get(0).toString()); // [one, two, three, four, five]
        System.out.println(partition.get(1).toString()); // [six, seven, eight, nine, ten]
        System.out.println(partition.get(2).toString()); // [eleven, twelve, thirteen]
	}
}