/*==========================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : BufferReader 클래스
============================================*/

// 사용자로부터 반지름울 입력받아
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.

// 실행 예)
// 원의 반지름 입력 : 
// 넓이 : xxx.xx
// 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; // 에러 대응 메뉴얼  // 자바는 까다로운 녀석이기 때문에..



public class Test012
{
	public static void main(String[] args) throws IOException // main이라는 '배' 에서 발생하는 문제를 밖으로 던져라
	{												//입출력 예외

		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//                                           일종의 번역기    코드입력
		// 디바이스(키보드)를 본체에 연결하는 과정쯤으로 생각하면 됨.


		// 주요 변수 선언
		int r;				//-- 반지름
		double a, b;		//-- 넓이, 둘레



		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");

		// ② 사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내기

		// r = br.readLine();
		// 문자열로 받아버려 like r = "250";
		r = Integer.parseInt(br.readLine());		//--> 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
													// ex parseInt("250") -->> 250

		// 사용자가 입력한 값을 BufferedReader(br) 의 『readLine()』
		// 메소드를 활용하여 문자열 형태로 읽어들인 후
		// 그 값을 『Integer.parseInt()』 숫자형(정수형)으로 변환한 후
		// 정수 형태의 반지름 변수 r 에 담아내기


		// ③ 넓이 및 둘레 연산
		a = r * r * 3.141592;
		b = r * 2 * 3.141592;





		// 결과 출력
		/*
		System.out.println(">> 넓이 : " + a);
		System.out.println(">> 둘레 : " + b);
		*/

		//System.out.printf(">> 넓이 : ○\n", ○에 넣을 값);
		//System.out.printf(">> 둘레 : ○\n", ○에 넣을 값);
		
		//System.out.printf(">> 넓이 : %f\n", a);
		//System.out.printf(">> 둘레 : %f\n", b);

		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", b);

		//-- 『%f』 10진수 실수형을 담아내는 옵션 문자
		//-- 『%.2f』 는 소숫점 이하 둘째자리까지 표현하겠다는 의미(반올림을 하는것임!!)

	}
}

		/*
		원의 반지름 입력 : 10
		>> 넓이 : 314.1592
		>> 둘레 : 62.83184
		계속하려면 아무 키나 누르십시오 . . .
		
		원의 반지름 입력 : 10
		>> 넓이 : 314.16
		>> 둘레 : 62.83
		계속하려면 아무 키나 누르십시오 . . .
		
		
		*/