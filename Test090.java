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
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르세요...
*/

public class Test090
{
	public static void main(String[] args)
	{
		int[][] alp = new int[5][5];

		int n=65;

		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{

				alp[4-j][i] = n;
					n++;

			}
		}
		
		for (int i=0; i<alp.length; i++)
		{
			for (int j=0; j<alp.length; j++)
			{

				System.out.printf("%2c", (char)alp[i][j]);

			}
			System.out.println();
		}
	}
}