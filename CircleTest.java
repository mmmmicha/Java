/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=======================================*/

// ※ Test071.java 파일과 함께 볼 것

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


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{

	/*public static void main(String[] args)
	{
		// 이 경우 컴파일은 되지만 main method가 없기 때문에 이 class파일의 자체적인 exe는 불가능하다.
		
	}*/
	
	// 멤버 변수 → 주요 속성
	int r;
	final double PI = 3.141592;
	

	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException
	{
		//Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		//r = sc.nextInt();
		r = Integer.parseInt(br.readLine());
	}
	
	// 넓이 계산 기능 → 메소드 정의
	double cirArea()
	{
		double result;

		result = r * r * PI;

		return result;
	}

	// 둘레 계산 기능 → 메소드 정의
	double cirLength()
	{
		double result;

		result = r * 2 * PI;

		return result;
	}

	// 결과 출력 기능 → 메소드 정의
	void print(double a, double b)
	{
		System.out.printf("\n반지름이 %d 인 원의\n", r);
		System.out.printf("넓이 : %7.2f\n", a);
		System.out.printf("둘레 : %7.2f\n", b);

	}
}

