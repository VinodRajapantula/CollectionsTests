package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyTests {
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		 
		list1.add("Apple");
		     list1.add("Boy");
		     list1.add("Cat");
		     list1.add("Date");
		     list1.add("Flight");
		     list1.add("Girl");
		     list1.add("Cat");
		     list1.add("Boy");
		     
		     ArrayList<String> list2 = new ArrayList<String>();
		     
		     list2.add("One");
		     list2.add("Two");
		     list2.add("Three");
		     list2.add("Four");
		     list2.add("Five");
		     list2.add("Six");
		     list2.add("Seven");
		     list2.add("Two");
		     list2.add("Four");
		     
		         
		     shuffelList(list1);
		     System.out.println("===============");
		     joinArrays(list1,list2);  
		     System.out.println("===============");
		     linkedList.addAll(list2);
		     dsiplayListnReverseOrder(linkedList);
		     System.out.println("===============");
		     firstAndLastOccurenceOfElementInLinkedList(linkedList,"Two");
		     
		     
		}
		private static void firstAndLastOccurenceOfElementInLinkedList(LinkedList<String> linkedList, String element) {
			System.out.println("First Occurence of Element "+element+":"+ linkedList.indexOf(element));
			System.out.println("Last Occurence of Element "+element+":"+linkedList.lastIndexOf(element));		
		}
		
		private static void dsiplayListnReverseOrder(LinkedList<String> linkedList) {
		System.out.println("ReverseOrder:");
		Iterator<String> it = linkedList.descendingIterator();
		        while(it.hasNext()){
		            System.out.println(it.next());
		        }
		}

		private static void joinArrays(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(list1);
		list.addAll(list2);
		System.out.println("After join arrays:");
		for(String str: list ){
		            System.out.println(str);
		        }
		}

		public static void shuffelList(ArrayList<String> list1) {
		Collections.shuffle(list1);
		        System.out.println("After shuffling:");
		        for(String str: list1 ){
		            System.out.println(str);
		        }
		}
		
		
		

}
