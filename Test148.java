/*=====================================
  ■■■ 예외(Exception) 처리 ■■■
=====================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test148
{
	private String[] data = new String[3];

	public void proc()// throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n = 0;


		try
		{
			System.out.print("이름 입력[종료:Ctrl+z] : ");

			while((str = br.readLine()) != null)
			{
				data[n++] = str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}

			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace............");
			e.printStackTrace();
		}
		
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		

		System.out.println("입력된 내용...");
			for (String s : data )
			{
				if (s!=null)
				{
					System.out.println(s);
				}
			}
		
	
	}



	public static void main(String[] args)// throws IOException
	{
		Test148 ob = new Test148();
		ob.proc();
	}
}

/*
이름 입력[종료:Ctrl+z] : 홍길동
이름 입력[종료:Ctrl+z] : 이순신
이름 입력[종료:Ctrl+z] : 강감찬
이름 입력[종료:Ctrl+z] : 세종대왕
예외 발생~!!!
getMessage : 3
toString   : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace............
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test148.proc(Test148.java:27)
        at Test148.main(Test148.java:65)
입력된 내용...
홍길동
이순신
강감찬
계속하려면 아무 키나 누르십시오 . . .
*/