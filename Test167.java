// 2022-02-08 화

// ▶ 컬렉션 프레임워크(Collection Framework)

// List → Vector, ArrayList, ...
// ·순서 있음
// ·배열과 유사
// ·중복 허용

/*
○ ArrayList 클래스
   
   - ArrayList 와 Vector 클래스는
     List를 크기 변경이 가능한 배열로 구현한 것으로
	 차이점은 Vector 클래스의 객체는 기본적으로 동기화되지만,
	 ArrayList는 그렇지 않다는 점이다.

   - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
     스레드들이 컬렉션을 공유하지 않는 프로그램에서는
	 일반적으로 ArrayList 를 Vector보다 더 선호하며,
	 ArrayList는 동기화를 고려하지 않은 Vector처럼 동작함으로써
	 스레드 동기화에 따르는 부담을 가지지 않기 때문에
	 Vector 보다 더 빠르게 실행된다.

   - null 을 포함한 모든 요소를 허용하며
     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	 내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.
*/
// 벡터를 쓸 거면 ArrayList를 써라?
// 벡터는 동기화, ArrayList는 비동기
// 동기화 동시성 → 성능 떨어진다.
//-------------------------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test167
{
	public static void main(String[] args)
	{
		// ArrayList 자료구조 인스턴스 생성                 // Q.
		//ArrayList<String> list = new ArrayList<String>(); // ArrayList 타입의 list변수에 ArrayList 인스턴스 생성
		//Vector<String> list = new Vector<String>();       // Vector타입의 list변수에 Vector 인스턴스 생성 / 업캐스팅?     
		//List<String> list = new Vector<String>();         // List타입의 list변수에 Vector 인스턴스 생성 / 업캐스팅?
		List<String> list1 = new ArrayList<String>();
		// List는 인터페이스라서 인스턴스 생성이 안 된다.
		// 그래서 implements한 클래스 기반으로 인스턴스를 생성해야 한다.
        
		// list1 자료구조에 요소 추가 → add()
		list1.add("쇼생크탈출");
		list1.add("스파이더맨");
		list1.add("인셉션");

		// ArrayList 인스턴스 생성
		List<String> list2 = new ArrayList<String>(list1);

		// list2 에 요소 추가
		list2.add("어바웃타임");

		// ArrayList 인스턴스 생성
		List<String> list3 = new ArrayList<String>();

		// list3 에 list의 전체 요소 추가 → addAll()
		list3.addAll(list2);
		
		// "스파이더맨" 앞에 "레미제라블" 추가
		// ① "스파이더맨" 찾기 → indexOf() → 위치값 인덱스 반환
		int n = list3.indexOf("스파이더맨");

		// 테스트
		System.out.println(n);
		//--==>> 1

		// ② "스파이더맨" 찾은 인덱스 위치에 "레미제라블" 삽입 → add()
		list3.add(n, "레미제라블");
			
		// 출력 → 더미 데이터 확인
		System.out.println("==============================================");
	    System.out.println(list1);
		//--==>> [쇼생크탈출, 스파이더맨, 인셉션]
		System.out.println(list2);
		//--==>> [쇼생크탈출, 스파이더맨, 인셉션, 어바웃타임]
		System.out.println(list3);
		//--==>> [쇼생크탈출, 레미제라블, 스파이더맨, 인셉션, 어바웃타임]
		
		System.out.println("==============================================");
		System.out.println();

		// 출력 → listIterator() 메소드를 활용하여 출력
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//--==>> 쇼생크탈출 레미제라블 스파이더맨 인셉션 어바웃타임

		// 출력 → 역순으로 접근
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//--==>> 어바웃타임 인셉션 스파s이더맨 레미제라블 쇼생크탈출
	}
}