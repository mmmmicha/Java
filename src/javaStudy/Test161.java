package src.javaStudy;
/*=======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용 → 자료형

// 사용자 정의 클래스 설계 → 자료형처럼 활용
import java.util.Vector;

class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;		//-- 이름
	private int age;			//-- 연령

	// getXxx() → getter
	// setXxx() → setter

	// getter / setter 구성
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자 (매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// 생성자 (매개변수 없는 생성자) →	default 생성자 형태의 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}


public class Test161
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 인스턴스 생성
		Vector<MyData> v = new Vector<MyData>();

		//MyData md[];
		int n=0;
		MyData[] md;

		// 벡터 자료구조 v 에 
		// 박혜민 26세 / 백호진 73세 / 성열원 91세
		// 담아내기

		// ①
		/*
		MyData st1 = new MyData();
		st1.setName("박혜민");
		st1.setAge(26);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("백호진");
		st2.setAge(73);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("성열원");
		st3.setAge(91);
		v.add(st3);
		*/

		// ②
		/*
		MyData st1 = new MyData("박혜민", 26);
		v.add(st1);
		MyData st2 = new MyData("백호진", 73);
		v.add(st2);
		MyData st3 = new MyData("성열원", 91);
		v.add(st3);
		*/

		// ③
		
		v.add(new MyData("박혜민", 26));
		v.add(new MyData("백호진", 73));
		v.add(new MyData("성열원", 91));
		

		// 벡터 자료구조 v 에 담인 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름:박혜민, 나이:26세
		// 이름:백호진, 나이:73세
		// 이름:성열원, 나이:91세

		// ①
		
		for (MyData obj : v )
		{
			System.out.printf("이름:%s, 나이:%d세%n", obj.getName(), obj.getAge());
		}
		System.out.println();
		/*
		이름:박혜민, 나이:26세
		이름:백호진, 나이:73세
		이름:성열원, 나이:91세

		계속하려면 아무 키나 누르십시오 . . .
		*/
		// ②
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름:%s, 나이:%d세%n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}
		System.out.println();
		/*
		이름:박혜민, 나이:26세
		이름:백호진, 나이:73세
		이름:성열원, 나이:91세
		*/
		
		// ③
		for (Object temp : v )
		{
			System.out.printf("이름:%s, 나이:%d세%n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		}

		/*
		이름:박혜민, 나이:26세
		이름:백호진, 나이:73세
		이름:성열원, 나이:91세
		*/
////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		MyData md1 = new MyData();
		MyData md2 = new MyData();
		MyData md3 = new MyData();
		
		md1.setName("박혜민");
		md1.setAge(26);
		md2.setName("백호진");
		md2.setAge(91);
		md3.setName("성열원");
		md3.setAge(73);
		v.insertElementAt(md1, 0);
		v.insertElementAt(md2, 1);
		v.insertElementAt(md3, 2);

		System.out.println(v);
		*/

		/*
		md = new MyData[n];

		for (int i=0; i<=2; i++)
		{
			md[i] = new MyData();
		}

		md[0].setName("박혜민");
		md[0].setAge(26);
		md[1].setName("백호진");
		md[1].setAge(91);
		md[2].setName("성열원");
		md[2].setAge(73);
		v.insertElementAt(md[0], 0);
		v.insertElementAt(md[1], 1);
		v.insertElementAt(md[2], 2);
		*/
		String[] str = {"박혜민", "백호진", "성열원"};
		int[] ag = {26, 91, 73};

		md = new MyData[n];
/*
		for (int i=0; i<=2; i++)
		{
			md[i] = new MyData();
			v.insertElementAt(md[i], i);
			v.get(i).setName(str[i]);
			v.get(i).setAge(ag[i]);
		}

*/		
		
	}
}