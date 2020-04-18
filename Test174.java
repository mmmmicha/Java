/*========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
========================================*/


import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;

public class Test174
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in		 : 자바 표준 입력 스트림 →바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림 → 문자 기반 스트림으로 변환
		//					   (번역기 역할 수행)
		// Reader			 : 문자 기반 스트림 객체

		// new BufferedReader(new InputStreamReader(System.in))
		//	문자기반		  --------------------- 바이트기반

		Reader rd = new InputStreamReader(System.in);

		System.out.println("문자열 입력(종료:Ctrl+z) : ");

		while((data = rd.read()) != -1)
			//		  --------문자기반으로 받는중
		{
			ch = (char)data;

			//System.out.print(ch);
			//--==>>
			/*
			문자열 입력(종료:Ctrl+z) :
			asdf
			asdf
			qwer
			qwer
			바보
			바보
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/

			System.out.write(ch);
			//--==>>
			/*
			문자열 입력(종료:Ctrl+z) :
			asdf
			asdf
			1234
			1234
			가나다라
			 섆|
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/


		}
	}
}