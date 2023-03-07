package com.AllBasicPrograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args)

	{
		int n, count;
		System.out.println("Enter Any Number: ");

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int i, j;

		for (i = 2; i <= n; i++) {
			count = 0;

			for (j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}

			}

			if (count == 2) {
				System.out.println(i + "  " + "It is a Prime No");

			}

		}
	}
}
