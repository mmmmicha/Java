/*=========================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
===========================*/

// ○ 실습 문제
// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르세요...

// class Test112 과 비교~!!!

// superClass

import java.util.Scanner;
import java.io.IOException;

class AClass
{
	protected int x, y;
	protected char op;

	AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

// subClass → AClass 를 상속받는 클래스
class BClass extends AClass
{
	private double result;

	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
	}
	
	public void calc()
	{
		switch (op)
		{
		case '+': result = x + y; break;
		case '-': result = x - y; break;
		case '*': result = x * y; break;
		case '/': result = x / (double)y; break;
		default : return;
		}
		
		super.write(result);

	}

	
}

// main() 메소드를 포함하는 외부 클래스
public class Test112_1 
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		ob.input();

		ob.calc();
		
	}
}