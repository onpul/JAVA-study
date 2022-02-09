// 2022-02-09 수

// ▶ 자바의 기본 입출력(I/O)

// Buffer 실습
//-------------------------------------------------------------------------------------------------
public class Test177
{
	public static void main(String[] args)
	{
		// System.out : 자바 기본 출력 스트림
		// write() : OutputStream 클래스의 대표적 메소드(→ 바이트 스트림)

		System.out.write(65);   //-- 'A'
		System.out.write(66);   //-- 'B'

		System.out.write(180);  //
		System.out.write(235);  //-- 180 + 235 → '대'

		System.out.flush();     // check~!!!
		//--==>> AB대계속하려면 아무 키나 누르십시오 . . .

		// ※ 출력 버퍼가 채워지지 않으면
		//    출력할 데이터(자료)를 출력 디바이스(장치)로 보내지 않기 때문에
		//    flush() 메소드를 통해 아직 다 채워지지 않은 출력 버퍼의 내용을
		//    출력 장치로 밀어내어 보낼 수 있도록 처리해야 한다.

		//    즉, 현재 구문에서는 『System.out.flush()』 구문은 생략할 수 없다.

		// 자바의 out은 buffer를 자동으로 갖고 있다
	}
}