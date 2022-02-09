// 20220128 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// Wrapper Ŭ����

//-------------------------------------------------------------------------------------------------

public class Test137
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE); // static final -> �ν��Ͻ� ���� ���� �ٷ� ���� ����
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647
        //       -2147483648

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
        //       -9223372036854775808

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
        //       4.9E-324
		// �� e ǥ���

		System.out.println(); // ����

		// �Ǽ� ����� ������ ����
		System.out.println("1 : " + 3.0/0); // ������ ���� ���� -> ���� ���� Infinity
		//--==> 1 : Infinity

		System.out.println("2 : " + -3.0/0); // ���� Infinity
		//--==> 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true
		//       4 : false

		// ��Double.isInfinite()�� // ���Ǵ�Ʈ���� Ȯ���� �ִ� �޼ҵ�
		                           // ���Ǵ�Ƽ �ƴϰ� ���Ǵ�Ʈ
								   // ����ƽ �޼ҵ�
								   // is~~~�� ������ ���� ���� ���� �ƴ��� Ȯ���ؼ� t or f ��ȯ
		
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		//--==>> 5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 6 : true
		// ��ȣ�� ������ �ʰ� �������� �ƴ��� �Ǻ�
		
		//------------------------------------------------------

		// ����~!!! check~!!!
		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>> 7 : NaN (�� Not a Number) // ���ڰ� �ƴմϴٿ�~
		//--==>> 8 : NaN
		
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>> 9 : false
		//       10 : true

		// �� NaN(Not a Number) ���� ������ ����
		//    ��==�� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//    ����� ������ ��false���� ��ȯ�Ѵ�.

		// ���Ѵ� -> �ڹٴ� �ϳ��� ���ڷ� ����.
		// but, NaN�� �̸��� ���� ���ڷ� �������� ���� -> �� �Ұ������� ó��
		
		// ��Double.isNaN()�� NaN���� �ƴ��� Ȯ���� �ִ� �޼ҵ�
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1+2.2));
		//--==>> 11 : true
        //       12 : false
	
	}
}
//-------------------------------------------------------------------------------------------------