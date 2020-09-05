import java.util.*;
public class Sudoku{


	int BOARD_SIZE;
	int [][] values;
	int num = 0;



	public Sudoku(){

		this.BOARD_SIZE = 9;
		values = new int [BOARD_SIZE][BOARD_SIZE];


	}


	public String toString(){

		return values+"";
	}

	public int [][] enterBoard(){
		
		for(int x = 0;x<BOARD_SIZE;x++)
		{
			
			for(int y = 0; y < BOARD_SIZE; y++){
				Scanner user = new Scanner(System.in);
				System.out.println();
				System.out.println("Please enter numbers 1 - 9 for Sudoku board");
				String user_input = user.nextLine();
				int num = Integer.parseInt(user_input); //Asking user for input values
				
				values[x][y]=num;
				

				}	//Storing values in table
			System.out.println();	

	}
	return values;

}


	public void printBoard(){


		for (int x = 0;x < BOARD_SIZE;x++) 
		{	System.out.println("-------------------------");
			System.out.println();
			for (int y = 0;y < BOARD_SIZE;y++) 
			{
				System.out.print(this.values[x][y]);
				System.out.print("  ");
				
			}
			System.out.println();
			
		}

		
	}


	public boolean safe(int row, int col)
	{	
		for (int i = 0;i < BOARD_SIZE;i++) 
		{	
			if (i!=col&&this.values[row][col]==this.values[row][i]) //Checking Rows 
			{	//System.out.println("I got to the first if statement");
				return false;	
			}
			
		}

		for (int j = 0;j < BOARD_SIZE;j++) 
		{
			if (j!=row&&this.values[row][col]==this.values[j][col]) //Checking columns
			{	//System.out.println("I got to the second if statement");
				return false;
			}
			
		}


		int startRow = row/3;
		int startCol = col/3;
		for (int x =0;x < 3;x++) 
		{
			if (this.values[row][col]==this.values[row][x+startCol]) //Checking the 3X3 grids
			{	//System.out.println("I got to the third if statement"); //Rows
				return false;
			}
			
		}
		for (int y = 0;y <3;y++) 
		{
			if (this.values[row][col]==this.values[y+startRow][col]) //Checking grids
			{	//System.out.println("I got to the fourth if statement");//Columns
				return false;
				
			}
			
		}



		return true;
	}

	public boolean checkValues(int x, int y,int num){ //function to loop through the values

				for (int i =0;i <BOARD_SIZE;i++) //to see which one works
				{
					for (int j = 0;j < BOARD_SIZE;j++) 
					{
						this.values[x][y] = num;
						if (safe(x,y)) 
						{	

							//System.out.println("Fillboard printed out");
							return true;
						}
						else
							//this.values[x][y]=0; //Backtracking algorithm to replace the
							return false; //zero if it does not work
						
					}

					
				}
					

			


	
		return false;


	}


	public boolean fillBoard(){
		num++;
		if (num==10) 
		{
			num=1;
			
		}
		int row = 0;
		int col = 0;
		
		if (row==BOARD_SIZE) 
		{
			return true;
			
		}
		

		for (int x = 0;x < BOARD_SIZE;x++) 
		{
			for (int y = 0;y < BOARD_SIZE;y++) 

			{	
				if (this.values[x][y]==0) 
				{	
				
					if (checkValues(x,y,num)) 
					{	
						return true;
					
						}
					else 
						{

						this.fillBoard();
					}
				
				
			}
			
		}

	}
	
	
		return false;

	}

	public static void main(String[] args) {
		
		
	Sudoku board = new Sudoku(); //Creating object
	board.enterBoard();
	board.printBoard(); //the board printed out with the zeroes
	board.fillBoard();
	board.printBoard();// the board after going through the fillBoard function
		
		
		
		
		
	}
}