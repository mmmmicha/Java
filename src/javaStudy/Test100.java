package src.javaStudy;
/*=================================================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
===================================================*/

// ※ 메소드 오버로딩이 가능한 형태와 불가능한 형태


public class Test100
{
	public static void main(String[] args)
	{
		print();
		print(10);
		print('A');

		double result = print(3.14);
		print(3.14);

	}

	public static void print()
	{		
	}

	public static void print(int i){}
	//public static void print(int j){}		//--(X)
	public static void print(char c){}		//-- ※ 자동 형 변환 규칙 check~!!!
											//		메소드를 정의 한 후 호출할 때 파라미터를 넣게되면 이미 판별 작업이 들어가서
											//		char와 int를 우선 구분하게 돼.
											//		이 때 'A'를 넣었지만 char를 다루는 메소드가 없으면, 순차적으로 int 메소드가
											//		받게 되는 것.
	public static void print(int i, int j){}
	public static double print(double d){return 10.0;}
	//public static void print(double e){}	//--(X)


	




}