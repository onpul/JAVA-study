import java.util.ArrayList;

interface food
{
	public void eat();
}

class salad implements food
{
	public void eat()
	{
		System.out.println("salad~");
	}
}

class sandwich implements food
{
	public void eat()
	{
		System.out.println("sandwich~");
	}
}

class receipt
{
	public ArrayList<food> fd;

	receipt()
	{
		fd = new ArrayList<>();
	}
}


public class TempTest
{
	public static void main(String[] args)
	{
		salad sd = new salad();
		sandwich sw = new sandwich();
		
		ArrayList<food> fd = new ArrayList<>();

		fd.add(sd);
		fd.add(sw);
		
		fd.get(0).eat();
		fd.get(1).eat();

		receipt rc = new receipt();

		rc.fd.add(sd);
		rc.fd.add(sw);

		rc.fd.get(0).eat();
		rc.fd.get(1).eat();

	}
}