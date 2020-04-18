/*====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - BufferedReader
  - 산술연산자
  - printf()
=====================================*/

// 사용자로부터 임의의 정수를 두 번 입력받아
// 사칙연산 및 나머지 연산을 수행하여
// 그 결과를출력하는 프로그램을 작성한다.
// 단, 입력받은 과정은 BufferedReader 를 활용할 수 있도록 하고
// 출력하는 과정은 printf() 메소드를 활용할 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2

// ====[결과]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ==============
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test021
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수
		//-- BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;												//-- 사용자 입력값을 담을 변수
		int sum, min, x, g;										//-- 덧셈, 뺄셈, 곱셈 그리고 나눗셈 결과를 담을 변수;							
		double div;		
		
		char c = '%';											// 방법 1

		// 연산 및 처리
		System.out.printf("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.printf("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		// 산술 연산을 통한 결과값 산출
		sum = a + b;
		min = a - b;
		x = a * b;
		div = a / (double)b;
		g = a % b;

		

		// 결과 출력
		System.out.printf("\n====[결과]====\n");
		System.out.printf("%d + %d = %d\n",a ,b ,sum);
		System.out.printf("%d - %d = %d\n",a ,b ,min);
		System.out.printf("%d * %d = %d\n",a ,b ,x);
		System.out.printf("%d / %d = %f\n",a ,b ,div);
		//System.out.println(a + " % " + b + " = "+g);			// 방법 2

		//System.out.printf("%d %c %d = %d\n",a ,c ,b ,g );		// 방법 3
		System.out.printf("%d %% %d = %d\n",a ,b ,g);
		//System.out.printf("%d", "%d = %d\n",a ,b, g);

		System.out.printf("==============\n");





		
	}
}

/*
첫 번째 정수 입력 : 15
두 번째 정수 입력 : 20

====[결과]====
15 + 20 = 35
15 - 20 = -5
15 * 20 = 300
15 / 20 = 0.750000
15 % 20 = 15
==============
계속하려면 아무 키나 누르십시오 . . .
*/