// 2022-02-09 수

// ▶ 자바의 기본 입출력(I/O)

// OutputStream 실습

//-------------------------------------------------------------------------------------------------
import java.io.OutputStream;
import java.io.IOException;

public class Test175
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : 자바의 표준 입력 스트림
		// System.out : 자바의 표준 출력 스트림
		OutputStream out = System.out; // 내보내는 물줄기   / 업캐스팅
		// OutputStream으로 받은 out --> buffer가 없음
		// 모든 바이트 스트림 객체는 OutputStream의 하위 객체
		// InputStream OutputStream --> 바이트 스트림의 조상

		// 배열 구성
		byte[] ch = new byte[3];
		ch[0] = 65;      // A
		ch[1] = 97;      // a
		ch[2] = 122;     // z

		out.write(ch);   //-- 밖으로 내보낼 데이터(변수)를 스트림에 기록.
                         // 수제비 떠서 올려놓듯이 종이배 띄우듯이 물줄기에 올린 것!!!

		out.flush();     //-- 기록된 스트림을 내보내는(밀어내는) 기능을 수행.
		                 //   지금은 Buffer를 활용하지 않고 있는 상황이기 때문에
						 //   생략이 가능한 코드.
						 //   (Buffered 되어 있는 스트림(stream)일 경우 생략 불가)
						 // 주사기!!! 피스톤!!! 밀어버리기!!!
						 // 버퍼가 있으면 고여 있을 텐데 그거를 밀어버리는 거임

		out.close();     //-- 출력 스트림(물줄기)에 대한 리소스 반납.
		                 //   (out 스트림을(수도꼭지를) 잠가버린 상황)
						 // 수도꼭지 잠가서 물 안 흐르게!!!
		
		System.out.println("절대적인 신뢰를 갖고 있는 구문..."); // 수도꼭지 잠가서 출력 안 됨...
		//-- 『out close()』를 작성한 이후 출력되지 않는 구문
		//   출력되는 스트림(물줄기)을 닫았기 때문에... 

		//--==>> Aaz계속하려면 아무 키나 누르십시오 . . .
	}
}