package com.bilgeadam.boost.week02.lesson02;

import javax.swing.JOptionPane;

public class PrintFunction {

	public static void main(String[] args) {
		
		String ad = "Yiğit Aral";
		String soyad = "Yücepur";
		
    	System.out.println(ad+" "+soyad);
		System.out.println(ad);
		System.out.println(soyad);
		
	//	System.out.println(hello+" "+world);
		JOptionPane.showMessageDialog(null, "Oops. Something went wrong.", "System Error", JOptionPane.ERROR_MESSAGE);
	//	JOptionPane.showConfirmDialog(null,"Are you sure?");
	}

}
