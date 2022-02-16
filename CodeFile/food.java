import java.util.ArrayList;

class DefaultMenu
{
	public static int dmCategory;       //defaultMenuCategory 
	public static int dmOption;         //defaultMenuOption   

	dmSelect()
	{
		System.out.print(“메뉴를 선택해 주세요(에그마요1, bmt 2, 서브웨이클럽 3) : );
		dmCategory = System.in.read();

		do 
		( 
			System.out.print(“빵은 1 샐러드는 2) : );
			dmOption = System.in.read();
	
		}
		while dmCategory != 숫자
		
		// 
		if dmOption ==1

		Bread bread1 = new Bread(); //빵 객체 생성
		//bread.select(1);
		
		ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // 빵만 담는 ArrayList
		breadArrayList.add(bread1);   // 추가 주문 적용되는지 확인★

		else if dmOption == 2

		Salad salad1 = new Salad(); // 샐러드 객체 생성

		ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류 // 샐러드만 담는 ArrayList
		saladArrayList.add(salad1);

		else if dmOption == 3 //-- 사이드메뉴
		{
			SideMenu sidemenu1 = new sidemenu();

			ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
			sideMenuArrayList.add(sidemenu1);
		}
		else if dmOption == 4;
		{
			nowOrderOption();
		}

}

class SuperMenu
{
	//사용자가 입력한 커스텀 수량.
	vdArray [] = {1,1,1};        //vegetableArray야채커스텀 []  //-- 야채는 뺄거니까 1로 미리 초기화
	scArray [] ={0, 0, 0, 0};    //souceArray 소스커스텀    // --소스추가하면 1로 초기화
	cCategory;                   //cheeseCategory 1 2 3 int 
	count = 1;                   //개수
	addMenu()
	{
		Yes → 
			DefaultMenu  dm = new DefaultMenu () // 인스턴스 생성 클래스명세서에 나중에 필요하면 써라.
			dm.dmMenuselect();
		No  → new 결제 클래스(); // 이렇게 옮기는게 맞나 싶다 ! 
	}
	vdCustom()//야채 커스텀();
	{
		n = 1
		vdArray = 
		커스텀옵션확인()
		pritn(야채)
	}
	scCustom()//소스 커스텀();
	{
			커스텀옵션확인(n)
			print(야채,소스)
			decrease()
	}
	ccSelect()//치즈여부선택하기();
	{ 
		n = 2

			커스텀옵션확인()
			decrease()
	}
	----------------------------------
	샌드위치 - 에그마요 - 15cm
	토마토 o
	양상추 o
	양파   x
	치즈   슈레드
		

	
	addCount();//개수추가메소드();
	{
			개수 몇개 추가할래? : 3개
			n = 3;
			count += n;
			야채 
			소스
			치즈
			
			커스텀옵션확인(
			~~~~~ , 에그마요빵 4개)
			decrease()
	}

	decrease() //감소메소드
	{
		재료 변수 - 커스텀변수 <0 // 재료가 없음
		→ 구매불가. 재료품절.
			매번 커스텀을 할 때마다 감소메소드() 호출
	}

	checkCustom(int n)
	{

		int [] customArray= { 디폴트메뉴,빵길이,야채[0], 야채[1], 야채[2], 소스[0], ~~~ };
		for (int ;i <5 ;i++ )
		{	
			야채 [2] 까지 출력 ~ 이런식.
			print(커스텀용[i]);
			커스텀옵션 정보 담기 배열 ? 
		}
	}


}

class Bread extends SuperMenu
{
	String bCategory;               //빵 종류; 빵.bCategort == "에그마요" 수 ++;
    int bPrice;                     //빵 가격;
	int bLength;                    //빵 길이;

	Bread () //-- 생성자.
	{
		bcSelect();//breadCategory빵종류 select(디폴트 n) //에그마요, BMT 등등
		blSelect()//breadLength빵길이();
		vdCustom()//야채 커스텀();
		/*
		super.scCustom()//소스 커스텀();
		super.ccSelect()//치즈여부선택하기();
		super.addCount();//개수추가메소드();
		super.addMenu();//추가메뉴메소드();
		*/
	}

	bcSelect()(int DefaultMenu.dmOption) // 매개변수 보류 ★
	{
		if dmCategory == 1
		this.bCategory = "에그마요";
		this.bPrice= 4500;
		
		else if dmCategory ==2
		this bCategory = BMT
		this bPrice  = 5500
	}

	blSelect()
	{
		bLength 15? 30? 
		this.bLength = 사용자 입력값;
	}

