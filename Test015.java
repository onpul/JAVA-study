// �ڹ� �⺻ ���α׷���

// ����
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ����: XXX
// ����Ϸ��� �ƹ� Ű��...

// �� ���� �ν� �� �м�
//    �ﰢ���� ���� = �غ� * ���� / 2
//    ����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// import java.io.*; // ���� �� �� ��� �̷��� �� �� ���� �׷���, ��ó�� ���� ���� �����Ѵ�. �ڹٿ��� ��ȿ������ �� �ִ�. 

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		/*
		int base; // �غ�
		int height; // ����
		double area; // ����
		*/

		// �ֿ� ���� ���� (���� Ǯ��)
		int underLength, height;
		double area;
		
		// ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���
		//System Ŭ���� �ȿ��� out�� ��������?
	
		/*
		System.out.print("- �ﰢ���� �غ� �Է� : "); // ����ڿ��� �ȳ� �޼��� ���
		base = Integer.parseInt(br.readLine()); // ����ڰ� �Է��� ���� ���ڿ� ���·� �о���� -> ������(������)���� ��ȯ -> ���� ������ ������ ��Ƴ���

		System.out.print("- �ﰢ���� ���� �Է� : ");
		height = Integer.parseInt(br.readLine());
		
		area = base * height / 2;

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ����: %.2f\n", base, height, area);
		*/

		/*
		- �ﰢ���� �غ� �Է� : 5
		- �ﰢ���� ���� �Է� : 2
		>> �غ��� 5, ���̰� 2�� �ﰢ���� ����: 5.00
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		// 1. ����ڿ��� �ȳ� �޼��� ��� (���� Ǯ��)
		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.print("- �ﰢ���� �غ� �Է�: ");

		// 2. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ����  underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());

		// 3. �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print(" �ﰢ���� ���� �Է� : ");

		// 4. ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		// 5. �ﰢ���� ���� ���ϴ� ���� ó��
		// �ﰢ���� ���� = �غ� * ���� / 2
		area = underLength * height / 2.0;
		//       ������      ������   (2)������ �� ���� ��� ���� (��, ���� ���ϰ� ������ ����)
		//       ������      ������   (2.0)�Ǽ��� �� �Ǽ� ��� ����

		// �Ǽ� ����� ���� ����
		//area = (double)underLength * height / 2; //--(x)
		//area = (double)underLength * height / 2; 
		//area = underLength * (height) / 2;
		//area = underLength * height / 2.0;
		
		// �� �Ǽ� �ڷ����� ��������� ������ ��������
		//    �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//    ������ ��2���� �ƴ�. �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//    �� ������ �Ǽ� ������� ó���ȴ�.

		// ��� ���
		System.out.println(); // ����

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ����: %.2f\n", underLength, height, area);


		
	}
}

// ���� ���
/*
�� �ﰢ���� ���� ���ϱ� ��
- �ﰢ���� �غ� �Է�: 23
 �ﰢ���� ���� �Է� : 15

>> �غ��� 23, ���̰� 15�� �ﰢ���� ����: 172.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/