// 20221011

// ������ �帧�� ��Ʈ��(���)

// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// ��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� 5�� �Է�(���� ����): 1 2 3 4 5

// >> ¦���� ���� 6�̰�, Ȧ���� ���� 9�Դϴ�.

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args)
	{
		//���� ����
		Scanner sc = new Scanner(System.in);

		int evenSum = 0; // ¦�� ��
		int oddSum = 0; // Ȧ�� ��
        int num1, num2, num3, num4, num5; // �Է¹��� �ټ� �� ���� ��

		//���� �� ó��
		System.out.print("������ ���� 5�� �Է�: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1%2==0)       // num1�� ¦���� �� -> ***evenSum�� num1��ŭ ����*** 
			evenSum += num1; // <-- ���߿��: *������ ����� �� ���� �ʱⰪ�� 0���� ����*
		else                 // Ȧ���� �� -> oddSum�� num1��ŭ ����
			oddSum += num1;
		if (num2%2==0)
			evenSum += num2;
		else
			oddSum += num2;
		if (num3%2==0)
			evenSum += num3;
		else
			oddSum += num3;
		if (num4%2==0)
			evenSum += num4;
		else
			oddSum += num4;
		if (num5%2==0)
			evenSum += num5;
		else
			oddSum += num5;
		
		//��� ���
		System.out.println();
		System.out.printf("¦���� ���� %d�̰�, Ȧ���� ���� %d�Դϴ�.%n", evenSum, oddSum);
	}
}
//���� ���
/*
������ ���� 5�� �Է�: 1 2 3 4 5

¦���� ���� 6�̰�, Ȧ���� ���� 9�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/