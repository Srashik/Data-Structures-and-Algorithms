import java.util.ArrayList;
import java.util.List;

public class SortColumns
{



	public SortColumns()
	{	

	}
	public static void main(String[] args) 
	{
		String [] array = {"abdc","jklm"};
		int [] index = {1,2,4,6};
		SortColumns s = new SortColumns();
		System.out.println(s.minDeletionSize(array));



		
	}


	public List<Integer> minDeletionSize(String [] array)
	{


		List<Integer> myList = new ArrayList<Integer>();

		for (int x =0;x < array.length;x++) 
		{
			for (int y = 0; y < array[x].length();y++) 
			{
				char c = array[x].charAt(y);
				if (c > array[x].charAt(y-1)) 
				{
					myList.add(y-1);
					
				}
				System.out.println(c);
				
			}

			

			return myList;
			
			
		}
			
			
		
		//System.out.println(myList);

		return myList;


	}


}