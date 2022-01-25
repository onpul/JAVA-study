// 20220125 화

// ▶ 클래스 고급

// 추상 클래스(Abstract)

/*
● 추상 클래스(abstract)는
   
   선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
   메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.

● 형식 및 구조
   
   [접근제어지시자] abstract calss 클래스명
   {
       [접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
   }

● 특징
	
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며,
   추상 클래스로 선언한 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며
   추상 클래스에서 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding) 해야 한다.

※ 『abstract』 키워드는
   클래스와 메소드에서만 사용할 수 있으며
   멤버 변수나 로컬 변수에서는 사용 불가능하다.
*/
//-------------------------------------------------------------------------------------------------
// 추상 클래스
abstract class SortInt117
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}

	// 『final』 키워드로 인해
	// 이 클래스(SortInt117)를 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
		{
			return 0;
		}
		else if (x>y)
		{
			return 1;
		}
		else
			return -1;
	}

	// 『final』 키워드로 인해
	// 이 클래스(SortInt117)를 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
}

// SortInt117(추상 클래스)를 상속받은 클래스 → 일단은 추상 클래스
// → 추상 메소드(sorting())를 Override → 일반 정상 클래스
public abstract class Test117 extends SortInt117
{
	/*
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// 추상 메소드
	protected abstract void sorting();

	protected int dataLength();
	{
		return value.length;
	}
	*/
	
	int i, j;

	static int[] data = {7, 10, 3, 8, 7};

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		//Test117 ob = new Test117();
		//ob.sort(data);

		System.out.print("Sorted Data : ");
		for (int n : data)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}