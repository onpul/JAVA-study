// 20221011

// ������ �帧�� ��Ʈ��(���)

// �ݺ���(while��) �ǽ�

// 1���� 100���� ������ ���� ���ϵ�
// 10�� ����� �� ������ ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 1 ~ 10������ ��: 
// 1 ~ 20������ ��:
// 1 ~ 30������ ��:
//       :
// 1 ~ 100������ ��:
// ��� . . .
//----------------------------------------------------------------------
public class Test050
{
	public static void main(String[] args)
	{
		// �� Ǯ��
		/*
		int n=1;
		int sum=0;

		while (n<=100)
		{
			if (n==10)
			{
				sum+=n;
				System.out.println("1~10 ��: " + sum);
			}
			else if (n==20)
			{
				sum+=n;
				System.out.println("1~20 ��: " + sum);
			}
			else if (n==30)
			{
				sum+=n;
				System.out.println("1~30 ��: " + sum);
			}
			else if (n==40)
			{
				sum+=n;
				System.out.println("1~40 ��: " + sum);
			}
			else if (n==50)
			{
				sum+=n;
				System.out.println("1~50 ��: " + sum);
			}
			else if (n==60)
			{
				sum+=n;
				System.out.println("1~60 ��: " + sum);
			}
			else if (n==70)
			{
				sum+=n;
				System.out.println("1~70 ��: " + sum);
			}
			else if (n==80)
			{
				sum+=n;
				System.out.println("1~80 ��: " + sum);
			}
			else if (n==90)
			{
				sum+=n;
				System.out.println("1~90 ��: " + sum);
			}
			else if (n==100)
			{
				sum+=n;
				System.out.println("1~100 ��: " + sum);
			}
			sum+=n;
			n++;
			*/
//----------------------------------------------------------------------
		// ���� Ǯ��
		int n=1, sum=0;
		while (n<=100)
		{	
			sum += n;

			if (n%10==0)
			{
				System.out.printf("1 ~ %d������ ��: %d%n",n ,sum);
			}
			n++;
		}
	}
}