public class TwoSum{

	


	public TwoSum(){
		

	}




	public int twoSum(int [] num, int sum)
	{
		for (int x =0;x < num.length;x++) 
		{
			for (int y =0;y < num.length;y++) 
			{
				if (num[x] + num[y] == sum) 
			{	
				//int [] newSum = {x,y};
				System.out.println(y);
				return x;

				
			}

				
			}
			
		}
		return -1;


	}

	

public static void main(String[] args) 
{	
	int [] num = {5,14,10,7};
	int target = 12;
	TwoSum n = new TwoSum();
	
	//n.TwoSum(num,target);
	System.out.println(n.twoSum(num,target));

	
}

}