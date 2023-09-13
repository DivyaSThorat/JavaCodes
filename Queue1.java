package com.java;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	 public static void main(String[] args) {
            //peek
	        Queue qi = new LinkedList<>();
	        qi.add(50);
	        qi.add(100);
	        qi.add(25);

	        Integer x = (Integer) qi.peek();
	        System.out.println(x);

	        x = (Integer) qi.peek();
	        System.out.println(x);

	        System.out.println(qi);
	        
	        
	        
	        //poll
	        Queue qi1 = new LinkedList<>();
	        qi1.add(50);
	        qi1.add(100);
	        qi1.add(25);

	        Integer x1 = (Integer) qi1.poll();
	        System.out.println(x1);

	        x1 = (Integer) qi1.poll();
	        System.out.println(x1);

	        System.out.println(qi1);
	        
	        
	        
           //poll
	        Queue qi2 = new LinkedList<>();
	        qi.add(50);
	        qi.add(100);

	        Integer x2 = (Integer) qi.poll();
	        System.out.println(x);

	        x2 = (Integer) qi2.poll();
	        System.out.println(x);

	        x2 = (Integer) qi2.poll();
	        System.out.println(x2);

	        System.out.println(qi2);
	        
	        
	        
	        
	        //remove
	        Queue qi3 = new LinkedList<>();
	        qi3.add(50);
	        qi3.add(100);

	        Integer x3 = (Integer) qi3.remove();
	        System.out.println(x3);

	        x3 = (Integer) qi3.remove();
	        System.out.println(x3);

	        x3 = (Integer) qi3.remove();
	        System.out.println(x3);

	        System.out.println(qi3);
	        
	        
	        
	        Queue qi4 = new LinkedList<>();
	        System.out.println(qi4.peek());
	        
	        
	        Queue qi5 = new LinkedList<>();
	        System.out.println(qi5.element());
	    }
}
