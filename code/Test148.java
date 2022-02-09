// 2022-02-03 ��

// �� Random Ŭ����

/*
�� java.util.Random Ŭ������ 
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵
   ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ���
   �߰����� ������ �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 41
// 1 2 8 36 41 42
// 4 9 11 13 22 30
// 5 10 13 15 27 6
// 22 31 32 33 40 41
// ����Ϸ���... 
//-------------------------------------------------------------------------------------------------
import java.util.Random;
import java.util.Arrays;

class Lotto
{	
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;

	// ������
	Lotto()
	{
		num = new int[6];
	}

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();
		int n;
		int cnt=0;
		
		jump:

		while (cnt<6)              // 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;  // 1 ~ 45       // ex) 10 12 13

			for (int i=0; i<cnt; i++) 
			{
				if (num[i]==n)
				{
					continue jump;
				}
			}
			
			num[cnt++] = n;        // num[0] num[1] num[2] num[3] num[4] num[5]
		}

		// ���� �޼ҵ� ȣ��
		sorting();
	}

	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num); // �迭 �Ѱ��ָ� �˾Ƽ� �� �� ��
	}

	// �� Ǯ��-------------------------------------------------------------------------------------
	/*
	int[] lt; // 6�� �ζ� ��ȣ �� �迭�� 

	public int pickNum() // ���� �߻��� �޼ҵ�
	{
		return (int)(Math.random() * 45) + 1; // 1~45 ���� ������ ���� ����
		// �����Լ��� �⺻���� Double�� �� (int)�� ����ȭ �ؾ� ��
        // 1������ ���� �̰� ���� �� �����Լ��� 0���� �����⶧���� +1
	}

	public void setting() // �ζ� ��ȣ ������ �޼ҵ�
	{
		lt = new int[6]; // �ζ� ��ȣ �� �迭�� 6��
		boolean[] picked = new boolean[46]; // 45�ϸ� ���� ��... ����?

		for (int i=0; i<lt.length; i++) // 0  1  2  3  4  5
		{
			//lt[i] = pickNum();
			while (true) // ���� �ݺ�
			{
				int temp = pickNum(); // �ӽ� ���� temp�� ���� ���� �־����

				if (picked[temp] == false) // �ߺ��� ���� �ƴϸ�
				{
					picked[temp] = true; // �̾Ҵٰ� üũ�ϰ�
					lt[i] = temp; // �迭�濡 �� �ֱ�

					break; // ���� ����� �ݺ��� Ż�� --> �����, �׸��� ����������!
				}
			}
		}
		
		// �������� ���� (���� ����)
		for (int i=0; i<lt.length-1; i++)           // �� ���� ������     (0     1     2     3    4)
		{                                           //                       |     |     |     |    |
			for (int j=i+1; j<lt.length; j++)       // �� ��� ������      12345 2345  345   45   5
			{
				if (lt[i] > lt[j])    
				{
					// �ڸ� �ٲٱ�
					lt[i] = lt[i]^lt[j];
					lt[j] = lt[j]^lt[i];
					lt[i] = lt[i]^lt[j];
				}
			}
		}
		
	} // setting() end
	public void print()
	{
		for (int i=0; i<lt.length; i++)
		{
			System.out.print(lt[i] + " ");
		}
		System.out.println();
	}
	*/
} // Lotto end

public class Test148
{
	public static void main(String[] args)
	{
		// ���� Ǯ��
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5 ����
		for (int i=1; i<=5; i++)
		{
			// �ζ� ���� ����
			lotto.start();

			// ��� ���
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}

		// �� Ǯ��---------------------------------------------------------------------------------
		/*
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ 5 ����
		for (int i=1; i<=5; i++)
		{
			// �ζ� ���� ����
			lotto.pickNum();
			lotto.setting();

			// ��� ���
			lotto.print();
		}
		*/
	}
}
//-------------------------------------------------------------------------------------------------
// ���� ���
/*
   6  15  17  19  23  28
  15  22  26  31  36  43
  26  29  36  39  40  44
   9  15  16  19  38  45
  21  23  24  27  39  40
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/