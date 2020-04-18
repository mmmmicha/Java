/*====================
  ■■■ 배열 ■■■
  - 배열의 복사
====================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// 임의의 두 배열
// int[] a = {2,3,7,10,11}
// int[] b = {3,6,10,14}

// 실행 예)
// 2 3 7 10 11 6 14
// 계속하려면 아무 키나 누르세요...

public class Test103
{
	public static void main(String[] args)
	{
		// 임의의 두 배열 구성
		int[] a = {2,3,7,10,11};
		int[] b = {3,6,10,14};
		int count = 0;

		
		int[] temp = new int[b.length];
		

		for (int i=0; i<b.length; i++)
		{
			//sum[i] = a[i];
			temp[i] = b[i];
		}

		

		for (int j=0; j<b.length; j++)
		{
			for (int i=0; i<a.length; i++)
			{
				
				if (temp[j]==a[i])
				{
					count++;
					temp[j]=0;

				}
			}
		}

		int n = a.length + b.length - count;

		int[] sum = new int[n];

		for (int i=0; i<a.length; i++)
		{
			sum[i] = a[i];
		}

		for (int i=a.length, j; i<a.length+b.length; i++)
		{
			for (j=0; j<b.length; j++)
			{
				if (temp[j]==0)
				{
					continue;	
				}
				sum[i] = temp[j];
			}
			
			
		}
		

		for (int i=0; i<sum.length; i++)
			System.out.printf("%4d", sum[i]);

		System.out.println();
			


		
	}


}