import java.util.Scanner;
import java.lang.Math;
import java.io.*; 
import java.util.*; 
public class first{

	public static int[][] createAndPopulateArray(int[][] arr){
		for(int i = 0; i < arr.length;i++){
			for(int j = 0 ; j < arr.length;j++){
				arr[i][j] = 0;
			}
		}
		
		return arr;
	}

	public static void print2D(int mat[][]) { 
        	for (int i = 0 ; i < mat.length;i++){
			for(int j = 0; j < mat.length;j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
    	} 

	public static void processString(String input){	
		String firstCo = input.substring(0,input.indexOf(";"));
		String secondCo = input.substring(input.indexOf(",")+1);
		int rowFirst = getRow(firstCo);
		int columnFirst = getCol(firstCo);
		
		int rowSecond = 
	}

	public static int getRow (String coords){
		return rowFirst = Integer.parseInt(input.substring(0,coords.indexOf(",")));
	}

	public static int getCol (String coords){
		return rowFirst = Integer.parseInt(input.substring(coords.indexOf(",")+1));
	}

	public static void createObstacle(int[][] grid, String input){
		
	}


	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		int neighbours = reader.nextInt();
		int obstacles = reader.nextInt();
		int samplePoints = reader.nextInt();
		int dimension = reader.nextInt();

		String start = reader.next();
		String finish = reader.next();

		for(int o = 0; o < obstacles ; o++){
			String obst = reader.nextInt();
		}

		int[][] grid = new int[dimension][dimension];
		grid = createAndPopulateArray(grid);
		insertPoint(grid,start);
		insertPoint(grid,finish);
		print2D(grid);
		reader.close();
	
		//int[] array = createAndPopulateArray(size);
		//printArray(array);
	}
}
