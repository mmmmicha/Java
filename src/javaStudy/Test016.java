package src.javaStudy;
/*==================================
■■■ 자바의 기본 프로그래밍 ■■■
- 자바의 기본 입출력 : printf()
===================================*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");  //-- 『\n』 개행
		//--==>> AAABBBCCC

		// 서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』 개행
		System.out.printf("12345678901234567890%n");	//-- 『%n』 개행
		System.out.printf("%d + %d = %d\n",10 ,20, 30);
		//--==>>
		/*
		AAABBBCCC
		1234567890123456789012345678901234567890
		12345678901234567890
		10 + 20 = 30
		*/

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%010d\n", 123);
		//--==>>
		/*
		123
			123
		0000000123
		*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> +365
		//		 +365

		System.out.printf("%d\n", +365);
		//--==>> 365

		//System.out.printf("%-d\n", 365);		// 런타임 에러 발생
		System.out.printf("-%d\n", 365);
		//--==>> -365

		System.out.printf("%d\n", -365);
		//--==>> -365

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>> (365)
		//		  365

		//System.out.printf("%d\n", 'A');			// 런타임 에러 발생
		System.out.printf("%c\n", 'A');				// printf 내에서는 자동 형변환 허용x
		//System.out.printf("%c\n", "ABCD");		// 런타임 에러 발생
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n", 365);				
		System.out.printf("%o\n", 24);
		//--==>> 16d
		//		 30

		System.out.printf("%b\n", true);
		//--==>> true


		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.231);		// 반올림 범위 차이
		System.out.printf("%.2f\n", 123.236);		// check~!!!!
		
		//--==>>123.230000
		//		123.23
		//		123.23
		//		123.24


		System.out.printf("%8.2f\n", 123.236);
		//--==>>   123.24	전체 8칸 중 점 포함해서 6자리


		System.out.printf("%2.2f\n", 1234.1234);
		//--==>> 1234.12





	}
}