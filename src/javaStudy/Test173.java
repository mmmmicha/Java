package src.javaStudy;
/*========================================
  ■■■ 자바의 기본 입출력(I/O) ■■■
========================================*/

// OutputStream 실습

import java.io.OutputStream;
import java.io.IOException;

public class Test173
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : 자바의 표준 입력 스트림
		// System.out : 자바의 표준 출력 스트림
		OutputStream out = System.out;	// 내보내는 물줄기 수도꼭지 틀기

		// 배열 구성
		byte[] ch = new byte[3];
		ch[0] = 65;		// 'A'
		ch[1] = 97;		// 'a'
		ch[2] = 122;	// 'z'

		out.write(ch);	//-- 밖으로 내보낼 데이터(변수)를 스트림에 기록.(물줄기에 띄우기)

		out.flush();	//-- 기록된 스트림을 내보내는 기능을 수행.(물줄기를 쭉 밀어내는거) 버퍼가 있을 때 유용한놈
						//	 지금은 Buffer 를 활용하지 않고 있는 상황이기 때문에
						//	 생략이 가능한 코드.
						//	 (Buffered 되어 있는 Stream 일 경우 생략 불가)
		
		out.close();	//-- 수도꼭지 잠굼. 출력 스트림(물줄기)에 대한 리소스 반납
						//	 (out 스트림을 (수도꼭지를) 잠가버린 상황)

		System.out.println("절대적인 신뢰를 갖고 있는 구문~!!!");
		//-- 『out.close()』를 작성한 이후 출력되지 않는 구문
		//	 출력되는 스트림(물줄기)을 닫았기 때문에...



	}
}