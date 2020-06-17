package src.javaStudy;
/*========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
========================================*/

public class Test175
{
	public static void main(String[] args)
	{

		// System.out : 자바 기본 표준 출력 스트림 

		System.out.write(65);	//-- 'A'
		System.out.write(66);	//-- 'B'

		System.out.write(180);	//
		System.out.write(235);	//-- 180 + 235 → '대' 

		System.out.flush();
		//-- 출력 버퍼가 채워지지 않으면
		//	 출력할 데이터(자료)를 출력 디바이스(장치)로 보내지 않기 때문에
		//	 flush() 메소드를 통해서 아직 다 채워지지 않은 출력 버퍼의 내용을
		//	 출력 장치로 밀어내어 보낼 수 있도록 처리해야 한다.
		//	 (현재 구문에서는 생략 불가)
		
	}
}
// 실행 결과
/*
AB대계속하려면 아무 키나 누르십시오 . . .
*/