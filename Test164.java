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
		
		/*
		MyData md = new MyData("ȫ����", 13);
		v.add(md);
		
		MyData md1 = new MyData("������", 7);
		v.add(md1);

		MyData md2 = new MyData("������", 78);
		v.add(md2);
		*/

		MyData md = new MyData();
		md.setName("ȫ����");
		md.setAge(13);

		String name = md.getName();
		int age = md.getAge();
		
		MyData md2 = new MyData(name, age);
		v.add(md2);
		
		for (MyData m : v)
		{
			System.out.print(m + " ");
		}
		System.out.println();
	}
}