// 20220110 ��

// ���� �帧�� ��Ʈ��(���)
// if ��
// if ~ else�� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//    �б� ������ ���ϱ� ���� ����ϴ� �������
//    if��, if~else��, ���� ������, ����if��(if�� ��ø),
//    switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���,
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// �� ������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
//    ��, ���� if ������ ����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n; // �Է� ���� ���� ���� ����

		// 1. ����ڷκ��� ������ �Է¹޴´�
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		// 2. if ��
		if(n % 2 == 0)
			System.out.printf("¦��\n");
		if(n % 2 != 0)
			System.out.printf("Ȧ��\n");
	}
}
//���� ���
/*
������ ���� �Է� : 14
¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
