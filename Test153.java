// 2022-02-04 금

// ▶ 예외 처리

// Test152.java 파일과 비교~!!!

// ※ throw            cf) throws    // 's' 주의

// throws -> 예외 던질 때
// throw -> 예외 발생시킬 때
//-------------------------------------------------------------------------------------------------

class Demo
{
	private int value; // 전역 변수 -> 자동으로 0으로 초기화

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{
			//return;               
			throw new Exception("value는 0보다 작거나 같을 수 없습니다."); // 예외도 객체다, 객체 만들겠다.
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test153
{
	public static void main(String[] args) // throws Exception
	{
		Demo ob = new Demo();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		//--==>> java.lang.Exception: value는 0보다 작거나 같을 수 없습니다.
	}
}