// 20220121 ��

// ���޼ҵ� �ߺ�����(Method Overloading)
//-------------------------------------------------------------------------------------------------
// Method overloading�� ������ ���¿� �Ұ����� ����
//-------------------------------------------------------------------------------------------------
public class Test106
{
	public static void main(String[] args)
	{
		print(3.14);

		double result = print(3.14); // X �ڹٴ� '=' ���Կ������� �����ʸ� ���� ����! �׷��� ���ٰ� �����Ѵ�
	}

	public static void print() {}                         // O �޼ҵ� �̷��� ������ �� ����
	//public static void print() {}                       // X ���� ���·δ� �� ��
	public static void print(int i) {}                    // O �Ű������� �����ϱ� �ĺ� ����
	//public static void print(int j) {}                  // X �Ű����� Ÿ���� ���Ƽ� �ĺ� �Ұ���
	public static void print(char c) {}                   // O ������ �ϳ�, �����ؾ� ��(�ڵ� ����ȯ ��Ģ), char --> int �ڵ� ����ȯ�� ��
	public static void print(int i, int j) {}             // O �Ű������� Ÿ���� ������ ������ �޶� ����
	public static void print(double d) {}                 // O �Ű������� ������ ������ ������ Ÿ���� �޶� ���� but, �ڵ� ����ȯ ��� �ʿ�
	//public static void print(double e) {return 10.0;}   // X ���� �Ұ� ���� �ڷ����� void�ε� ���� �Ǽ���
	//public static double print(double e) {return 10.0;} // X �߿�~!!!  
}