	vdCustom()
	{

		 System.out. print(“토마토, 양상추, 양파 선택안함은 0 공백구분: “); 1 0 1
		 this.vdArray = 사용자 입력 값으로 초기화;

	}
	scCustom()
	{
		 System.out. print(“머스타드, 케찹, 랜치 드레싱 선택안함은 0 공백구분: “); 1 0 1
		 this.scArray = 사용자 입력 값으로 초기화;

	}
	ccSelect()
	{
		n = 치즈 선택해라 1, 2, 3
		switch (n)
		{
		case 1: 슈레드
		case 2: 치즈종류 2 ...
		
		}
	}
	addCount()
	{
		n = 개수추가할래? 3
		while(n)
		{
			this.빵개수 ++; // -- 이러면 빵 개수변수의 수가 늘어남.
		}
	}


	
}


class Salad extends SuperMenu
{
	sCategory;//SaladCategory
    sPrice;//SaladPrice샐러드가격;

	Salad() //-- 생성자.
	{
		scSelect();//SaladCategory샐러드종류 select(디폴트 n)
		super.scCustom()//소스 커스텀();
		super.ccSelect()//치즈여부선택하기();
		super.addCount();//개수추가메소드();
		super.addMenu();//추가메뉴메소드();
	}

	scSelect(디폴트 n) // 매개변수 보류 ★
	{
		if n == 1
		this.sCategory = 에그마요
		this.sPrice = 4500 + 1700;
		
		else if n ==2
		this sCategory = BMT
		this sPrice  = 5500 + 1700;
	}
}
	


class SideMenu extends CustomArray implements 유효성검사.
{
	smCategory;
	smPrice;

	SideMenu()
	{
	smSelect();//사이드종류선택하기();
	super.addMenu();//추가메뉴메소드();
	}

	smSelect()()
	{
		사이드 뭐할래? 콜라면 1 맥주면 2 ...
		n = 사용자입력값; 
		if (1)
		{
			smCategory = 콜라
			smPrice = 1000;
			super.addCount();
		} 
		else if (2 ) // 맥주
		{
			adultCertification(); boolean 반환
			if (true)
			{
				smPrice = 2000;
				super.addCount();
			}
			else
				"성인아니라 맥주 못사";
		
	}


	adultCertification()
	{
		주민번호유효성검사
		그 주민번호 앞자리 앞에 2개로 >= 20 이면 true 반환 아니면 false 반환
	}

} 
class OrderRecord
{
	//breadArrayList ... = {빵1, 빵2, 빵3} → static 할지안할지 생각해라
	//salad = {샐러드1, 샐러드 2....} // static 보류
	//sidemenuArrayList = {사이드메뉴1,사이드메뉴2...}; 

		/*
		set빵길이(int n)
		{
			n = 빵.빵길이;
		}
		*/
		setBread(n,n1,n2,n3,n4…)
		{
		System.out.print(bLenth : n);
		System.out.print(bCategory : n1);
		System.out.print(bPrice: n3);
		}
		setSalad();
		setSidemenu();
}

//재료 관리 클래스
class IngManagement 
{		
		// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
		Map<String, int> vegetable = new HashMap<String, int>();
		Map<String, int> sauce = new HashMap<String, int>();
		Map<String, int> cheese = new HashMap<String, int>();
		Map<String, int> bread = new HashMap<String, int>();
		Map<String, int> sidemenu = new HashMap<String, int>();
		
		String [] breArray= {"화이트","허니오트","플랫브래드"};
		String [] vaArray = {"토마토","양상추","오이","양파","올리브"};
		String [] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
		String [] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
		String [] sidArray = {"콜라","커피","쿠키","스프","맥주"};
		
		for (String s : breArray)
		{
			bread.put(s, 0);
		}
		
		for (String s : vaArray)
		{
			vegetable.put(s, 0);
		}
		vegetable.put("토마토", 0);

		for (String s : sauArray)
		{
			sauce.put(s, 0);
		}

		for (String s : chArray)
		{
			cheese.put(s, 0);
		}

		for (String s : sidArray)
		{
			sidemenu.put(s, 0);
		}
	
		
		// 관리자가 수량 증가시키는 메소드
		ingPut() 
		{
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("사용자한테 무슨 종류 수량 늘래?");
				que = sc.next();
			}
			while ();
			~~ n 
				~~n1
				put(n,n1);
		}
}

class Manager extends Ingredient
{
	//얼마증가할래? 토마토 100
	ingPut ();
}
		
}
class NowOrderOption
{
	int n1 = 빵.size();
	int n1 = 빵.size();
	int n1 = 빵.size();
	static void nowOrderOption()
	{
		System.out.println("빵 개수 : " + n1); // 객체만들고 개수보여주기
	}
	
}

public class food
{
	public static void main(String[] args)
	{		


	}
}