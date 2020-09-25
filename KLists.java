
import java.util.*;
public class KLists
{
	
	


	public KLists(double [][] array)
	{
		
		

	}

	public void print(double [][] array)
	{
		for (int x =0;x < array.length;x++) 
		{
			for (int y = 0;y < array.length;y++) 
			{
				System.out.print(array[x][y]+", ");
				
			}
			System.out.println();
			
		}
	}
	

	public void swap(double [][] arr, double n1, double n2)
	{
		double temp = n1;
		n1 = n2;
		n2 = temp;

	}

	public double findMin(double [][] array, int start)
	{	

		int smallest = start;
		double small = 0;
		for (int i = 0;i < array.length;i++ ) 
		{
			for (int j = start +1;j <array[i].length;j++) 
			{
				if (array[i][j] < array[i][smallest]) 
			{
					smallest = j;
					small = array[i][smallest];
					return small;
			}
				
			}
			
			
		}
		return small;
	} 

	public double [] mergeKLists(double [][] outerArray)
	{
		double min = 0;
		double [] sortedArray = new double[outerArray.length];
		for (int x = 0;x < outerArray.length;x++) 
		{
			for (int y = 0;y < outerArray[x].length;y++) 
			{
				
				min = findMin(outerArray,0);
				System.out.println(min);
				sortedArray[y]=min;
				
			}
			
		}

		return sortedArray;

	}


	public static void main(String[] args) 
	{
		double [][] array = {{1,4,3},{2,5,9},{7,8,6}};
		KLists myList = new KLists(array);
		myList.print(array);
		//System.out.println(myList);
		double [] sorted = myList.mergeKLists(array);
		for (double n :sorted ) 
		{
			System.out.println(n);
			
		}
		//System.out.println(myList.findMin(array,0));
	//	myList.print(array);

		
		
	}



}