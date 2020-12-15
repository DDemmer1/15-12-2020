package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		int[] myArray = new int[9999];


//		myArray[0] = 42;
//		myArray[1] = 42;
//		...

		for (int i = 0; i < myArray.length; i++) {
			
//			myArray[i] = 42;
			
//			**********

			double random = Math.random();
			double rounded = Math.round(random);
			int result = (int) rounded;

			myArray[i] = result;
		}

		
		//Variate mit for each
		int l = 0;
		for (int n : myArray) {
			myArray[l] = 42;
			l++;
		}
		
		// for each print
		for (int n : myArray) {
			System.out.println(n);
		}
		
//		Objekte können auch in ein Array
		Hund bello = new Hund(2);
		
		Hund[] myHundArray = new Hund[1];

		myHundArray[0] = bello;

		System.out.println(myHundArray.toString());
		System.out.println(Arrays.toString(myHundArray));
		System.out.println(bello);
		
		
		
		
		//Strings immer mit equals oder campareTo vergleichen
		char c = 'o';
		String s1 = "Hall" + c;
		String s2 = "Hallo";
		
		System.out.println(s1 == s2);
		System.out.println(s2.equals(s1));
		
		



	}

}
