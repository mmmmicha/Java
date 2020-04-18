/*=========================================
  ■■■ 정렬(sort) 알고리즘 ■■■
  - 거품 정렬(Bubble Sort : 버블 정렬)
=========================================*/

/*
※ 앞서 공부한 Selection Sort 나 Bubble Sort 의 성능은 같다.
   (반복의 횟수로 추정)
   하지만, 향상된 Bubble Sort 는 대상 데이터의 구조에 따라
   일반 Bubble Sort 나 Selection Sort 보다 성능이 좋다.


원본 데이터 : 61 15 20 22 30

==>> 회전시 스왑이 

*/

public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 33, 40};

		/*
		10 50 20 33 40		0	1
		== --
		10 20 50 33 40		1	2
		   == --
		10 20 33 55 40		2	3
		      == --
		10 20 33 40 55		3	4
		         == --
		--------------------------------- 1회전
		10 20 33 40 55	   
		== --				0	1
		   == --			1	2
		      == --			2	3
		--------------------------------- 2회전
		X
		X
		--------------------------------- 3회전
		X



		*/

		int pass, temp;
		boolean flag;

		System.out.print("Source Data : ");
		for (int n :a )
		{
			System.out.print(n + " ");
		}
		System.out.println();
		//--==>> Source Data : 10 50 20 33 40

		// 향상된 Bubble Sort 구현

		pass=0;

		do
		{
			flag = false;
			pass++;
			for (int i=0; i<a.length-pass; i++)
			{
				
				if (a[i] > a[i+1])
				{
					// 자리 바꾸기
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

					flag = true;
					//-- 단 한번이라도 스왑(자리 바꿈)이 발생하면
					//	 flag 변수는 true 로 변경~!!!
				}
				

			}
		}
		while (flag);
		//-- flag 가 false 라는 것은
		//	 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//	 더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!!



		System.out.print("Sorted Data : ");
		for (int n :a )
		{
			System.out.print(n + " ");
		}
		System.out.println();






	}
}