// 20220114 ��
// ��Ŭ������ �ν��Ͻ�
//-------------------------------------------------------------------------------------------------
// �� Test073.java ���ϰ� ��Ʈ~!!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java
// BufferedReader�� readLine() ���

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ *2 * 3.141592

// ���� ��)
// ������ �Է� : xxx

// >> �������� xx�� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
//-------------------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; //--> �� ���� ����

public class CircleTest 
{
	// ��� ���� �� �ֿ� �Ӽ�
	int r; //������
	final double PI = 3.141592; // ������ (������ ���ȭ)

	// ��� �޼ҵ� �� �ֿ� ���(����, ����)
	// ������ �Է� ��� �� �޼ҵ� ����
	void input() throws IOException //--> �� ���� ������
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// �� ���� ��� ��� �� �޼ҵ� ����
	double Circlearea()
	{
		double result;
		result = r * r * PI;
		return result;

		//return = r * r * PI; //--> �ص� �ȴ�
	}

	// �� �ѷ� ��� ��� �� �޼ҵ� ����
	double Circlecircum()
	{
		double result;
		result = r * 2 * PI;
		return result;
	}
	
	// ��� ��� �� �޼ҵ� ����
	void print(double a, double l)
	{
		System.out.printf(">> �������� %d�� ����%n", r); // �������� ���� --> %d
		System.out.printf(">> ���� : %.2f%n", a);
		System.out.printf(">> �ѷ� : %.2f%n", l);
	}
}