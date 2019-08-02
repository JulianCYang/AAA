import java.util.Scanner;
import java.lang.Math;
public class randomCode{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = reader.nextInt();
		System.out.println("Enter the value: ");
		int num = reader.nextInt();
		System.out.println("Enter the key: ");
		int key = reader.nextInt();
		reader.close();
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

		int swapValue =0;
		for(int k =0; k < n;k++){
			for(int l = 1; l < n-k;l++){
				if (arr[l-1] > arr[l]){
					swapValue = arr[l-1];
					arr[l-1] = arr[l];
					arr[l] = swapValue;
				}
			}
		}
		
		int tempValue =0;
		boolean checker = false;
		for(int temp = 0 ; temp < n ;temp++){
			if(arr[temp] == num){
				tempValue = arr[key];
				arr[key] = arr[temp];
				arr[temp] = tempValue;
				checker = true;
			}
		}

		if(checker != true){
			arr[key] = num;
		}

		for(int m = 0; m < n ; m++){
			System.out.println(arr[m]);
		}

	}
}
