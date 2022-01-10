// �ڹ� �⺻ ���α׷���

// ������ �ڷ���
// �ڹ��� �⺻ �����: BufferedReader Ŭ����

// ���� ������ �Է�: XXX
// >> ���� : xxxx
// >> �ѷ� : XXXX
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Test014
{
	public static void main (String[] args) throws IOException
	{
		// Ű���� ����(����)
		// �� BufferedReader Ŭ���� ����� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//-------------------------------------
		//     ���� �Է��� �о���̴� ��ġ
	    //                                     ----------------------
		//                                      ����Ʈ �� ���� ������
		//                                                           -------------
		//                                                           ����Ʈ �Է°�
		// �ֿ� ���� ����
		int r;                      //-- ������
		final double PI = 3.141592;  //-- ������
		double a, b;                //-- ����, �ѷ�

		// ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���
		// System.out.println("���� ������ �Է� : ");   //--(X)
		System.out.print("���� ������ �Է� : ");
		
		// 2. ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
		// r = br.readLine();     //-- BufferedReader �� readLine() �� ���ڿ� ��ȯ
		// r = "80";

		// r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("80");
		// r = 80;

		// Integer.parseInt("80") �� 80
		//-- �Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		//   ��, �̶� �Ѱܹ޴� ���ڿ� �����ʹ� ���ڸ���̾�� �Ѵ�.
		//                                     (NumberFormat)

		r = Integer.parseInt(br.readLine());
		//-- ����ڰ� �Է��� ���� BufferedReader(br)�� ��readLine()��
		//   �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		//   �� ���� ��Integer.parseInt()���� ���� ������(������)���� ��ȯ�� ��
		//   ���� ������ ������ ���� r�� ��Ƴ���


		// 3. ���� �� �ѷ� ���(����)
		a = r * r * PI;
		b = r * 2 * PI;


		// ���� ��� ���
		// System.out.println(">> ���� : " + a);
		// System.out.println(">> �ѷ� : " + b);

		// �������� 45�� ���� ���̴� 6461.72�̸�,
		// �������� 45�� ���� �ѷ��� 282.74�̴�.

		System.out.printf("�������� %d�� ���� ���̴� %.2f�̸�,%n", r , a);
		System.out.printf("�������� %d�� ���� �ѷ��� %.2f�̴�.\n", r , b); 
	}
}
/*
���� ������ �Է� : 45
>> ���� : 6361.723800000001
>> �ѷ� : 282.74328
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
���� ������ �Է� : 45
�������� 45�� ���� ���̴� 6361.72�̸�,
�������� 45�� ���� �ѷ��� 282.74�̴�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/