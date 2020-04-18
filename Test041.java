/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - switch 문 실습
===========================================*/

// ○ 실습 문제
// 1 부터 3 까지의 정수 중 하나를 사용자로부터 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// ① switch 문의 일반 모델을 활용한다.
// ③ switch 문의 기본 모델을 활용하되,
//	  『break』 를 딱 한 번만 사용할 수 있도록 구성한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력(1~3) : 7
// 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{

		int n;
		String star = "★★";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());
		
		// ①-1 기본 모델
		/*
		switch (n)
		{
		case 1 : star = "★";
		break;
		case 3 : star = "★★★";
		default : System.out.print(">> 입력 오류~!!!");
		}

		System.out.printf(" %s \n", star);
		*/


		// ①-2 기본 모델
		switch (n)
		{
		// default : System.out.print(">> 입력 오류~!!!\n");
		// break;
		case 3 : System.out.print("★");
		case 2 : System.out.print("★");
		case 1 : System.out.print("★\n");

		break;

		default : System.out.print(">> 입력 오류~!!!\n");	// 어디에 두든 break만 있으면 상관 없음.
		
		}




		// ② 일반 모델
		/*
		switch (n)
		{
		case 1 : star = "★";break;
		case 2 : star = "★★";break;
		case 3 : star = "★★★";break;
		default : System.out.print(">> 입력 오류~!!!");
		
		System.out.printf(" %s \n", star);
		*/
		}
	
}