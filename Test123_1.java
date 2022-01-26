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
		// ��ĳ�� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		// Record Ŭ������ ������� ������ �ν��Ͻ��� ���� �� �ִ� �迭���� 
		// �Է¹��� inwon��ŭ ����
		rec = new Record[inwon];
		// Record Ŭ������ �ν��Ͻ��� ������ �� �ƴ�!
	}

	@Override
	public void input() //-- ������ �Է�
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			// Record Ŭ���� ����� �ν��Ͻ� ����
			rec[i] = new Record();

			// �й� �̸� �Է¹ޱ�
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			// ����, ����, ���� ���� �Է¹ޱ�
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			// ���� ������ ���ϱ�
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			// ��� ���ϱ�
			rec[i].avg = rec[i].tot / 3;
		}
	}

	@Override
	public void print() //-- ��� ���
	{
		for (int i=0; i<inwon; i++)
		{
			System.out.printf(" %-8s %-3s %3d %3d %3d %3d %3d%n"
			, rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%19s %2s %2s%n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}

    // ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		int s = score;
		String grade;

		switch (s/10)
		{
			case 10 : case 9 : grade = "��"; break;
			case 8 : grade = "��"; break;
			case 7 : grade = "��"; break;
			case 6 : grade = "��"; break;
			default : grade = "��"; 
		}
		return grade;
	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123_1
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();
		
		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob.set();
		ob.input();
		ob.print();
	}
}
//-------------------------------------------------------------------------------------------------