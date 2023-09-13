package com.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Meera");  
		al.add("Vaishnavi");  
		al.add("Bhakti");  
		al.add("Shreya");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	
}
