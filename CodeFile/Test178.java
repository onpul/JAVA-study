// 2022-02-09 수

// ▶ 자바의 기본 입출력(I/O)

// Reader Writer 실습
//-------------------------------------------------------------------------------------------------
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class Test178
{
	public void process(InputStream is) // System.in --> 업캐스팅
	{// InputStream OutputStream --> 바이트 스트림의 조상

		int data;

		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{
			// 매개변수 is라는 바이트 기반 객체(InputStream)를
			// 문자 스트림으로 변환하여
			// (→ InputStreamReader 가 수행)
			// Reader 타입의 rd에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);
            
			// 바이트 기반 스트림인 자바 기본 출력 스트림(System.out)을
			// 문자 스트림으로 변환하여
			// (→ OutputStreamWriter가 수행)
			// Writer 타입의 wt 에서 참조할 수 있도록 처리
			//문자 기반     문자 기반으로 변환                      
			Writer wt = new OutputStreamWriter(System.out);
            //              문자 기반으로 변환
			while ( (data = rd.read()) != -1 )
			{
				wt.write(data); //-- 내보내는 스트림 물줄기에 기록 --> 수제비 떼서 동동
				wt.flush();     //-- 기록한 스트림을 밀어내어 내보냄
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args)
	{
		Test178 ob = new Test178();
		ob.process(System.in);
	}
}
// 실행 결과
/*
문자열 입력(종료:Ctrl+z)
abcd
abcd
1234
1234
가나다라
가나다라
^Z
*/