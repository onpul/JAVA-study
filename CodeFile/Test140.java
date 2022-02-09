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
		
		////////////////////////////////////////////////////////////////////

		System.out.println(sb1);
		//--==>> korea

		System.out.println(sb1.toString());
		//--==>> korea

		// �ؽ��ڵ� ���� ������ �ʾҴ� -> toString�� �������̵� �� �Ŵ�.
		// �� �� ���ڿ� ��ȯ -> �׻� ���ڿ� ��ȯ�Ѵ�.

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true 


		System.out.println("---------------------------"); 
		
		StringBuffer sb3 = new StringBuffer();
		//-- �⺻ ������ ������� �� ������ ũ��� 16
		//-- StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ������ ũ��� ��16��

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16

		////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> ��
		
		/*
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
		*/

		sb3.append("seoul");        //sb3 += "seoul"      // 3b3 ���� �ٲ� -> ���� �ڷ��� void
		sb3.append("korea");        //sb3 += "korea"      // 3b3 ���� �ٲ� -> ���� �ڷ��� void
		sb3.append("�츮����");     //sb3 += "�츮����"   // 3b3 ���� �ٲ� -> ���� �ڷ��� void
		sb3.append("���ѹα�");     //sb3 += "���ѹα�"   // 3b3 ���� �ٲ� -> ���� �ڷ��� void

		System.out.println(sb3); // StringBufferŸ��
		//--==>> seoulkorea�츮������ѹα�

		System.out.println(sb3.toString());  // StringŸ��
		//--==>> seoulkorea�츮������ѹα�
		
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		
		////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase()); // �ҹ��ڸ� �빮�ڷ�
		//--==>> JAVA AND ORACLE                 // ��ȯ -> String

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase()); // ��ȯ -> String
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		// StringBuffer���� toUpperCase() toLowerCase()�� ������~

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		// sb3 ������ �ٲ� �� �ƴ�. ���� �״��

		System.out.println(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		// sb3 ������ �ٲ� �� �ƴ�. ���� �״��

		// sb3
		// seoulkorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� seoul �տ� 
		//    "�ѱ�" �̶�� ���ڿ� �߰�
		//     �� �ѱ�seoulkorea�츮������ѹα�

		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

        ////////////////////////////////////////////////////////////////////

		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    "���"�̶�� ���ڿ� �߰�
		//    ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�...

		System.out.println(sb3.indexOf("korea"));
		System.out.println(sb3.indexOf("a"));
		//--==>> 7
		//       11
		//sb3.insert(12, "���");
		System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�

        //-------------------------------------------- �ٸ� ���
		/*
		System.out.println(sb3.length()); // 1~22 ����
		//--==>> 22
		System.out.println(sb3.indexOf("korea")); // �ڸ��ƴ� �ε��� 7��, �� 8��°����
		//--==>> 7
		*/

		// ���� Ǯ��
		
		// �׽�Ʈ ��
		System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		// �׽�Ʈ ��
		//sb3.insert(12, "���"); // sb3�� �ٲ�
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�

		// �׽�Ʈ ��
		//sb3.indexOf("korea");
		System.out.println(sb3.indexOf("korea"));
        //--==>> 7

		// �׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));

		//System.out.println(sb3.insert(12, "���")); 
		//                              ---
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		//                              -------------------

		// �׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "���"));
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "���"));
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		////////////////////////////////////////////////////////////////////

		// �� ��� ���ڿ�(sb3) ����
		//    ���츮���� ���ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		//System.out.println(sb3.indexOf("�츮����")); // 14
		//System.out.println("�츮����".length()); // 4

		//System.out.println(sb3.delete(sb3.indexOf("�츮����"), 18));
	    //                                                       --
		//System.out.println((sb3.indexOf("�츮����")) + ("�츮����".length()));
		//                                               ---------------------

		//                            ----------14----------   ------------14-----------    -----------4----------
		//System.out.println(sb3.delete(sb3.indexOf("�츮����"), (sb3.indexOf("�츮����")) + ("�츮����".length())));
		//--==>> �ѱ�seoulkorea������ѹα�
 
		// ���� Ǯ��-------------------------------------------------
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����") + "�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�
       
	    ////////////////////////////////////////////////////////////////////

		// �� ��� ���ڿ�(sb3) ����
		//    ��korea�� ���� ���ڿ� ����(korea ����)
		//sb3.delete(7, 18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoul

		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul
        
        ////////////////////////////////////////////////////////////////////

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		// �پ���� ����!

		// ���ڿ�(sb3)�� ����
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//                                      -------------stringBuffer���� length() �ֱ���
		//--==>> ���ڿ��� ���� : 7

		// ���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();
		
		// ���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7


	}
}

//-------------------------------------------------------------------------------------------------