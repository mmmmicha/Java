/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - switch 문 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그럄을 작성한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 14
// 연산자 입력(+ - * /) : +

// >> 10 + 14 = 24
// 계속하려면 아무 키나 누르세요...



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		int a, b, temp;				// 사용자로 부터 입력받을 정수 값 변수 a, b 선언 및 연산자 ASCII 값 변수 선언
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// BufferedReader 인스턴스 생성

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());		// 첫 번째 정수 입력

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());		// 두 번째 정수 입력

		System.out.print("연산자 입력(+ - * /) : ");
		temp = System.in.read();					// 연산자 입력



		switch (temp)
		{
		case 43 : System.out.printf("\n >> %d %c %d = %d\n", a, (char)temp, b, (a+b)); break;	// 덧셈 출력

		case 45 : System.out.printf("\n >> %d %c %d = %d\n", a, (char)temp, b, (a-b)); break;	// 뺄셈 출력

		case 42 : System.out.printf("\n >> %d %c %d = %d\n", a, (char)temp, b, (a*b)); break;	// 곱셈 출력

		case 47 : System.out.printf("\n >> %d %c %d = %d\n", a, (char)temp, b, (a/b)); break;	// 나눗셈(몫) 출력

		default : System.out.println("\n잘 못 입력하셨습니다.");							// 예외 경우 출력
		
		}
		// 1.5 ver 이상에선 case '*' 가능 (Char)
		// 1.7 ver 이상에선 case "*" 가능 (String)


		// ※ 『retrun』 1. 값의 반환
		//				 2. 메소드 종료 ex) default : retren; → main() 메소드 종료 → 프로그램 종료



	}
}


// 결과 출력
/*

첫 번째 정수 입력 : 15
두 번째 정수 입력 : 10
연산자 입력(+ - * /) : +
15 + 10 = 25
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 15
두 번째 정수 입력 : 10
연산자 입력(+ - * /) : -
15 - 10 = 5
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 15
두 번째 정수 입력 : 10
연산자 입력(+ - * /) : *
15 * 10 = 150
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 15
두 번째 정수 입력 : 10
연산자 입력(+ - * /) : /
15 / 10 = 1
계속하려면 아무 키나 누르십시오 . . .
*/