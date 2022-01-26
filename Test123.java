// 20220126 ��

// �� Ŭ���� ���

// �������̽�(Interface)

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2290847 �ֹ���
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2280946 ȫ����   90 100  85   xxx   xx
//                  ��  ��  ��
// 2290847 �ֹ���   85  70  65   xxx   xx
//                  ��  ��  ��

// ����Ϸ��� . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;   //-- �й�, �̸�
	int kor, eng, mat;  //-- ����, ����, ���� ����
	int tot, avg;       //-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();     //-- �ο� ����
	public void input();   //-- ������ �Է�
	public void print();   //-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec; // Record�� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭 ����

	@Override
	public void set() //-- �ο� ����
	{
		Scanner sc = new Scanner(System.in);

		// �ο� �Է� �ޱ�
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);
		
		// Record Ŭ������ ������� ������ �ν��Ͻ��� ���� �� �ִ� �迭���� inwon��ŭ ����
		rec = new Record[inwon];
	}

	@Override
	public void input() //-- ������ �Է�
	{
		Scanner sc = new Scanner(System.in);
	
		for (int i=0; i<inwon; i++)
		{
			// Record Ŭ���� ����� �ν��Ͻ� ����
			rec[i] = new Record();
			
			// �й� �̸� �Է�
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();
			
			// ���� �Է�
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			// ���� ������
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;

			// ���
			rec[i].avg = rec[i].tot / 3;
		}
	}

	@Override
	public void print() //-- ��� ���
	{
		for (int i=0; i<rec.length; i++)
		{
			System.out.printf("%s %s   %d %d  %d   %d   %d%n"
			, rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("                 %s  %s  %s%n", panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		}	
	}

    // ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		String result = "���� �Ұ�";

		int s = score;

		if (s>=90)
		{
			result = "��";
		}
		else if (s>=80)
		{
			result = "��";
		}	
		else if (s>=70)
		{
			result = "��";
		}
		else if (s>=60)
		{
			result = "��";
		}
		else 
			result = "��";

		return result;
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args)
	{
		Sungjuk ob;
		ob = new SungjukImpl();
		
		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob.set();
		ob.input();
		ob.print();
	}
}
//-------------------------------------------------------------------------------------------------
