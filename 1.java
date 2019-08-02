import java.util.Scanner;
import java.lang.Math;
public class questionOne{

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

	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = reader.nextInt();
		reader.close();
	
		int[] array = createAndPopulateArray(size);
		printArray(array);
	}
}
