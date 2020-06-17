package src.javaStudy;
/*========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
==========================*/

// ○ 실습 문제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력는 프로그램을 구현한다.

// 실행 예)
/*
 1  2  3  4  5
 2  3  4  5  6
 3  4  5  6  7
 4  5  6  7  8
 5  6  7  8  9
계속하려면 아무 키나 누르세요...
*/

public class Test087
{
	public static void main(String[] args)
	{
		/*
		// 배열에 내용물 넣기
		int n = 1;
		int[][] mat = new int[5][5];

		for (int i=0; i<mat.length; i++, n++)
		{	
			for (int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = n + j;
				
			}			
			
		}

		// 내용물 출력하기
		for (int i=0; i<mat.length; i++, n++)
		{	
			for (int j=0; j<mat[i].length; j++)
			{
				
				System.out.printf("%2d", mat[i][j]);
			}
			System.out.println();
		}
		*/

//==========================================================

		int n = 1;
		int[][] mat = new int[5][5];
	
		// 배열에 내용물 넣고 출력까지 하기
		for (int i=0; i<mat.length; i++, n++)
		{	
			for (int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = n + j;
				System.out.printf("%2d", mat[i][j]);
				
			}
			System.out.println();
			
		}
		
		
	}
}

/*
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
계속하려면 아무 키나 누르십시오 . . .
*/