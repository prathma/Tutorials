package com.kamath.prabhudas;

import java.util.Scanner;

public class MyFirstProgramInEclipse {

	public static void main(String[] args) {
		System.out.println("My First Program  in Eclipse to be updated in GITHub to be Uploaded");
		Scanner sc=new Scanner(System.in);
		while (true) {
			String st=sc.nextLine();
			System.out.println(st);
			if (st.equals("Exit")) {
				break;
			}
		}
		sc.close();
	}
}
