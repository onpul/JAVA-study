// ������
// ���� ������ == ���� ������

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader�� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// ������ ���� �Է� : 257
// 257 �� ���
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// ������ ���� �Է� : 0
// 0 �� ��
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// Hint : ���ǿ����� ��ø

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; // ����ڷκ��� �Է¹��� ������ ������ ��Ƶ� ����
		String strResult; // �������� ��������� ���� �Ǻ� ����� ��� �� ����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n<0) ? "����" : (n>0) ? "���" : "��";
		// 1. (���ǽ�) ? 2. �� : 3. (���ǽ�) ? �� : ���� 

		// ���� ��� ���
		System.out.println();
		System.out.printf("%d �� %s\n", n, strResult);

	}
}

// ���� ���
/*
������ ���� �Է� : -222

-222 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/