/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
===========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20
// >> 10 ~ 20 까지의 합 : xxx
// 계속하려면 아무 키나 누르세요...

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10 까지의 합 : xxx
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException	//-- br.readLine() 사용을 위한 장치
	{
		int a, b, tmp, sum=0;		//-- 사용자로부터 받을 정수 변수, a값을 저장할 임시 변수 및 누적값 변수 선언

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//-- BufferedReader 인스턴스 생성

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());		//-- 첫 번째 정수 입력
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());		//-- 두 번째 정수 입력
		
		if (a>b)		//-- 첫 입력이 두 번째 입력보다 클 때 서로 교환
		{
			a ^= b;		//
			b ^= a;		//-- xor 연산(서로 교환)
			a ^= b;		//
		}
		
			tmp = a;	//-- a 값을 tmp 에 대입(결과 출력시 a값이 필요하기 때문에...)

		while (tmp<=b)	//-- tmp값(a값)이 b값과 같아질 때 까지 반복
		{
			sum += tmp;	//-- 누적값 덧셈 연산

			tmp++;		//-- tmp 값을 b와 같아질 때 까지 증가시킴
		}

		System.out.printf(" >> %d ~ %d 까지의 합 : %d \n",a ,b ,sum);	//-- 최종 값 출력

	}
}

// 실행 결과

/*

첫 번째 정수 입력 : 50
두 번째 정수 입력 : 2
 >> 2 ~ 50 까지의 합 : 1274
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 1
두 번째 정수 입력 : 100
 >> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .

*/