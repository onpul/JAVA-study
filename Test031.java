// ������

// ����ڷκ��� ������ ���ڸ� �ϳ� �Է¹޾�
// �빮���̸� �ҹ��ڷ�, �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ����ϴ�
// ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// �� ���� �Է� : b
// b �� B
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

// �� ���� �Է� : 7
// 7 �� 7
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ��
		/*
		// �ֿ� ���� ����
		char temp; // ����ڷκ��� �Է¹��� ������ ���ڸ� ��Ƶ� ����
		char res;

		// ���� �� ó��
		System.out.print("�� ���� �Է� : ");
		temp = (char)System.in.read();

		int i = temp; // ����ڿ��� ���� ���� �� ���� �����ϱ�

		// �Է� ��⿭�� �����ִ� ��\r���� ��\n���� ��ŵ(�ǳʶٱ�)
		System.in.skip(2);
		// �Ű�����(2)�� ���� �� ���ڸ� ���� �ʰ� �ǳ� �ڴ�. (������.)

        // 1.�빮���̸� �ҹ��ڷ�
		// 2.�ҹ����̸� �빮�ڷ�
		// 3.���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ���
		// 1. (���ǽ�) ? 2. �� : 3. (���ǽ�) ? �� : ���� 
		// �빮���̸� ? �ҹ��ڷ� ��ȯ : �ҹ����̸� ? �빮�ڷ� ��ȯ : ���� �״�� ���
		// c�� �ƽ�Ű �ڵ尡 65~90�̸� ? 32�� ���� : 97~122�̸� ? 32�� �� : ���� �״�� ��� 
		res = (65<=temp)&&(temp<=90) ? temp+=32 : (97<=temp)&&(temp<=122) ? temp-=32 : temp; 
		// temp ���� �ٲ�ϱ�... ���� �� ��� ��������??? --> int i�� temp ���� ������ ����!

		// ���� ��� ���
		System.out.println();
		System.out.printf("%c �� %c\n", i, res);
		*/

		// ���� Ǯ��

		//int temp;
		//char temp;

		//System.out.print("�� ���� �Է� : ");
		//temp = (char)System.in.read(); //int������ �޾ƿ��ϱ� char�� ���� ����ȯ

		//System.out.println("�Է¹��� �� Ȯ�� : " + temp);
		// �ƽ�Ű �ڵ� �� ��ȯ

		//*�� �� �̻��� ������ �����ϸ� ������ �� ������*
		
		
		//String result = temp >= 65 && temp <= 90 ? "�빮��" : "�빮�ھƴ�";
		//System.out.println("��� : " + result);
		

		//String result = temp >= 'A' && temp <= 'Z' ? "�빮��" : "�빮�ھƴ�";
		//System.out.println("��� : " + result);

		char ch, result;

		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : (ch>='a' && ch<='z' ? (char)(ch-32) : ch);

		System.out.println(ch + " �� " + result);
	}
}

