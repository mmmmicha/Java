package src.javaStudy;
/*==========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 실수형 데이터 타입의 정밀도 테스트 실습
===========================================*/


public class Test020
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		float a = 0;
		double b = 0;



		// 연산 및 처리
		for (int i =1; i <= 100000 ;i++ )
		{
			a += 100000;
			b += 100000;
		}	




		// 결과 출력
		System.out.println("float : " + (a/1000000));
		System.out.println("double : "+ (b/1000000));

	}
}


// 실행 결과
/*
float : 9999.605
double : 10000.0
계속하려면 아무 키나 누르십시오 . . .

*/