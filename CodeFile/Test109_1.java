// 선택 정렬(Selection Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------
public class Test109_1
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		int i, j;

		for(i=0; i<a.length-1; i++) 
		{
			int min_index = i;	
			
			// 최솟값을 갖고있는 인덱스 찾기 
			for(j=i+1; j<a.length; j++)
			{
				if(a[j]<a[min_index]) 
				{
					min_index = j;
				}
			}

			// i번째 값과 찾은 최솟값을 서로 교환 
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}
//-------------------------------------------------------------------------------------------------
