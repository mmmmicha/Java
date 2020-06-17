package src.javaStudy;
/*===========================================
  ■■■ 메소드 재귀호출 (재귀 메소드) ■■■
=============================================*/


public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	public static void showHi(int cnt)	// 3
	{
		System.out.println("Hi~ ");
		
		
		if (cnt==1)
			return;

		showHi(--cnt);

		

		
		
	}
}


// 실행 결과

/*
Hi~
Hi~
Hi~
계속하려면 아무 키나 누르십시오 . . .
*/