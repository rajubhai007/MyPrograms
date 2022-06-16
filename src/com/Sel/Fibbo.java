package com.Sel;

public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f,s,t;
	f=0;
	s=1;
	for(int i=1;i<100;i++)
	{
		t=f+s;
		System.out.print(" "+t);
		f=s;
		s=t;
	
	if(t==987) 
	break;
	
}
}}