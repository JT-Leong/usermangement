/**
 * 
 */
package com.jt.work;

/**
 * @author JT
 *
 */
public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Fiction f = new Fiction(199, 12, null);
			f.Info();
			Magzing m = new Magzing(3, 30, "6 months");
			m.Info();
			Journal j = new Journal(274, 36, "3 years");
			j.Info();
			Textbook t = new Textbook(187,19,"students");
			t.Info();
	}

}
