package org.ex;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main (String[]args) {
			List <Integer> li = new ArrayList();
			li.add(10);
			li.add(20);
			li.add(30);
			li.add(40);
			li.add(50);
			li.add(70);
			li.add(100);
			li.add(150);
			li.add(190);
			System.out.println("===========list1============");
			System.out.println(li);
	        List <Integer> li1 = new ArrayList();
			li1.add(10);
			li1.add(200);
			li1.add(60);
			li1.add(40);
			li1.add(50);
			li1.add(190);
			li1.add(80);
			li1.add(100);
			System.out.println("===========list2============");
			System.out.println(li1);
			
			System.out.println("===========iteration list1============");
			  for( int i=0; i<li.size();i++) {
				Integer a = li.get(i);
				 System.out.println(a);
			}
			System.out.println("===========iteration list2============");
			 for( int i=0; i<li1.size();i++) {
				Integer a1 = li1.get(i);
				 System.out.println(a1);
			 }
			System.out.println("===========common values============");
			li.retainAll(li1);
			System.out.println(li);
			
			System.out.println("===========number of common values============");
			int size = li.size();
		    System.out.println(size);
				 

}
}