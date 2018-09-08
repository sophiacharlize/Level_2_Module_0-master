package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] i = new String[5];
		//2. print the third element in the array
		System.out.println(i[2]);
		//3. set the third element to a different value
		i[2] = "p";
		//4. print the third element again
		System.out.println(i[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		//6. make an array of 50 integers
		int [] x = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		
		for (int j = 0; j < x.length; j++) {
			x[j] = ran.nextInt(100);
		}
		System.out.println();
		//8. without printing the entire array, print only the smallest number in the array
		int min = x[0];
		for (int j = 0; j < x.length; j++) {
			
			if(x[j] < min) {
				min = x[j];
			}
		}
		 System.out.println(min);
		//9 print the entire array to see if step 8 was correct
		for (int j = 0; j < x.length; j++) {
			System.out.print(x[j] + " ");
		}
		System.out.println();
		//10. print the largest number in the array.
		int max = x[0];
		for (int j = 0; j < x.length; j++) {
			
			if(x[j] > max) {
				max = x[j];
			}
		}
		System.out.println(max);
	}
}
