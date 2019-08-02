import java.util.Scanner;
import java.lang.Math;
public class experimentOne{
	
	public static int[] createAndPopulateArray(int size){
		int[] arr =new int[size];

		for(int i = 0; i < size;i++){
			arr[i] = (int)(Math.random()*1000000);
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

	public static int linearSearch(int[] arr, int key){
		int index = 0;
		while( key != arr[index]){
			index++;
		}
		return index;
	}
	
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
	
		for(int n = 1; n <= 500001; n=n+20000){
			int[] arr = createAndPopulateArray(n);
			arr[arr.length-1] = 12312323;
			//System.out.println(arr.length);
			//System.out.println(arr[arr.length-1]);
			long startTime = System.nanoTime();
			//System.out.println("Enter the key that you are looking for: ");
			int key = 12312323;
			linearSearch(arr, key);
			long endTime = System.nanoTime();
     			long elapsedTime = (endTime-startTime);
			System.out.println(elapsedTime);
		}
		
		reader.close();
	}
}
