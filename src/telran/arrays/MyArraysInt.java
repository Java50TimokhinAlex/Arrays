package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		//TODO
		//add number at the array's end
		//returns new array with added number
		//using standard method Arrays.copyOf
		int myArray[] = Arrays.copyOf(array, array.length + 1);
		myArray[array.length] = num;
		return myArray;
	}
	public static int[] removeNumber(int[] array, int index) {
		//TODO
		//removes element at a given index for right index value
		//return new array without removed index
		//returns the source array for a wrong index value
		//(less then 0 or greater than array.length - 1)
		//using the standard method system.arraycopy
		if(index < 0 || index > array.length - 1) {
			return array;
		}
		int array1[] = new int[array.length - 1];
			System.arraycopy(array, 0, array1, 0, index);
			System.arraycopy(array, index + 1, array1, index, (array.length - 1) - index);
		
		return array1;
	}
	public static int[] insertNumber(int[] array, int index, int number) {
		//TODO
		//insert a given number at a given index for right value of index
		//([0 - array.lenght])
		//return new array with the inserted number
		//return the source array for a wrong index value
		//(less then 0 or greater than array.length)
		//using the standard method system.arraycopy
		if(index < 0 || index > array.length) {
			return array;
		}
		int array2 [] = new int[array.length + 1];
		System.arraycopy(array, 0, array2, 0, index);
		array2[index] = number;
		System.arraycopy(array, index, array2, index + 1, array.length - index);
		return array2;
	}
}
