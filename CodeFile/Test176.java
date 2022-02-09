// 2022-02-09 ��

// �� �ڹ��� �⺻ �����(I/O)

// Reader �ǽ�

//-------------------------------------------------------------------------------------------------
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] agrs) throws IOException
	{
		int data;
		char ch;
		
		// System.in         : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� �� ���� ��� ��Ʈ������
		//                     ��ȯ�� �ִ� ���� ����
		// Reader            : ���� ��� ��Ʈ�� ��ü
		
		Reader rd = new InputStreamReader(System.in);
		//------ ����   -------����------ --------- ����Ʈ ��� ��Ʈ�� 
		//���ڱ���Է�  ����Ʈ����� ���ڱ������ 

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		while ( (data = rd.read()) != -1 )
		{
			ch = (char)data;

			//System.out.print(ch); // print : ���� ��� ���
			//--==>>
			/*
			���ڿ� �Է�(����:Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�����ٶ�
			^z
			*/

			// write() : OutputStream Ŭ������ ��ǥ�� �޼ҵ�(�� ����Ʈ ��Ʈ��)
			System.out.write(ch);
			/*
			���ڿ� �Է�(����:Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			 ��|
			^z
			*/
		}	
	}
}