package src.javaStudy;
/*================================
  ■■■ 연산자(operator) ■■■
  - 삼항 연산자 == 조건 연산자
==================================*/

// ○ 실습문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader 의 readLine()을 통해 넘겨받을 수 있도록 한다.
// 또한, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나...

// 임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언

		int n=0;						//-- 사용자 입력값을 담을 변수
		String strResult;				//-- 비교 결과를 넣을 변수

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 연산 및 처리

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		/*

		n 이 0 이다	→ true		→ 영
					→ false	→ n 이 0보다 크다   → true	→ 양수
													 → false	→ 음수
		
		*/


		

		// 처리 결과

		
		strResult = (n == 0) ? "영" : ((n > 0) ? "양수" : "음수"); 
		System.out.printf("%d → %s\n",n ,strResult);


	}
}


// 실행 결과

/*
임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 10
10 → 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : -10
-10 → 음수
계속하려면 아무 키나 누르십시오 . . .
*/