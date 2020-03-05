package com.epam.CustomCollections;

import java.util.Arrays;

public class CustomList<T> 
{
	private static final int initial_capacity = 10 ;
	private int size = 0 ;
	private Object myCustumList[] ;
	public CustomList() {
		myCustumList = new Object[initial_capacity] ;
	}
	public void add(T element) 
	{
		
		if(size == myCustumList.length) 
		{
			myCustumList = Arrays.copyOf(myCustumList, myCustumList.length*2) ;
		}
		myCustumList[size++] = element ;
	}
	public void display() 
	{
		
		for(int i = 0 ; i < size ; i++)
		{
			System.out.println(myCustumList[i]+" ") ;
		}
	}
	
	public T fetch(int x) 
	{
		
		if(x < 0 || x >= size) {
			System.out.println("Invalid index entered.") ;
		}
		return (T)myCustumList[x];
	}
	
	public T remove(int y)
	{
		
		if(y < 0 || y >= size) {
			System.out.println("Invalid index entered") ;
		}
		Object removedElement = myCustumList[y] ;
		for(int i = y ; i < size-1 ; i++)
		{
			myCustumList[i] = myCustumList[i+1] ;
		}
		size-- ;
		return (T)removedElement;
	}
}
	