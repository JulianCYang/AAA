import java.util.Scanner;
import java.lang.Math;
public class randomCode{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = reader.nextInt();
		
		int[] arr =new int[n];

		for(int i = 0; i < n;i++){
			arr[i] = (int)(Math.random()*101);
			for(int j = 0 ; j < i ;j++){
				if(arr[i]==arr[j])
				{
					i=i-1;
				}
			}
		}

		for(int m = 0; m < n ;m++){
			System.out.println(arr[m]);
		}

		System.out.println("Enter the key that you are looking for: ");
		int key = reader.nextInt();
		reader.close();
		
		int index = 0;
		while( key != arr[index]){
			index++;
		}
		
		System.out.println(index);
	}
}
