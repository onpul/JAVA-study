import java.util.ArrayList;

class DefaultMenu
{
	public static int dmCategory;       //defaultMenuCategory 
	public static int dmOption;         //defaultMenuOption   

	dmSelect()
	{
		System.out.print(���޴��� ������ �ּ���(���׸���1, bmt 2, �������Ŭ�� 3) : );
		dmCategory = System.in.read();

		do 
		( 
			System.out.print(������ 1 ������� 2) : );
			dmOption = System.in.read();
	
		}
		while dmCategory != ����
		
		// 
		if dmOption ==1

		Bread bread1 = new Bread(); //�� ��ü ����
		//bread.select(1);
		
		ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
		breadArrayList.add(bread1);   // �߰� �ֹ� ����Ǵ��� Ȯ�Ρ�

		else if dmOption == 2

		Salad salad1 = new Salad(); // ������ ��ü ����

		ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
		saladArrayList.add(salad1);

		else if dmOption == 3 //-- ���̵�޴�
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
	//����ڰ� �Է��� Ŀ���� ����.
	vdArray [] = {1,1,1};        //vegetableArray��äĿ���� []  //-- ��ä�� ���Ŵϱ� 1�� �̸� �ʱ�ȭ
	scArray [] ={0, 0, 0, 0};    //souceArray �ҽ�Ŀ����    // --�ҽ��߰��ϸ� 1�� �ʱ�ȭ
	cCategory;                   //cheeseCategory 1 2 3 int 
	count = 1;                   //����
	addMenu()
	{
		Yes �� 
			DefaultMenu  dm = new DefaultMenu () // �ν��Ͻ� ���� Ŭ���������� ���߿� �ʿ��ϸ� ���.
			dm.dmMenuselect();
		No  �� new ���� Ŭ����(); // �̷��� �ű�°� �³� �ʹ� ! 
	}
	vdCustom()//��ä Ŀ����();
	{
		n = 1
		vdArray = 
		Ŀ���ҿɼ�Ȯ��()
		pritn(��ä)
	}
	scCustom()//�ҽ� Ŀ����();
	{
			Ŀ���ҿɼ�Ȯ��(n)
			print(��ä,�ҽ�)
			decrease()
	}
	ccSelect()//ġ��μ����ϱ�();
	{ 
		n = 2

			Ŀ���ҿɼ�Ȯ��()
			decrease()
	}
	----------------------------------
	������ġ - ���׸��� - 15cm
	�丶�� o
	����� o
	����   x
	ġ��   ������
		

	
	addCount();//�����߰��޼ҵ�();
	{
			���� � �߰��ҷ�? : 3��
			n = 3;
			count += n;
			��ä 
			�ҽ�
			ġ��
			
			Ŀ���ҿɼ�Ȯ��(
			~~~~~ , ���׸��仧 4��)
			decrease()
	}

	decrease() //���Ҹ޼ҵ�
	{
		��� ���� - Ŀ���Һ��� <0 // ��ᰡ ����
		�� ���źҰ�. ���ǰ��.
			�Ź� Ŀ������ �� ������ ���Ҹ޼ҵ�() ȣ��
	}

	checkCustom(int n)
	{

		int [] customArray= { ����Ʈ�޴�,������,��ä[0], ��ä[1], ��ä[2], �ҽ�[0], ~~~ };
		for (int ;i <5 ;i++ )
		{	
			��ä [2] ���� ��� ~ �̷���.
			print(Ŀ���ҿ�[i]);
			Ŀ���ҿɼ� ���� ��� �迭 ? 
		}
	}


}

class Bread extends SuperMenu
{
	String bCategory;               //�� ����; ��.bCategort == "���׸���" �� ++;
    int bPrice;                     //�� ����;
	int bLength;                    //�� ����;

	Bread () //-- ������.
	{
		bcSelect();//breadCategory������ select(����Ʈ n) //���׸���, BMT ���
		blSelect()//breadLength������();
		vdCustom()//��ä Ŀ����();
		/*
		super.scCustom()//�ҽ� Ŀ����();
		super.ccSelect()//ġ��μ����ϱ�();
		super.addCount();//�����߰��޼ҵ�();
		super.addMenu();//�߰��޴��޼ҵ�();
		*/
	}

	bcSelect()(int DefaultMenu.dmOption) // �Ű����� ���� ��
	{
		if dmCategory == 1
		this.bCategory = "���׸���";
		this.bPrice= 4500;
		
		else if dmCategory ==2
		this bCategory = BMT
		this bPrice  = 5500
	}

	blSelect()
	{
		bLength 15? 30? 
		this.bLength = ����� �Է°�;
	}

