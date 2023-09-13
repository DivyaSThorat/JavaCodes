package com.java;

import java.util.ArrayList;
import java.util.Iterator;

class Collection{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Meera");//Adding object in arraylist  
list.add("Vaishnavi");  
list.add("Bhakti");  
list.add("Shreya");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  