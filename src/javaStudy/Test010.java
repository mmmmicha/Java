package src.javaStudy;
/*========================================
	■■■ 변수와 자료형 ■■■
	- 퀴즈
	  사전에 부여된 반지름 정보를통해
	  원의 넓이와 둘레를 구하는 프로그램을 구현한다.
	  → 반지름 : 10

====================================================*/

// 실행 예)
// 넓이 : xxxxx
// 둘레 : xxxxx
// 계속하려면 아무 키나 누르세요...

public class Test010
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		double r = 10.0;				// 반지름 r
		final double PIE = 3.141592;	// PIE = 3.141592
		double second = 0.0;			// second == 넓이
		double third = 0.0;				// third  == 둘레

		


		// 연산 및 처리
		second = PIE * r * r;			// 넓이 = PIE * r * r;
		third = 2 * PIE * r;			// 둘레 = 2 * PIE * r;


		// 결과 출력

		System.out.printf("넓이 : %f\n" ,second);
		System.out.printf("둘레 : %f\n" ,third);

// 함께 풀어보기 ======================================================

		

		//※ 문제 인식 및 분석
		//	 원의 넓이 = 반지름 * 반지름 * 3.141592
		//	 원의 둘레 = 2 * 반지름 * 3.141592



		// 주요 변수 선언
		int r1 = 10;						//-- 반지름

		// ※ 『final』 키워드 : 변수의 상수화~!!!!
		final double PI = 3.141592;		//-- 원주율
		
		//under score 표기법 : 상수의 케이스에서 CIRCLE_PI 이런 예
		
		double area, length;			//-- 원의 넓이, 둘레


		// 연산 및 처리
		area = r1 * r1 * PI;
		length = 2 * r1 * PI;



		// 결과 출력

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);





	}
}

/*
넓이 : 314.159200
둘레 : 62.831840
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/




