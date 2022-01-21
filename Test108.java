// 20220121 ��

// ���ֹε�Ϲ�ȣ ��ȿ�� �˻�
//-------------------------------------------------------------------------------------------------
/*
�� �ֹε�Ϲ�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

   123456-1234567 (�ֹι�ȣ)
   ****** ******  ------------------------ �� �ڸ����� ���ϱ�
   234567 892345  (�� �ڸ��� ������ ��)

   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5 
	   ---------------------------
	   �� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
	   
	      == 217

   �� ������ ������� 11�� ������ ������������ ���Ѵ�.
    
	217 / 11 = 19(��) ... 8(������)

   �� 11���� ������ 8�� �� ������� ���Ѵ�.

    11 - 8 �� 3

	�� ���� ó�� �������� �������� 0�� ��� �� 11 - 0 �� 11
	                      �������� 1�� ��� �� 11 - 1 �� 10
	   
	   �̸� �ٽ� 10���� ������ �������� ���Ѵ�.  11 �� 1
	                                             10 �� 0

   �� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
      ��ġ�ϴ����� ���θ� ���Ѵ�.

	  ��ġ   �� ��ȿ�� �ֹι�ȣ
	  ����ġ �� �߸��� �ֹι�ȣ
*/
// ���� ��)
// �ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 123456-12345678  �� �Է� ���� �ʰ�
// >> �Է� ����
// ����Ϸ��� . . .

// �ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 123456-123456    �� �Է� ���� �̴�
// >> �Է� ����
// ����Ϸ��� . . .

// �ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 750615-1252085   �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ
// ����Ϸ��� . . .

// �ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : 750615-1252086   �� ��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ
// ����Ϸ��� . . .

// �� ���� �ذ��� ���� �߰� ��~!!!

//    �迭.length            �� �迭�� ����(�迭���� ����) ��ȯ
//    ���ڿ�.length()        �� ���ڿ��� ���� ��ȯ
//    ���ڿ�.substring()     �� ���ڿ� ���� 
//    ���ڿ�.substring(m, n) �� ���ڿ��� m��°���� n-1��°���� ����(�ε����� 0����)
//    ���ڿ�.substring(m)    �� ���ڿ��� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)
//-------------------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test108
{
	public static void main(String[] args) throws IOException
	{

		// ���� Ǯ��
		// BufferedReader �ν��Ͻ� ���� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		String str;

		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		//           7  5  0  6  1  5  -  1  8  6  2  1  3  3
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                            ---
		//                         check~!!!
		
		// ���� ���� �� ������ (�� ������ ����� ���� ������...)
		// ---------    ====== 
		//           0���� �ʱ�ȭ

		int tot = 0;

		System.out.print("�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : "); // "750615-1252085"
		//Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����");
			return; //-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}

		// �׽�Ʈ
		//System.out.println(">> �ڸ��� ����");
		
		// ex) "750615-1252085"
		for (int i=0; i<13; i++) // 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			// �׽�Ʈ
			//System.out.print(i + " ");

			str.substring(i, (i+1));
		    //----------------------
			// ex) "7"�̶�� ���ڿ�
			// ���ڿ����� �����ϸ� ���ڿ��� ����Ǵ� ��.
			
			if (i==6)
			{
				continue;  //-- �޺κ� �����ϰ� ����ض� (�길 ����)
			}

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1))); // �޺κ�
		}










//-------------------------------------------------------------------------------------------------
		/*
		//�׽�Ʈ
		String strTemp = "�ֹ���";
		System.out.println(strTemp.length());
		//--==> 3

		String strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//--==> 9

		String strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==> 10
        
		//----------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		//--==> ���� �߻�(��Ÿ�� ����)
		//      java.lang.StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==> FGHIJKLMNOPQRSTUVWXYZ
		*/
//-------------------------------------------------------------------------------------------------		
		// �� Ǯ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num;
		int sum;
		String number;
		int jumin;

		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

		do
		{
			System.out.print("�ֹι�ȣ�Է�(XXXXXX-XXXXXXX) : ");
			num = br.readLine(); 

			if (num.length()>14 || num.length()<14)
			{
				System.out.println("�Է¿���");
			}
		}
		while (num.length()>14 || num.length()<14);


		for (int i=0; i<num.length(); i++)
		{
			int n = i;

			if (n != 6)
			{	
				number = num.substring(i, i+1);
				jumin = Integer.parseInt(number);
				System.out.print(jumin);	
			}
		}
		*/
	}
}
//-------------------------------------------------------------------------------------------------
