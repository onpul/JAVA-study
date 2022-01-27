// 20220127 목

// ▶ 자바의 주요(중요) 클래스
//-------------------------------------------------------------------------------------------------

// ※ Test128.java와 비교~!!!

/*
toString() : 이 메소드는 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다. 
             인스턴스의 정보를 제공한다는 것은 대부분의 경우 인스턴스 변수에 저장된 값들을 
			 문자열로 표현한다는 뜻이다.

Object 클래스에 정의된 toString()은 아래와 같다.

public String toString() 
{
    return getClass().getName()+"@"+Integer.toHexString(hashCode());
}

클래스를 작성할 때 toString()을 오버라이딩하지 않는다면, 위와 같은 내용이 그대로 사용될 것이다. 
즉, toString()을 호출하면 클래스이름에 16진수의 해시코드를 얻게 될 것이다.

--> getClass()와 hashCode() 역시 Object클래스에 정의된 것이므로 
    인스턴스 생성없이 바로 호출할 수 있다.

*/
//-------------------------------------------------------------------------------------------------
// ※ Test128.java와 비교~!!!

// import java.lang.*;
public class Test129 // extends Object
{
	/*
	...

	public String toString()
	{
	    ...;
	}
	...
	*/

	
	@Override
	public String toString()
	{
	    return "재정의한 toString()...";
	}
	
	// Object 클래스에 정의된 toString()은 public String toString()이기 때문에 
	// 오버라이딩 할 때에도 String타입으로 해야 한다! 

	// 오버라이딩 --> 메소드 이름, 리턴 타입, 매개변수의 갯수나 타입이 완전히 일치해야 함!!!
	                                             
    /*
	@Override
	public String toString()
	{
	    return "테스트";
	}
	*/

	public static void main(String[] args) // main 메소드는 자바의 처음과 끝.
	{
		Test129 ob = new Test129();
		// Q. 인스턴스 생성이 필요한 이유?
		// A. 클래스 선언한 것은 설계도에 불과하므로 인스턴스를 생성해야 함.
		//    -> 인스턴스 생성 -> 메모리에 퍼올리기 !!!

		// + 자바에서 모든 코드는 반드시 클래스 안에 존재해야 함.
		// 클래스 구조, 인스턴스 다시 다시 다시 복습

		System.out.println(ob.toString());
		//--==>> 재정의한 toString()...

		System.out.println(ob);
		//--==>> 재정의한 toString()...

		// toString 클래스를 오버라이딩 하지 않고 위 구문을 실행하면
		//--==>> Test129@15db9742
	}
}
// 실행 결과
/*
재정의한 toString()...
*/