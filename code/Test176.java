// 2022-02-09 수

// ▶ 자바의 기본 입출력(I/O)

// Reader 실습

//-------------------------------------------------------------------------------------------------
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test176
{
	public static void main(String[] agrs) throws IOException
	{
		int data;
		char ch;
		
		// System.in         : 자바 표준 입력 스트림 → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 → 문자 기반 스트림으로
		//                     변환해 주는 역할 수행
		// Reader            : 문자 기반 스트림 객체
		
		Reader rd = new InputStreamReader(System.in);
		//------ 문자   -------번역------ --------- 바이트 기반 스트림 
		//문자기반입력  바이트기반을 문자기반으로 

		System.out.println("문자열 입력(종료:Ctrl+z)");

		while ( (data = rd.read()) != -1 )
		{
			ch = (char)data;

			//System.out.print(ch); // print : 문자 기반 출력
			//--==>>
			/*
			문자열 입력(종료:Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
			가나다라
			^z
			*/

			// write() : OutputStream 클래스의 대표적 메소드(→ 바이트 스트림)
			System.out.write(ch);
			/*
			문자열 입력(종료:Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
			 섆|
			^z
			*/
		}	
	}
}