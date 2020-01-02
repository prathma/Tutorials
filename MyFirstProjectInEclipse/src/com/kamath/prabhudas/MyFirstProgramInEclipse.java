package com.kamath.prabhudas;

import java.util.Scanner;

public class MyFirstProgramInEclipse {

	public static void main(String[] args) {
		System.out.println("My First Program  in Eclipse to be updated in GITHub to be Uploaded");
		Scanner sc=new Scanner(System.in);
		while (true) {
			String s=sc.nextLine();
			System.out.println(s);
			if (s.equals("Exit")) {
				break;
			}
		}
		sc.close();
	}
}
