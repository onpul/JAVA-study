// 20220124 ��

// �� ����(Sort) �˰���
//-------------------------------------------------------------------------------------------------
// �� ����
//    ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
//    ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1, ���� ����) : �̾Ƹ� 90
// �̸� ���� �Է�(2, ���� ����) : ������ 80
// �̸� ���� �Է�(3, ���� ����) : ������ 85
// �̸� ���� �Է�(4, ���� ����) : ������ 75
// �̸� ���� �Է�(5, ���� ����) : ��μ� 95

/*
------------------
1�� ��μ� 95
2�� �̾Ƹ� 90
3�� ������ 85
4�� ������ 80
5�� ������ 75
------------------
����Ϸ��� . . .
*/
//-------------------------------------------------------------------------------------------------

import java.util.Scanner;

class Data // �����͸� ���� Ŭ����
{
	// ���� ����
	String name; // �̸�
	int score; // ����
}

class Setting // ��� ������ ó���� �̷���� Ŭ����
{
	// �ֿ� ����
	int inwon;
	Data[][] arr; // ������ Ÿ���� �迭 arr ���� -> 2���� �迭�� �غ���

	public void input() 
	{
		// �ο� �� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է� : ");
		inwon = sc.nextInt();

		arr = new Data[inwon][2]; // ������ Ÿ���� �迭 arr
		                          // ���� [inwon]��ŭ ���� �̸�, ���� ���� [2]ĭ
	}

	public void info()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			arr[i] = new Data();

			System.out.printf("�̸� ���� �Է�(%d, ���� ����) : ", (i+1));
			arr[i][1].name = sc.next();
			arr[i][2].score = sc.nextInt();
		}
	}

	public void print()
	{
		System.out.println("------------------");
		
		boolean swap = false; // ���� ����
		String temp;
		

		for (int i=1; i<arr.length; i++)           
		{
			
		
		}

		// ���
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d�� %s %d%n", (i+1), arr[i].name, arr[i].score);
		}

		System.out.println("------------------");
	}
}

public class Test112_1
{
	public static void main(String[] args) 
	{	
		// Setting Ŭ���� �ν��Ͻ� ����
		Setting set = new Setting();

		set.input();
		set.info();
		set.print();
	}
}