// 20220127 목

// ▶ 클래스 고급

// 중첩 클래스
//-------------------------------------------------------------------------------------------------

// outer
class Test2
{
	// 멤버 변수
	static int a = 10;  // 전역변수, Test2의 멤버변수, static변수(class변수 클래스변수)
	int b = 20;         // 전역변수, Test2의 멤버변수, non-static변수(instance변수 인스턴스변수)

	// 멤버 메소드, 인스턴스 메소드
	// 위에 b랑, write()메소드는 같이 태어남
	// write()메소드가 태어났을 때 이미 a가 태어나 있음.
	void write() // ▶ 첫 번째 write() 메소드
	{
		System.out.println("write()...①");
		final int c = 20; // 지역변수 c, 상수화된 변수(값이 변하지 않는 변수)
		int d = 40;       // 지역변수 d, 값이 수시로 변할 수 있는 변수
		
		// c, d, LocalTest 클래스 모두 non-static
		// 클래스는 인스턴스 생성 시점에 태어남 -> 인스턴스 생성 시점을 보장 받을 수 없음
 
		// 지역 클래스, 로컬 클래스(메소드 안에 설계된 클래스)
		// 메소드 안에 존재하는 또다른 클래스(로컬 클래스, local class, 지역 클래스)
		// inner
		class LocalTest
		{
			void write() // ▶ 두 번째 write() 메소드
			{
				System.out.println("write()...②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c); // LocalTest가 언제 태어났든 c는 20 (final) -> 안전성 확보

				System.out.println("d : " + d); //-- 에러 발생(컴파일 에러)
				//--==>> local variables referenced from an inner class must be final or effectively final
				// 언제 LocalTest의 인스턴스가 생성되었냐에 따라 d값이 달라질 수 있어서
				// d의 접근을 막은 것

				// d의 변동사항을 수정한 후에는 -> d에 접근 허용
				//write()...①
                //write()...②
                //a : 10
                //b : 20
                //c : 20
                //d : 40
                //계속하려면 아무 키나 누르십시오 . . .
			}
		}

		// ※ 변수 c와 변수 d는 둘 다 지역변수이지만...
		//    c는 final변수이기 때문에
		//    두 번째 write() 메소드에서 언제 접근하더라도
		//    고정된 값임을 보장받을 수 있다
		//    반면에 d는 그 값이 수시로 변동될 수 있는 상황이므로
		//    LocalTest 클래스의 인스턴스 생성 시점을
		//    언제가 될지 알 수 없기 때문에
		//    그렇다면 d에 어떤 값이 담겨있는지 보장받을 수 없기 때문에
		//    변수 d에 접근하는 것을 피할 수 있도록 문법적으로 처리된 것이다.

		//d = 10;
		//d -= 30;

		//LocalTest lt = new LocalTest(); // 써 있는 건 여기지만 생성시점은 모름.
		                                // 언제 인스턴스가 생성되었냐에 따라 d값이 달라질 수 있어서
										// d의 접근을 막은 것

        // Q. 인스턴스 생성 구문을 어디에 작성했든, 언제 탄생되는지 알 수 없는 건가?

		//lt.write(); //-- 두 번째 write() 메소드 호출

		//d += 10;

		//-----------------------------------------------------
		// A. 여기에 작성해도 똑같은 에러 뜸!!
		//LocalTest lt = new LocalTest();
		//lt.write();
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test125
{
	public static void main(String[] args)
	{
		Test2 ob = new Test2();
		ob.write(); //-- 첫 번째 write() 메소드 호출
		//write()...①
        //write()...②
        //a : 10
        //b : 20
        //c : 20
	}
}