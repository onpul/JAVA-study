// 20220203 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// StringTokenizer Ŭ����

/*
�� StringTokenizer Ŭ������
   ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
   �Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
   ���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
   ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
   ��ū(token)�̶�� �Ѵ�.

   StringTokenizer Ŭ������ ����ϱ� ���ؼ���
   java.util ��Ű���� StringTokenizer�� import �ؾ� �Ѵ�.

   StringTokenizer Ŭ������ ȣȯ���� �����ϴ� �������� // �̷� �� ������ �� ���� ��... �ܼ� ȣȯ��
   ���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
   String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű����
   ����� ���� �����ϰ� �ִ�.

�� ������
   - ����
     StringTokenizer(String str)
	 StringTokenizer(String str, String delim)
	 StringTokenizer(String str, String delim, boolean returnDelims)
	 �� �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ� 
	    ����(����)���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		���� returnDelimes�� true�̸�
		���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

// �Ĳ��� �о �ʿ䰡 ����... �ڹٰ� ���ְ� ������ ������ ���� Ŭ����
// ��� ����... 
//-------------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test142
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ� ���� : )");
		strTemp = br.readLine();
		//-- "���,����,�ٳ���,�丶��"

		// StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp�� ��� ���ڿ���... ("���,����,�ٳ���,�丶��")
		//   ��,���� �����ڷ�...
		// ��ü�� ������ ����, �迭�� ���� �� �ƴ�

		// st�� ��countTokens()�� �޼ҵ� ȣ��
		// ��int countTokens()��
		//  : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.
		strArr = new String[st.countTokens()];
		//                  ----------------
		//                          4

		// �� strArr = new String[4]; 
		//    4�� �迭�� �迭 �����

        // **���� �߿�
		n=0;
		while (st.hasMoreTokens())            // nextToken�̶� ���� ����, ������ Ȯ�� �� ����
		{   // true true true ture false      // ���� �� ������ true �� ��ȯ�ϸ�
			strArr[n++] = st.nextToken();     // ��� ȭ��ǥ �������� �� ��������
			// strArr[0] = "���";
			// strArr[1] = "����";
			// strArr[2] = "�ٳ���";
			// strArr[2] = "�丶��";
		}
		//-- ��hasMoreTokens()��
		//    : ����� �� �ִ� ��ū�� �����ִ� ��� true�� ��ȯ.
		//      �� �̻� ����� ��ū�� ���� ��� false�� ��ȯ.
		//      Ȯ�� ����� ��ȯ�� ��...
		//      ���� ������ �о�������� �ʰ�,
		//      ���� ������ �о���̴� ��带 �̵���Ű���� �ʴ´�.
		//-- ��nextToken()��
		//    : ���� ��ū�� ���´�.
		//      ���� ��ū�� ������ ��带 �̵���Ű�� �ȴ�.
		//      �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//      �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.

		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
	}
}