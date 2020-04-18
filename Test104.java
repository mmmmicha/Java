/*========================
  ■■■ 만년달력 ■■■
========================*/

// 실행 예)
// 『연도』를 입력하세요 : 2019
// 『월』을 입력하세요	 : 8
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

public class Test104
{
	public static void main(String[] args)
	{
		int n=0;
		int year;
		int month;
		int nujeok;
		char[] mon = {'일','월','화','수','목','금','토'};
		int[] day = {31,0,31,30,31,30,31,31,30,31,30,31};
		int count;


		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();

		System.out.print("『월』을 입력하세요   : ");
		month = sc.nextInt();
		System.out.println();

		System.out.printf("       [ %4d년 %2d월 ]       ",year ,month);
		System.out.println();
		System.out.print("  일  월  화  수  목  금  토\n");
		System.out.print("==============================\n");
		


		nujeok = 365*(year-1) + (year-1)/4 - (year-1)/100 + (year-1)/400;

		if (year%4==0 && year%100!=0 || year%400==0)
		{
			day[1] = 29;
		}
		else
		{
			day[1] = 28;
		}

		for (int i=0; i<=month-2; i++)
		{
			nujeok += day[i];
		}

		nujeok += 1;

		int w = nujeok%7;

		char result = mon[w];

		

		for (int j=0; j<=6; j++)
		{
			if (mon[j]!=result)
			{
				System.out.print("    ");
				continue;
			}
			count = 7-j;
			
			for (; ; )
			{
				System.out.printf("%4d", ++n);
				count--;

				if (count==0)
				{
					count = 7;
					System.out.println();
				}

				if ((month==6 || month==4 || month==9 || month==11) && n==30)
				{
					break;
				}
				if (month==2 && (n==28 || n==29))
				{
					break;
				}
				if ((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && n==31)
				{
					break;
				}
			}
			break;

			
			
			
		}
		System.out.println();
		
		
		

		
	}


}