	vdCustom()
	{

		 System.out. print(���丶��, �����, ���� ���þ����� 0 ���鱸��: ��); 1 0 1
		 this.vdArray = ����� �Է� ������ �ʱ�ȭ;

	}
	scCustom()
	{
		 System.out. print(���ӽ�Ÿ��, ����, ��ġ �巹�� ���þ����� 0 ���鱸��: ��); 1 0 1
		 this.scArray = ����� �Է� ������ �ʱ�ȭ;

	}
	ccSelect()
	{
		n = ġ�� �����ض� 1, 2, 3
		switch (n)
		{
		case 1: ������
		case 2: ġ������ 2 ...
		
		}
	}
	addCount()
	{
		n = �����߰��ҷ�? 3
		while(n)
		{
			this.������ ++; // -- �̷��� �� ���������� ���� �þ.
		}
	}


	
}


class Salad extends SuperMenu
{
	sCategory;//SaladCategory
    sPrice;//SaladPrice�����尡��;

	Salad() //-- ������.
	{
		scSelect();//SaladCategory���������� select(����Ʈ n)
		super.scCustom()//�ҽ� Ŀ����();
		super.ccSelect()//ġ��μ����ϱ�();
		super.addCount();//�����߰��޼ҵ�();
		super.addMenu();//�߰��޴��޼ҵ�();
	}

	scSelect(����Ʈ n) // �Ű����� ���� ��
	{
		if n == 1
		this.sCategory = ���׸���
		this.sPrice = 4500 + 1700;
		
		else if n ==2
		this sCategory = BMT
		this sPrice  = 5500 + 1700;
	}
}
	


class SideMenu extends CustomArray implements ��ȿ���˻�.
{
	smCategory;
	smPrice;

	SideMenu()
	{
	smSelect();//���̵����������ϱ�();
	super.addMenu();//�߰��޴��޼ҵ�();
	}

	smSelect()()
	{
		���̵� ���ҷ�? �ݶ�� 1 ���ָ� 2 ...
		n = ������Է°�; 
		if (1)
		{
			smCategory = �ݶ�
			smPrice = 1000;
			super.addCount();
		} 
		else if (2 ) // ����
		{
			adultCertification(); boolean ��ȯ
			if (true)
			{
				smPrice = 2000;
				super.addCount();
			}
			else
				"���ξƴ϶� ���� ����";
		
	}


	adultCertification()
	{
		�ֹι�ȣ��ȿ���˻�
		�� �ֹι�ȣ ���ڸ� �տ� 2���� >= 20 �̸� true ��ȯ �ƴϸ� false ��ȯ
	}

} 
class OrderRecord
{
	//breadArrayList ... = {��1, ��2, ��3} �� static ���������� �����ض�
	//salad = {������1, ������ 2....} // static ����
	//sidemenuArrayList = {���̵�޴�1,���̵�޴�2...}; 

		/*
		set������(int n)
		{
			n = ��.������;
		}
		*/
		setBread(n,n1,n2,n3,n4��)
		{
		System.out.print(bLenth : n);
		System.out.print(bCategory : n1);
		System.out.print(bPrice: n3);
		}
		setSalad();
		setSidemenu();
}

//��� ���� Ŭ����
class IngManagement 
{		
		// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
		Map<String, int> vegetable = new HashMap<String, int>();
		Map<String, int> sauce = new HashMap<String, int>();
		Map<String, int> cheese = new HashMap<String, int>();
		Map<String, int> bread = new HashMap<String, int>();
		Map<String, int> sidemenu = new HashMap<String, int>();
		
		String [] breArray= {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String [] vaArray = {"�丶��","�����","����","����","�ø���"};
		String [] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String [] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String [] sidArray = {"�ݶ�","Ŀ��","��Ű","����","����"};
		
		for (String s : breArray)
		{
			bread.put(s, 0);
		}
		
		for (String s : vaArray)
		{
			vegetable.put(s, 0);
		}
		vegetable.put("�丶��", 0);

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
	
		
		// �����ڰ� ���� ������Ű�� �޼ҵ�
		ingPut() 
		{
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("��������� ���� ���� ���� �÷�?");
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
	//�������ҷ�? �丶�� 100
	ingPut ();
}
		
}
class NowOrderOption
{
	int n1 = ��.size();
	int n1 = ��.size();
	int n1 = ��.size();
	static void nowOrderOption()
	{
		System.out.println("�� ���� : " + n1); // ��ü����� ���������ֱ�
	}
	
}

public class food
{
	public static void main(String[] args)
	{		


	}
}