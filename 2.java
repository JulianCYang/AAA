import java.util.Scanner;
import java.lang.Math;
public class question2{

	public static int[] createAndPopulateArray(int size){
		int[] arr =new int[size];

		for(int i = 0; i < size;i++){
			arr[i] = (int)(Math.random()*101);
			for(int j = 0 ; j < i ;j++){
				if(arr[i]==arr[j])
				{
					i=i-1;
				}
			}
		}
		
		return arr;
	}

	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}

	public static void sortArray(int[] arr){
		int temp =0;
		for(int k =0; k < arr.length;k++){
			for(int l = 1; l < arr.length-k;l++){
				if (arr[l-1] > arr[l]){
					temp = arr[l-1];
					arr[l-1] = arr[l];
					arr[l] = temp;
				}
			}
		}
	}
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = reader.nextInt();
		reader.close();

		int[] array = createAndPopulateArray(n);
		sortArray(array);
		printArray(array);				
	}
}
