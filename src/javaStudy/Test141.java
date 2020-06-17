package src.javaStudy;
/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
========================================*/

/*
※ Calendar 클래스는 추상클래스이기 때문에 객체를 생성할 수 없다.
   (추상 클래스 : 미 완성된 클래스)

   Calendar ob = new Calendar();	→ 이와 같은 구문을 통해 인스턴스 생성 불가.

○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법

   1. Calendar ob1 = Calendar.getInstance(); 

   2. Calendar ob2 = new GregorianCalendar();

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (※ GregorianCalendar : Calendar 클래스의 하위 클래스)

*/

// 년, 월, 일, 요일을 Calendar 클래스로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test141
{
	public static void main(String[] args)
	{
		// Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → 『get』
		int y = rightNow.get(Calendar.YEAR);
		System.out.println(y);
		//--==>> 2019
		int m = rightNow.get(Calendar.MONTH) + 1;	// 『+1』 인덱스를 반환하기 때문에 1을 더해줘야 월이랑 일치해
		System.out.println(m);
		//--==>> 8
		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>> 22
		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>> 5

		System.out.println(y + "-" + m + "-" + d + "-" + w);
		//--==>> 2019-8-22-5

		// 테스트
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1 → 일요일
		System.out.println(Calendar.MONDAY);		//--==>> 2 → 월요일
		System.out.println(Calendar.TUESDAY);		//--==>> 3 → 화요일
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 → 수요일
		System.out.println(Calendar.THURSDAY);		//--==>> 5 → 목요일
		System.out.println(Calendar.FRIDAY);		//--==>> 6 → 금요일
		System.out.println(Calendar.SATURDAY);		//--==>> 7 → 토요일
		*/


		String week = "";
		switch (w)
		{
		//case 1:week = "일요일";break;
		case Calendar.SUNDAY: week = "일요일"; break;
		case Calendar.MONDAY: week = "월요일";break;
		case Calendar.TUESDAY: week = "화요일";break;
		case Calendar.WEDNESDAY: week = "수요일";break;
		case Calendar.THURSDAY: week = "목요일";break;
		case Calendar.FRIDAY: week = "금요일";break;
		case Calendar.SATURDAY: week = "토요일";break;
		
		}

		System.out.println(y + "-"+ m+ "-"+ d+"-"+week);
		//--==>> 2019-8-22-목요일


		///////////////////////////////////////////////////////////////////

		// Calendar 클래스 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};


		// 달력의 날짜 세팅 → 『set()』 메소드 활용
		rightNow2.set(2019, 7, 22); // 8월 -- check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 5 → 목요일

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 목요일


		// 달력의 날짜 세팅
		rightNow2.set(1994, 3, 23);		// 1994년 4월 23일
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 토요일
		





	}
}