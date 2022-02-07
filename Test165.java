// 2022-02-07 ��

// �� �÷��� �����ӿ�ũ(Collection Framework)

// Test165 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.
/*
���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ������
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ���̻�
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : N

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		������
		���̻�
	���� ��ü ��� �Ϸ�~!!!
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���̻�

	[�˻� ��� ���]
	�׸��� �����մϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : �Ӽҹ�

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ȫ����

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ������

	[���� ��� ���]
	������ �׸��� �����Ǿ����ϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5 

	������ ��� �Է� : ��μ�

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ���̻�
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2	
	                  			 
	[���� ��ü ���]
		������
	���� ��ü ��� �Ϸ�~!!!
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ� Ű�� . . .


*/
//-------------------------------------------------------------------------------------------------
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus // �� �ϼ�
{
	public static final int E_ADD = 1;      //-- ��� �߰�
	public static final int E_DISP = 2;     //-- ��� ���
	public static final int E_FIND = 3;     //-- ��� �˻�
	public static final int E_DEL = 4;      //-- ��� ����
	public static final int E_CHA = 5;      //-- ��� ����
	public static final int E_EXIT = 6;     //-- ����
}

public class Test165
{
	// �ֿ� �Ӽ� ���� �� �ϼ�
	private static final Vector<Object> vt; //-- �ڷ� ����
	private static BufferedReader br;       //-- �Է� �� Ȱ��
	private static Integer sel;             //-- ���� ��
	private static String con;              //-- ��� ����
	 
	// static �ʱ�ȭ �� �� �ϼ�
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();
		
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ� // �� 
	public static void menuDisp()
	{
		System.out.println("\n\t[�޴� ����]"); // ��\t�� �ǡ�
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ��     ��");
		System.out.println();
	}

	// �޴� ���� �޼ҵ� // ��
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print("\t>> �޴� ����(1~6) : ");  
			sel = Integer.parseInt(br.readLine());	
		}
		while (sel<1 || sel>6);
	}
		
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ� // ��
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD  : addElement(); break;   // ��� �߰� / 1
			case Menus.E_DISP : dispElement(); break;  // ��� ��� / 2
			case Menus.E_FIND : findElement(); break;  // ��� �˻� / 3
			case Menus.E_DEL  : delElement(); break;   // ��� ���� / 4
			case Menus.E_CHA  : chaElement(); break;   // ��� ���� / 5
			case Menus.E_EXIT : exit(); break;         // ����      / 6
		}
	}

	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ� // ��
	public static void addElement() throws IOException
	{		
		do
		{
			System.out.printf("\n\t%d��° ��� �Է� : ", vt.size()+1); // �� ó���� ��Ұ� ���� -> 0 �̴ϱ� +1  
			String temp = br.readLine();

			vt.add(temp); // ��� �߰� 
			System.out.printf("\n\t%d��° ��� �Է� ����~!!!", vt.size()); // ��Ұ� �߰��� ��  

			System.out.println();
			System.out.print("\t��� �Է� ���(Y/N)? : ");
			con = br.readLine(); // con ���� ���� ��� ����
		}
		while(con.equals("Y") || con.equals("y"));

		System.out.println();
	}

	// �ڷᱸ�� ��ü ��� ��� �޼ҵ� // ��
	public static void dispElement()
	{
		System.out.println("\n\t[���� ��ü ���]");
		
		// ��ü ��� ���
		for (int i=0; i<vt.size(); i++)
		{
			System.out.printf("\t%s\n", vt.elementAt(i)); // E elementAt(int index)	
		}                                                 // �Ǵ� E get(int index)
		System.out.println("\t���� ��ü ��� �Ϸ�~!!!");

		System.out.println();
	}

	// �ڷᱸ�� �� ��� �˻� �޼ҵ� // ��
	public static void findElement() throws IOException
	{
		System.out.print("\n\t�˻��� ��� �Է� : ");
		String temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("\n\t[�˻� ��� ���]");

		if (i<0)
		{
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");		
		}
		else
			System.out.println("\t�׸��� �����մϴ�.");	

		System.out.println();
	}

	// �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.print("\n\t������ ��� �Է� : ");
		String temp = br.readLine();
		System.out.println();

		System.out.println("\t[�˻� ��� ���]");

		if (vt.contains(temp)) // boolean    
		{
			int a = vt.indexOf(temp);
			vt.remove(a);          
			System.out.printf("\t%s �׸��� �����Ǿ����ϴ�.\n", temp);
		}
		else
			System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");

		System.out.println();
	}

	// �ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\n\t������ ��� �Է� : ");
		String temp = br.readLine();

		if (vt.contains(temp)) // boolean    
		{
			System.out.print("\t������ ���� �Է� : ");
			String change = br.readLine();	

			int i = vt.indexOf(temp);
			vt.setElementAt(change, i); // �Ǵ� vt.set(i, change);

			System.out.println("\n\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\n\t[���� ��� ���]");
			System.out.println("\t������ ����� �������� �ʽ��ϴ�.");
		}

		System.out.println();
	}

	// ���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit()
	{
		System.out.println("\n\t���α׷� ����~!!!");
		System.exit(-1);
	}
	
	// main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}
// ���� ���
/*
        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 1

        1��° ��� �Է� : �ֹ���

        1��° ��� �Է� ����~!!!
        ��� �Է� ���(Y/N)? : Y

        2��° ��� �Է� : ȫ����

        2��° ��� �Է� ����~!!!
        ��� �Է� ���(Y/N)? : Y

        3��° ��� �Է� : ������

        3��° ��� �Է� ����~!!!
        ��� �Է� ���(Y/N)? : N


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 2

        [���� ��ü ���]
        �ֹ���
        ȫ����
        ������
        ���� ��ü ��� �Ϸ�~!!!


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 3

        �˻��� ��� �Է� : �ֹ���

        [�˻� ��� ���]
        �׸��� �����մϴ�.


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 3

        �˻��� ��� �Է� : ¯��

        [�˻� ��� ���]
        �׸��� �������� �ʽ��ϴ�.


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 4

        ������ ��� �Է� : ������

        [�˻� ��� ���]
        ������ �׸��� �����Ǿ����ϴ�.


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 2

        [���� ��ü ���]
        �ֹ���
        ȫ����
        ���� ��ü ��� �Ϸ�~!!!


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 5

        ������ ��� �Է� : �ֹ���
        ������ ���� �Է� : ¯��

        [���� ��� ���]
        ������ �Ϸ�Ǿ����ϴ�.


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) : 2

        [���� ��ü ���]
        ¯��
        ȫ����
        ���� ��ü ��� �Ϸ�~!!!


        [�޴� ����]
        1. ��� �߰�
        2. ��� ���
        3. ��� �˻�
        4. ��� ����
        5. ��� ����
        6. ��     ��

        >> �޴� ����(1~6) :
*/