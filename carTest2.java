// 2022.01.25. 화

// 자바의 정석 p.296 - Testo078 참고
// 생성자에서 다른 생성자 호출하기 - this(), this
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

		//System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		//System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

		Car ob = new Car("white","auto",4);
	}
}
//-------------------------------------------------------------------------------------------------
/*
c1의 color = white, gearType = auto, door = 4
c2의 color = blue, gearType = auto, door = 4
계속하려면 아무 키나 누르십시오 . . .
*/