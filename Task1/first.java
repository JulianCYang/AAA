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
	
	public static void insertNode(int[][] arr, String coords,int symbol){
		node test = new node(coords);
		arr[test.getRow()][test.getColumn()] = symbol;
	}
	
	public static void createObstacle(int[][]arr, String obs){
		String first, second;
		
		first = obs.substring(0, obs.indexOf(";"));
		second = obs.substring(obs.indexOf(";")+1);
		
		node firstCoords = new node(first);
		node secondCoords = new node(second);
		
		for(int i = secondCoords.getRow(); i < firstCoords.getRow(); i++){
			for(int j = firstCoords.getColumn(); j < secondCoords.getColumn(); j++){
				arr[i][j] = 8;
			}
		}
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
		
		int[][] grid = new int[dimension][dimension];
		grid = createAndPopulateArray(grid);
		insertNode(grid,start,5);
		insertNode(grid,finish,3);

		for(int o = 0; o < obstacles ; o++){
			String obst = reader.next();
			createObstacle(grid,obst);
		}
		
		for(int p = 0; p < samplePoints ; p++){
			String sPoint = reader.next();
			node checker = new node(sPoint);
			if(grid[checker.getRow()][checker.getColumn()] != 8)
			{
				insertNode(grid,sPoint,1);
			}
		}

		
		print2D(grid);
		reader.close();
	
		//int[] array = createAndPopulateArray(size);
		//printArray(array);
	}
}
