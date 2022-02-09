// 2022-02-04 금

// ▶ 예외 처리

// 다른 예외 다시 던지기
//-------------------------------------------------------------------------------------------------
public class Test155
{
	public int getValue(int value) throws Exception        // ⑦ 예외 던지기
	{                                                      //    파란 폭탄
		int a = 0;
		
		try
		{
			a = getData(-2);                               // ③ 예외 발생
                                                           //    빨간 폭탄
		}
		catch (Exception e)                                // ④ 예외 잡아내기
		{                                                  //    빨간 폭탄
			// ⑤ 예외 처리 (빨간 폭탄)
			System.out.println("printStackTrace... ...");
			e.printStackTrace();

			// ⑥ 예외 발생 (파란 폭탄)
			throw new Exception("value가 음수입니다.");
			
		}

		return a;
	}

	public int getData(int data) throws Exception          // ② 예외 던지기
	{                                                      //    빨간 폭탄
		if (data < 0)
		{
			throw new Exception("data가 0보다 작습니다."); // ① 예외 발생
			                                               //    빨간 폭탄
		}

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test155 ob = new Test155();	
		
		try
		{	
			int a = ob.getValue(-2);                       // ⑧ 예외 발생
														   //    파란 폭탄
            System.out.println("a: " + a);                 
		}
		catch (Exception e)                                // ⑨ 예외 잡아내기
		{                                                  //    파란 폭탄
			// ⑩ 예외 처리 (파란 폭탄)
			System.out.println("printStackTrace... ...");
			e.printStackTrace();
		}
	}
}
// 실행 결과
/*
printStackTrace... ...
java.lang.Exception: data가 0보다 작습니다.
        at Test155.getData(Test155.java:36)
        at Test155.getValue(Test155.java:15)
        at Test155.main(Test155.java:49)
printStackTrace... ...
java.lang.Exception: value가 음수입니다.
        at Test155.getValue(Test155.java:25)
        at Test155.main(Test155.java:49)
계속하려면 아무 키나 누르십시오 . . .
*/