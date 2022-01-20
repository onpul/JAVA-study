// 20220120 ��
// ��Ŭ������ �ν��Ͻ�
//-------------------------------------------------------------------------------------------------
// Ŭ������ �ν��Ͻ� Ȱ��

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// �� ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:����  2:����  3:��  �� �Է�(1~3) : 4
// 1:����  2:����  3:��  �� �Է�(1~3) : -1
// 1:����  2:����  3:��  �� �Է�(1~3) : 2

// - ����   : ����
// - ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
// ����Ϸ��� . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	int rps;
	
	String userhand;
	String comhand;
	String result;

	// ����ڰ� 1~3 �� �Է� �޼ҵ�
	void input() 
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����  2:����  3:��  �� �Է�(1~3) : ");
			rps = sc.nextInt();
		}
		while (rps<1 || rps>3);

		if (rps==1)
		{
			userhand="����";
		}
		else if (rps==2)
		{
			userhand="����";
		}
		else
			userhand="��";
	}

	// ���� �߻� �޼ҵ�
	int nansu() // 1:����, 2:����, 3:��
	{
		Random rd = new Random();
	    int nan = rd.nextInt(3)+1; // 1 ~ 3 

		if (nan==1)
		{
			comhand="����";
		}
		else if (nan==2)
		{
			comhand="����";
		}
		else
			comhand="��";

		return nan;
	}

	// ���� �޼ҵ�
	String exec(int nan)
	{
		// ���������� �º�
		if (rps==nan)
		{
			result="���º��Դϴ�~!!!";
		}
		else if (rps==1)
		{
			if (nan==2)
			{
				result="��ǻ�Ͱ� �̰���ϴ�~!!!";
			}
			else
				result="����ڰ� �̰���ϴ�~!!!";
		}
		else if (rps==2)
		{
			if (nan==1)
			{
				result="����ڰ� �̰���ϴ�~!!!";
			}
			else
				result="��ǻ�Ͱ� �̰���ϴ�~!!!";
		}
		else if (rps==3)
		{
			if (nan==1)
			{
				result="��ǻ�Ͱ� �̰���ϴ�~!!!";
			}
			else
				result="����ڰ� �̰���ϴ�~!!!";
		}
		return result;
	}

	void print(int nan)
	{
		System.out.printf("%n- ����   : %s%n", userhand);
		System.out.printf("- ��ǻ�� : %s%n", comhand);
		System.out.println();
		System.out.printf(">> �º� ���� ��� : %s%n", result);// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!!
	}

}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rg = new RpsGame();
		int nan = rg.nansu();
		rg.input();
		rg.print(nan);
	}
}