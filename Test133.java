/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
========================================*/

public class Test133
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//--==>> 3
		//		 256

		print(b2);
		print(i2);

		byte b3 = b2.byteValue();	//-- unboxing
		int i3 = i2.intValue();		//-- unboxing

		// check~!!!
		int i4 = b2.byteValue();
		//byte b4 = i2.intValue();	//--==>> 에러 발생
		byte b4 = i2.byteValue();
		System.out.println(b3);
		System.out.println(i3);
		//--==>>  3
		//		  256

		// check~!!! 에러는 안나지만 올바르지 않은 데이터 발생
		System.out.println(i4);
		System.out.println(b4);
		//--==>>  3
		//		  0


	}
/*
	public static void print(Object ob)
	{

		System.out.println(ob.toString());

	}
*/
	// java.lang.Number 클래스(추상 클래스)는
	// 모든 Wrapper 클래스들의 부모 클래스(슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number n 에 넘어오면서
	// Auto-Boxing 이 일어나게 된다.
	public static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}
}