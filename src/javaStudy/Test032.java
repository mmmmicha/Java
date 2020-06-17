package src.javaStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());


		/*
		if (n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else if (n==0)
		{
			System.out.println(n + " → 영");
		}
		else
		{
			System.out.println(n + " → 홀수");
		}
		*/


		/*
		if (n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else if (n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else
		{
			System.out.println(n + " → 영");
		}
		*/

		if (n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else if (n==0)
		{
			System.out.println(n + " → 영");
		}
		else if (n%2==0)
		{
			System.out.println(n + " → 짝수");
		}
		else
		{
			System.out.println("확인요망!!");
		}

	}
}

// ※ 조건문을 구성할 때에는 항상 조건의 구성 순서에 유의해야 한다.
// ※ 조건문 구성 과정에서 이외의 영역(else) 을
//	  업무에 포함된 내용으로 처리하는 것은 바람직하지 않다.
//	  불가능한 경우는 어쩔 수 없더라도
//	  가급적이면 업무에 포함되지 않은 내용을
//	  이외의 영역(else)에서 처리할 수 있도록 하자.