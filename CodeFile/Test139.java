// 20220128 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// String Ŭ����

//-------------------------------------------------------------------------------------------------

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// �� ���ڿ� ����
		System.out.println(s.substring(6, 9));
		//--==>> kor

		// �� ��String.substring(s, e)��
		//    String ���ڿ��� �������
		//    s ��°���� ... e-1 ��°���� ����
		//    (��, �ε����� 0���� ����)

		System.out.println(s.substring(7));
		//--==>> orea

		// �� ��String.substring(s)��
		//    String ���ڿ��� �������
		//    s ��°���� ... ������ ����
		//    (��, ���ڿ��� ���� ���̸�ŭ...)

		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//--==>> true
        //       false
		//-- ��ҹ��� ����

		System.out.println(s.equalsIgnoreCase("Seoul korea"));
		//--==>> true
		//-- ��ҹ��� ���� ���ϰ� ������ ������ �ٸ����� ��

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��kor�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?

		// "seoul korea"
		//        ---
		//  0123456
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		// �� ������, �� ���ڴ� 6��°�� ��ġ�ϰ� �־�~

		System.out.println(s.indexOf("ea"));
		//--==>> 9
		
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		// ������ ��ȯ -> �ʰ� ã���� �ϴ� �� ���� �������� �ʾ�
		//             -> ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//                �� ���ڿ��� �ε����� ��ȯ������
		//                �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)
		//                                   ----> �ݵ�� -1�� �ƴ�

		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//    (true / false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		//--==>> true
		//       false

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��e�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		//    (��, �ڿ������� �˻�)

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9
		// ã�� �� �ڿ����������� �ε����� �տ������� 0 �״��

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7


		// �� ��� ���ڿ�(s) ��
		//    ��6����° �ε��� ��ġ�� ���ڴ�?

		// seoul korea

		System.out.println(s.charAt(6));
		//--==>> k

		//System.out.println(s.charAt(22));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//--     StringIndexOutOfBoundsException
		// subString������ �� ����

		
		// �� ��� ���ڿ�(s) �� �� ���ڿ� ��seoul corea�� ��
		//    � ���ڿ��� �� ū��? �� ���ڿ��� ���� ũ�� ��
		//    ==> �� ���ڿ��� ���ٸ� �� 0
		//    ==> �� ���ڿ��� �ٸ��ٸ� �� ���̸� Ȯ��(������ �迭)

		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k �� defghijk �� 8

		
		// �� ��� ���ڿ�(s) ��
		//    �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����
		
		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println("ó�� ���: " + s);
		//--==>> ó�� ���: �츮���� ���ֹα� ���ֵ��� ����


		// �� ���� ����
		s = "           ��          ��               ";
		System.out.println("|||" + s + "|||");
		//--==>> |||           ��          ��               |||

		System.out.println("|||" + s.trim() + "|||");
		//--==>> |||��          ��|||
		//--> ���� �����ڸ� ���� ����

		// Ʈ�� -> ������� ���� 
		//      -> �����ڸ����� ��Ƴ����� -> �߰����� ���� �� ���� -> ��Ƴ� �� ������!
		//      -> �����ִ� �� ���Ѵ�!
		// �� ���� �ڸ��� �ʰ� �Ǳ�..�Ǳ�....�ϳ��� �ڸ� ! ������̿� ��ũ���� 1000%

		// ���� ������ �� �����ϴ� �Լ�! (���� ������ ���� �� ����)
		// ����Ŭ���� lƮ��, rƮ�� ���� ����

		System.out.println("|||" + s.replaceAll(" ", "") + "|||");
		//--==>> |||���|||



		// "30"
		int temp = Integer.parseInt("30"); // ���ڿ��� ������
		//System.out.println(temp);
		System.out.printf("%d\n", temp);
		//--==>> 30
		Integer.toString(30); // toString()�� ��Ƽ���� �������̵��ؼ� ���� ��
		//System.out.println(s);
		System.out.printf("%s\n", temp);
		//--==>> 30
		

		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>> 23456782345678

		s = String.format("%d", n); // static �޼ҵ�! 
								    // printf, format�� ������ ����!
		                            // printf, format -> �̷� ������ ������ ����ض�~
		                            // String.format -> �̷� ������ ���ڿ��� ��ȯ�ض�~
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%,d", n); // % �ڿ� ��,���� �� ���� ó�� �� ���� ����
		                             // ����ض� ���� ���ڿ��� ��ȯ�ض� ����
		System.out.println(s); // 
		//--==>> 2,345,678
		
		System.out.printf("%,d\n", n);
		//--==>> 2,345,678
		

		//String str = "�⺻,����,���";
		//String[] strArr = str.split(",");
		// ��
		// �� �� �ٰ� ������ ����
		String[] strArr = "�⺻,����,���".split(",");

		/*
		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		*/

		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==>> �⺻ ���� ���
	}
}
//-------------------------------------------------------------------------------------------------