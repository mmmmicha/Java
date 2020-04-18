/*=============================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : BufferedReader 클래스

=================================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 김종범
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ===[결과]===
// 이름 : 김종범
// 총점 : 240
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strName;									//-- 이름 변수
		int nKorean, nEnglish, nMath, nSum;				//-- 국어, 영어, 수학 점수 및 합계 변수

		// 추가 변수 선언
		String strTemp;									//-- 문자열 데이터 임시 저장 변수


		// 처리 및 연산
		// - 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print(" 이름을 입력하세요 : ");
		strName = br.readLine();

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		System.out.print(" 국어 점수 입력 : ");
		//korean = Integer.parseInt(br.readLine());
		
		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();
		nKorean = Integer.parseInt(strTemp);


		System.out.print(" 영어 점수 입력 : ");
		nEnglish = Integer.parseInt(br.readLine());

		System.out.print(" 수학 점수 입력 : ");
		nMath = Integer.parseInt(br.readLine());
		
		// - 각 점수 변수에 담겨있는 데이터(입력 데이터)들을
		//	 종합하여 총점 산출하고
		//	 그 결과를 총점 변수에 담아내기

		nSum = nKorean + nEnglish + nMath;



		// 결과 출력
		//System.out.println();								// 다른 개행 방법
		System.out.println("\n ====[결과]==== ");			// 『\n』 개행
		System.out.printf(" 이름 : %s\n " ,strName);
		System.out.printf("총점 : %d\n " ,nSum);



	}
}

// 실행 결과
/*

 이름을 입력하세요 : 정광현
 국어 점수 입력 : 80
 영어 점수 입력 : 80
 수학 점수 입력 : 80

 ====[결과]====
 이름 : 정광현
 총점 : 240
 계속하려면 아무 키나 누르십시오 . . .

*/
