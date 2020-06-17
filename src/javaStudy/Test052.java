package src.javaStudy;
/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문(while문) 실습
===========================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1 부터 입력받은 그 수 까지의
// 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 270
// >> 1 ~ 270 까지 정수의 합 : xxxx
// >> 1 ~ 270 까지 짝수의 합 : xxxx
// >> 1 ~ 270 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test052
{
	public static void main(String[] args) throws IOException		// br.readLine()을 호출하기 위해 필요한 조건
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// BufferedReader 인스턴스 생성

		int a, n=1;									//-- 사용자에게 받을 입력 변수, 루프 변수 선언 및 초기화
		int sum=0, even=0, odd=0;					//-- 정수 합, 짝수 합 그리고 홀수 합 변수 선언 및 초기화

		System.out.print("임의의 정수 입력 : ");	
		a = Integer.parseInt(br.readLine());		//-- 사용자로부터 정수 입력 받기

		while (n<=a)								//-- 입력받은 정수와 루프변수가 같아질 때 까지 반복을 실행하여
		{											//-- 누적 덧셈 값을 얻는 것이 목적

			sum += n;			//-- 1 ~ a 까지의 정수의 합

			if (n%2==0)			//-- 짝수 구별 기준
			{
				even += n;		//-- 1 ~ a 까지의 짝수의 합
			}
			else if (n%2!=0)	//-- 홀수 구별 기준
			{
				odd += n;		//-- 1 ~ a 까지의 홀수의 합
			}

			n++;				//-- 루프변수의 증가
		}

		System.out.printf(" >> 1 ~ %d 까지 정수의 합 : %d\n", a, sum);		//-- 최종 정수의 합
		System.out.printf(" >> 1 ~ %d 까지 짝수의 합 : %d\n", a, even);		//-- 최종 짝수의 합
		System.out.printf(" >> 1 ~ %d 까지 홀수의 합 : %d\n", a, odd);		//-- 최종 홀수의 합
	}
}

// 실행 결과

/*
임의의 정수 입력 : 25
 >> 1 ~ 25 까지 정수의 합 : 325
 >> 1 ~ 25 까지 짝수의 합 : 156
 >> 1 ~ 25 까지 홀수의 합 : 169
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
 >> 1 ~ 1 까지 정수의 합 : 1
 >> 1 ~ 1 까지 짝수의 합 : 0
 >> 1 ~ 1 까지 홀수의 합 : 1
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 100
 >> 1 ~ 100 까지 정수의 합 : 5050
 >> 1 ~ 100 까지 짝수의 합 : 2550
 >> 1 ~ 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/