/*===========================
  ■■■ 클래스와 인스턴스 ■■■
  - 정보은닉과 접근제어지시자
=============================*/
import java.util.Scanner;

class CircleTest2
{
	// 정보 은닉(imformation Hiding)
	// 멤버 변수, 인스턴스 변수, 전역 변수
	// 『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미.
	// int 형 변수 0 으로 초기화 지원.
	private int r;


	// private을 사용할 경우 이런 과정을 보편적으로 거침.
	// setter
	void setR(int r)
	{
		this.r = r;
	}

	// getter
	/*
	getR()
	{
		
	}
	*/

	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
	}
	
	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("반지름 : " + r);
		System.out.println("넓  이 : " + a);
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test094
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		CircleTest2 ob2 = new CircleTest2();

		//ob.input();

		//ob.r = 10000;	// ex) 커피자판기를 내가 열어서 관리자도 아닌데 커피통을 건드린 격
		/*
		System.out.println("ob.r : " + ob.r);

		double result = ob.calArea();

		ob.write(result);
		*/

		// 넓이 연산 결과를 담을 변수 선언
		double result;

		// 첫 번째 인스턴스(ob1)의 반지름을 10으로 초기화
		//ob1.r = 10;					//-- 에러 발생(컴파일 에러)
		//System.out.println(ob1.r);	//-- 에러 발생(컴파일 에러)
		// ※ 『private』변수는 외부에서 접근이 불가능하다.

		// 두 번째 인스턴스(ob2)의 반지름을 20으로 초기화
		ob2.setR(20);
		result = ob2.calArea();
		ob2.write(result);
		//--==>>
		/*
		반지름 : 20
		넓  이 : 1256.6368
		계속하려면 아무 키나 누르십시오 . . .
		*/

	}
}