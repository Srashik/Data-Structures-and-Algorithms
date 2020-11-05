

public class MyArrayList implements MyList
	
	{
		int size;
		CelestialBody [] list;



		public MyArrayList(){

			size = 0;
			list = new CelestialBody[10];
		}
		public void add(CelestialBody item)
	{
		if (size<=this.list.length) 
		{
			grow_array();
			this.list[this.size++] = item;

			
		}
		else
		{
			this.list[size++] = item;
			
		}
	}

	public CelestialBody get(int i)
	{
		if (i >= size||i < 0) 
		{
			return null;
		}

		return list[i];
	}

	public int getListSize()
	{
		return this.size;
	}

	private void grow_array () 
	{
		CelestialBody [] new_arr = (CelestialBody[]) new CelestialBody[list.length * 2];

		for (int i = 0; i < list.length; i++)
			new_arr[i] = list[i];
		list = new_arr;
		}


	public CelestialBody Remove(int i)
	{
		if (i >= size||i < 0) 
		{
			return null;
		}
		else
			{
				for(int x = i; x < size; x++)
				{
					list[x] = list[x+1];
					size--;
				}
				return list[size];
			}

		
		
			
		
	}



	}