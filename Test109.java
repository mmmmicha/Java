/*=========================================
  ■■■ 정렬(sort) 알고리즘 ■■■
=========================================*/

/*******
쌍용 F반
정 광 현
********/

/*
○ 실습 과제
   사용자로부터 여러 학생의 성적 정보를 입력받아
   점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
   단, 배열과 원하는 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

   실행 예)
   인원 수 입력 : 5
   이름 점수 입력(1) : 황보영 90
   이름 점수 입력(2) : 한현수 80
   이름 점수 입력(3) : 최창훈 85
   이름 점수 입력(4) : 정민하 75
   이름 점수 입력(5) : 정광현 95

   -------------
   1등 정광현 95
   2등 황보영 90
   3등 최창훈 85
   4등 한현수 80
   5등 정민하 75
   -------------
   계속하려면 아무 키나 누르세요...
*/
import java.util.Scanner;

class Student	// 각 학생 한 명의 정보를 담을 클래스 생성
{
	String name;
	int score;

}// end class


public class Test109
{
	public static void main(String[] args)
	{
		int num;								//-- 사용자로부터 입력받을 인원 수에 대한 변수 선언
		Student[] stuInform;					//-- Student형의 배열 변수 선언

		boolean flag = true;					//-- 향상된 버블정렬을 실행하기 위한 tool
		
		

		Scanner sc = new Scanner(System.in);	//-- Scanner 인스턴스 생성

		do										//-- 인원 수 입력 시 양의 정수(1 이상) 외의
		{										//   숫자 입력 시 재 입력 필요	
			System.out.print("인원 수 입력 : ");
			num = sc.nextInt();
		}
		while (num<=1);

		stuInform = new Student[num+1];			//-- num+1 사이즈의 인스턴스 주소값 배열 
												//	 각각의 학생을 나타낼 num개와 temp용 1개(num+1)


		for (int i=0; i<num; i++)				//-- 각 학생들의 인스턴스를 본격적으로 생성한 후
		{										//	 각 인스턴스 변수에 학생들의 이름과 점수를 저장
			stuInform[i] = new Student();
			System.out.printf("이름 점수 입력(%2d) : ", i+1);
			stuInform[i].name = sc.next();
			stuInform[i].score = sc.nextInt();
			
			// 테스트 1
			// System.out.printf("%s, %d", stuInform[i].name, stuInform[i].score);
		}

		stuInform[num] = new Student();			//	 앞서 얘기한 temp용 인스턴스 배열 1개
// 선택 정렬 ==========================================================================================================
/*

		for (int i=0; i<num-1; i++)								//-- ① 선택 정렬	0 1 2 3 ... num-2
		{
			for (int j=i+1; j<num; j++)							//					  1 2 3 ... num-2 num-1
			{
				// 테스트
				// System.out.println(i+j);
				if (stuInform[i].score < stuInform[j].score)	//-- 학생들의 점수를 비교하여
				{												//	 '내림차순' 정렬을 위해 자리바꾸기.
					stuInform[num] = stuInform[j];				//	 temp용 인스턴스 배열을 사용하여 순서를 바꾼다.
					stuInform[j] = stuInform[i];
					stuInform[i] = stuInform[num];
				}
			}
		}
		*/
// 버블 정렬 =============================================================================================================
/*

		for (int i=1; i<num; i++)								//-- ② 버블 정렬	  1 2 3 ... num-1
		{
			for (int j=0; j<num-i; j++)							//					0 1 2 3 ... num-1		
			{
				if (stuInform[j].score < stuInform[j+1].score)	//-- 학생들의 점수를 비교하여
				{												//	 '내림차순' 정렬을 위해 자리바꾸기.
					stuInform[num] = stuInform[j];				//	 temp용 인스턴스 배열을 사용하여 순서를 바꾼다.
					stuInform[j] = stuInform[j+1];
					stuInform[j+1] = stuInform[num];
				}
			}
		}
		*/

// 향상된 버블 정렬 ========================================================================================================
		int n = 0;												//-- 루프 변수 선언 및 초기화

		do														//-- ③ 향상된 버블 정렬
		{														//		한번도 자리바꿈이 없을 경우 flag를 false로 바꿔 반복을
			n++;												//		빠져 나간다.
			for (int j=0; j<num-n; j++)							//-- 
			{
				if (stuInform[j].score < stuInform[j+1].score)	//-- 학생들의 점수를 비교하여
				{												//	 '내림차순' 정렬을 위해 자리바꾸기.
					stuInform[num] = stuInform[j];				//	 temp용 인스턴스 배열을 사용하여 순서를 바꾼다.
					stuInform[j] = stuInform[j+1];
					stuInform[j+1] = stuInform[num];
					continue;
				}
				flag = false;
				
			}
		}
		while (flag);
			
		


		System.out.println();
		System.out.println("-------------");
		for (int i=0; i<num; i++)
		{
			System.out.printf("%d등%4s%3d\n", i+1, stuInform[i].name, stuInform[i].score);
		}
		System.out.println("-------------");
		

		
	}
}

/*
인원 수 입력 : 5
이름 점수 입력( 1) : 정광현 88
이름 점수 입력( 2) : 아무개 44
이름 점수 입력( 3) : 홍기동 77
이름 점수 입력( 4) : 초상화 67
이름 점수 입력( 5) : 카카오 97

-------------
1등 카카오 97
2등 정광현 88
3등 홍기동 77
4등 초상화 67
5등 아무개 44
-------------
계속하려면 아무 키나 누르십시오 . . .
*/