package src.javaStudy;
/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
========================================*/

import java.math.BigDecimal;

public class Test132
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		// movePointLeft : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//--==>> 123456.789123456789


		// 나눗셈 (대체 속성 확인, 반올림 하지 않는다. → 절삭)

		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN);	// 1의 자리까지 유효하게 표현하겠다.
		System.out.println(BigDecimal.ROUND_DOWN);	//--==>> 1
		System.out.println(c);
		//--==>> 1000.000000000

		// BigInteger 객체로 변환
		System.out.println(a.toBigInteger());
		//--==>> 123456789

		BigDecimal t1 = new BigDecimal("400.0");
		BigDecimal t2 = new BigDecimal("6.0");

		//BigDecimal t3 = t1.divide(t2, 3);
		//System.out.println(t3);
		
	}
}