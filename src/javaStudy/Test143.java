package src.javaStudy;
/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
========================================*/

// ○ 실습 문제
// 오늘을 기준으로 입력받는 날짜만큼 후의 년, 월, 일, 요일을
// 확인하여 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 오늘 날짜 : 2019-8-22 목요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ========[확인 결과]========
// 200일 후 : 2020-xx-xx x요일
// ===========================
// 계속하려면 아무 키나 누르세요...
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test143
{
	public static void main(String[] args)
	{
		int y, m, d, day;
		int n;
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		Calendar cal = new GregorianCalendar();

		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 기반 인스턴스 생성
		Calendar now = Calendar.getInstance();

		
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘 날짜 : "+y+"-"+m+"-"+d+" "+week[day]);

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		n = sc.nextInt();
		

		cal.add(Calendar.DATE, n);
		
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("========[확인 결과]========");
		System.out.println("200일 후 : "+y+"-"+m+"-"+d+" "+week[day]);
		System.out.println("===========================");




	}
}