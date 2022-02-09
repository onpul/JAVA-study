import java.io.IOException;

public class Sample
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		System.out.println("문자열 입력(종료: Ctrl+z)");
		
		// read() : InputStream 클래스의 대표적 메소드 (→ 바이트 스트림)
		while ( (data = System.in.read()) != -1 ) // -1인 이유 : Ctrl+z 하면 null로 처리돼서 -1임
		{//      int형  ----------------아스키 값 받음        
			ch = (char)data; // char형으로 강제 형변환 --> 문자열로.        // ●Q1. char형으로 강제 형변환한 건데 어떻게 문자열이 받아지나요...?

			//System.out.print(ch); // ●Q2. print() 메소드 사용 시 왜 "가나다라"는 깨져서 출력되나요? 문자열 받은 변수인데...
			/*
			문자열 입력(종료: Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
			°¡³ª´?¶?                   
			^Z
			*/

			// write() : OutputStream 클래스의 대표적 메소드(→ 바이트 스트림)
		    System.out.write(ch); // ●Q3. write() 메소드에서는 왜 "가나다라"가 잘 출력되나요...? write()는 바이트 기반인데...
			/*
			문자열 입력(종료: Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
			가나다라
			*/
		}
	}
}
/*
바이트 기반 : 입출력의 단위가 1byte
=> 자바에서는 한 문자를 의미하는 char형이 2byte이기 때문에 
   바이트기반의 스트림으로 2byte인 문자를 처리하는 데는 어려움이 있다.
*/