package src.javaStudy;
/*=================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
===================================*/

// ○ 실습 문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위 2:바위 3:보 중 입력(1~3) : 4
// 1:가위 2:바위 3:보 중 입력(1~3) : -2
// 1:가위 2:바위 3:보 중 입력(1~3) : 2
// - 유저	: 바위
// - 컴퓨터 : 보
// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나 누르세요...

import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	int user;
	int com;

	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3);				// 0 1 2 → 1 2 3	
	}

	public void input()
	{
		runCom();		// detail.. 사용자와 컴퓨터가 동시에 내는 상황을 연출하기 위해

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위  2:바위  3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	
	}

	public void middleCalc()
	{
		String[] str = {"가위","바위","보"};
	
		System.out.println("- 유저   : " + str[user-1]);	// 1 2 3 → 0 1 2
		System.out.println("- 컴퓨터 : " + str[com-1]);		// 1 2 3 → 0 1 2
	}

	public String resultCalc()
	{
		String result = "무승부";

		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "당신이 승리했습니다~!!!";
		}
		else if ((user==1 && com==2)||(user==2 && com==3)||(user==3 && com==1))
		{
			result = "컴퓨터가 승리했습니다~!!!";
		}

		return result;
	}

	public void print(String result)
	{
		System.out.printf(">> 승부 최종 결과 : %s\n", result);
	}


}


public class Test098
{
	public static void main(String[] args)
	{

		RpsGame ob = new RpsGame();
		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
		
	}
}

/*
1:가위  2:바위  3:보 중 입력(1~3) : 2
- 유저   : 바위
- 컴퓨터 : 바위
>> 승부 최종 결과 : 무승부
계속하려면 아무 키나 누르십시오 . . .
*/