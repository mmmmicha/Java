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

public class Test091
{
	public static void main(String[] args)
	{
		int[][] nums = new int[5][5];	// 전체 출력을 나타낼 기본 4byte 정수형 배열 변수 선언
		int n = 1;						// counter 변수 선언
		int sumI=0;						// 열에 대한 누적합 변수 선언 및 초기화
		int[] numsI = new int[5];		// 행에 대한 누적합 변수 선언 및 초기화
		int sumTot=0, sumsTot=0;

		for (int i=0; i<nums.length; i++)
		{
			
			for (int j=0; j<nums.length; j++)
			{
				if (j==4)
				{
					nums[i][j] = sumI;
					sumsTot += sumI;
					sumI=0;
					continue;
				}
				
				if (i==4)
				{
					nums[i][j] = numsI[j];
					continue;
				}
				
				nums[i][j] = n;
				sumI += n;

				numsI[j] += n;
				n++;

				
			}
		}
		nums[4][4] = sumsTot;

		for (int i=0; i<nums.length; i++)
		{
			for (int j=0; j<nums.length; j++)
			{
				System.out.printf("%4d", nums[i][j]);
				
			}
			System.out.println();
		}

		
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				if (i>=j)
				{
					//System.out.print(nums[i][j] + "+");
					sumTot += nums[i][j];
				}		 
			}	
		}

		System.out.print("대각선 아래의 합 : " + sumTot + " → 0");

		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				if (i>=j)
				{
					System.out.print("+" + nums[i][j]);
				}		 
			}	
		}
		System.out.println();

		/*
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				nums[i][j] = n;
				if ()
				{
				}
				n++;

			}
		}
		*/
		

		
	}
}