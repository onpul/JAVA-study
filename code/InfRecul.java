// 20220113 ��
// ���޼ҵ��� ��� ȣ��
//-------------------------------------------------------------------------------------------------

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);
	}
	
	// �ڵ� ������ 2���� ��ġ �ٲٱ� 

	public static void showHi(int cnt)
	{
		// ���� �ڵ�
		/*
		System.out.println("Hi~ ");
		showHi(cnt--);
		if(cnt==1)
			return;
		*/

		// �ٲ� �ڵ�
		System.out.println("Hi~ ");
		if(cnt==1) // 2. �Լ� ��� ȣ�⺸�� ���� ���ǹ��� ����!
			return; 
		showHi(--cnt); // 1. ���� �������� �ٲ�!
	}
}