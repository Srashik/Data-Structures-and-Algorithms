import java.util.*;


public class LinkedList<Node> 
{
	Node<Integer> head;
	int size;

	public static class Node<Integer>
	{
		Integer data;
		Node<Integer> next;


		public Node()
		{
			this.data = null;
			this.next = null;
		}
		public Node(Integer data)
		{
			
			this.data = data;
			this.next = null;
		}
		public Integer getData()
		{
			return this.data;
		}

		public void setData(Integer data)
		{
			this.data = data;

		}
		public Node<Integer> getNext()
		{
			return this.next;
		}
		public void setNext(Node<Integer> node)
		{
			this.next = node;
		}
		public String toString()
		{
			return this.data + "";
		}

	}


	public LinkedList()
	{	
		this.head = null;
		this.size = 0;

	}
	
	public int size()
	{	
		return size;
	}
	public void add(Integer item)
	{
		
		if (this.head == null) 
		{
			this.head = new Node<Integer>(item);
			//System.out.println(this.head);
			size++;

			
		}
		else
		{	
			Node<Integer> prev = this.head;
			//System.out.println(node);
			//System.out.println(this.size);
			Node<Integer> n = new Node<Integer>(item);

			for (int x = 0;x < size;x++) 
			{	
				if (prev.next == null) 
				{
					prev.next = n;
					prev = prev.next;
					size++;
					
				}
				
				
				
				
				
			}
		}
		
	}
	public String toString()
	{
		return this.head+"";
	}

	/*public void print()

	{	Node<Integer> count =this.head;
		for(int x = 0; x < this.size;x++)
		{

			System.out.println(count.next);
			count = count.next;


		}
	}*/

	public void add(int position, Integer item)
	{	


		
		if (position==0) 
		{	
			//System.out.println("n");
			Node<Integer> n = new Node<Integer>(item);
			System.out.println(n);
			n.next = this.head;
			this.head = n;
			

			size++;

			
		}
		else
		{	
			Node<Integer> prev = this.head;
			Node<Integer> newItem = new Node<Integer>(item);
			
			for (int x = 0;x < position;x++) 
				{	

					if (prev.next==null) 
					{
						prev.next = newItem;
						prev = prev.next;
						size++;
						
					}
					else
					{
					System.out.println("prev.next");
					prev = prev.next;
					//Node<Integer> n = new Node<Integer>(item);
					newItem.next = prev.next;
					prev.next = newItem;
					System.out.println(prev.next);

				}
					
				}

			
		}
		
	}

	public Integer remove(int position)
	{
		//Node<Integer> node = this.head;
		if (position ==0) 
		{
			Node<Integer> node = this.head;
			this.head = this.head.next;
			size--;

			return node.getData();
			
		}

		else
		{
			Node<Integer> prev = this.head;
			Node<Integer>node = prev.next;
			for(int x = 0; x < position-1;x++)
			{
				prev = prev.next;
				
				prev.next = node.next;
				System.out.println("Yass");
				size--;
				return node.getData();

			}

			return node.getData();
		}
		
	}
	public Integer get(int position)
	{	
		if (position>size) 
		{
			return this.head.getData();
			
		}
		else
		{
			Node<Integer> curr = this.head;
			for (int x =0;x < position;x++) 
			{
				curr = curr.next;
			}
			return curr.getData();

		}
	}
	public Node reverse(Node head)
	{
		if (this.size==0) 
		{
			return this.head;
		}
		else

		{
			Node<Integer> prev = null;
			Node<Integer> current = this.head;
			for (int x = 0;x < this.size;x++) 
			{
				prev.next = current.next;
				current = current.next.next;
				prev = prev.next;

				
			}
			return current;
		}

		
	}

	public static void main(String[] args) 
	{	
		LinkedList<Node<Integer>> list = new LinkedList<Node<Integer>>();
		Integer num = Integer.valueOf(5);
		Integer num2 = Integer.valueOf(7);
		Integer num3 = Integer.valueOf(10);
		list.add(num);
		list.add(2,num2);
		list.add(num3);
	
		System.out.println(list.size());
		Integer n = list.remove(2);
		System.out.println(n);
		System.out.println(list.size());
		System.out.println(list.get(1));

		//list.print();


	}
}