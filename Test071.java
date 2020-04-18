/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=======================================*/

// ※ CircleTest.java 파일과 함께 볼 것

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 별도로 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 넓이 = 반지름 * 반지름 * 3.141592
// 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xxx

// 반지름이 xx 인 원의
// 넓이 : xxx
// 둘레 : xxx
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ct = new CircleTest();

		ct.input();
		double area = ct.cirArea();
		double length = ct.cirLength();


		ct.print(area, length);
	}
}

// 실행 결과

/*
반지름 입력 : 15

반지름이 15 인 원의
넓이 :  706.86
둘레 :   94.25
계속하려면 아무 키나 누르십시오 . . .
*/

