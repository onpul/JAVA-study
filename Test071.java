// 20220113 목
// ▶지역변수와 전역변수
//-------------------------------------------------------------------------------------------------
// 전역 변수의 초기화 테스트
// Test070.java와 비교~!!!
//-------------------------------------------------------------------------------------------------

public class Test071
{
	// 클래스의 영역

	// 전역 변수 a 선언
	int a; //--> 클래스 변수 아님!!! 클래스 변수는 아직 안 배웠음.
	// 자바가 자동으로 0으로 초기화를 지원해 줌.

	boolean b;

	char c;

	double d;

	public static void main(String[] args)
	{
		// 메소드의 영역

		//System.out.println("a : " + a);
		//--> 컴파일 에러 발생
		//--> non-static variable a cannot be referenced from a static context
		//--> 스타틱 변수가 아니기 때문에 에러남 

		// Test071 클래스를 기반으로 인스턴스 생성
		Test071 ob = new Test071(); // 인스턴스 생성해야 메모리로 퍼올려짐

		System.out.println("ob.a : " + ob.a);
		//--> ob.a : 0 //에러 안남, 메모리에 올라와 있는 a에 접근한 것.

		System.out.println("ob.b : " + ob.b);
		//--> ob.b : false //자바가 자동으로 false 초기화

		System.out.println("ob.c : " + ob.c);
		//--> ob.c :  //자바가 자동으로 아무것도 들어있지 않은 값으로 초기화

		System.out.println("ob.d : " + ob.d);
		//--> ob.d : 0.0  //자바가 자동으로 실수 형태로 초기화


	}

	/*
	다른메소드1()
	{
	}
	*/

	/*
	다른메소드2()
	{
		
	}
	*/
}