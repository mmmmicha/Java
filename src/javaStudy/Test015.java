package src.javaStudy;
/*===========================================
	■■■ 자바의 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : System.in.read()
=============================================*/

// 실행 예)
// 한 문자 입력 : G
// 한 자리 정수 입력 : 9

// 입력한 문자 : G
// 입력한 정수 : 9
// 계속하려면 아무 키나 누르세요...


/*
	『System.in.read()』 메소드는 한 문자만 가져온다.
	단, 하나의 문자를 입력받아 입력받은 문자의
	ASCII Code 값을 반환한다.
*/

import java.io.IOException;


public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		char ch;				//-- 입력받은 문자를 담을 변수
		int n;					//-- 입력받은 정수를 담을 변수

		char temp;

		/*
		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read();
		




		// 결과 출력

		System.out.println("\n");
		System.out.println("입력한 문자 : " + ch);
		System.out.println("입력한 정수 : " + n);
		*/


//함께 풀기========================================================


	
		// 연산 및 처리

		// - 사용자에게 안내 메세지 출력
		System.out.print("한 문자 입력 : ");		// A + 엔터
		ch = (char)System.in.read();				//     --------------------------
													//     \r + \n

		
		
		// 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기)
		System.in.skip(2);
		//-- 두 글자를 읽지않고 건너뛴다.(버린다.)

		// - 사용자에게 안내 메세지 출력
		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read();

		temp = (char)n;

		// n 의 값을 48만큼 감소시켜라~~!!!
		n -= 48;



		// 결과 출력

		System.out.println("\n");
		System.out.println("입력한 문자 : " + ch);
		System.out.println("입력한 정수 : " + n);
		//System.out.println("입력한 정수 : " + temp);

		
	}
}


// 실행 결과
/*

한 문자 입력 : q
한 자리 정수 입력 : 2


입력한 문자 : q
입력한 정수 : 2
계속하려면 아무 키나 누르십시오 . . .

*/