/*=====================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - return
=======================================================*/

// ※ return 키워드가 지니는 두 가지 의미
//	  1. 메소드 종료
//	  2. 값의 반환

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s;

		System.out.print("임의의 정수 입력(10이상) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return;
		}

		s=0;
		for (int i=1; i<=n; i++)
			s+=i;

		System.out.println("결과 : " + s);

	}
}

/*
임의의 정수 입력(10이상) : 5
10 이상의 정수를 입력해야 합니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(10이상) : 10
결과 : 55
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(10이상) : 15
결과 : 120
계속하려면 아무 키나 누르십시오 . . .
*/