// 20220128 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// StringBuffer Ŭ����

/*
�� StringBuffer Ŭ������
   ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

   ����, JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�. 
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�. 
   ��, Syncronization �� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.
*/

// StringBuilder-> multi-thread unsafe
// StringBuffer -> multi-thread safe
// ���� : StringBuilder > StringBuffer
//        -> �ܼ��� �� ������ �� ����
//-------------------------------------------------------------------------------------------------

public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
		

		System.out.println(sb1 == sb2); // �� ����� ��ü -> �ּҰ� �� 
		System.out.println(sb1.equals(sb2)); // ���ڿ��ӿ��� f => �������̵� �� �ߴ�
		//--==>> false                       // Object�� ������ �޼ҵ� �״�� 
	    //       false                       // check~!!!

		// �� �߰� ����
		// StringBuffer -> Object�� equals()�� �״�� ��� 
		//                 ��==���� ������ �������� ��ü�� �ּ� ��! (Test130 ����)
        // String -> Object�� equals() �������̵� �� �Ŵ�
		// -> ���ڿ� ��ü�� �� (�ּ� ����, �����ϴ� ���ڿ� �� ��)
		
		//--------------------------------------------------------------------------

		System.out.println(sb1);
		//--==>> korea

		System.out.println(sb1.toString());
		//--==>> korea

		// �ؽ��ڵ� ���� ������ �ʾҴ� -> toString�� �������̵� �� �Ŵ�.
		// �� �� ���ڿ� ��ȯ -> �׻� ���ڿ� ��ȯ�Ѵ�.

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true 


		System.out.println(); // ����
		
		StringBuffer sb3 = new StringBuffer();
		
	}
}

//-------------------------------------------------------------------------------------------------