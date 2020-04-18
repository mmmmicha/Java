/*===============================
  ■■■ 클래스와 인스턴스 ■■■
  ===============================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 1 부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 작성한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
// 입력 데이터가 1 보다 작거나 1000 보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1002
// 임의의 정수 입력(1~1000) : -20
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...

// class name : Hap

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	// 주요 변수 선언(사용자의 입력값을 담아둘 변수)
	int n;

	// 정수 입력 → 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);
	}


	// 정수의 합 → 메소드 정의
	int sum()
	{	
		int result=0, a=0;
		while (a<n)	// for를 사용했으면 더 깔끔
		{	
			a++;
			result += a;			
		}	
		return result;
	}

	// 값 출력 → 메소드 정의
	void print(int tot)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, tot);
	}
}

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		
		// Hap class 의 인스턴스 생성
		Hap hp = new Hap();
		
		hp.input();	// 여기서 IOException이 작동하면 main에 던져지게 돼 → main에서도 밖으로 던져야 해

		int s = hp.sum();

		hp.print(s);
		
		
		
		
	}// end main
}// end class Test072

// 실행 결과

/*
임의의 정수 입력(1~1000) : 0
임의의 정수 입력(1~1000) : 0
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : -40
임의의 정수 입력(1~1000) : 5555
임의의 정수 입력(1~1000) : 6666
임의의 정수 입력(1~1000) : 50
>> 1 ~ 50 까지의 합 : 1275
계속하려면 아무 키나 누르십시오 . . .
*/