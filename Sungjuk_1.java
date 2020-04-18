/*==========================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
============================================================*/

// 2. Sungjuk 클래스
//	  - 인원 수를 입력받아, 입력받은 인원 수 만큼
//	    이름, 국어점수, 영어점수, 수학점수를 입력받고
//	    총점과 평균을 산출하는 클래스로 설계할 것~!!!!
//	    * 속성 : 인원수, Record 형태의 배열
//	    * 기능 : 인원수 입력, 상세 데이터 입력(이,국,영,수), 총점/평균 연산, 결과 출력

import java.util.Scanner;
//import java.io.IOException;

class Sungjuk_1
{
	
	
	int n;				// 사용자로부터 인원 수를 입력받을 정수형 변수 선언;
	Record_1[] rd;		// 기록만을 위해 쓰인 클래스를 배열로 사용하기 위해서
						// 그 배열에만 적합한 변수를 선언
	

	void input()		// 사용자로부터 인원수를 입력받는 메소드 정의
	{
			Scanner sc = new Scanner(System.in);
						// Scanner 인스턴스 생성
		do				// 1~100 까지의 정수를 입력받기위해 조건 설정
		{
			System.out.print("인원 수 입력(1~100) : ");
			n = sc.nextInt();	// 정수 입력 받기
		}
		while (n<1 || n>100);
		//System.out.print(n);
	}// end input();


	
	void detail() // 사용자로부터 이름과 각 점수를 입력받는 메소드 정의
	{
		Scanner sc = new Scanner(System.in);
		rd = new Record_1[n];	// ***매우중요*** 배열자체를 완성한 것이 아니라	
								// 배열의 틀을 만들어 놓은 것. 
		

		for (int i=0; i<n; i++)
		{
			rd[i] = new Record_1();	// 본격적으로 만들어 놓은 틀에 인스턴스를 개별적으로 생성하여 넣은 과정

			System.out.printf("%d번째 학생의 이름 입력 : ", i+1);
			rd[i].name = sc.next();
			System.out.print("국어 점수 : ");
			rd[i].nKor = sc.nextInt();
			System.out.print("영어 점수 : ");
			rd[i].nEng = sc.nextInt();
			System.out.print("수학 점수 : ");
			rd[i].nMath = sc.nextInt();
		} 
		
	}// end detail()

	void calculate()	// 받은 점수들의 합계/평균/석차 를 구하는 메소드 정의
	{
		
		
		for (int i=0; i<n; i++)
		{
			rd[i].tot = rd[i].nKor + rd[i].nEng + rd[i].nMath;	// 점수들의 합계

			rd[i].avg = rd[i].tot/(double)3;					// 점수들의 평균

		}
		
		
		for (int j=0; j<n; j++)									// 합계로 석차를 구하는 알고리즘		
		{	
			rd[j].temp = rd[j].tot;								// 일시적으로 합계를 다른 배열에 담기
		}
			

		for (int i=1; i<n; i++)
		{
			for (int j=1; j<n; j++)
			{
				if (rd[j-1].temp < rd[j].temp)					// 옮긴 배열을 큰 순서로 정렬하기
				{
					rd[j-1].temp ^= rd[j].temp;
					rd[j].temp ^= rd[j-1].temp;
					rd[j-1].temp ^= rd[j].temp;
				}
			}
			
		}


		for (int i=0; i<n; i++)									// 제일 큰 값부터 같은 수들을 순서 매겨서
		{														// 해당 인스턴스의 grade 에 채워주기
			for (int j=0; j<n; j++)
			{
				if (rd[i].temp==rd[j].tot)
				{
					rd[j].grade = i+1;
				}
			
			}
		}
		
		
	}// end calculate()

	void print()
	{
		
		for (int i=0; i<n; i++)									// 최종 출력메소드 정의
		{
			System.out.printf("%3s %3d %3d %3d %3d %5.2f %d\n",rd[i].name, rd[i].nKor, rd[i].nEng, rd[i].nMath, rd[i].tot, rd[i].avg, rd[i].grade);
		}
		
	}// end print()
	

}