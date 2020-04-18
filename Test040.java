/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - switch 문 실습
===========================================*/

/*
○ 다중 선택문이라 하며, switch 문 다음의 수식 값에 다라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
		case 상수1 : 문장1; [break;]      // [] 는 생략가능한 놈들
		case 상수2 : 문장2; [break;]
				:
		[default : 문장n+1; [break;]]
   }

   switch 문의 『수식』 과 case 의 『상수』 는
   byte, short, int, long 형이어야 한다.

   case 문 뒤에 『break;』가 없는 형태인 경우
   다음 case 문의 문장을 계속해서 수행하게 된다. (→ 기본 모델)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		String strName = "";
		int kor, eng, mat, tot;
		char grade = 'F';
		int avg = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("당신의 이름을 입력하세요 : ");
		strName = br.readLine();

		System.out.print("국어점수를 입력하세요 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어점수를 입력하세요 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학점수를 입력하세요 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3;


		switch (avg/10)
		{
		case 10 : case 9 :
			{
				grade = 'A';
				break;
			}
		case 8 :
			{
				grade = 'B';
				break;
			}
		case 7 :
			{
				grade = 'C';
				break;
			}
		case 6 :
			{
				grade = 'D';
				break;
			}
	/*	default : 굳이 필요 없음
			{
				grade = 'F';
				break;
			}
		}
    */ 
		System.out.printf(" \n당신의 이름은 %s\n 국어점수 %d\n 영어점수 %d\n 수학점수 %d\n 평균점수 %d\n 등급은 %c입니다.\n\n", strName, kor, eng, mat, avg, grade);

		
		}


/*

		switch (avg)
		{
		case 100 :
		case 99 :
			:
		case 0 :
		
		}
		
*/
	
}
}