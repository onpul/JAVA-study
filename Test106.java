// 20220121 금

// ▶메소드 중복정의(Method Overloading)
//-------------------------------------------------------------------------------------------------
// Method overloading이 가능한 형태와 불가능한 형태
//-------------------------------------------------------------------------------------------------
public class Test106
{
	public static void main(String[] args)
	{
		print(3.14);

		double result = print(3.14); // X 자바는 '=' 대입연산자의 오른쪽만 먼저 본다! 그러니 같다고 생각한다
	}

	public static void print() {}                         // O 메소드 이렇게 지정할 수 있음
	//public static void print() {}                       // X 같은 형태로는 안 됨
	public static void print(int i) {}                    // O 매개변수를 받으니까 식별 가능
	//public static void print(int j) {}                  // X 매개변수 타입이 같아서 식별 불가능
	public static void print(char c) {}                   // O 가능은 하나, 주의해야 함(자동 형변환 규칙), char --> int 자동 형변환이 됨
	public static void print(int i, int j) {}             // O 매개변수의 타입이 같으나 갯수가 달라서 가능
	public static void print(double d) {}                 // O 매개변수의 개수는 같으나 데이터 타입이 달라서 가능 but, 자동 형변환 고려 필요
	//public static void print(double e) {return 10.0;}   // X 정의 불가 리턴 자료형은 void인데 값은 실수형
	//public static double print(double e) {return 10.0;} // X 중요~!!!  
}