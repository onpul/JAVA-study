import java.util.Random;

public class LuckInfo
{
	static String[] luckkind = {"연애운", "학업운", "취업운", "오늘의 운세"};

	String[] loveLuck = new String[3];
	String[] academicLuck = new String[3];
	String[] jobLuck = new String[3];
	String[] todayLuck = new String[3];

	void loveLuck()
	{
		Random random = new Random();
		
		loveLuck[0] = "솔로 탈출의 기회가 바로 오늘이겠군요~! \n가장 아끼는 옷을 입고 나가 보세요! \n누군가 먼저 말을 걸어올지 몰라요";
		loveLuck[1] = "요즘 관심 가는 사람이 있었다면 먼저 다가가 보세요! \n그 사람도 관심이 있는 것 같은 걸요?! \n용기를 내봐요~";
		loveLuck[2] = "흠... 오늘은 나서지 않는 것이 좋겠어요.";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[오늘의 연애운]==================");
		System.out.println(loveLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}

	void academicLuck()
	{
		Random random = new Random();
		
		academicLuck[0] = "원하는 일이 술술 풀릴 거예요. 하던대로만 하면 돼요! \n이미 잘하고 있는 걸요~";
		academicLuck[1] = "준비하던 일이 잘 풀릴 것 같은 걸요? \n조금만 더 힘내요! 파이팅!";
		academicLuck[2] = "잘하고 있어요. 곧 좋은 일이 있을 거예요! \n자신감을 가지세요!";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[오늘의 학업운]==================");
		System.out.println(academicLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}

	void jobLuck()
	{
		Random random = new Random();
		
		jobLuck[0] = "스스로를 믿으세요!";
		jobLuck[1] = "좋은 동료를 만날 기회가 있을 거예요.";
		jobLuck[2] = "잘하고 있어요. 좋은 일이 있을 거예요.";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[오늘의 취업운]==================");
		System.out.println(jobLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}

	void todayLuck()
	{
		Random random = new Random();
		
		todayLuck[0] = "오늘은 밖에 나가지 않는 것이 좋겠어요.";
		todayLuck[1] = "오늘은 사람들을 많이 만나는 것이 좋겠어요.";
		todayLuck[2] = "오늘은 말을 아끼는 것이 좋겠어요.";
		
		int i = random.nextInt(3);
		System.out.println("\n==================[오늘의 운세]==================");
		System.out.println(academicLuck[i]);
		System.out.println("===================================================");
		System.out.println();
	}
}