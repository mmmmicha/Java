/*========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
==========================*/

// ○ 실습 문제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(4x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  8  9 16 17 
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르세요...
*/

public class Test089
{
	public static void main(String[] args)
	{
		/*
		int[][] arr = new int[4][5];
		
		for (int i=0; i<arr.length; i++)		// 행
		{
			
			for (int j=0; j<arr[i].length; j++)	// 열
			{
				
				if (j%2==0)						// 홀수열
				{
					arr[i][j] = 4*j+i+1;
				}
				else							// 짝수열
				{
					arr[3-i][j] = 4*j+i+1;
				}
				System.out.printf("%3d", arr[i][j]);
				
			}
			System.out.println();
			
		}

		System.out.println("============================");
		
		
		for (int i=0; i<arr.length; i++)
		{
			
			for (int j=0; j<arr[i].length; j++)
			{
				
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/

//=====================================================================

		int[][] arr = new int[4][5];

		int n = 0;
		
		for (int i=0; i<5; i++)		// i → 0 1 2 3 4 
		{
			
			for (int j=0; j<4; j++)	// j → 0 1 2 3
			{
				n++;
				if (i%2==0)						// 홀수열
					arr[j][i] = n;
				else							// 짝수열
					arr[3-j][i] = n;
						
			}
		}
		
		
		for (int i=0; i<arr.length; i++)
		{
			
			for (int j=0; j<arr[i].length; j++)
			{
				
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		

		
	}
}

/*
  1  0  9  0 17
  2  0 10  0 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . . .
*/