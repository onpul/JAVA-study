import java.io.IOException;

public class Sample
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		System.out.println("���ڿ� �Է�(����: Ctrl+z)");
		
		// read() : InputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
		while ( (data = System.in.read()) != -1 ) // -1�� ���� : Ctrl+z �ϸ� null�� ó���ż� -1��
		{//      int��  ----------------�ƽ�Ű �� ����        
			ch = (char)data; // char������ ���� ����ȯ --> ���ڿ���.        // ��Q1. char������ ���� ����ȯ�� �ǵ� ��� ���ڿ��� �޾�������...?

			//System.out.print(ch); // ��Q2. print() �޼ҵ� ��� �� �� "�����ٶ�"�� ������ ��µǳ���? ���ڿ� ���� �����ε�...
			/*
			���ڿ� �Է�(����: Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�Ƣ�������?��?                   
			^Z
			*/

			// write() : OutputStream Ŭ������ ��ǥ�� �޼ҵ�(�� ����Ʈ ��Ʈ��)
		    System.out.write(ch); // ��Q3. write() �޼ҵ忡���� �� "�����ٶ�"�� �� ��µǳ���...? write()�� ����Ʈ ����ε�...
			/*
			���ڿ� �Է�(����: Ctrl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�����ٶ�
			*/
		}
	}
}
/*
����Ʈ ��� : ������� ������ 1byte
=> �ڹٿ����� �� ���ڸ� �ǹ��ϴ� char���� 2byte�̱� ������ 
   ����Ʈ����� ��Ʈ������ 2byte�� ���ڸ� ó���ϴ� ���� ������� �ִ�.
*/