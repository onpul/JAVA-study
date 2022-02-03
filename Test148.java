// 2022-02-03 ��

// �� Random Ŭ����

/*
�� java.util.Random Ŭ������ 
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
   ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ���
   �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 41
// 1 2 8 36 41 42
// 4 9 11 13 22 30
// 5 10 13 15 27 6
// 22 31 32 33 40 41
// ����Ϸ���... 
//-------------------------------------------------------------------------------------------------
class Lotto
{	
	int[] lt;

	public int pickNum() // ���� �߻��� �޼ҵ�
	{
		return (int)(Math.random() * 6) + 1; // 1~45 ���� ������ ���� ����
	}

	public void setting() // �ζ� ��ȣ ������ �޼ҵ�
	{
		lt = new int[6]; // 6�� �ζ� ��ȣ �� �迭�� ����
		boolean[] picked = new boolean[45];

		for (int i=0; i<lt.length; i++) // 0  1  2  3  4  5
		{
			lt[i] = pickNum();
		}
		
		// �������� ���� (���� ����)
		for (int i=0; i<lt.length-1; i++)           // �� ���� ������     (0     1     2     3    4)
		{                                           //                       |     |     |     |    |
			for (int j=i+1; j<lt.length; j++)       // �� ��� ������      12345 2345  345   45   5
			{
				if (lt[i] > lt[j])    
				{
					// �ڸ� �ٲٱ�
					lt[i] = lt[i]^lt[j];
					lt[j] = lt[j]^lt[i];
					lt[i] = lt[i]^lt[j];
				}
			}
		}
		
	} // setting() end
	public void print()
	{
		for (int i=0; i<lt.length; i++)
		{
			System.out.print(lt[i] + " ");
		}
		System.out.println();
	}
} // Lotto end

public class Test148
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5 ����
		for (int i=1; i<=5; i++)
		{
			// �ζ� ���� ����
			lotto.pickNum();
			lotto.setting();

			// ��� ���
			lotto.print();
		}
	}
}