package com.java.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Uniqnumbers {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" enter the number");
		    String str = sc.next();
		    int count = 0;
		    char ch2[] = new char[10];
		    for(int i=0;i<=9;i++)
		    {
		        ch2[i]='0';
		    }

		    int str1le = str.length();
		    char ch1[] = new char[str1le];
		    str.getChars(0, str1le, ch1, 0);
		    for (int i = 0; i < str1le; i++) {
		        for (int j = 0; j <= 9; j++) {
		            if (ch1[i] =='j') {
		                ch2[i] = 1;
		            }
		        }
		    }
		    for (int i = 0; i <= 9; i++) {
		        if (ch2[i] != '0')
		            count++;
		    }

		    System.out.println("count:" + count);
		}
	}


