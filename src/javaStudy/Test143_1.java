package src.javaStudy;

// ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
//	  『객체.add(Calendar.DATE, 날 수);』

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test143_1
{
	public static void main(String[] args)
	{
		

		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 기반 인스턴스 생성
		Calendar now = Calendar.getInstance();
		//		     = new GregorianCalendar();

		int nalsu;
		int y, m, d, w;
		String[] week = {"일","월","화","수","목","금","토"};

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;		//-- check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// 현재의 연, 월, 일, 요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week[w-1] + "요일");
		
		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		
		// check~!!!
		now.add(Calendar.DATE, nalsu);
		
		// 결과 출력
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("=========[확인 결과]=========");
		System.out.printf("%d일 후 : %tF %tA \n",nalsu, now, now);
		System.out.println("=============================");
		




	}
}