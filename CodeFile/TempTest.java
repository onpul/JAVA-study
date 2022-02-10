import java.util.ArrayList;

변수명 규칙 = 선언된클래스+용도; 브래드카테고리, 브래드랭스, 브래드프라이스,, 
메소드명 규칙 = 해당클래스+용도; 디폴트메뉴셀렉트, 낙타 캐멀케이스 ? 그걸로
class DefaultMenu
{
	int dmCategory;//defaultMenuCategory     // 에그마요1, bmt 2, 클럽 3 dmc as dmc
	int dmOption; //defaultMenuOption   // 빵1 샐러드 2 사이드메뉴 3 현재 옵션 4

	dmSelect()
	{
		System.out.print(“메뉴를 선택해 주세요(에그마요1, bmt 2, 서브웨이클럽 3) : );
		dmCategory = System.in.read();

		do 
		( System.out.print(“빵은 1 샐러드는 2) : );
		 dmOption = System.in.read();


		while dmCategory != 숫자

		if dmOption ==1

		Bread bread1 = new Bread();
		//bread.select(1);
		
		ArrayList<Bread> breadArrayList = new ArrayList<Bread>();
		breadArrayList.add(bread1);   // 추가 주문 적용되는지 확인★

		else if dmOption == 2

		Salad salad1 = new Salad();

		ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류
		saladArrayList.add(salad1);

		else if dmOption == 3 //-- 사이드메뉴
		{
			SideMenu sidemenu1 = new sidemenu();

			ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
			sideMenuArrayList.add(sidemenu1);
		}
		else if dmOption == 4;
		{
			현재옵션출력하는메소드();
		}

}

class SuperMenu
{
	vdArray [] = {1,1,1,1}; //vegetableArray야채커스텀 []  //-- 야채는 뺄거니까 1로 미리 초기화
	scArray [] ={0, 0, 0, 0};//sourceArray 소스커스텀 // --소스추가하면 1로 초기화
	cCategory;//cheeseCategory
	count; //개수
	addMenu()
	{
		Yes → DefaultMenu  
			dm = new DefaultMenu ()
			dm.dmMenuselect();
		No  → new 결제 클래스(); // 이렇게 옮기는게 맞나 싶다 ! 
	}
	vdCustom()//야채 커스텀();
	scCustom()//소스 커스텀();
	ccSelect()//치즈여부선택하기();
	addCount();//개수추가메소드();
}

class Bread extends SuperMenu
{
    bCategory;//BreadCategory 빵종류;
    bPrice;//BreadPrice 빵가격;
	bLength;//BreadLength빵길이;

	Bread () //-- 생성자.
	{
		bcSelect();//breadCategory빵종류 select(디폴트 n) //에그마요, BMT 등등
		blSelect()//breadLength빵길이();
		vdCustom()//야채 커스텀();
		super.scCustom()//소스 커스텀();
		super.ccSelect()//치즈여부선택하기();
		super.addCount();//개수추가메소드();
		super.addMenu();//추가메뉴메소드();
	}

	bcSelect()(int DefaultMenu.dmOption) // 매개변수 보류 ★
	{
		if n == 1
		this. bCategory = 에그마요
		this.bPrice= 4500
		
		else if n ==2
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
	


class SideMenu extends CustomArray
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
class 주문내역
{
	breadArrayList ... = {빵1, 빵2, 빵3} → static 할지안할지 생각해라
	salad = {샐러드1, 샐러드 2....} // static 보류
	sidemenuArrayList = {사이드메뉴1,사이드메뉴2...}; 

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


public class TempTest
{
	public static void main(String[] args)
	{		


	}
}