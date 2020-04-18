/*========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
==========================*/

// ○ 실습 문제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5 
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르세요...
*/

public class Test088
{
	public static void main(String[] args)
	{
		/*
		int t;

		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			t = 6-i;
			for (int j=0; j<arr[i].length; j++)
			{
				
				if (i>j)
				{
					arr[i][j] = t+j;
				}
				else
				{
					arr[i][j] = j-i+1;
				}

				System.out.printf("%2d",arr[i][j]);
				
				
			}
			System.out.println();
		}
		*/
		

//=====================================================
		/*

		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (i<=j)
				{
					arr[i][j] = j-i+1;
				}
				else
				{
					arr[i][j] = 6-i+j;
				}

				System.out.printf("%2d",arr[i][j]);
				
				
			}
			System.out.println();
		}
		*/

//=========================================================
/*

		int[] arr1 = {1,2,3,4,5};
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (j==i)
				{
					arr1[4-z] ^= arr1[3-z];	// arr1 = arr 1 ^ arr1
					arr1[3-z] ^= arr1[4-z];
					arr1[4-z] ^= arr1[3-z];
				

				}
					


						
			}
				
				
			}
			System.out.println();

*/
//============================================================
/*
		int[] arr1 = {1,2,3,4,5};

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (j==i)
				{
					temp = arr1[4-j];
					arr1[3-j]
				

				}
					


						
			}
				
				
			}
			System.out.println();
*/
//===========================================================
		
		int[][] arr = new int[5][5];



		/*
			1 2 3 4 5
			  1 2 3 4 5 
			    1 2 3 4 5
				  1 2 3 4 5
				    1 2 3 4 5
					|
					|
					|
				  b→4
		
		*/

		//초기화
		//  n → 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5
		for (int a=0; a<arr.length; a++)	// a → 0 1 2 3 4
		{
			for (int b=a, n=1; n<=5; n++)
			{
				arr[a][b]=n;
				// 1회전------------------
				// 00 01 02 03 04
				//  1  2  3  4  5
				// 2회전-----------------
				// 10 11 12 13 14 
				//  5  1  2  3  4
				// 3회전------------------
				// 20 21 22 23 24
				//  4  5  1  2  3
				b++;

				if (b==5)
				{
					b=0;
				}

			}
		}

		// 내용물 출력하기
		for (int i=0, n=0; i<arr.length; i++, n++)
		{	
			for (int j=0; j<arr[i].length; j++)
			{
				
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}



			

	}
}

// 실행 결과

/*
 1 2 3 4 5
 5 1 2 3 4
 4 5 1 2 3
 3 4 5 1 2
 2 3 4 5 1
계속하려면 아무 키나 누르십시오 . . .
*/