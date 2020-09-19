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
		System.out.println(s.minDeletionSize(array,index));



		
	}


	public List<Integer> minDeletionSize(String [] array,int [] index)
	{


		List<Integer> myList = new ArrayList<Integer>();


		
		for (int num:index) 
		{
			myList.add(num);
		}
		for (int x =0;x < array.length;x++) 
		{
			for (int y = 0; y < index.length;y++) 
			{
				char c = array[x].charAt(y);
				System.out.println(c);

				
			}

			for (int i =0;i < myList.size();i++) 
			{
				myList.remove(i);
				
			}

			return myList;
			
			
		}
			
			
		
		//System.out.println(myList);

		return myList;


	}


}