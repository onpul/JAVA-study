// 2022-02-03 ��

// �� Calendar Ŭ����

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �ʱ�����
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GragorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance()��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� �����ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.
*/		

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
//    ��getActualMaximum()�� �޼ҵ� Ȱ��

//    ���� ��)
//    ���� �Է� : 0
//    ���� �Է� : 2022
//    �� �Է�   : -1
//    �� �Է�   : 16
//    �� �Է�   : 7
/*
	   [ 2022�� 7�� ]

  ��  ��  ȭ  ��  ��  ��  ��
============================
					   1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
============================
����Ϸ���....
*/
//-------------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		// ���� Ǯ��

		// BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ� ���� ����
		int y, m;   //-- ��, ��
		int w;      //-- ����
		int i;      //-- ���� ����

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		cal.set(y, m-1, 1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.

		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		// Ȯ��
		//System.out.println(w);
		//--==>>���� �Է� : 2022
		//      �� �Է�   : 6
		//      4 �� 2022�� 6�� ���� �� ������ �� 2022�� 6�� 1�� �� ������

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t[ " + y + "�� " + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		for (i=1; i<w; i++)
		{
			System.out.print("    "); // ���� 4ĭ �߻�
		}
		// �׽�Ʈ
		//System.out.printf("%4d", 1);

		// Calendar Ŭ���� ��getActualMaximum()�� �޼ҵ� check~!!!
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++) // ��¥�� ���� �ִ밪 ���
		{
			System.out.printf("%4d", i);
			w++;             //-- �ݺ����� �����ϸ� ��¥�� ������ ������ 
			                 //   ���ϵ� �Բ� ������ �� �ֵ��� ó��
			if (w%7==1)      //-- ������ ������ �Ͽ����� �� ������
			{                
				System.out.println(); // ���� �� ��µ� �� �ֵ��� ó��
			}
		}
		
		if (w%7!=1)          //-- �Ͽ��� ������ ������� �ʾ��� ��츸
		{                    //-- ����
			System.out.println();
		}

		System.out.println("============================");



		// �� Ǯ��---------------------------------------------------------------------------------
		/*
		// ���� ����
		int y; // �Է¹��� ����
		int m; // �Է¹��� ��
        
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� �Է�(1 �̻�)
		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		// �� �Է�(1~12)
		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// Calendar �ν��Ͻ� ����
		Calendar ca = new GregorianCalendar();
		
		// �޷��� ��¥ ����
		ca.set(y, m-1, 1); // ���� -1

		int dayOfWeek = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek); // �׽�Ʈ
		//int maxDays = ca.getActualMaximum(Calendar.DAY_OF_MONTH);
		// DAY_OF_MONTH�� DATE�� ���Ǿ (api���� ��)
		int maxDays = ca.getActualMaximum(Calendar.DATE);
		System.out.println(maxDays); // �׽�Ʈ
		
		// ���
		System.out.printf("	[ %d�� %d�� ]%n%n", y, m);
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");

		// �޷� ���
		for (int i=1; i<dayOfWeek; i++)
		{
			System.out.print("    "); // ���� ���ϱ��� ���� 4��
		} 

		int tmp = dayOfWeek; // �ӽ� ������ ���� ���� ���� �ֱ�
		for (int i=1; i<=maxDays; i++) // 1���� �� ������ ������ ���
		{
			System.out.printf("%4d", i);

			if (tmp%7==0) // ������̸� ����
			{
				System.out.println();
			}
			tmp++; // ������ �� 1up
		}

		System.out.println("\n============================");	
		*/
	}
}
//-------------------------------------------------------------------------------------------------
// ���� ���
/*
���� �Է� : 2022
�� �Է�   : 4

        [ 2022�� 4�� ]

  ��  ��  ȭ  ��  ��  ��  ��
============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/