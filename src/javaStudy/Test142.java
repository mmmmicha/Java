package src.javaStudy;
/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
========================================*/

/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일, 요일, 시, 분, 초 까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고, Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   GregorianCalendar 클래스에 저의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와시간 정보를 가지며,
   이 객체가 생성되면 갖고있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
   돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
   구할 수도 있다.
*/


// ○ 실습 문제
// 사용자로부터 연, 월을 입력 받아
// 달력을 그려주는(출력하는) 프로그램을 구현한다.
// 단, 만년 달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2019
// 월 입력	 : -2
// 월 입력	 : 16
// 월 입력	 : 8
/*

       [ 2019년 8월 ]

 일  월  화  수  목  금  토 
 ===========================
 				 1   2   3
  4   5   6   7  8   9  10
 11  12  13  14 15  16  17
 18  19  20  21 22  23  24
 25  26  27  28 29  30  31
 ===========================
 계속하려면 아무 키나 누르세요...


*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test142
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Calendar ca = new GregorianCalendar();
		int[] ym = new int[2];
		int[] lastDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};

		do
		{
			System.out.print("연도 입력 : ");
			ym[0] = sc.nextInt();
		}
		while (ym[0]<1);

		do
		{
			System.out.print("월 입력   : ");
			ym[1] = sc.nextInt();
		}
		while (ym[1]<1 || ym[1]>12);

		// 년, 월, 일 초기화
		ca.set(ym[0], ym[1]-1, 1);

		System.out.printf("       [ %4d년 %2d월 ]", ym[0], ym[1] );
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");
		
		int n=0;
		
		for (int i=1; i<7; i++)
		{
			
			if (ca.get(Calendar.DAY_OF_WEEK)==i)
			{
				break;
			}
			System.out.print("    ");
			n++;
		}
			
		for (int i=1; i<lastDate[ym[1]-1]+1; i++)
		{
			System.out.printf("%4d",i);
			n++;
			if (n%7==0 || i==lastDate[ym[1]-1]+1)
			{
				System.out.println();
			}
		}
		return;	
		/*
		 * for (int i=0; i<7; i++) { if (ca.get(Calendar.DAY_OF_WEEK)==i) { break; }
		 * System.out.print("    "); }
		 */
		/*
		 * for (int i=0; i<=getActualMaximum(Calendar.DATE); i++) { }
		 */

		
		
				
				
			
			
			
			
		
		
		
		

		
	}
}