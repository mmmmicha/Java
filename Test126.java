/*========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스
========================================*/

// Test125 와 비교~!!!

//import java.lang.*;

public class Test126	// extends Object
{
	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}



	public static void main(String[] args)
	{
		Test126 ob = new Test126();
		System.out.println(ob.toString());
		//--==>> 재정의한 toString()...

		System.out.println(ob);
		//--==>> 재정의한 toString()... 이 상황에서도 눈엔 안보이지만 toString 을 호출하고 있구나!
		
	}
}