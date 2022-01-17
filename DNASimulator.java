package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNASimulator 
{
	private int generations;
	private int[]DNARules;
	private int[][]currentGen;
	private int[][]nextGen;
	private final int DNA_RULES_COUNT=16;
	private final int PETRI_DISH_ROWS=10;
	private final int PETRI_DISH_COLS=10;

	//currentGen = nextGen;
	
	public DNASimulator(String filename) throws FileNotFoundException
	{
		this.DNARules = new int[16];
		this.currentGen = new int[10][10];
		this.nextGen = new int[10][10];
		readFileInfo(filename);
	}
private void readFileInfo(String filename) throws FileNotFoundException
{
	
	Scanner inputFile = new Scanner(new File(filename));
	this.generations = inputFile.nextInt();
	for(int i=0;i<this.DNARules.length;i++)
		DNARules[i] = inputFile.nextInt();
	inputFile.nextLine();
	String DNAValues = inputFile.nextLine();
	String[] DNANumbers = DNAValues.split(" ");
	
	//System.out.print();
	
	for(int row=0;row<PETRI_DISH_ROWS;row++)
	{
		for(int col=0;col<PETRI_DISH_COLS;col++)
		{
			this.currentGen[row][col]=inputFile.nextInt();
		}
	}
	inputFile.close();      

}
public void runSimulation() 
{
	/*int [][] curGen = new int[12][12];//note that all cells are assigned 0,
	//this would be declared at class level of homework
int [][] nextGen = new int[12][12]; //declared at class level of homework
int [] DNARules = new int[16];// this would be declared at class level of your homework

//to walk through the 10x10 part of the array we'll start at index 1
//and stop at index 10
int row, col;
int DNARulesIndex;

//since we have extra rows and cols around our 10x10 that have 0s in those cells
//we don't have to check for outside the bounds of the 2d array :-)
for (row = 1; row <= 10; row++) { //note instead of saying 10 we could say twod.length-2
for (col = 1; col <= 10; col++) {//ditto for 10 here (twod.length-2) since we know same # of cols
DNARulesIndex = curGen[row][col] +
curGen[row-1][col] + //cell above
curGen[row+1][col] + //cell below
curGen[row][col-1] + //cell to left
curGen[row][col+1]; //cell to right
nextGen[row][col] = curGen[row][col] + DNARules[DNARulesIndex];
if (nextGen[row][col] > 3)
nextGen[row][col] = 3;
else if (nextGen[row][col] < 0)
nextGen[row][col] = 0;*/







	
	 
	int DNAIndex=0;
	for(int row=1;row<PETRI_DISH_ROWS-1;row++)
	{
		for(int col=1;col<PETRI_DISH_COLS-1;col++)
		{
			
				
			//if(this.currentGen[row][col]>3)
				//this.currentGen[row][col]=3;
			
			
				/*if(this.currentGen[row-1][col]<0)
				{
					this.currentGen[row-1][col]=this.currentGen[0][col];
				}
			if(this.currentGen[row+1][col]>10)
			{
				this.currentGen[row+1][col]=this.currentGen[10][col];
			}
			if(this.currentGen[row][col-1]<0)
			{
				this.currentGen[row][col-1]=this.currentGen[row][0];
			}
			if(this.currentGen[row][col+1]>10)
			{
				this.currentGen[row][col+1]=this.currentGen[row][10];
			}*/
			
			
			
			
			
			DNAIndex = this.currentGen[row][col]		
					+this.currentGen[row-1][col]
					+this.currentGen[row+1][col]
							+this.currentGen[row][col-1]
							+this.currentGen[row][col+1];
			int cellValue = this.currentGen[row][col]
					+this.DNARules[DNAIndex];//DNAIndex = this.
			if(cellValue>3)
			{
				cellValue=3;
			}
			else if(cellValue<0)
			{
				cellValue=0;
			}
			this.nextGen[row][col]=cellValue;
		
			
			
			//System.out.println(currentGen[row][col]);
		}
		
	}
	
	this.currentGen = this.nextGen;
	this.nextGen = new int[10][10];
	//DNAIndex++;
	//printArray(DNAIndex);
	this.nextGen = new int[10][10];
	}
	
	// TODO Auto-generated method stub
	

public void printArray()
{
	//System.out.println("Generation: " + Gen);

	for(int row=0;row<PETRI_DISH_ROWS;row++)
	{
		System.out.print("\n");
		for(int col=0;col<PETRI_DISH_COLS;col++)
		{
			//System.out.println("."); 
			if(currentGen[row][col]==0)
			{
				System.out.print(".");
			}
				else if(currentGen[row][col]==1)
				{
					System.out.print("!");
				}
				else if(currentGen[row][col]==2)
				{
					System.out.print("X");
				}
				else if(currentGen[row][col]==3)
				{
					System.out.print("#");
				}
		}
		
		
}
	System.out.print("\n");
}
}
