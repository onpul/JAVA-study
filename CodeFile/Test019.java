// �ڹ� �⺻ ���α׷���
// �ڹ��� �⺻ �����: java.util.Scanner

// �� java.util.Scanner
//    �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//    ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//    �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
//    �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test019
{
	public static void main(String[] args) // throws IOException
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in); 
		
		// �ֿ� ���� ����
		String name; // �̸�
		int kor, eng, mat; // ����, ����, ����

		// ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next(); 
		
		System.out.print("���� ���� �Է� : ");
		// Kor = Integer.parseInt(sc.next()); - �̷��� �� �ᵵ ��
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		// ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + (kor+eng+mat));


	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : �ֹ���
���� ���� �Է� : 80
���� ���� �Է� : 90
���� ���� �Է� : 100

>> �̸� : �ֹ���
>> ���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/