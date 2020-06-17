package src.javaStudy;
/*================================
  ■■■ 연산자(operator) ■■■
  - 삼항 연산자 == 조건 연산자
==================================*/

// ○ 실습 문제
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader 의 readLine() 을 활용하고
// 조건 연산자를 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...


// 임의의 연도 입력 : 2012
// 2012년 → 윤년
// 계속하려면 아무 키나 누르세요...


// 임의의 연도 입력 : 2019
// 2019년 → 윤년
// 계속하려면 아무 키나 누르세요...


// ※ 윤년의 판별 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나
//	  400의 배수이면 윤년~!!!
//	  그렇지 않으면 평년~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		
		// BufferedReader 인스턴스 생성

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언

		int year;
		String strResult;

		// 연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		//strResult = (year%4 == 0) ? ((year%400==0) ? "윤년" : ((year%100==0) ? "평년" : "윤년" )) : "평년";

		strResult = (year%4 == 0) && !(year%100==0) || (year%400==0) ? "윤년" : "평년";

		// ※ 조건이 두 개 이상이면 무조건 **논리연산자** 떠올리기!!


		// 결과 출력
		System.out.println(year + "년 → " +strResult);
	}
}

/*
임의의 연도 입력 : 2020
2020년 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2019
2019년 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/