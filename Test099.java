// 20220118 ȭ
// ���迭

// �迭�� ����

// Test098.java ���ϰ� ��~!!!
//-------------------------------------------------------------------------------------------------
// �� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
//    �ּҰ� ���� �� ���� ���� �� ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���.
//                                (�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)
//    ������ ���� �� ���� ���� �� ���� ��ҷ� ����ִ� ���� ���� �����
//                                ������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���.
//-------------------------------------------------------------------------------------------------

// ������ ����
// - int �� �迭�� ���� ���� �ǹ��� ���縦 ó���ϴ�
//   �޼ҵ带 �����ϴ� ���·� �ǽ�

public class Test099
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50}; //-- �迭 ����

		int[] copys1 = nums; //(�ּҰ� ����)
        int[] copys2 = copyArray(nums);
		
		int[] copys3 = (int[])nums.clone;
		int[] copys1Array(nums); // ���� �ǹ��� �迭 ���� ����
		                      // (����� ���� �޼ҵ� ȣ��);
		int[] copys2Array(nems);
	}
	num[1] = 2;

	// ��� Ȯ��
	for (int i=0; i<nums.length; i++)
	{
		System.out.printf("%4d%", nums[i]);
	}
	System.out.println();
	for (int i=0; i<copys1.length; i++)
	{
		System.out.printf("%4d%", copys1[i]);
	}
	System.out.println();
	for (int i=0; i<copys2.length; i++)
	{
		System.out.printf("%4d%", copys2[i]);
	}
	System.out.println();
	for (int i=0; i<copys23.length; i++)
	{
		System.out.printf("%4d%", copys3[i]);
	}
	System.out.println();

	// �Ű������� int �迭 Ÿ���� �Ѱܹ޾�
	// �̸� ������ ��
	// ������ �迭�� ��ȯ�ϴ�
	// ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os)
	{
		//�Ű������� �Ѱܹ��� �迭(os)
		//��, ���� �迭 ��ŭ�� �迭��(�޸� ����)�� Ȯ����
		//������ �迭�� ����
		int[] temp = new int[os.length];
	
		//������ ���� �迭(os)�� ����ִ� ��ҵ��� ���� �迭(temp)�� ��Ƴ���
		// temp = os;
		for (int i=0; i<os.lenght; i++)
		{
			temp[i] = os[i];
		}

		//������ �迭(temp) ��ȯ
		return temp;
	}
}