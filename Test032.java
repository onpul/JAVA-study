// 20220110 ��

//������
//���� ������ == ���� ������

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������... �������� ������� �Ǻ��Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է��� BufferedReader�� readLine()�� Ȱ���ϰ�
//���� �����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է� : 2000
//2000�� �� ����
//����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

//������ ���� �Է� : 2012
//2012�� �� ����
//����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

//������ ���� �Է� : 2022
//2022�� �� ���
//����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// �� 2���� 28�ϱ��� �ִ� �� �� ���
//          29�ϱ��� �ִ� �� �� ����
// �� ������ �Ǻ� ����
//    ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    400�� ����̸� ����
//    �׷��� ������ ���

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year; //�Է��� ����
		String result; //�Ǻ� ���

		System.out.print("������ ���� �Է� :");
		year = Integer.parseInt(br.readLine());
		result = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "����" : "���";

		System.out.println();
		System.out.printf("%d�� �� %s\n", year, result);
	}
}