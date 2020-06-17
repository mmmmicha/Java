package src.javaStudy;
/*======================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 생성자(constructor)와 초기화 블럭(Initialized Block)
========================================================*/



public class Test078
{
	int n=20;	// 이건 됨.
	int m;

//	n=20;	// 선언해둔채로 이렇게 대입하는것 안돼.
//	m=40;	// class 전역환경에선 직접 연산이 안돼


	// 초기화 블럭(Initialized Block)
	{
		n=20;
		m=40;	// 이건 됨!!
		System.out.println("초기화 블럭 실행...");
	}

	// 문법적으로 초기화 블럭 보다 생성자의 중요도가 훨씬 높다!!
	// 고로 초기화 블럭이 클래스 내 어디에 위치하던 생성자가 더 늦게 작용한다.
	// 인스턴스 생성 시에 항상 호출 됨.
	

	// 생성자(Constructor)
	
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}


	// 생성자(Constructor)
	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");
	}
	

	// 출력 메소드 정의
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}


	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		
		Test078 ob2 = new Test078(1234, 2345);
		ob2.write();
	}
}

// 실행 결과
/*
초기화 블럭 실행...
생성자 실행...
n : 100, m : 200
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n : 1234, m : 2345
계속하려면 아무 키나 누르십시오 . . .

*/