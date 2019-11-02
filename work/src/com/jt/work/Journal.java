package com.jt.work;

public class Journal implements Reading {
	int price,pages;
	String publishing_time;

	public Journal(int pages, int price, String publishing_time) {
		this.pages = pages;
   	    this.price = price;
   	    this.publishing_time =publishing_time;
	}
	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is a Journal, which has " + pages + " pages,"+"costs"+price+"yuan,and pubish once every"+publishing_time+".");
	}

}
