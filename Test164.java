// 2022-02-07 ��

// �� �÷��� �����ӿ�ũ(Collection Framework)

// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���
//-------------------------------------------------------------------------------------------------
// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
import java.util.Vector;

class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name; //-- �̸�
	private int age;     //-- ����

	// getXxx() �� getter
	// setXxx() �� setter

	// getter / setter ����
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// ������(�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// �� ����� ���� �����ڰ� ������ ���
	//    default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//    default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//    �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//    (��, �ݵ�� �����ؾ� �� �ʿ�� ����)
	
	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}
}

public class Test164
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v��
		// ȫ���� 13�� / ������ 7�� / ������ 78��
		// ��Ƴ���
		
		// ��
		/*
		MyData st1 = new MyData();
		st1.setName("ȫ����");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("������");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(78);
		v.add(st3);
		*/

		// ��
		/*
		MyData st1 = new MyData("ȫ����", 13);
		v.add(st1);
		MyData st2 = new MyData("������", 7);
		v.add(st2);
		MyData st3 = new MyData("������", 78);
		v.add(st3);
		*/

		// ��
		v.add(new MyData("ȫ����", 13));
		v.add(new MyData("������", 7));
		v.add(new MyData("������", 78));

		// ���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		// �̸�: ȫ����, ����: 13
		// �̸�: ������, ����: 7
		// �̸�: ������, ����: 78
		
		for (MyData m : v)
		{
			System.out.printf("�̸�: %s, ����: %d", m.getName(), m.getAge());
			System.out.println();
		}

		// �� Ǯ��
		/*
		// ��� 1
		MyData md1 = new MyData("ȫ����", 13);
		v.add(md1);
		
		MyData md2 = new MyData("������", 7);
		v.add(md2);

		MyData md3 = new MyData("������", 78);
		v.add(md3);

		// ��� 2
		MyData md1 = new MyData();
		md1.setName("ȫ����");
		md1.setAge(13);
		v.add(md1);

		MyData md2 = new MyData();
		md2.setName("������");
		md2.setAge(7);
		v.add(md2);

		MyData md3 = new MyData();
		md3.setName("������");
		md3.setAge(78);
		v.add(md3);
		
		// ��� 3
		MyData md1 = new MyData();
		md1.setName("ȫ����");
		md1.setAge(13);
		v.add(md1);
		
		MyData md2 = new MyData();
		md2.setName("������");
		md2.setAge(7);
		v.add(md2);

		MyData md3 = new MyData();
		md3.setName("������");
		md3.setAge(78);
		v.add(md3);

		for (MyData m : v)
		{
			System.out.printf("%s %d�� / ", m.getName(), m.getAge());
		}
		System.out.println();
		*/
	}
}