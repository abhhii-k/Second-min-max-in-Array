package deletefiles;

import java.util.Scanner;

public class Arrayex {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int element = 4;										//The number of array elements
		int[] arr= new int[element];
		for(int i=0;i<element;i++) {
			System.out.print("Enter value: ");
			arr[i] = scan.nextInt();                        //taking the inputs from user
			
		}
		int max=0;
		int max2=0;										//Initializing the variables
		int min=Integer.MAX_VALUE;
		int min2=0;
		for(int a:arr) {							//For-each loopfor array
			System.out.print(a+" ");
			
			if(max<a || max2<a) {					//Checking for max and second max
				if(max<a) {
					max2=max;
					max=a;
				}
				if(max2<a && a!=max) {
					max2=a;
				}
			}
			
			if(min>a || min2>a) {				//checking for min and second min
				
				if(min>a) {
					min2=min;
					min=a;
				}
				
				if(min2>a && a!=min) {
					min2=a;
				}
			}
		}
		System.out.println("\nMax: "+max);
		System.out.println("Second max: "+max2);		//Printing the output
		
		System.out.println("Min: "+min);
		System.out.println("Second Min : "+min2);
		scan.close();
	}

}
