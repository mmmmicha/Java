package src.javaStudy;
/*===============================
  ■■■ 클래스와 인스턴스 ■■■
  ===============================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /)    : +
// > 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{

	//-- 전역 변수 선언
	//	 n1		: 첫 번째 정수
	//	 n2		: 두 번째 정수
	//	 result : 연산결과
	//	 c		: 연산자

	int n1, n2, result;		
	char c;

	void nInput()						//-- 정수 입력 → 메소드 정의
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백구분) : ");
		n1 = sc.nextInt();				//-- 첫 번째 정수 입력
		n2 = sc.nextInt();				//-- 두 번째 정수 입력

		System.out.println("n1:"+n1+", n2:"+n2);
	}

	void cInput() throws IOException	//-- System.in.read() 사용을 위한 tool
	{
		System.out.print("임의의 연산자 입력(+ - * /)   : ");
		c = (char)System.in.read();		//-- 연산자 입력
		//System.out.println(c);

		switch (c)						//-- 입력받은 연산자에 따른 연산 실시 결과 대입
		{
			case '+' : result = n1 + n2; break;
			case '-' : result = n1 - n2; break;
			case '*' : result = n1 * n2; break;
			case '/' : 
			{
				if (n2==0) 
					break; 
				result = n1 / n2;		
			}			
			default : System.out.println("연산자를 다시 입력해주세요.");	//-- 잘못된 입력 시 안내문
		}
	}

	void print()						//-- 값 출력 → 메소드 정의
	{
		/* Test
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(result);
		System.out.println("|" + c + "|");
		*/

		//System.out.println("n1:"+n1+", n2:"+n2+", c:"+c+", result:"+result);

		
		if (n2==0 && c=='/'	|| c!='+' || c!='-' || c!='*' || c!='/')	// \r은 개행 후 맨 왼쪽으로 커서를 보내는데, 이 때 왼쪽의 모든 내용을 지워버려
		{																// \n은 개행을 시키는데 커서를 개행시킨 바로 아래에 가져다 두는 기능.
			System.out.printf("\n오류 입니다.\n");
			return;
		}
		

		//System.out.printf("\n>> %d %c %d = %d\n", n1, c, n2, result);
	}


}


public class Test073
{
	public static void main(String[] args) throws IOException	//-- cal.cInput() 내 read() 를 위한 tool
	{
		Calculate cal = new Calculate();	//-- Calculate 인스턴스 생성

		cal.nInput();						//-- 두 개의 정수 입력

		cal.cInput();						//-- 연산자 입력

		cal.print();						//-- 최종 값 출력
	}
}

// 실행 결과

/*
임의의 두 정수 입력(공백구분) : 40 20
임의의 연산자 입력(+ - * /) : -

>> 40 - 20 = 20
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백구분) : 40 20
임의의 연산자 입력(+ - * /) : +

>> 40 + 20 = 60
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백구분) : 40 20
임의의 연산자 입력(+ - * /) : *

>> 40 * 20 = 800
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백구분) : 40 20
임의의 연산자 입력(+ - * /) : /

>> 40 / 20 = 2
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백구분) : 20 0
임의의 연산자 입력(+ - * /)   : /

오류 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/