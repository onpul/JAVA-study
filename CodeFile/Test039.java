// 20220110 ��

// ���� �帧�� ��Ʈ��(���)
// if ��
// if ~ else�� �ǽ�

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 7
// �� ��° ���� �Է� : 70
// �� ��° ���� �Է� : 42

// >> ���� ��� : 7 42 70
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// 1. ù ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�
// 2. ù ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�
// 3. �� ��° ���� vs �� ��° ���� ũ�� �� �� �ڸ� �ٲ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------------------------------------------
		/*
		int n1, n2, n3;
		String result;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n3 = Integer.parseInt(br.readLine());
		*/
		//------------------------------------------------------------------------
		/*
		if (n1<=n2 && n2<=n3)
			System.out.printf("���� ��� : %d, %d, %d", n1, n2, n3);
		else if (n2<=n3 && n3<=n1)
			System.out.printf("���� ��� : %d, %d, %d", n2, n3, n1);
		else if (n3<=n1 && n1<=n2)
			System.out.printf("���� ��� : %d, %d, %d", n3, n1, n2);
		else
			System.out.printf("�� �� ����");
		*/
		//------------------------------------------------------------------------
		/*
		if (n1 <= n2) //n1<n2
		{
			if (n1 <= n3) //n1<n3
			{
				if (n2 <= n3) //n2<n3
				{
					System.out.printf("���� ��� : %d, %d, %d", n1, n2, n3);
				}
				else if (n2 > n3) //n3<n2
				{
					System.out.printf("���� ��� : %d, %d, %d", n1, n3, n2);
				}
			}
			// n1 < n2
			else if (n1 > n3) // n3 < n1
			{
				if (n2 > n3) // n3 < n1 < n2
 				{
					System.out.printf("���� ��� : %d, %d, %d", n3, n1, n2);
				}
			}
		}
		else if (n1 > n2) // n2 < n1
		{
			if (n1 <= n3) // n1 < n3
			{
				if (n2 <= n3) // n2 < n3
				{
					System.out.printf("���� ��� : %d, %d, %d", n2, n1, n3);
				}
			}
			else if (n1 > n3) // n3 < n1
			{
				if (n2 > n3) // n3 n2 n1
 				{
					System.out.printf("���� ��� : %d, %d, %d", n3, n2, n1);
				}
			}
		}
		else if (n2 > n3 && n3 > n1)
		{
			System.out.printf("���� ��� : %d, %d, %d", n2, n3, n1);
		}
		else
			System.out.printf("����");
		*/
		//------------------------------------------------------------------------
		// ���� Ǯ��
		// 1. ù ��° ����(a) vs �� ��° ����(b) ũ���
		//    ù ��° ����(a)�� �� ��° ����(b)���� Ŭ ��� �ڸ��ٲ�
		// 2. ù ��° ����(a) vs �� ��° ����(c) ũ�� ��
		//    ù ��° ����(a)�� �� ��° ����(c)���� Ŭ ��� �ڸ��ٲ�
		// 3. �� ��° ����(b) vs �� ��° ����(c) ũ�� ��
		//    �� ��° ����(b)��  �� ��° ����(c)���� Ŭ ��� �ڸ��ٲ�
		//------------------------------------------------------------------------
		int a, b, c;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		
		// ** �ϳ��� ó���� �Ŀ��� �� ������ Ȯ���ؾ� �ϴϱ� ���������� �� �� - ���� if������ ó��

		if (a>b) // ù ��° ����(a)�� �� ��° ����(b)���� Ŭ ���
		{
			// �ڸ��ٲ�(a�� b) / Test026 ����
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a>c) // ù ��° ����(a)�� �� ��° ����(c)���� Ŭ ���
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c) // �� ��° ����(b)��  �� ��° ����(c)���� Ŭ ��� �ڸ��ٲ�
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}

		// ���� ��� ���
		System.out.printf("\n>> ���� ��� : %d, %d, %d\n", a, b, c);
	}
}

//���� ���
/*
ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 5
�� ��° ���� �Է� : 6

>> ���� ��� : 1, 5, 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/