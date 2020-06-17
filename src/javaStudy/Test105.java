package src.javaStudy;
/*=========================================
  ■■■ 주민등록번호 유효성 검사 ■■■
=========================================*/

/*

○ 주민등록번호 검증 공식

   ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

   123456-1234567 (주민번호)
   ****** ******  --------------------- 각 자릿수에 곱하기
   234567 892345  (각 자리에 곱해질 수)

   ② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	+  2 3 4 5 6 7   8 9 2 3 4 5
	------------------------------
	→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

	   == 217

   ③ 더해진 결과물을 11로 나누어 『나머지』를 구한다.
   	       19 → 몫
	    --------
	 11 | 217
	      11
		--------
		  107
		   99
		--------
		    8 → 나머지

	④ 11에서 나머지를 뺀 결과값을 구한다.

	   → 나머지가 0인 경우... 11
	   → 나머지가 1인 경우... 10

	   	  → 이를 다시 10으로 나누어 나머지를 구한다.

	⑤ ④ 의 연산 결과가 주민번호를 구성하는 마지막 숫자와
	   일치하는지 비교한다.

						일치
	   11 - 8 연산결과 3 == 주민번호 마지막 자리 3

	   ※ 마지막 숫자와 같은 경우 유효한 주민등록번호~!!!


*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 111111-22222222 → 입력 갯수 초과
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 111111-222222 → 입력 갯수 미달
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효한 주민번호
// >> 정확한 주민번호~!!!

// 주민번호 입력(xxxxxx-xxxxxxx) : 750616-1252086 → 유효하지 않은 주민번호
// >> 잘못된 주민번호~!!!
// 계속하려면 아무키나 누르세요...

// 배열.length			→ 배열의 길이(방의 갯수) 반환
// 문자열.length()		→ 문자열의 길이 반환

// 문자열.substring()	→ 문자열 추출

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class Test105
{
	public static void main(String[] args) throws IOException
	{
		/*
		// 테스트
		String strTemp = "김동현";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>> 9

		System.out.println("남산위의 저 소나무".length());
		//--==>> 10

		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(3,5));
		//					0123456789...
		// "문자열".substring(시작위치, 끝위치);
		// 시작위치 ~ 끝위치-1 까지의 문자열 반환

		System.out.println("여름이 끝나가니 졸려죽겠네".substring(3,5));
		//					0 1 2 34 5 6 ...

		// System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(3,51));
		//--==>> StringIndexOutOfBoundsException

		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(3));
		//--==>> DEFGHIJKLMNOPQRSTUVWXYZ
		*/

		String number, numbers;
		String[] strNums = new String[14];
		int[] nNums = new int[13];
		double result;
		int nalsu=0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		number = br.readLine();

		if (number.length()>14)
		{
			System.out.print(number);
			System.out.println(" → 입력 갯수 초과");
			return;
		}
		else if (number.length()<14)
		{
			System.out.print(number);
			System.out.println(" → 입력 갯수 미달");
			return;
		}

		numbers = number.substring(0,6) + number.substring(7,14);
		

		for (int i=0; i<numbers.length(); i++)
		{
			
			if (Integer.parseInt(numbers.substring(i,i+1))>=0 || Integer.parseInt(numbers.substring(i,i+1))<10)
			{
				strNums[i] = numbers.substring(i,i+1);
				nNums[i] = Integer.parseInt(strNums[i]);
			}
			else
			{
				return;
			}
			
			
		}

		



		for (int i=0, n=2; i<=11; i++, n++)
		{	
			if (n==10)
			{
				n=2;
			}
			nalsu += n*nNums[i];
			// test
			//System.out.print(nNums[i]);

		}

		int rest = 11 - (nalsu%11);
		System.out.println(rest);
		
		
		if (rest%10 == nNums[12])
		{
			System.out.printf("%14s → 유효한 주민번호\n", number);
		}
		else 
		{
			System.out.printf("%14s → 유효하지 않은 주민번호\n", number);
		}




		
	}
}


