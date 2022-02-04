// 2022-02-04 금

// ▶ 예외 처리

// Test153.java 파일과 비교~!!!
//-------------------------------------------------------------------------------------------------

class Demo
{
	private int value; // 전역 변수 -> 자동으로 0으로 초기화

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;               //-- 종료 → 메소드 종료
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test152
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}