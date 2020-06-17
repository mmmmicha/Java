package src.javaStudy;
/*=======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// ○ 실습 문제
// Test162 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 1

   1번째 요소 입력 : 이성조
   1번째 요소 입력 성공~!!!
   요소 입력 계속(Y/N)? : y

   2번째 요소 입력 : 이예림
   2번째 요소 입력 성공~!!!
   요소 입력 계속(Y/N)? : n


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 2

   [벡터 전체 출력]
   	    이성조
		이예림
   벡터 전체 출력 완료~!!!


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 3

   검색할 요소 입력 : 이성조

   [검색 결과 출력]
   항목이 존재합니다.


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 4

   삭제할 요소 입력 : 이원정

   [검색 결과 출력]
   항목이 존재하지 않아 삭제할 수 없습니다.


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 4

   삭제할 요소 입력 : 이성조

   [삭제 결과 출력]
   이성조 항목이 삭제되었습니다.


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 5

   변경할 대상 입력 : 이성조

   [변경 결과 출력]
   변경할 대상이 존재하지 않습니다.


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 5

   변경할 대상 입력 : 이예림
   수정할 내용 입력 : 이은채

   [변경 결과 출력]
   변경이 완료되었습니다.


   [메뉴 선택]
   1. 요소 추가
   2. 요소 출력
   3. 요소 검색
   4. 요소 삭제
   5. 요소 변경
   6. 종료
   >> 메뉴 선택(1~6) : 6

   프로그램 종료
   계속하려면 아무 키나 누르세요...
   
*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus		//-- 완성 건들지 말 것.
{
	public static final int E_ADD	= 1;		//-- 요소 추가
	public static final int E_DISP	= 2;		//-- 요소 출력
	public static final int E_FIND	= 3;		//-- 요소 검색
	public static final int E_DEL	= 4;		//-- 요소 삭제
	public static final int E_CHA	= 5;		//-- 요소 변경
	public static final int E_EXIT	= 6;		//-- 종료
}

public class Test162
{
	// 주요 속성 구성 → 완성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- 선택 값
	private static String con;				//-- 계속 여부


	// static 초기화 블럭
    static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}


	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("\t[메뉴 선택]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		System.out.print("\t>> 메뉴 선택(1~6) : ");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
		sel = Integer.parseInt(br.readLine());

	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case Menus.E_ADD	: addElement();		break;
		case Menus.E_DISP	: dispElement();	break;
		case Menus.E_FIND	: findElement();	break;
		case Menus.E_DEL	: delElement();		break;
		case Menus.E_CHA	: chaElement();		break;
		case Menus.E_EXIT	: exit();
		default : try
		{
			break;
		}
		catch (Exception e)
		{
			System.out.println("숫자를 입력하라니깐요");
		}
		
		}
	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		
		
		do
		{
		   
		   
		   System.out.printf("\n\t%d번째 요소 입력 : ", vt.size()+1);
		   con = br.readLine();

		   if (vt.add(con)==true)
		   {
			   System.out.printf("\t%d번째 요소 입력 성공~!!!\n", vt.size());
		   }
		   else
		   {
			System.out.printf("\t%d번째 요소 입력 실패~!!!\n", vt.size());
		   }
		   System.out.print("\t요소 입력 계속(Y/N)? : ");
		   con = br.readLine();
		   
		}
		while (con.equals("y") || con.equals("Y"));

		System.out.println();
		System.out.println();
		   
	   
	   
	}

	// 요소 출력 메소드
	public static void dispElement()
	{
		
		System.out.println("\n\t[벡터 전체 출력]");
		for (Object str : vt)
		{
		   System.out.printf("\t%8s\n", ((String)str).toString());
		}
		System.out.println("\t벡터 전체 출력 완료~!!!");
		System.out.println();
		System.out.println();
	   
	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		
		System.out.print("\n\t검색할 요소 입력 : ");
		con = br.readLine();

		System.out.println("\n\t[검색 결과 출력]");
		if (vt.contains(con)==true)
		{
			System.out.println("\t항목이 존재합니다.");
		}
		else
		{
			System.out.println("\t항목이 존재하지 않습니다.");
		}
		System.out.println();
		System.out.println();

	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.print("\n\t삭제할 요소 입력 : ");
		con = br.readLine();

		System.out.println("\n\t[삭제 결과 출력]");
		if (vt.remove(con))
		{
			System.out.printf("\t%s 항목이 삭제되었습니다.\n", con);
		}
		else
		{
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		System.out.println();
		System.out.println();

	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{

		System.out.print("\n\t변경할 대상 입력 : ");
		con = br.readLine();

		if (vt.contains(con)==true)
		{
			int s = vt.indexOf(con);
			System.out.print("\t수정할 내용 입력 : ");
			con = br.readLine();
			vt.setElementAt(con, s);
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");
			
		}
		else
		{
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.");
		}
		System.out.println();
		System.out.println();
	}

	// 프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("\n\t프로그램 종료~!!!");
		System.exit(-1);
	}

	// main() 메소드 → 완성
	public static void main(String[] args) throws IOException
	{
		//menuDisp();
		
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		
		
	}//	end main()


}// end class Test162