// 20220121 금

// ▶메소드 중복정의(Method Overloading)
//-------------------------------------------------------------------------------------------------
/*
● 메소드 오버로딩의 개요
   메소드 오버로딩(Overloading)이란
   메소드가 처리하는 기능은 같고
   메소드 괄호 속에 오는 인수(인자, 매개변수, 파라미터)의 갯수가 다르거나
   자료형(Data Type)이 다른 경우
   메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록
   문법적으로 허용하게 되는데
   이를 메소드 오버로딩(Method Overloading)이라고 한다.
*/
//-------------------------------------------------------------------------------------------------
public class Test105
{
	public static void main(String[] args)
	{
		/*
		Test105 ob = new Test105();
		ob.drawLine();
		*/

		drawLine();    // 매개변수 없이 부르기 (1)
		//--==>> ====================

		drawLine('-'); // 매개변수 넣어 부르기 (2) 
		//--==>> --------------------

		drawLine('<'); // 매개변수 넣어 부르기 (2) 
		//--==>> <<<<<<<<<<<<<<<<<<<<

		drawLine('+', 30); // (3)
		//--==> ++++++++++++++++++++++++++++++
		
		drawLine('/', 50); // (3)
		//--==> //////////////////////////////////////////////////
	}

	// 선을 그리는 메소드 정의
	//public void drawLine()
	public static void drawLine() // (1)
	{
		System.out.println("====================");
	}

	// 선의 형태를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c) // (2)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}

	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c, int n) // (3)
	{
		for (int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}
//-------------------------------------------------------------------------------------------------
// **예시**

//-- 우리는 다 같은 println을 쓰고 있는 줄 알았지만 아니었다!!
// System.out.println(10);
// System.out.println("ABCD");
// System.out.println('K');
// System.out.println(3.141592);
// System.out.println(true);

// System.out.printyf("%d%n", 10);
// System.out.println("%d + %d = %d%n", 10, 20, 30);