import java.awt.Color;
import java.util.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.Timer;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class NBody extends JPanel implements ActionListener{
	Timer tm = new Timer(5,this);
	MyList myList;

public NBody(String listType)
	{
	
	myList = new MyArrayList();

	}


	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//g.setColor(Color.RED);
		//g.drawRect(100,10,30,40);
		//g.fillRect(x,10,20,10);
		
	
		g.setColor(Color.RED);
		for (int x = 0;x < this.myList.getListSize();x++) 
		{	g.drawString("Planet Name: "+ myList.get(x).getName() + " ",myList.get(x).getXPos()-12,myList.get(x).getYPos()-12);
			g.drawString("Mass: "+ myList.get(x).getMass() + " ",myList.get(x).getXPos(),myList.get(x).getYPos());
			g.drawOval(myList.get(x).getXPos(),myList.get(x).getYPos(),25,25);
			g.fillOval(myList.get(x).getXPos(),myList.get(x).getYPos(),25,25);
			g.setColor(Color.BLACK);
			
		}
		
		tm.start();
	}



	public void actionPerformed(ActionEvent e)
	{


		
		int y = 0;



		/*while(myList.get(y).getXPos()< 767 && myList.get(y).getYPos()< 767 || y < myList.getListSize())
		{
			repaint();

			myList.get(y).setXPos(myList.get(y).getXPos()*(int)myList.get(y).getXVel());
			myList.get(y).setYPos(myList.get(y).getYPos()*(int)myList.get(y).getYVel());
			
			y++;


			
			for (int x = 0;x < this.myList.getListSize();x++) 
			{
				if (myList.get(y).getXPos() == myList.get(x).getXPos()||myList.get(y).getYPos()==myList.get(x).getYPos()||myList.get(y).getXPos()==myList.get(x).getYPos()||myList.get(y).getYPos()==myList.get(x).getXPos()) 
				{
					myList.get(y).setXVel(-1*myList.get(y).getXVel());
					myList.get(y).setYVel(-1*myList.get(y).getYVel());
					myList.get(x).setXVel(-1*myList.get(x).getXVel());
					myList.get(x).setYVel(-1*myList.get(x).getYVel());

					//^^Supposed to let the planets move away from each other if they crashed. like bounce back away.
				}
				
			}

		}*/

		
		
	}


	

	public static void main(String[] args) throws FileNotFoundException
	{

		
		JFrame frame = new JFrame();
		File myFile = new File("nbody_input.txt");

		String name;
		Scanner sc = new Scanner(myFile);
		//MyList list = new MyArrayList();
		String listType = sc.nextLine();
		NBody n = new NBody(listType);
		double pixelScale = Double.parseDouble(sc.nextLine());
		while(sc.hasNext())
		{
			String line = sc.nextLine();
			
			if (line.charAt(0)=='P') 
			{
				n.myList.add(new CelestialBody(line));
				
			}


		}

		sc.close();
		System.out.println(n.myList.get(0).getXVel());

		frame.setTitle("Tutorial");
		frame.setSize(768,768);
		frame.add(n);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

		
	}



//Questions: 
// How do I allow the program to read and assign variables to the JFrame?
	//Extending two classes..Inheritance??







}