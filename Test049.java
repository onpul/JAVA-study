// 20221011

// ������ �帧�� ��Ʈ��(���)

// �ݺ���(while��) �ǽ�

// ���� ��)
// 1���� 100���� ������ �� : 5050
// 1���� 100���� ¦���� �� : 2550
// 1���� 100���� Ȧ���� �� : 2500
// ����Ϸ��� . . .

public class Test049
{
	public static void main(String[] args)
	{
		// �� Ǯ��
		/*
		int n=1;
		int sum=0, oddsum=0, evensum=0; // ������, Ȧ����, ¦����

		while (n<=100)
		{
			if (n%2==0)
			{
				evensum+=n;
			}
			else if (n%2!=0)
			{
				oddsum+=n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return; // �޼ҵ� ���� --> main()�޼ҵ� ���� --> ���α׷� ���� 
			}
			sum+=n;
			n++;
		}
		System.out.println("������ ��: " + sum);
		System.out.println("¦���� ��: " + evensum);
		System.out.println("Ȧ���� ��: " + oddsum);
		*/

		// ���� Ǯ��
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n=1, sum, even, odd;
		sum=even=odd=0;

		// ���� �� ó��
		while (n<=100)
		{
			sum += n;

			if (n%2==0)
			{
				even += n;
			}
			else if (n%2!=0)
			{
				odd += n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			n++;
		}
		System.out.println("������ ��: " + sum);
		System.out.println("¦���� ��: " + even);
		System.out.println("Ȧ���� ��: " + odd);
	}
}