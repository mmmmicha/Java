/*=======================================
  ■■■ 자바 기본 프로그래밍 ■■■
=======================================*/


public class Test002
{
	public static void main(String[] args)
	{
		// ※ println() 와 print()


		System.out.println("첫 번째 구문...");
		System.out.println("두 번째 구문...");

		System.out.print("세 번째 구문...\n");
		System.out.print("네 번째 구문...\n");

		//-- 『 println() 』 메소드와 『 print() 』 메소드의 차이는
		//   라인 스킵(줄바꿈) 유무에 있다.
		//-- 『\n』 : 개행문자 를 문자열에 포함하면 라인 스킵이 가능하다.

		System.out.println(7+7);
		System.out.println("7" + "7");


	}

}

/*
	--EditPlus 기본 설정---
	1. 그룹이름 : JAVA Program
	2. 추가 : JAVA Compile, JAVA Execute
	3. 각각 명령 : bin
	4. 인수 1. Compile - 파일이름, 디렉토리
			2. Execute - 확장자를 뺀 파일이름, 디렉토리

	5. 파일 에서 '저장시 백업 파일 생성' 체크 빼기
	6. 글꼴 '나눔고딕코딩' 으로 바꾸기
*/

/* 실행결과
	
	첫 번째 구문...
	두 번째 구문...
	세 번째 구문...
	네 번째 구문...
	14
	77

*/