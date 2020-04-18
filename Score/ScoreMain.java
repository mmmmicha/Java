/*======================================
  ScoreMain.java
  - main() 메소드가 포함된 구동 클래스
======================================*/

// ScoreVO.java
// Score.java
// ScoreImpl.java

// 1. 추가, 2. 수정, 3. 삭제
// 4. 전체 출력, 5. 학번검색 6. 이름검색
// 7. 종료

// [Score 어플리케이션]
// 1. 추가, 2. 수정, 3. 삭제
// 4. 전체 출력, 5. 학번검색 6. 이름검색
// 7. 종료
// (1~7) 번호 선택 : 

public class ScoreMain
{
	public static void main(String[] args)
	{
		ScoreImpl sim = new ScoreImpl();
		do
		{
			sim.menu();
		}
		while (true);
	}
}