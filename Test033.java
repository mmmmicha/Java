/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else 문 실습
===========================================*/

// ○ 과제
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2019
// 2019년 → 평년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2020
// 2020년 → 윤년
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		int year;							//-- 년도 변수
		String strResult = "";				//-- 문자열 변수 초기화


		// 연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());		//-- 사용자에게 년도 입력받기

		if (year%4==0 && year%100!=0 || year%400==0)	//-- 윤년 : 4의 배수면서 100의 배수가 아니거나, 400의 배수
		{
			strResult = "윤년";							
		}	
		else
		{
			//System.out.printf("%s", strResult);
			strResult = "평년";
		}
		

		// 결과 출력
		System.out.printf("%d → %s\n", year, strResult);
		
		
	}
}
// 실행 결과
/*
임의의 연도 입력 : 2020
2020 → 윤년
계속하려면 아무 키나 누르십시오 . . .


임의의 연도 입력 : 2015
2015 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/