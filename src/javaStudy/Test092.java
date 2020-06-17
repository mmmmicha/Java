package src.javaStudy;
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
 A  B  C  D  E
 F  G  H  I  J
 K  L  M  N  O
 P  Q  R  S  T
 U  V  W  X  Y
계속하려면 아무 키나 누르세요...
*/

/*
 A
 B  C
 D  E  F
 G  H  I  J
 K  L  M  N  O
계속하려면 아무 키나 누르세요...
*/

/*
 A
 C  B
 D  E  F
 J  I  H  G
 K  L  M  N  O
계속하려면 아무 키나 누르세요...
*/

public class Test092
{
	public static void main(String[] args)
	{

		int[][] alp = new int[5][5];

		int n = 65;
//=======================================================
/*
		
		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{
				alp[i][j] = n;
				n++;

			}
		}

		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{
				System.out.printf("%3c", (char)alp[i][j]);
			}
			System.out.println();
		}
		

		System.out.println();
		
*/
//==============================================================
/*
		n = 65;
		
		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{
				if (i>=j)
				{
				
						alp[i][j] = n;
						n++;
			
				}
			}
		}

		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{
				System.out.printf("%3c", (char)alp[i][j]);
			}
			System.out.println();
		}

		System.out.println();
*/
//=====================================================================
/*
		n = 65;
		
		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{
				if (i>=j)
				{
					if (i%2==0)
					{
						alp[i][j] = n;
						n++;
					}
					else
					{
						alp[i][i-j] = n;
						n++;
					}
					
				}
			}
		}

		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{
				System.out.printf("%3c", (char)alp[i][j]);
			}
			System.out.println();
		}
		
*/
	}
}

/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y

계속하려면 아무 키나 누르십시오 . . .


  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O

계속하려면 아무 키나 누르십시오 . . .


  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/