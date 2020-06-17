package src.javaStudy;
/*===============================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(constructor)
  ===============================*/

class NumberTest2
{
	int num;

	/*
	NumberTest2()
	{
		
	}
	*/

	// 사용자 정의 생성자
	NumberTest2(int n)
	{
		num = n;
		System.out.println("생성자 호출 시 인자 전달 : " + n);
	}

	int getNum()
	{
		return num;
	}
}

// main() 메소드를 포함하고 있는 외부 클래스
public class Test075
{
	public static void main(String[] args)
	{
		// NumberTest2() 클래스 기반의 인스턴스 생성
		// NumberTest2 nt = new NumberTest2();	//--==>> 컴파일 에러 발생
		//-- NumberTest2 클래스에는
		//	 사용자 정의 생성자가 존재하고 있는 상황이기 때문에
		//	 『default 생성자』 가 자동으로 삽입되지 않으며,
		//	 사용자 정의 생성자는 매개변수를 갖는 형태이기 때문에
		//	 위와 같이 매개변수 없는 생성자 호출 시 문제가 발생하는 것이다.

		NumberTest2 nt1 = new NumberTest2(10);
		//--==>> 생성자 호출 시 인자 전달 : 10

		System.out.println("메소드 반환 값 : " + nt1.getNum());
		//--==>> 메소드 반환 값 : 10

		NumberTest2 nt2 = new NumberTest2(3259);
		//--==>> 생성자 호출 시 인자 전달 : 3259

		System.out.println("메소드 반환 값 : " + nt2.getNum());
		//--==>> 메소드 반환 값 : 3259
		
	}
}