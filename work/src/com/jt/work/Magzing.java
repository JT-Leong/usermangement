/**
 * 
 */
package com.jt.work;

/**
 * @author JT
 *
 */
public class Magzing implements Reading {

	/* (non-Javadoc)
	 * @see book.Reading#Info()
	 */
	int price,pages;
	String publish_time;

	public Magzing(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}
	public void Magazing(int price,int pages,String publish_time) {
		this.pages = pages;
		this.price = price;
		this.publish_time = publish_time;
	}
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is a magazine, which has " + pages + " pages,"+" costs " + price + " yuan, and publish once every " + publish_time +"." );
	}

}
