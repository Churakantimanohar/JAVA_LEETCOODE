// Recursive Java Program to reverse an array 
import java.io.*;
import java.util.Scanner; 

class ReverseArray { 

	/* Function to reverse arr[] from start to end*/
	static void rvereseArray(int arr[], int start, int end) 
	{ 
		int temp; 
		if (start >= end) 
			return; 
		temp = arr[start]; 
		arr[start] = arr[end]; 
		arr[end] = temp; 
		rvereseArray(arr, start+1, end-1); 
	} 

	/* Utility that prints out an array on a line */
	static void printArray(int arr[], int size) 
	{ 
		for (int i=0; i < size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(""); 
	} 

	/*Driver function to check for above functions*/
	public static void main (String[] args) { 
    //     Scanner obj=new Scanner(System.in);
    //     int arr[]=new int[79];
	// 	for(int i=0;i<7;i++){
    //         arr[i]=obj.nextInt();
        
    // }
        int arr[] = {1, 2, 3, 4, 5, 6,7}; 
		printArray(arr, 7); 
		rvereseArray(arr, 0, 6); 
		System.out.println("Reversed array is "); 
		printArray(arr, 7); 
	} 
} 
/*This article is contributed by Devesh Agrawal*/
