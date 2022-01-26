// 20220119 수
// ▶클래스와 인스턴스

// 정보 은닉과 접근 제어 지시자(접근지정자, 접근제한자, ...)

/*
클래스나 멤버, 주로 멤버에 접근 제어자를 사용하는 이유
- 1. 외부로부터 데이터를 보호하기 위해서
- 2. 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서

- 데이터 보호: 데이터가 유효한 값을 유지하도록, 또는 비밀번호와 같은 데이터를 
               외부에서 함부로 변경하지 못하도록 하기 위해 접근 제한이 필요
			   --> 데이터 감추기(data hiding), 정보 은닉, 캡슐화

- 외부에서 접근할 필요가 없는 멤버들을 private로 지정하여 외부에 노출시키지 않음으로써
  복잡성을 줄일 수 있다. --> 이것도 캡슐화에 해당

●접근제어 지시자의 관계
--------------------------------------------------------------------
지시자   클래스 내부   동일 패키지   상속받은 클래스   이외의 영역
private       O             X               X               X        -> 같은 클래스 내에서만
default       O             O               X               X        -> 같은 패키지 내에서만(디폴트)
protected     O             O               O               X        -> 같은 패키지, 다른 패키지의 자손클래스 
public        O             O               O               O        -> 접근 제한 없음
--------------------------------------------------------------------
*/                       
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
class CircleTest2
{
	// 멤버 변수, 인스턴스 변수, 전역 변수
	//int num;

	// ↓

	// 정보 은닉(Information Hiding)
	// 『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int형 전역 변수 → 자동 0으로 초기화 지원
	
	private int num;

	// getter / setter 구성
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

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.141592;
	}

	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이   : " + area);
	}
}

public class Test100
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		// ↓
		//ob1.setNum(10);

		//System.out.println("원의 반지름 : " + ob1.num);
		// ↓
		//System.out.println("원의 반지름 : " + ob1.getnum);

		ob1.input();

		double result = ob1.calArea();
		ob1.write(result);
	}
}