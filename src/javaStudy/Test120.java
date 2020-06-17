package src.javaStudy;
/*===========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
===========================*/

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 1911110 이은채
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 1910112 김소원
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

//1911110  이은채  90 100  85     275  91
//                 수  수  우
// 1910112 김소원	85	70 65		220		73
//					우  미 양

// 계속하려면 아무 키나 누르세요...

// 속성만 존재하는 클래스 → 자료형 활용

import java.util.Scanner;

class Record1
{
	String hak, name;	//-- 학번, 이름
	int kor, eng, mat;	//-- 국어, 영어, 수학 점수
	int tot, avg;		//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk1
{
	public void set();
	public void input();
	public void print();
}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl implements Sungjuk1
{
	int n;
	Record1[] rec;
	String[][] recgrade;
	int[][] score;
	
	String[] grade = {"가", "양", "미", "우", "수"};
	
	
	
	
	

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		rec = new Record1[n];
		score = new int[n][3];
		recgrade = new String[n][3];
		
		
		

		for (int i=0; i<n; i++)
		{
			rec[i] = new Record1();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();
			// System.out.println(0);

			System.out.print("국어 영어 수학 점수 입력    (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			//System.out.println(rec[i].kor);
			score[i][0] = rec[i].kor;
			//System.out.println(score[i][0]);

			rec[i].eng = sc.nextInt();
			score[i][1] = rec[i].eng;

			rec[i].mat = sc.nextInt();
			score[i][2] = rec[i].mat;

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
			
			for (int j=0; j<3; j++)
			{
				switch (score[i][j]/10)
				{
				case 9 : recgrade[i][j] = grade[4]; break;
				case 8 : recgrade[i][j] = grade[3]; break;
				case 7 : recgrade[i][j] = grade[2]; break;
				case 6 : recgrade[i][j] = grade[1]; break;
				default : recgrade[i][j] = grade[0];
				}
			
			}
					

		}
	}

	@Override
	public void print()
	{
		for (int i=0; i<n; i++)
		{
			System.out.printf("%7s %3s%3d%3d%3d  %3d  %2d\n",rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%16s%2s%2s\n",recgrade[i][0], recgrade[i][1], recgrade[i][2]);

		}
	}
}

// main() 메소드를 포함하고 있는 외부 클래스
public class Test120
{
	
	public static void main(String[] args)
	{
		SungjukImpl ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
		
	}
}