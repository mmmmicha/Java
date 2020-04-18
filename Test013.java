/*=======================================================
	○ 퀴즈
	삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	삼각형의 넓이를 구하는 프로그램을 구현한다.
========================================================*/

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader; // import 패키지.클래스(빨간색)
import java.io.InputStreamReader;
import java.io.IOException;

// import java.io.*;



public class Test013
{
	public static void main(String[] args) throws IOException // readLine()을 사용하기위해 필수!! Exception 발생하면 main 밖으로 던지렴!!
	{
		// 변수 선언
		int u, h;
		double a;		// 밑변, 높이, 넓이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		// 연산 및 처리
		// ① 사용자에게 안내 메시지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print(" - 삼각형의 밑변 입력 : ");

		// ② 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//	  변수 u 에 담아내기
		u = Integer.parseInt(br.readLine());

		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print(" - 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//	  변수 h 에 담아내기	
		h = Integer.parseInt(br.readLine());
		
		// ⑤ 넓이 구하는 공식 : 넓이 = ( 밑변 * 높이 ) / 2
		// a = (u * h) / 2;
		//  정수 정수 정수	→ 정수
		//  3    5     2	→ 7
		a = (double)(u * h) / 2;
		// a = (u * h) / 2.0;

		// ※ 실수 자료형이 결과값으로 나오는 광정에서
		//    실수 기반의 연산이 필요한 상황이다.
		//	  정수형 『2』 가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//	  이 연산은 실수 기반으로 처리된다.

		
		// 결과 출력
		
		System.out.println();
		// System.out.print(); 에러 발생.
		System.out.printf(" >> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %f\n" ,u ,h, a);


		// Int형으로 나누기 때문에 결과가 정확하게 나오지 않음.




	}
}

// 실행 결과
/*

■ 삼각형의 넓이 구하기 ■
 - 삼각형의 밑변 입력 : 3
 - 삼각형의 높이 입력 : 5

 >> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.500000
계속하려면 아무 키나 누르십시오 . . .

*/