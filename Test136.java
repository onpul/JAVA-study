// 20220128 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// Wrapper Ŭ����

//-------------------------------------------------------------------------------------------------

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2); 

		print(b2); // Byte Ÿ��
		print(i2); // Integer Ÿ��

		// Byte Ŭ������ byteValue() �޼ҵ� ȣ��
		byte b3 = b2.byteValue(); // ��ڽ�

		// Integer Ŭ������ intValue() �޼ҵ� ȣ��
		int i3 = i2.intValue(); // ��ڽ�

		// check~!!!
		int i4 = b2.byteValue(); // ����
		//       ---------------
		//         ����Ʈ ��

		//byte b4 = i2.intValue(); // �ڵ� ����ȯ ��Ģ ���� -> ���� �߻�(������ ����)
		byte b4 = i2.byteValue();
		
		System.out.println(b3);
		System.out.println(i3);

		// check~!!!
		System.out.println(b4); //--==>> 256 ���µ� 0 ��� 
		                        //      (byte���� ������ �� ���� ���̱� ������)
		System.out.println(i4);
	}
	
	/*
	static void print(Byte b)
	{
	}

	static void print(Integer i)
	{
	}
	*/
	
	// Byte Ÿ���� byte��? -> ��ڽ�
	// Integer Ÿ���� int��? -> ��ڽ�
	
	// �Ѱ��ִ� ����? -> Byte b, Integer i
	// �� ���� �Ű����� �� ���� �޾Ƽ� ó��
	// �׷����� �Ű������� Ÿ����...?
	
	// toString ���?
	/*
	@Override
	public String toString()
	{
	    return " ? ";
	}
	*/
	/*
	static void print(?) // �Ѱ���� �ϴ� �Ű������� Ÿ����?
	{
		// �ȿ��� ����Ǿ�� �� ����?
		System.out.println(?);
	}
	*/
    // static void print(Object obj) -> ������� �����帧 ~
	// Object�� �� �޾��� �� -> ������ ����

	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ�������� �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number�� �Ѿ���鼭 
	// �� ĳ������ �Ͼ�� �ȴ�.
	// Auto-Boxing�� �Ͼ�� �ȴ�.
	static void print(Number n) // �� 3
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}
}
// ���� �ǵ�
// 1. API ��ť��Ʈ �� ����~
// 2. Object ���ø���