/**
 * 
 */
package com.jt.work;

/**
 * @author JT
 *
 */
public class Fiction implements Reading {
	private String applicable_object;
    int price,pages;
    /* Fiction�๹�췽�� */
    public Fiction(int pages,int price,String applicable_object) {
        this.pages = pages;
        this.price = price;
        this.applicable_object = applicable_object;
    }
    //ʵ�ֽӿڷ���Info()
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is a  fiction, which has " + pages + " pages,"+" costs " + price + " yuan, and applicable for " + applicable_object +"." );
	}

}
