// 20220119 ��
// ��Ŭ������ �ν��Ͻ�

// ���� ���а� ���� ���� ������(����������, ����������, ...)

/*
Ŭ������ ���, �ַ� ����� ���� �����ڸ� ����ϴ� ����
- 1. �ܺηκ��� �����͸� ��ȣ�ϱ� ���ؼ�
- 2. �ܺο��� ���ʿ���, ���������θ� ���Ǵ�, �κ��� ���߱� ���ؼ�

- ������ ��ȣ: �����Ͱ� ��ȿ�� ���� �����ϵ���, �Ǵ� ��й�ȣ�� ���� �����͸� 
               �ܺο��� �Ժη� �������� ���ϵ��� �ϱ� ���� ���� ������ �ʿ�
			   --> ������ ���߱�(data hiding), ���� ����, ĸ��ȭ

- �ܺο��� ������ �ʿ䰡 ���� ������� private�� �����Ͽ� �ܺο� �����Ű�� �������ν�
  ���⼺�� ���� �� �ִ�. --> �̰͵� ĸ��ȭ�� �ش�

���������� �������� ����
--------------------------------------------------------------------
������   Ŭ���� ����   ���� ��Ű��   ��ӹ��� Ŭ����   �̿��� ����
private       O             X               X               X        -> ���� Ŭ���� ��������
default       O             O               X               X        -> ���� ��Ű�� ��������(����Ʈ)
protected     O             O               O               X        -> ���� ��Ű��, �ٸ� ��Ű���� �ڼ�Ŭ���� 
public        O             O               O               O        -> ���� ���� ����
--------------------------------------------------------------------
*/                       
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
class CircleTest2
{
	// ��� ����, �ν��Ͻ� ����, ���� ����
	//int num;

	// ��

	// ���� ����(Information Hiding)
	// ��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int�� ���� ���� �� �ڵ� 0���� �ʱ�ȭ ����
	
	private int num;

	// getter / setter ����
	/*
	int getNum()
	{
		return num;
	}

	void setNum(int num)
	{
		this.num = num;
	}
	*/
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("������ : " + num);
		System.out.println("����   : " + area);
	}
}

public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		// ��
		//ob1.setNum(10);

		//System.out.println("���� ������ : " + ob1.num);
		// ��
		//System.out.println("���� ������ : " + ob1.getnum);

		ob1.input();

		double result = ob1.calArea();
		ob1.write(result);
	}
}