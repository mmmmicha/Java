/*============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if문 실습
=============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지 홀수인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단 , BufferedReader 의 readLine() 을 사용할 수 있도록 하며,
// if 조건문(단독 if 구문)을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 37
// 37 → 홀수입니다.
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 26
// 26 → 짝수입니다.
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int n;
		String strResult = ""; // else 구문 작성하면 해결됨. 출력구문에서 자바는 책임감을 느끼기 때문에 없으면 에러를 발생시킴!!! 지역변수는 초기화하는 습관을 들여라.
		// BufferedReader 인스턴스 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		if (n%2==0)
		{
			strResult = "짝수";
		}

		if (n%2!=0)
		{
			strResult = "홀수";
		}
		
		
	    
			
		



		// 결과 출력

		System.out.printf("%d → %s입니다.\n",n ,strResult);
	}
}

// 실행 결과

/*

임의의 정수 입력 : 13
13 → 홀수입니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 14
14 → 짝수입니다.
계속하려면 아무 키나 누르십시오 . . .

*/