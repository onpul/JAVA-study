import java.util.Random;

public class LuckInfo
{
	static String[] luckkind = {"���ֿ�", "�о���", "�����", "������ �"};

	String[] loveLuck = new String[3];
	String[] academicLuck = new String[3];
	String[] jobLuck = new String[3];
	String[] todayLuck = new String[3];

	void loveLuck()
	{
		Random random = new Random();
		
		loveLuck[0] = "�ַ� Ż���� ��ȸ�� �ٷ� �����̰ڱ���~! \n���� �Ƴ��� ���� �԰� ���� ������! \n������ ���� ���� �ɾ���� �����";
		loveLuck[1] = "���� ���� ���� ����� �־��ٸ� ���� �ٰ��� ������! \n�� ����� ������ �ִ� �� ���� �ɿ�?! \n��⸦ ������~";
		loveLuck[2] = "��... ������ ������ �ʴ� ���� ���ھ��.";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[������ ���ֿ�]==================");
		System.out.println(loveLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}

	void academicLuck()
	{
		Random random = new Random();
		
		academicLuck[0] = "���ϴ� ���� ���� Ǯ�� �ſ���. �ϴ���θ� �ϸ� �ſ�! \n�̹� ���ϰ� �ִ� �ɿ�~";
		academicLuck[1] = "�غ��ϴ� ���� �� Ǯ�� �� ���� �ɿ�? \n���ݸ� �� ������! ������!";
		academicLuck[2] = "���ϰ� �־��. �� ���� ���� ���� �ſ���! \n�ڽŰ��� ��������!";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[������ �о���]==================");
		System.out.println(academicLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}

	void jobLuck()
	{
		Random random = new Random();
		
		jobLuck[0] = "�����θ� ��������!";
		jobLuck[1] = "���� ���Ḧ ���� ��ȸ�� ���� �ſ���.";
		jobLuck[2] = "���ϰ� �־��. ���� ���� ���� �ſ���.";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[������ �����]==================");
		System.out.println(jobLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}

	void todayLuck()
	{
		Random random = new Random();
		
		todayLuck[0] = "������ �ۿ� ������ �ʴ� ���� ���ھ��.";
		todayLuck[1] = "������ ������� ���� ������ ���� ���ھ��.";
		todayLuck[2] = "������ ���� �Ƴ��� ���� ���ھ��.";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[������ �]==================");
		System.out.println(academicLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}
}