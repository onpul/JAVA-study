// 2022.01.25. ȭ

// �ڹ��� ���� p.296 - Testo078 ����
// �����ڿ��� �ٸ� ������ ȣ���ϱ� - this(), this
//-------------------------------------------------------------------------------------------------
class Car
{
	String color;
	String gearType;
	int door;

    /*
	Car()
	{
		this("white", "auto", 4);
	}

	Car(String color)
	{	
		this(color, "auto", 4);
	}
	*/

	Car(String color, String gearType, int door)
	{
		/*
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		*/

		color = "white";
		gearType = "auto";
		door = 4;
	}
}

public class carTest2
{
	public static void main(String[] args)
	{
		//Car c1 = new Car();
		//Car c2 = new Car("blue");

		//System.out.println("c1�� color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		//System.out.println("c2�� color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

		Car ob = new Car("white","auto",4);
	}
}
//-------------------------------------------------------------------------------------------------
/*
c1�� color = white, gearType = auto, door = 4
c2�� color = blue, gearType = auto, door = 4
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/