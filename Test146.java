// 2022-02-03 ��

// �� Calendar Ŭ����

// �� �ǽ� ����
//    ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//    Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
//       �� ����ü.add(Calendar.DATE, �� ��);��

// ���� ��)
// ���� ��¥ : 2022-2-3 �����
// ��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ==========[Ȯ�� ���]==========
// 200�� �� : xxxx-xx-xx x����
// ===============================

// ����Ϸ��� ...
//-------------------------------------------------------------------------------------------------
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test146
{
	public static void main(String[] args)
	{
		// ���� Ǯ��

		// Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;
		int y,m,d,w;
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;  // ��+1�� check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// ������ ��, ��, ��, ���� Ȯ�� ��� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week[w-1] + "����");

		do
		{
			System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		// check~!!!
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println();
		System.out.println("==========[Ȯ�� ���]==========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now); // check~!!!
		System.out.println("===============================");

		// �� Ǯ��
		/*
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);

		String week = "";
		switch (w)
		{
			case 1: week = "�Ͽ���"; break;
			case 2: week = "������"; break;
			case 3: week = "ȭ����"; break;
			case 4: week = "������"; break;
			case 5: week = "�����"; break;
			case 6: week = "�ݿ���"; break;
			case 7: week = "�����"; break;
		}

		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + " " + week);

		Scanner sc = new Scanner(System.in);
		System.out.print("��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		int after = sc.nextInt();
		
		cal.add(Calendar.DATE, after);
		int afterY = cal.get(Calendar.YEAR);
		int afterM = cal.get(Calendar.MONTH)+1;
		int afterD = cal.get(Calendar.DATE);
		int afterW = cal.get(Calendar.DAY_OF_WEEK);
		
		String afterweek = "";
		switch (afterW)
		{
			case 1: afterweek = "�Ͽ���"; break;
			case 2: afterweek = "������"; break;
			case 3: afterweek = "ȭ����"; break;
			case 4: afterweek = "������"; break;
			case 5: afterweek = "�����"; break;
			case 6: afterweek = "�ݿ���"; break;
			case 7: afterweek = "�����"; break;
		}
		
		System.out.println("\n==========[Ȯ�� ���]==========");
		System.out.printf("%d�� �� : %d-%d-%d %s%n", after, afterY, afterM, afterD, afterweek);
		System.out.println("===============================");
		*/
	}
}
//-------------------------------------------------------------------------------------------------
// ���� ���
/*
���� ��¥ : 2022-2-3 �����
��ĥ ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

==========[Ȯ�� ���]==========
200�� �� : 2022-08-22 ������
===============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/