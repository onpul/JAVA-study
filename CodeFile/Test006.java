//자바의 개요 및 특징



// 변수와 자료형
// 키워드 및 식별자

public class Test006
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 27;
		char degree = 'A';

		System.out.println(height);
		System.out.println(age);
		System.out.println(degree);
        //--==>> 172.8
		//       27
		//       A

		String name = "김상기";
		//String name = "홍은혜";
		//-- 스코프 영역 안에서 변수명은 식별자 역할을 한다.

		//String #name = "김태형";
		//-- 『$』와 『_』를 제외한 다른 특수문자는
		// 변수의 이름으로 활용할 수 없다.
		// 하지만, 그나마 사용 가능한 이들 특수문자도
		// 함부로 사용하는 것은 고려해야 한다.

		//int tel = 010123123;
		//자바에서는 앞에 0이 붙으면 진법이 변환되어 버린다.
		String tel = "01022565567";
		
		String 주소 = "경기도 고양시";
		//-- 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		//   실무적인 측면에서 접근한다면
		//   절대로 한글 단어를 변수명으로 사용해서는 안 된다.


		// 결과 출력
		System.out.println("name : " + name);
		//--==> name : 김상기

		System.out.println("tel : " + tel);
		System.out.println("주소 : " + 주소)
	}
}

// 실행 결과
/*
172.8
27
A
name : 김상기
계속하려면 아무 키나 누르십시오 . . .
*/