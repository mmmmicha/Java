package src.javaStudy;
/*================================
  ■■■ 연산자(operator) ■■■
  - 삼항 연산자 == 조건 연산자
==================================*/


/*

	피연산자 연산자 피연산자 연산자 피연산자
	--------		--------		--------
	1항				2항				3항


	
	피연산자   ?	피연산자	:   피연산자
	--------		--------		--------
	1항				2항				3항



*/


// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다.
// 단, 조건연산자(삼항연산자)를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 5

// ==[판별결과]==
// 5 → 홀수
// ==============
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int n;					//-- 사용자로부터 입력받은 데이터를 담을 변수
		String strResult;		//-- 홀수인지 짝수인지에 대한 판별 결과를 담을 변수

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());


		// 홀수인지 짝수인지에 대한 판별 연산
		// _______?_______:________;
		//	수식1	수식2	수식3

		// 수식1 : 참(true) 또는 거짓(false)을 반환할 수 있는 수식 형태로 작성
		// 수식2 : 수식1의 처리 결과가 참(true)일 경우 수행하는 영역
		// 수식3 : 수식1의 처리 결과가 거짓(false)일 경우 수행하는 영역

		// 입력받은 정수(n)가 홀수인지 짝수인지 확인하기 위한 연사...
		// → n 을 2로 나눈 나머지가 0이면... 짝수
		//							 0아니면..홀수

		strResult = (n%2==0) ? "짝수" : "홀수" ;

		// ex) 사용자의 입력값이 5인 경우
		// ① strResult = (5%2==0) ? "짝수" : "홀수" ;
		// ② strResult = (1==0) ? "짝수" : "홀수" ;
		// ③ strResult = (false) ? "짝수" : "홀수" ;
		// ④ strResult = "홀수" ;


		// 결과 출력
		System.out.println();
		System.out.println("==[판별결과]==");
		System.out.printf("%d → %s%n", n, strResult);
		System.out.println("==============");


	}
}


// 실행 결과
/*
임의의 정수 입력 : 25

==[판별결과]==
25 → 홀수
==============
계속하려면 아무 키나 누르십시오 . . .


*/