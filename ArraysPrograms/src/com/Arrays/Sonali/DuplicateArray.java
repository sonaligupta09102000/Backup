package com.Arrays.Sonali;

public class DuplicateArray {

	public static void main(String[] args) {
		// int count;
		int arr[] = { 1, 1, 4, 5, 6, 4, 3, 4, 4, 4 };
		System.out.println("The Duplicate Arrays in the above list are as follow: ");
		for (int i = 0; i < arr.length - 1; i++) {
			// count=0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// count++;
					System.out.println(arr[j]);
					// arr[j]='0';
				}

			}
		}

	}

}
