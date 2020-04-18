/*=========================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
===========================*/

/*
○ 메소드 오버라이딩(Method Overriding)의 특징

   - 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
   - 반드시 상속 관계가 있어야 한다.
   - 재정의된 하위 클래스의 메소드 접근제어지시자는
     상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
     예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』 인 경우
     하위 클래스가 이 메소드를 오버라이딩(Overriding) 하는 경우
     접근제어지시자는 『protected』 또는 『public』이어야 한다.
   - 『static』, 『final』, 『private』 메소드는 오버라이딩(Overriding)할 수 없다.
   // ex) 유리벽에 보관된 차, 튜닝할수없는 차, 그냥 건드리지도 못하는 차
   - Exception 의 '추가' 가 불가능하다.
     즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에
     새로운 Exception 을 추가하는 것은 불가능하다는 것이다.
*/

// 상위 클래스, 부모 클래스, Super class
class SuperTest113
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 하위 클래스, 자식 클래스, Sub class
class SubTest113 extends SuperTest113
{
	protected int b = 100;	//-- check~!!!

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//	 → private 변수이기 때문에...
		System.out.println("Sub print() 메소드 : " + b + " : " + c);

		System.out.println("Sub print() 메소드 : " + super.b);

		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + super.c);
		System.out.println("Sub print() 메소드 : " + this.c);
		//-- 슈퍼 클래스에서 선언된 변수 c 에 접근하는데에는
		//	 아무런 제약과 제한이 없다.
	}
	
	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//	 → private 변수이기 때문에...
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}
}

public class Test113
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest113) 인스턴스 생성
		SubTest113 ob = new SubTest113();

		ob.print();
		//--==>> Sub print() 메소드 : 100 : 20

		ob.write();
		//--==>> Sub write() 메소드 : 100 : 20

		//-------------------------------------------------------------
		System.out.println("------------------------------------------ 구분선");

		((SuperTest113)ob).write();		// 부모타입으로의 형변환???				//-- check~!!!

		System.out.println(ob.b);
		//--==>> 100

		// System.out.println(((super)ob).b); 여기서는 부모가 아니기때문에 super는 main()이 포함된 클래스의 부모야
		System.out.println(((SuperTest113)ob).b);	// (SuperTest113)ob.b 이거랑 옆에꺼랑 다른거야!!	//-- check~!!!
		//--==>> 10
		//System.out.println((SuperTest113)ob.b);	-->> 에러 발생!!

		// ※ 슈퍼 부름	→ 업캐스팅을 통해서 구현되는 문법

		// 메소드와 변수를 꼭 구분하여 정리할 것~!!!
		// 메소드는 '덮어쓰기', 변수는 아니야!!





	}
}