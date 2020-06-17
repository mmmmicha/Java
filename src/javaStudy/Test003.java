package src.javaStudy;
/*================================
■■■ 자바 기본 프로그래밍 ■■■
- 자바 소스코드 입력 및 컴파일
- 변수와 자료형
===============================*/

public class Test003
{
	public static void main(String[] args)
	{
		// 변수 선언
		int a;
		
		// 변수 초기화(변수 a에 10을 대입)
		a = 10;

		// 변수 선언 및 초기화
		int b = 20;

		// 변수 선언
		int c;

		// 연산 및 처리
		c = a + b;
		

		
		// 결과 출력
		//System.out.println(c);
		//--==> 30

		//System.out.println(a b c);
		//--=> 에러 발생
		//		(컴파일 에러)

		// 덧셈 연산자(+)
		// 피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
		// 산술 연산자로써의 기능을 수행하는 것이 아니라
		// 문자열 결합 연산자로써의 기능을 수행하게 된다.

		//System.out.println(a + " " + b + " " + c);
		// --=>> 10 20 30

		System.out.println("a의 값은 " + a + "입니다.");
		System.out.println("b의 값은 " + b + "입니다.");
		System.out.println("a와 b를 더한 결과값 : " + c + "입니다.");
		//--==>>
		/*
		a의 값은 10입니다.
		b의 값은 20입니다.
		a와 b를 더한 결과값 : 30입니다.
		*/


	}
}
