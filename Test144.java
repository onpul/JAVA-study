// 2022-02-03 ��

// �� Calendar Ŭ����

/*
�� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ��� Ŭ����)

   Calendar ob = new Calendar();
   �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�.

�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���.
   
   1. Calendar ob1 = Calendar.getInstance(); // ���� �޼ҵ�, ����ƽ

   2. Calendar ob2 = new GregorianCalendar(); // 1. GregorianCalendar Ŭ������ �ְڱ���
                                              // 2. Calendar Ŭ������ ���� Ŭ�����̰ڱ���(���)
											  // 3. �߻�޼ҵ带 �ϼ��ؼ� �߻� ����ǥ�� �����ڱ���
											  // 4. ��ĳ�����̰ڱ���!
   
   3. GragorianCalendar ob3 = GregorianCalendar();

   (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
*/											
//-------------------------------------------------------------------------------------------------

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test144
{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar ob = new Calendar(); // �� �ȴ�
		Calendar rightNow = Calendar.getInstance();
		
		// Calendar Ŭ������ util ��Ű���� -> import ���� �ʿ�
		
		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��
		// ���� ������ �� �� �޼ҵ�

		int y = rightNow.get(Calendar.YEAR); // YEAR�� final�̱���, static�̱���(�빮��)
		                                     // static�̱���(.~)
		System.out.println(y);
		//--==>> 2022
			
		int m = rightNow.get(Calendar.MONTH)+1; // ������ �� +1, ������� �� -1 �ؾ� ��
		                                        // �迭 �ε��� ���·� ó���Ǵ±���!
												//-- ��+1�� check~!!!
		System.out.println(m);
        //--==>> 2

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>> 3

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>> 5    //--> �����

		// �׽�Ʈ
		/*
		System.out.println(Calendar.SUNDAY);      //--==>> 1 �� �Ͽ���
		System.out.println(Calendar.MONDAY);      //--==>> 2 �� ������
		System.out.println(Calendar.TUESDAY);     //--==>> 3 �� ȭ����
		System.out.println(Calendar.WEDNESDAY);   //--==>> 4 �� ������ 
		System.out.println(Calendar.THURSDAY);    //--==>> 5 �� ����� 
		System.out.println(Calendar.FRIDAY);      //--==>> 6 �� �ݿ���
		System.out.println(Calendar.SATURDAY);    //--==>> 7 �� �����
		*/
		
		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2022-2-3 5
		
		String week = "";
		switch (w)
		{
			/*
			case Calendar.SUNDAY: week = "�Ͽ���"; break;
			case Calendar.MONDAY: week = "������"; break;
			case Calendar.TUESDAY: week = "ȭ����"; break;
			case Calendar.WEDNESDAY: week = "������"; break;
			case Calendar.THURSDAY: week = "�����"; break;
			case Calendar.FRIDAY: week = "�ݿ���"; break;
			case Calendar.SATURDAY: week = "�����"; break;
			*/

			case 1: week = "�Ͽ���"; break;
			case 2: week = "������"; break;
			case 3: week = "ȭ����"; break;
			case 4: week = "������"; break;
			case 5: week = "�����"; break;
			case 6: week = "�ݿ���"; break;
			case 7: week = "�����"; break;
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2022-2-3 �����
		
		
		System.out.println("////////////////////////////////////////////////////////////////////");

		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar(); // import ���� �ʿ�

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2022, 5, 20); // 6�� -- ��-1�� check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> ������
		
	}
}