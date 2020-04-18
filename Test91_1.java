public class Test91_1
{
/*========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
==========================*/

// ○ 실습 문제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1  2  3  4  10
 5  6  7  8  26
 9 10 11 12  42
13 14 15 16  58
28 32 36 40 136
대각선의 아래의 합 : 100 → 1 + 5 + 6 + 7 + ... + 15 + 16
계속하려면 아무 키나 누르세요...
*/

	public static void main(String[] args)
	{
		int[][] num = new int[5][5];
		
		int n = 1;

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				num[i][j] = n++;

				num[i][4] += num[i][j];

				num[4][j] += num[i][j];

				if(i>=j)
				{
					num[4][4] += num[i][j];
				}
				
			}
		}

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("대각선의 합 : 100 → ");

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(i>=j)
				{
					System.out.print(num[i][j]);

					if(i!=3 || j!=3)
						System.out.print(" + ");
				}
				

			}
		}
		System.out.println();


	}
}