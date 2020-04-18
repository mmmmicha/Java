public class Test103_1
{
	public static void main(String[] args)
	{

		int[] a = {2,3,7,10,11};
		int[] b = {3,6,10,14};
		/*
		// 방법 ①
		// - 집합 a 의 전체 요소 출력
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		// - 집합 b 는 집합 a 와 중복되는 데이터를
		//	 제거하면서 출력
		for (int i=0; i<b.length; i++)
		{
			boolean flag = false;

			for (int j=0; j<a.length; j++)
			{
				if (b[i] == a[j])
				{
					flag = true;			//-- 중복 확인
					break;					//-- 멈춘다. 그리고 빠져나간다. (j관련 반복문 탈출)
				}
			}

			if (flag)
				continue;					//-- 뒷부분 무시하고... 계속해라.

			System.out.print(b[i] + " ");	//-- 뒷부분~!!! check~!!!
		}
		System.out.println();
		*/



		// 방법 ②
		// - 임시 배열을 만들고
		int[] temp = new int[a.length + b.length];
		// 0 0 0 0 0 0 0 0 0

		// - 만들어진 임시 배열에 중복되지 않은 배열 요소를 채운 다음
		int n;		// 변수의 선언 위치 중요~!!! check~!!!

		for (n=0; n<a.length; n++)	// 0→t, 1→t, 2→t, 3→t, 4→t, 5→f
		{
			temp[n] = a[n];
			//System.out.print(a[n] + " ");
		}
		// 2 3 7 10 11 0 0 0 0

		for (int k=0; k<b.length; k++)
		{
			boolean flag = false;

			for (int m=0; m<a.length; m++)
			{
				if (b[k] == a[m])
				{
					flag = true;
					break;
				}
			}

			if (flag)
				continue;
			
			//System.out.print(b[k] + " ");
			temp[n] = b[k];

			n++;





		}
		// 2 3 7 10 11 6 14 0 0




		// - 그렇게 구성된 임시 배열을 전체 출력
		for (int i=0; i<n; i++)
		{
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		// 2 3 7 10 11 6 14
		
	}




}

//--==>>
/*
2 3 7 10 11 6 14
계속하려면 아무 키나 누르십시오 . . .
*/

