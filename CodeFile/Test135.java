// 20220128 ��

// �� �ڹ��� �ֿ�(�߿�) Ŭ����

// Wrapper Ŭ����

//-------------------------------------------------------------------------------------------------

import java.math.BigDecimal; // math ��Ű���� �ֱ� ������ import ���� �ۼ��ϱ� ~

public class Test135
{
	public static void main(String[] args)
	{
		// �ǰ� ū �Ǽ� ������ �� ! BigDecimal
		BigDecimal a = new BigDecimal("123456789.123456789"); // �����ڿ��� �Ѱ��ִ� �� ���ڿ� ����.

		// movePointLeft : �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println("ó�� ��� : " + b);
		//--==>> ó�� ��� : 123456.789123456789

		// ������ ���� (��ü �Ӽ� Ȯ��, �ݿø� ���� �ʴ´�. �� ���� ó��)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN); // ROUND_DOWN -> static final 
		                                                   // -> Ư���� ���� �������� ���̰ڱ���
		System.out.println("ó�� ��� : " + c);
		//--==>> ó�� ��� : 1000.000000000

		// BigInter ��ü�� ��ȯ
		System.out.println(a.toBigInteger()); // �Ǽ��� -> ������ (����ȭ)
		//--==>> 123456789
	}
	
}