/*========================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
==========================*/

// ○ 실습 문제
// 『char』자료형의 배열을 만들어
// 그 배열의 각 방에 알파벳 대문자를 채우고
// 채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다.
// 단, 채우는 구문과 출력하는 구문을 분리하여 처리한다.

// 실행 예)
// A B C D E F G ... W X Y Z
// 계속하려면 아무 키나 누르세요...

public class Test081
{
	public static void main(String[] args)
	{
		char[] alp = new char[26];
		
		/*
		for (int i=0; i<alp.length; i++)
		{
			int z = i+65;
			alp[i] = (char)z;		
		}
		*/

		for (int i=0, ch=65; i<alp.length; i++, ch++)
		{
			alp[i] = (char)ch;		
		}

		/*
		for (int i=0; i<=25; i++)
		{
			int z = i+65;
			alp[i] = (char)z;		
		}
		*/

		/*
		for (int i=65; i<=90; i++)
		{
			int z = i-65;
			alp[z] = (char)i;
		}
		*/

		for (int i=0; i<alp.length; i++)		
			System.out.printf("%c ", alp[i]);

		System.out.println();
		
	}
}

// 실행 결과

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/