// 20220112 ��
// ������ �帧�� ��Ʈ��(���)
//----------------------------------------------------------------------
// �ݺ���(while��) �ǽ�

// �� ����
//    ����ڷκ��� ������ ������ �Է¹޾�
//    1���� �Է¹��� �� ����������
//    ��ü �հ�, ¦���� �հ�, Ȧ���� ����
//    ���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

//    ���� ��)
//    ������ ���� �Է� : 280
//    >> 1 ~ 280���� ������ �� : XXXX
//    >> 1 ~ 280���� ¦���� �� : XXXX
//    >> 1 ~ 280���� Ȧ���� �� : XXXX

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test055
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; // ����ڿ��� �Է¹��� ���� ���� ���� n 
		int a=1; // 1���� n���� ������ ��
		int tot,odd,even; // ��ü��, Ȧ����, ¦����
		tot=odd=even=0; // 0���� �ʱ�ȭ

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine()); // �Է¹��� n�� ���������� ����

		while (a<=n)
		{	
			tot+=a;
			
			if (a%2==0) //¦����
			{
				even+=a;
			}
			else if (a%2!=0) //Ȧ����
			{
				odd+=a;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}

			a++;//��ġ ����غ��� ��
		}
		System.out.printf("1 ~ %d���� ������ �� : %d%n", n, tot); // ������ ���๮�� �ݺ��� �ȿ� �θ� �갡 �ݺ����ݾ�?		
		System.out.printf("1 ~ %d���� ¦���� �� : %d%n", n, even); // ���๮�� �ݺ��� �ȿ� �θ� ���๮�� �ݺ��Ѵ�!!!
		System.out.printf("1 ~ %d���� Ȧ���� �� : %d%n", n, odd);
	}
}
// ������
/*
������ ���� �Է� : 3
1 ~ 3���� ������ �� : 6
1 ~ 3���� ¦���� �� : 2
1 ~ 3���� Ȧ���� �� : 4
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/