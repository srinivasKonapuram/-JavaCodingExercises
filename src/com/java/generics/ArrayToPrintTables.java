package com.java.generics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArrayToPrintTables {

	public static void main(String[] args) {
		int myarray[][] = new int[6][6];
		int k = 3, p = 1, c = 0;
		// adjusting the matrix
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				myarray[i][j] = p++;
			}
			c++;
			p = p - 5;
			if (c == 2) {
				p = p + 5;
				c = 0;
			}
		}
		c = 0;
		// multipliers code
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				myarray[i][j] = myarray[i][j] * k;
			}
			c++;
			if (c % 2 == 1)
				k = 6;
			else
				k = 3;
		}
		// printing the matrix
		System.out.println("\nRequired Matrix\n ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(myarray[i][j] + "\t");
			}
			System.out.println("");
	
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
	}
	
}
