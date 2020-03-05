package com.epam.CustomCollections;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in) ;
        CustomList<Object> c = new CustomList<Object>() ;
        c.add(23) ;
        c.add(45) ;
        c.add(698) ;
        c.add(456) ;
        c.add(98) ;
        c.add("Micheal");
        c.add("Jim");
        c.add("Pam");
        c.add("Kevin");
        c.add("Ryan");
        System.out.println("Initial state of the list is:");
        c.display() ;
        System.out.println("Do you want to add element to the list?\n"
        					+ "If yes,press 1 to add.\n"
        					+ "Press 0 to continue");
        int a=sc.nextInt();
        if(a==1)
        {
        	System.out.println("Press 1 to insert String element.\n"
        						+"Press 0 to insert number");
        	int u=sc.nextInt();
        	if(u==1)
        	{
        		String element=sc.next();
        		c.add(element);
        		
        	}
        	else
        	{
        	int element=sc.nextInt();
        	c.add(element);
        	}
        	System.out.println("Custom list state after adding is:");
            c.display();
            
        }
        
        System.out.println("Enter index to fetch the element from.");
        int x = sc.nextInt() ;
        System.out.println("Element retrived from the index "+x+" is: "+c.fetch(x)) ;
        System.out.println("Enter index from which you want to remove element.");
        int y = sc.nextInt() ;
        System.out.println("Element removed from index "+y+" is:"+c.remove(y)) ;
        System.out.println("Final state of the custom list is:") ;
        c.display() ;
    }
}
