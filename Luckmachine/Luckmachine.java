import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Luckmachine 
{
	int sel=0;
	
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// [ ���ֿ� �о��� ����� ������ � ]
		System.out.print("[ ");
		for (int i=0; i<LuckInfo.luckkind.length; i++)
		{
			System.out.print(LuckInfo.luckkind[i] + " "); 
		}
		System.out.println("]");

		System.out.println("��� ������ ������ �ּ���.");
		System.out.print("�翬�ֿ� ���о��� ������� ������� � : ");
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