package src.javaStudy;
/*=====================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - break
=======================================================*/

// ○ 실습 문제
// 아래와 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 100 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력 : -10
// 임의의 정수 입력 : 0
// 입의의 정수 입력 : 2019
// 임의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까?(Y/N) : y or Y
// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까?(Y/N) : n
// 계속하려면 아무 키나 누르세요...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException		//-- br.readLine() 및 System.in.read() 메소드를 사용하기 위한 tool
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;						//-- 사용자로부터 입력받을 정수 변수 선언
		int	j, sum;					//-- 루프변수와 누적합 변수 선언 
		char inp;					//-- 'y' or 'n' 를 입력받을 문자 변수 선언

		
			for (; ; )		// 무한 loop
			{
				System.out.print("임의의 정수 입력 : ");
				n=Integer.parseInt(br.readLine());	//-- 사용자로부터 정수 입력 받기

				if (1<=n && n<=100)					//-- 1 ~ 100 사이의 정수 뽑아내기
				{
					sum = 0;						//-- 초기화 시점 매우 중요!!!!!!
					for (j=1;j<=n ;j++ )			//-- 1 ~ n 까지의 정수의 총합 구하기
					{
						sum += j;
					}
					System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, sum);	//-- 총합 출력
					System.out.print("계속하시겠습니까?(Y/N) : ");				//-- 사용자에게 프로그램 지속 실행여부 질문
					inp = (char)System.in.read();	//-- 'y' or 'n' 입력 받기	
					System.in.skip(2);				//-- 순수 문자 하나만 받기 위한 tool
					
					if (inp=='n' || inp=='N')		//-- 일반적으로 코딩하는 사람들끼리는 부정의 의미를 가진 결정은 아무키나 눌러도 되게끔 만들고
													//   yes 만을 정해놓는다
					{
						break;						//-- 감싸고 있는 루프를 벗어남
					}			
					else if (inp=='y' || inp=='Y')
					{
						System.out.println();		//-- 공출력 후 다시 임의의 정수를 입력 받을 수 있도록 함
					}
					else
					{
						System.out.println("y 또는 n을 눌러주십쇼.");
						break;
					}
						
				}


			}

// 선생님 ===========================================================================================================================
/*
	
	while (true)
	{
	
		do
		{
			System.out.print("\n임의의 정수 입력 : ");
			n = Integer.parserInt(br.readLine());
		}
		while (n<1 || n>100);

		s = 0;

		for (i=1; i<=n; i++)
		{
			s += i;
		}

		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);

		System.out.print("계속하시겠습니까?(Y/N) : ");
		ch = (char)System.in.read();

		// 엔터값(\r\n) 처리 check~!!!
		System.in.skip(2);

		if (ch!='Y' && ch!='y')		// 그만할래 의사표현 == (ch=='Y' || ch=='y')	// 논리 연산자 check~!!!!
		{
			// 반복문(while)을 빠져나갈 수 있는 코드 작성 필요
			//-- 위와 같은 의사표현을 했다면
			//	 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
			break;
			//-- 멈춘다. (+ 그리고 빠져나간다.) check~!!!
		}




	}//end while

	

*/
	}//end main
}

/*
임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .
*/