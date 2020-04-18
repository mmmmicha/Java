/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else 문 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 16
// 두 번째 정수 입력 :  8
// 세 번째 정수 입력 : 21

// >> 정렬 결과 : 8 16 21
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test036
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int a=0, b=0, c=0;
		int s1=0, s2=0, s3=0;
		String str = "";

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

/*

//-- ① 방법
		if (a>b)
		{
			if (b>c)
			{
				s1 = c; s2 = b; s3 = a;
			}
			else if (c>b)
			{
				if (a>c)
				{
					s1 = b; s2 = c; s3 = a;
				}
				else if (c>a)
				{
					s1 = b; s2 = a; s3 = c;
				}
			}
		}
    	else if (a<b)
		{
			if (c>b)
			{
				s1 = a; s2 = b; s3 = c;
			}
			else if (b>c)
			{
				if (a>c)
				{
					s1 = c; s2 = a; s3 = b;
				}
				else if (c>a)
				{
					s1 = a; s2 = c; s3 = b;
				}
			}
		}
		else
		{
			System.out.println("\n수 중에 같은 수가 있거나, 입력이 잘 못 되었습니다.\n");
		}


		System.out.printf(" >> 정렬 결과 : %d %d %d%n",s1, s2, s3);
*/



/*
//-- ② 방법

		if (a>b)
		{
			a ^= b;
			b ^= a;
			a ^= b;
		}

		if (b>c)
		{
			b ^= c;
			c ^= b;
			b ^= c;
		}

		if (a>b)
		{
			a ^= b;
			b ^= a;
			a ^= b;
		}

		System.out.printf(" >> 정렬 결과 : %d %d %d%n",s1, s2, s3);

		

		
		//System.out.printf(" >> 정렬 결과 : %d %d %d%n",a, b, c);

*/



// ③ 방법

		int temp;

		if (a>b)
		{
			temp = a;
			a = b;
			b = temp;
		}

		if (b>c)
		{
			temp = c;
			c = b;
			b = temp;
		}

		if (a>b)
		{
			temp = b;
			b = a;
			a = temp;
		}

		System.out.printf(" >> 정렬 결과 : %d %d %d%n",a, b, c);
	}
}



/*
	if 문을 else if 까지 사용하지 않고 비교하기.
	temp 라는 변수 선언한 후,
	temp = a; a = b; b = temp;
	
*/

// 결과 출력

/*


*/