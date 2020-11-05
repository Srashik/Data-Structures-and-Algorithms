
public class CelestialBody{

	String name;
	double mass;
	int xpos;
	int ypos;
	double xvel;
	double yvel;
	int pixelSize;

	public CelestialBody(String line)
	{
		String [] fields = line.split(",");
		this.name = fields[0];
		this.mass = Double.parseDouble(fields[1]);
		this.xpos = Integer.parseInt(fields[2]);
		this.ypos = Integer.parseInt(fields[3]);
		this.xvel = Double.parseDouble(fields[4]);
		this.yvel = Double.parseDouble(fields[5]);
		this.pixelSize = Integer.parseInt(fields[6]);


	}

	public String toString(){

		return "Name: " + this.name + " Mass: " + this.mass + " X coordinate: " + this.xpos + " Y coordinate: " + this.ypos 
		+ " x velocity: " + this.xvel + " Y velocity: " + this.yvel + "Pixel Size: " + this.pixelSize;
	}

	public String getName(){

		return this.name;
	}

	public double getMass(){

		return this.mass;
	}

	public int getXPos(){

		return this.xpos;
	}

	public int setXPos(int xpos){
		this.xpos = xpos;
		return xpos;
	}
	public int getYPos(){

		return ypos;
	}
	public int setYPos(int ypos){

		this.ypos = ypos;
		return ypos;
	}
	public double getXVel(){

		return this.xvel;
	}

	public double setXVel(double xvel){

		this.xvel = xvel;
		return xvel;
	}

	public double setYVel(double yvel){
		this.yvel = yvel;
		return yvel;
	}

	public double getYVel(){

		return this.yvel;
	}
	public int getPixelSize(){

		return this.pixelSize;
	}

}