// �ڹ� �⺻ ���α׷���

// ��� ������
// BufferedReader
// printf()

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader�� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

// ====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ==============
// ����Ϸ��� �ƹ� Ű�� �����ÿ�. . .

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test023
{
	public static void main(String[] args) throws IOException
	{
		/* �� Ǯ��
		// BufferedReader �ν��Ͻ� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// �ֿ� ���� ����
		int a, b;
		int sum, sub, mul, div, mod;

		// ���� �� ó��
		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("ù ��° ���� �Է� : ");
	    // ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		a = Integer.parseInt(br.readLine());

		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�� ��° ���� �Է� : ");
		// ����ڰ� �Է��� ��(�ܺ� ������)�� ���� ���·� ��ȯ�� �� ������ ��Ƴ���
		b = Integer.parseInt(br.readLine());

		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		mod = a % b;

		// ��� ���
		System.out.printf("====[���]====");
		System.out.printf("\n %d + %d = sum", a, b);
		System.out.printf("\n %d - %d = sub", a, b);
		//System.out.printf("\n %d * %d = mul", a, b);
		//System.out.printf("\n %d / %d = div", a, b);
		System.out.printf("\n %d %% %d = mod", a, b);
		System.out.printf("\n==============");
		*/
		
		// �ֿ� ���� ����
		int num1, num2; // ����� �Է°��� ���� ����
		int res1, res2, res3, res4, res5; // ���� ����� ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// ���� ��� ���
		System.out.printf("\n====[���]====\n");
		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5); // %% -> %

		System.out.printf("==============\n");

	}
}