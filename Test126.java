// 20220127 목

// ▶ 클래스 고급

// 중첩 클래스
//-------------------------------------------------------------------------------------------------

// outer
class InnerOuterTest
{
	static int a = 10; // 스태틱 변수, 클래스 변수
	int b = 20;        // 인스턴스 변수

	// inner
	// 제일 나중에 만들어지는 애
	class InnerNested
	{
		int c = 30; 
		
		// inner의 write()
		void write()
		{
			System.out.println("inner의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}
	
	// outer의 write()
	void write()
	{
		System.out.println("outer의 write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write(); //-- inner의 write() 메소드 호출

	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test126
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write(); //-- outer의 write() 메소드 호출
		/*
		outer의 write()...
		inner의 write()...
		a : 10
		b : 20
		c : 30
		계속하려면 아무 키나 누르십시오 . . .
		*/

		//------------------------------------------------------

		// 필요에 의해 외부에서 안에 있는 class에 접근할 때

		//InnerNested ob3 = new InnerNested();
		//--==>> 에러 발생(컴파일 에러)

		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>> 에러 발생(컴파일 에러)

		// ※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//    외부 클래스의 인스턴스(객체)를 사용하지 않고
		//    단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		//    → 외부 클래스의 객체를 생성하면
		//       내부 클래스의 객체를 생성하는 것이 가능하다.

		// ※ Test124.java 파일과 비교하기 ~ !!!
		// InnerOuterTest안에 들어있는 InnerNested 타입의 ob5
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/*
		inner의 write()...
		a : 10
		b : 20
		c : 30
		*/
		
		// InnerOuterTest안에 들어있는 InnerNested 타입의 ob6에 = 외부 객체 안에.내부 객체 생성
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		/*
		inner의 write()...
		a : 10
		b : 20
		c : 30
		*/
		
		/*
		outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();
		*/

		/*
		cf) static → 중첩 내부 클래스
		outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();
		*/

		// 외부 클래스를 생성하지 않으면 내부 클래스 생성할 수 없음
		// 외부 클래스 객체를 생성해도, 내부 클래스 객체 생성전까지는 없는 거라 따로 생성하는 것
	}
}
//-------------------------------------------------------------------------------------------------
/*
outer의 write()...
inner의 write()...
a : 10
b : 20
c : 30
inner의 write()...
a : 10
b : 20
c : 30
inner의 write()...
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/