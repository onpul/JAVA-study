// 2022-02-04 ��

// �� ���� ó��

// Test152.java ���ϰ� ��~!!!

// �� throw            cf) throws    // 's' ����

// throws -> ���� ���� ��
// throw -> ���� �߻���ų ��
//-------------------------------------------------------------------------------------------------

class Demo
{
	private int value; // ���� ���� -> �ڵ����� 0���� �ʱ�ȭ

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{
			//return;               
			throw new Exception("value�� 0���� �۰ų� ���� �� �����ϴ�."); // ���ܵ� ��ü��, ��ü ����ڴ�.
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
		//--==>> java.lang.Exception: value�� 0���� �۰ų� ���� �� �����ϴ�.
	}
}