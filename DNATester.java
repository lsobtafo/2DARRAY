package assignment1;

import java.io.FileNotFoundException;

public class DNATester 
{
	private static final int PETRI_DISH_ROWS = 10;
	private static final int PETRI_DISH_COLS = 10;

	public static void main (String[] args) throws FileNotFoundException
	{
		DNASimulator dna = new DNASimulator("dna.txt");
		dna.printArray();
	    dna.runSimulation();
		dna.printArray();
		//dna.
	
		dna.runSimulation();
		/*
		int [][] numbers;
		numbers = new int[10][10];//3 rows, 2 columns
		
		//enhanced for loop on 2d array
		for (int [] row: numbers){
			for (int val: row)
				System.out.println(val);
		}
		
		System.out.println(numbers);
		
		int [] oneD = new int[10];
		System.out.println(oneD);
		
		print2d(numbers);
		fillArray(numbers);
		System.out.println("array after filling it with numbers");
		print2d(numbers);
		printArray(numbers);
		//ctrl r is run to cursor in debug mode
		 * */
		 
		
	}
	public static void printArray(int[][] twodArray)
	{
		

		for(int row=0;row<PETRI_DISH_ROWS-1;row++)
		{
			System.out.print("\n");
			//nextLine();
			for(int col=0;col<PETRI_DISH_COLS-1;col++)
			{
				System.out.print(twodArray[row][col]);
				//System.out.print(row +", " + col);
				if(twodArray[row][col]==0)
				{
					System.out.print(".");
				}
					else if(twodArray[row][col]==1)
					{
						System.out.print("!");
					}
					else if(twodArray[row][col]==2)
					{
						System.out.print("X");
					}
					else if(twodArray[row][col]==3)
					{
						System.out.print("#");
					}
				
						
			}
			
	}
	}

	private static void print2d(final int[][] twod) 
	{
		
		// TODO Auto-generated method stub
		for (int row = 0; row < twod.length; row++){//numbers.length is number of rows
			for (int col = 0; col < twod[row].length; col++){
				System.out.print("row is: " + row + " col is: " + col + " value is: " + twod[row][col] + " ");
			}
			//System.out.println("");
		}

		
		
	}

	private static void fillArray(final int[][] twod) 
	{
		// TODO Auto-generated method stub
int row, col;
		
		for (row = 0; row < twod.length; row++){
			for (col = 0; col < twod[row].length; col++){
				twod[row][col] = row + col;
			}
		}
	}

}
