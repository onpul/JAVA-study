// 2022-02-04 ��

// �� ���� ó��

// Test153.java ���ϰ� ��~!!!
//-------------------------------------------------------------------------------------------------

class Demo
{
	private int value; // ���� ���� -> �ڵ����� 0���� �ʱ�ȭ

	public void setValue(int value)
	{
		if (value <= 0)
		{
			return;               //-- ���� �� �޼ҵ� ����
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