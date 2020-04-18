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


// class Test112_1 과 비교~!!!

// superClass


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");	// "20 15"
		String temp = br.readLine();
		String[] str = temp.split("\\s");	//-- 구분자 → 공백
		// ※ 문자열.split("구분자");		// 참고) 문자열.substring(), 문자열.length()
		// ex) "10 20 30 40".split("\\s"); → {"10", "20", "30", "40"} 반환
		//--> String[] str = {"20", "15"};
		
		if(str.length != 2)
			return false;
		//-- false(거짓)을 반환하며 input() 메소드 종료
		// ※ 이 조건문을 수행할 경우...
		//	  아래 코드들이 남아있는 상황이지만
		//	  결과값을 반환하며 메소드는 종료된다.

		x = Integer.parseInt(str[0]);	// super.x == this.x == x
		y = Integer.parseInt(str[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

/*
		if(op!='+' && op!='-' && op!='*' && op!='/')
			return false;

		return true;
*/
	
		if(op=='+' || op=='-' || op=='*' || op=='/')
			return true;

		return false;


	}// end input()

	double calc()
	{
		double result = 0;

		switch (op)
		{
		case '+': result = x + y; break;
		case '-': result = x - y; break;
		case '*': result = x * y; break;
		case '/': result = (double)x / y; break;
		
		}
		return result;
	}
	
	
	
}

// main() 메소드를 포함하는 외부 클래스
public class Test112
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);

	}
}

// 실행 결과

/*
임의의 두 정수 입력(공백 구분) : 10 7
연산자 입력(+ - * /) : /
>> 10 / 7 = 1.43
계속하려면 아무 키나 누르십시오 . . .

임의의 두 정수 입력(공백 구분) : 10 7
연산자 입력(+ - * /) : -
>> 10 - 7 = 3.00
계속하려면 아무 키나 누르십시오 . . .
*/