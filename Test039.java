// 20220110 ��

//// ���� �帧�� ��Ʈ��(���)
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

		int n1, n2, n3;

		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n3 = Integer.parseInt(br.readLine());

		if (n1<=n2 && n2<=n3)
			System.out.printf("���� ��� : %d, %d, %d", n1, n2, n3);
		else if (n2<=n3 && n3<=n1)
			System.out.printf("���� ��� : %d, %d, %d", n2, n3, n1);
		else if (n3<=n1 && n1<=n2)
			System.out.printf("���� ��� : %d, %d, %d", n3, n1, n2);
		else
			System.out.printf("�� �� ����");
	}
}

//���� ���
/*
ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 1
�� ��° ���� �Է� : 2
���� ��� : 1, 1, 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/