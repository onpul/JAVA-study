// �ڹ� �⺻ ���α׷���

// ������ �ڷ���
// �ڹ��� �⺻ ����� : BufferedReader Ŭ����

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : �ֹ���
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ====[���]====
// �̸� : �ֹ���
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args)
	{
		// ���� �� Ǯ��(������)
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String name;
		int korean, english, math, total;

		System.out.print("�̸��� �Է��ϼ���:  ");
		name = Integer.ParseInt(br.readLine());

		System.out.print("���� ���� �Է�:  ");
		korean = Integer.ParseInt(br.readLine());

		System.out.print("���� ���� �Է�:  ");
		english = Integer.ParseInt(br.readLine());

		System.out.print("���� ���� �Է�:  ");
		math = Integer.ParseInt(br.readLine());

		total = korean + english + math;

		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.println("���� : %d", total);
		*/

		// BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// BufferedReader br = new BufferedReader(new InputStreamReader(system.in));

		// �ֿ� ���� ����
		String strName; //�̸� ����
		int nKor, nEng, nMat; //����, ����, ���� ���� ����
		int nTot; //���� ����

		// ���� �� ó��
		// ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		// ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

	    // ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nKor = Integer.parseInt(br.readLine());

		// ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nEng = Integer.parseInt(br.readLine());

		// ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		nMat = Integer.ParseInt(br.readLine());

		// �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)
		// �����Ͽ� ������ �����ϰ� 
		// �� ����� ���� ������ ��Ƴ���

		nTot = nKor + nEng + nMat;



		// ��� ���
		System.out.println("\n====[���]====");
		//System.out.println("�̸� : " + strName);
		System.out.printf("�̸� : %s\n", strName);
		//System.out.println("���� : " + nTot);
		System.out.printf("���� : " + nTot);





		
		
	}
}