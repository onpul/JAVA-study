// 20220127 ��

// �� Ŭ���� ���

// ��ø Ŭ����
//-------------------------------------------------------------------------------------------------

// outer
class InnerOuterTest
{
	static int a = 10; // ����ƽ ����, Ŭ���� ����
	int b = 20;        // �ν��Ͻ� ����

	// inner
	// ���� ���߿� ��������� ��
	class InnerNested
	{
		int c = 30; 
		
		// inner�� write()
		void write()
		{
			System.out.println("inner�� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}
	
	// outer�� write()
	void write()
	{
		System.out.println("outer�� write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write(); //-- inner�� write() �޼ҵ� ȣ��

	}
}

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test126
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write(); //-- outer�� write() �޼ҵ� ȣ��
		/*
		outer�� write()...
		inner�� write()...
		a : 10
		b : 20
		c : 30
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		//------------------------------------------------------

		// �ʿ信 ���� �ܺο��� �ȿ� �ִ� class�� ������ ��

		//InnerNested ob3 = new InnerNested();
		//--==>> ���� �߻�(������ ����)

		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>> ���� �߻�(������ ����)

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//    �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//    �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.
		//    �� �ܺ� Ŭ������ ��ü�� �����ϸ�
		//       ���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�.

		// �� Test124.java ���ϰ� ���ϱ� ~ !!!
		// InnerOuterTest�ȿ� ����ִ� InnerNested Ÿ���� ob5
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/*
		inner�� write()...
		a : 10
		b : 20
		c : 30
		*/
		
		// InnerOuterTest�ȿ� ����ִ� InnerNested Ÿ���� ob6�� = �ܺ� ��ü �ȿ�.���� ��ü ����
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		/*
		inner�� write()...
		a : 10
		b : 20
		c : 30
		*/
		
		/*
		outerŬ������.innerŬ������ ���������� = new outer������().new inner������();
		*/

		/*
		cf) static �� ��ø ���� Ŭ����
		outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();
		*/

		// �ܺ� Ŭ������ �������� ������ ���� Ŭ���� ������ �� ����
		// �ܺ� Ŭ���� ��ü�� �����ص�, ���� Ŭ���� ��ü ������������ ���� �Ŷ� ���� �����ϴ� ��
	}
}
//-------------------------------------------------------------------------------------------------
/*
outer�� write()...
inner�� write()...
a : 10
b : 20
c : 30
inner�� write()...
a : 10
b : 20
c : 30
inner�� write()...
a : 10
b : 20
c : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/