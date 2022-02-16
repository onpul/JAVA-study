import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Luckmachine 
{
	int sel=0;
	
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// [ 연애운 학업운 취업운 오늘의 운세 ]
		System.out.print("[ ");
		for (int i=0; i<LuckInfo.luckkind.length; i++)
		{
			System.out.print(LuckInfo.luckkind[i] + " "); 
		}
		System.out.println("]");

		System.out.println("운세의 종류를 선택해 주세요.");
		System.out.print("①연애운 ②학업운 ③취업운 ④오늘의 운세 : ");
		sel = Integer.parseInt(br.readLine());
	}

	void machine()
	{
		LuckInfo info = new LuckInfo();

		switch (sel)
		{
			case 1 : info.loveLuck(); break;
			case 2 : info.academicLuck(); break;
			case 3 : info.jobLuck(); break;
			case 4 : info.todayLuck(); break;
		}
	}
}