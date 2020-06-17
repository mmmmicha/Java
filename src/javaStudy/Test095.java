package src.javaStudy;
/*===========================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계
  - 배열 활용
=============================*/

// ○ 실습 문제
// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calender)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 최종적으로 WeekDay클래스를 완성할 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백구분) : 2019 8 13

// 2019년 8월 13일 → 화요일
// 계속하려면 아무 키나 누르세요...


// ※ 1년 1월 1일 → "월요일"

//			~ 윤년/평년 적용 지나온 날짜 연산...

//	 2019년 8월 13일

import java.util.Scanner;
/*
class WeekDay
{
	
	// 주요 변수 선언
	private int y, m, d;			//-- 사용자가 입력한 년, 월, 일을 담을 변수
	String[] arr = {"월","화","수","목","금","토","일"};

	// 메소드 정의 → 입력받기
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" 년 월 일 입력(공백구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		System.out.println();

		
		
		

	}// input end

	// 메소드 정의 → 요일 산출하기
	String week()
	{
		String result = "";
		int n = 0;

		for (int i=1; i<=y-1; i++)
		{
			
			if (i%4==0 || i%400==0 && i%100!=0)
			{
				n += 366;
			}
			
			else
			{
				n += 365;
			}
		}
		
		
		
		for (int i=1; i<=m-1; i++)
		{
			if (i==2)
			{
				if (y%4==0 && y%100!=0 || y%400==0)
					n += 29;
				else
					n += 28;
			}
			else if (i==4 || i==6 || i==9 || i==11)
			{
				n += 30;
			}
			else
			{
				n += 31; //1, 3, 5, 7, 8, 10, 12
			}
		}
	
		// nalsu = 
		
		
		n += d;

		System.out.println(n);
		
		switch (n%7)
		{
		case 1: result = "월"; break;
		case 2: result = "화"; break;
		case 3: result = "수"; break;
		case 4: result = "목"; break;
		case 5: result = "금"; break;
		case 6: result = "토"; break;
		case 0: result = "일";
		
		}
		
		// return result;
		return arr[n%7-1];
		
	
	}// week end

	// 메소드 정의 → 결과 출력하기
	void print(String day)
	{
		System.out.printf("%d년 %d월 %d일 → %s요일\n", y, m, d, day);
		
	}// print end

}// class end
*/


//===========================================================================================

class WeekDay
{
	// 주요 변수 선언
	private int y, m, d;			//-- 사용자가 입력한 년, 월, 일을 담을 변수
	

	// 메소드 정의 → 입력받기
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" 년 월 일 입력(공백구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

		
		
		

	}// input end

	// 메소드 정의 → 요일 산출하기
	String week()
	{
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 테스트
		//System.out.println(months.length);
		
		// 요일명에 대한 배열 구성
		String[] weekNames = {"일","월","화","수","목","금","토"};

		// 날 수를 종합할 변수, 루프 변수, 요일 변수 선언
		int nalsu, i, w;

		// 윤년에 따른 2월의 날 수 계산
		// 윤년이라면... 2월의 마지막 날짜를 29일로 설정
		// 평년이라면... 2월의 마지막 날짜를 28일로 설정
		if (y%4==0 && y%100!=0 || y%400==0) // 윤년이라면...
		{
			// 2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}
		else								// 평년이라면...
		{
			// 2월의 마지막 날짜를 28일로 설정
			months[1] = 28;
		}

		// ① 1년 1월 1일 부터 입력받은 년도 이전 년도 12월 31일 까지의 날 수 계산
		//					   ------ y - 1 ----------
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		// 테스트
		// System.out.println(nalsu);
		//--==>> 737059 → 1.1.1 ~ 2018.12.31 의 총 날 수

		// ② 입력받은 월의 이전 월 까지의 날 수 계산
		//	  이 계산 결과를 1번의 결과에 더하는 연산
		for (i=0; i<m-1; i++)
			nalsu += months[i];

		// 테스트
		// System.out.println(nalsu);	// 2019 2
		//--==>> 737090 → 1.1.1 ~ 2019.1.31 의 총 날 수

		// ③ 입력받은 일의 날짜만큼 날 수 계산 후
		//	  2번 결과에 더하는 연산
		nalsu += d;

		//-------------------------------------------------- 여기까지 날 수 연산 끝~!!!!

		// 무슨 요일인지 확인하기 위한 연산
		w = nalsu % 7;		// 전체 날 수 % 7 == 0 → 일요일
							// 전체 날 수 % 7 == 1 → 월요일
							// 전체 날 수 % 7 == 1 → 화요일
							// 전체 날 수 % 7 == 1 → 수요일
							// 전체 날 수 % 7 == 1 → 목요일
							// 전체 날 수 % 7 == 1 → 금요일
							// 전체 날 수 % 7 == 1 → 토요일

		// 테스트
		System.out.println(w);
		

		return weekNames[w];






	
	}// week end

	// 메소드 정의 → 결과 출력하기
	void print(String day)
	{
		System.out.printf("%d년 %d월 %d일 → %s요일\n", y, m, d, day);
		
	}// print end

}// class end

//==================================================================================================

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test095
{
	public static void main(String[] args)
	{
		// WeekDayt 클래스 기반의 인스턴스 생성
		WeekDay wd = new WeekDay();

		wd.input();					//-- 입력 메소드 호출

		String result = wd.week();	//-- 요일 산출 메소드 호출 및 결과 확인

		wd.print(result);			//-- 출력 메소드 호출
	}
}