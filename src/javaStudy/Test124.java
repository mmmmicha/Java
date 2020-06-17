package src.javaStudy;
/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)

   - awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 크래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조

   new 상위 클래스의 생성자()
   {
		접근제어지시자 자료형 메소드()
		{
			...;
		}
   };	// ← 반드시 세미콜론 필요함~!!!


○ 물리적인 파일 구조 상(탐색기 상에서...)
   『클래스명$1.class』 파일이 생성되며
   $ 뒤의 숫자가 순차적으로 부여된다.
*/


// import java.lang.*;

class Test3 // extends Object
{
	/*
	Object 클래스의 멤버들...
	...
	...
	.....
	...

	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{
		
		return new Object()
		{
			@Override
			public int hashCode()
			{
				
				return 30;
			
				
			}
		};		// ← 세미콜론 (미 작성 시 에러 발생)
	}
}








// import java.lang.*;

public class Test124 // extends Object 모든 객체의 조상 클래스
{
	/*
	Object 가 갖고있는 멤버들...
	*/

	public static void main(String[] args)
	{
		/*
		Test124 ob = new Test124();

		System.out.println(ob.toString());	// Object 클래스 내의 메소드 중 하나
		*/

		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742
		//		 해쉬코드

		System.out.println(ob2.getString());
		//--==>> 익명의 클래스...
	}
}