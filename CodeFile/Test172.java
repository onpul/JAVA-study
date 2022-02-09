// 2022-02-08 화

// ▶ 컬렉션 프레임워크(Collection Framework)

// Map → Hashtable, HashMap
// - java.util.Map 인터페이스는
//   키(key)를 값(value)에 매핑(mapping)하며
//   동일한 키를 등록할 수 없고, 유일해야 하며,
//   각 키는 한 개의 값만을 매핑해야 한다.
//   즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.

/*
○ Hashtable<K, V> 클래스
   
   - 해시테이블 구조를 객체 모델링한 클래스로
     검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

   - 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
     구분된 데이터 구조이다.

   - 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며
     이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

   - 또한, Hashtable 클래스는 key 또는 value의 값으로 null을 허용하지 않는다.
*/
//-------------------------------------------------------------------------------------------------
import java.util.Hashtable;

public class Test172
{
	private static final String[] names
		= {"이연주", "이호석", "김태형", "김민성", "최문정", "이시우"};

	private static final String[] tels
		= {"010-4423-0463", "010-9600-1715", "010-9768-3110", "010-5154-6322", "010-2877-0992", "010-4428-9420"};
	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>(); // key, value 두 개가 들어가는 제네릭 표현식

		// ht 라는 Hashtable 자료구조에 배열(names, tels)에 담겨있는
		// 데이터를 요소로 담아내기
		// → put(k, v);
		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}
		
		// ht 라는 Hashtable 의 값을... key 를 이용하여 검색
		// → get(k)
		String findName1 = "김태형";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " 전화번호 : " + str);
		}
		System.out.println();
		//--==>> 김태형 전화번호 : 010-9768-3110

		// ht 라는 Hashtable 자료구조에... key가 존재하는지의 여부 확인
		// → containskey()
		String findName2 = "이아린";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>> 이아린 데이터가 존재하지 않습니다.

		String findName3 = "최문정";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>> 최문정 데이터가 존재합니다.

		// ht 라는 Hashtable 자료구조에... value가 존재하는지 여부 확인
		// → contains()
		String findTel1 = "010-4428-9420";
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>> 010-4428-9420 데이터가 존재합니다.

		// ht 라는 Hashtable 자료구조에서 『김민성』 데이터 삭제
		// → remove()
		ht.remove("김민성");
		//-- 『remove()』 메소드는 인자값으로 key를 넘겨받지만
		//    이 때, key만 삭제되는 것이 아니다.
		//    해당 key와 연결되어(매핑되어)있는 value도 함께 remove() 된다.

		// 삭제(remove()) 이후 key가 존재하는지 확인
		if (ht.containsKey("김민성"))
		{
			System.out.println("민성이가 존재합니다.");
		}
		else
		{
			System.out.println("민성이 어디갔어!!?!?!?");
		}
		System.out.println();
		//--==>> 민성이 어디갔어!!?!?!?

		// 삭제(remove()) 이후 value가 존재하는지 확인
		if (ht.contains("010-5154-6322"))
		{
			System.out.println("010-5154-6322 데이터가 존재합니다.");
		}
		else
		{
			System.out.println("010-5154-6322 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>> 010-5154-6322 데이터가 존재하지 않습니다.
		
		// ※ null 관련 처리------------------------------------------------------------------------
		//ht.put(null, null);            //-- key, value 모두 null → 런타임 에러
		//--==>> 에러 발생(런타임 에러)
		//       NullPointerException

		//ht.put("홍은혜", null);        //-- value가 null         → 런타임 에러
		//--==>> 에러 발생(런타임 에러)
		//       NullPointerException

		//ht.put(null, "010-1234-2345"); //-- key가 null           → 런타임 에러
		//--==>> 에러 발생(런타임 에러)
		//       NullPointerException
		
		// null은 아예 요소로 품을 수 없다!

		// 중복된 key 입력
		ht.put("이연주", "010-1111-1111");
		
		System.out.println(ht.get("이연주"));
		System.out.println();
		//--==>> 010-1111-1111
		//-- 기존 "010-4423-0463" 에서 "010-1111-1111"로 변경되었음을 확인
		//   (덮어쓰기 개념)

		// 중복된 value 입력
		ht.put("양윤정", "010-2877-0992");
		
		System.out.println(ht.get("최문정"));
		System.out.println(ht.get("양윤정"));
		System.out.println();
		//--==>> 010-2877-0992
		//       010-2877-0992

		// ※ value는 중복된 값이 입력되어도 기존 데이터에 아무런 영향을 미치지 않음.
	}
}