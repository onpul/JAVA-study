// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// String 클래스

// 골칫거리... -> 실수 - 전 세계에 있는 메모리를 가져오더라도 표현할 수 없다.
//             -> 문자열도 마찬가지이다.
//             -> 그래서 프리미티브 자료형으로 표현하기는 어려웠다~

// 배열 -> 동질의 성격을 가진 자료, 배열 크기 변할 수 없다.

// String -> ** 내용을 변화시킬 수 없다!!!!

// ● String 클래스는 내부 문자열 데이터에 대한 수정이 불가능하다.
//    -> 메모리 상상하자 □□□ □□□ □□□ ! ! !
//    -> 처음 정의된 값은 저장되어 있고, 그 값은 못 바꿈
//    -> 바꾸게 되면, 처음 참조하던 주소는 끊어지고 다른 주소를 참조하게 되는 것
//    -> "고길동" + "안녕"이면 고길동은 다른 데 넣어놓고 거기에 안녕 추가, 이전 주소 끊어짐

/* 
● String 클래스는 내부 문자열 데이터에 대한 수정이 불가능하다.
   (즉, 내용 불변 : Immutable)
   문자열의 내용이 변경되면 새로운 객체를 생성하며
   참조 대상을 잃어버린 객체는 가비지 컬렉션의 대상이 되고,
   새로운 객체에 새 주소를 할당하게 되므로 
   해시코드도 변하게 된다.

● String 클래스 간에 『+』 연산자를 사용하게 되면
   문자열 간의 결합이 가능하며,
   String 클래스와 다른 클래스 객체, 또는 기본형 데이터 간에
   『+』 연산자를 사용하는 경우에도 
   내부적으로 자동 String 클래스로 변환이 가능하다.

  ※ 눈으로 확인되는 결과는 이렇지만...
	 String은 내용을 변경할 수 없기 때문에
	 『+』연산자를 사용하게 되면
	 내부적으로 StringBuffer를 생성하여
	 append() 메소드를 이용하여
	 문자열에 대한 결합을 수행하게 된다.
	 따라서 동적인 문자열을 많이 사용하는 Servlet 등에서는
	 되도록이면 String을 사용하는 것보다
	 StringBuffer나 char[]을 사용하는 것이 효율적일 수 있다.

	 ==> 정적인 문자열을 처리하는 경우에는 주로 String 클래스를 사용
		 동적인 문자열을 처리하는 경우에는
		 런 타임 시 동적으로 처리해 주는 StringBuffer 클래스를
		 사용하는 것이 효율적이다.
*/
/*
● String 객체의 생성 및 특징
   
   String 객체를 생성하는 방법은
   ① 문자열 상수를 지정하는 방법과
   ② String 클래스의 생성자를 이용하는 방법
   이렇게 두 가지 방법이 있다.

   String str1 = "Java";
   String str2 = new String("Java");

   하지만 『문자열 상수』를 대입 연산자를 사용하여
   지정하는 방법을 통해 객체를 생성하는 경우와
   『new』 연산자를 이용하여 객체를 생성하는 것은 
   의미가 다르다.
*/
//-------------------------------------------------------------------------------------------------

public class Test138
{
	public static void main(String[] args)
	{
		String s1 = "seoul"; // 해시코드는 절대 주소가 아니다!!
		String s2 = "seoul"; // s1, s2는 주소가 같다 ~ / 주소 안에 들어있는 값은 "seoul"
		                     // 해시코드는 절대 주소가 아니다!!
		String s3 = new String("seoul");
		String s4 = new String("seoul");

		System.out.println(s1 == s2); // 객체끼리 비교 연산자를 통해 비교 -> 주소 비교
		System.out.println(s1 == s3); 
		System.out.println(s1 == s4);
		//--==>> true
		//       false
		//       false

		System.out.println(s1.equals(s2)); // 주소값이 아닌 값의 내용을 비교(String이 오버라이딩함)
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s1));
		//--==>> true
		//       true
		//       true
		//       true
		
		// ※ s1과 s2 객체가 참조하는 문자열 상수가 동일한 경우
		//    문자열이 저장된 기억장소의 영역이 동일하기 때문에
		//    s1 객체와 s2 객체는 동일한 기억 장소를 참조하게 된다.
		//    하지만,
		//    s3와 s4는 동일한 영역이 아닌 다른 기억 공간을 
		//    새롭게(new) 확보하여 문자열 상수를 그 공간에
		//    대입한 경우이므로
		//    두 인스턴스는 같은 영역을 참조하는 것이 아니다.
		//    따라서 『s3 == s4』는 거짓이 되며
		//    만약 같은 문자열 상수인지의 여부를 비교해야 할 경우라면
		//    『equals()』메소드를 이용해야 한다.
		// ※ String 클래스는 Object의 equals()를 Overriding~!!!

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		//--==>> s1 : seoul
		//       s2 : seoul
		//       s3 : seoul
		//       s4 : seoul

		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		//--==>> s1 : 109324212
		//	     s2 : 109324212
		//	     s3 : 109324212
		//  	 s4 : 109324212
		// 모두 같은 객체가 아님에도 해시코드는 같다 --> 해시코드가 같다고 해서 같은 객체는 아니다
		
		// ※ 객체가 같으면 hashCode가 같지만
		//    hashCode가 같다고 해서 같은 객체는 아니다.

		s2 += "Korea";
		System.out.println(s2);
		//--==>> seoulKorea

		s2 = "korea";
		System.out.println(s2);
		//--==>> Korea

		//-- 이와 같은 경우
		//   s2가 참조한 "seoul"이 저장된 영역은
		//   『s2 += "Korea";』가 수행되는 시점에서
		//   가비지 컬렉션의 대상이 되며
		//   "seoul korea" 상수가 저장된 영역을
		//   s2가 참조하게 되었다가
		//   다시 s2가 참조한 "seoul korea"가 저장된 영역은
		//   『s2 = "korea";』가 수행되는 시점에서
		//   가비지 컬렉션의 대상이 되며
		//   "korea"문자열 상수가 새롭게 저장된 영역을
		//   s2가 참조하게 된다.
		//==> ※ String 객체의 내용은 불변이다~!!!

		
	}
}