/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else 문 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 14
// 연산자 입력(+ - * /) : +

// >> 10 + 14 = 24
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int num1, num2;			//-- 첫 번째, 두 번째 정수
		double res = 0.0;		//-- 연산 결과 변수
		char cal;				//-- 연산자 변수

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력      : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력      : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력( + - * / ) : ");
		cal = (char)System.in.read();
		

		if (cal=='+')
			res = num1 + num2;
		else if (cal=='-')
			res = num1 - num2;
		else if (cal=='*')
			res = num1 * num2;
		else if (cal=='/')
			res = num1 / (double)num2;
		else
			System.out.println("확인요망");
			
		

		// 출력 결과
		System.out.println();
		System.out.printf(" >> %d %c %d = %.2f\n",num1 ,cal ,num2, res);
		

		/*
		// 방법 ②

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, op;
		double res;
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = System.in.read();

		// 확인
		//System.out.println("op : " + op);
		//--==>> + → op : 43
		//		 - → op : 45
		//		 * → op : 42
		//		 / → op : 47

		if (op==43)
		{
			res = num1 + num2;
		}
		else if (op==45)
		{
			res = num1 - num2;
		}
		else if (op==42)
		{
			res = num1 * num2;
		}
		else if (op==47)
		{
			res = num1 / (double)num2;
		}
		else
		{
			System.out.println("입력 과정에 오류가 존재합니다.");
		}
		*/
		
		/*
		// 방법 ③

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;
		char op;
		double res=0.0;

		System.out.println("첫 번째 정수 입력	: ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력	 : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op=='+')
		{
			res = num1 + num2;
		}
		else if (op=='-')
		{
			res = num1 - num2;
		}
		else if (op=='*')
		{
			res = num1 * num2;
		}
		else if (op=='/')
		{
			res = num1 / num2;
		}
		else 
		{
			res = 0.0;
		}

		System.out.printf("\n>> %d %c %d = %d%n", num1, op, num2, res);
		*/

	}
}

/*
첫 번째 정수 입력      : 10
두 번째 정수 입력      : 10
연산자 입력( + - * / ) : +

 >> 10 + 10 = 20.00
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력      : 0
두 번째 정수 입력      : 10
연산자 입력( + - * / ) : -

 >> 0 - 10 = -10.00
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력      : 10
두 번째 정수 입력      : 10
연산자 입력( + - * / ) : *

 >> 10 * 10 = 100.00
계속하려면 아무 키나 누르십시오 . . .


*/