/*=======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// Set → HashSet, TreeSet
// - 순서 없음
// - 중복 허용하지 않는 구조(기본)


/*
○ HashSet<E> 클래스

   java.util.HashSet<E> 클래스는
   Set 인터페이스를 구현하는 클래스로
   순서의 개념이 아니라 집합의 개념으로 이해해야 하는 자료구조이다.
   이로 인해 데이터의 중복을 허용하지 않는다.
   또한, 동기화를 지원하지 않는다.


*/


import java.util.Set;
import java.util.HashSet;


public class Test168
{
	public static void main(String[] args)
	{
		//Set<String> ob = new Set<String>();

		// HashSet 자료구조 인스턴스 생성
		Set<String> dog = new HashSet<String>();

		// dog 라는 HashSet 자료구조에 요소 추가
		dog.add("요크셔테리어");
		dog.add("말티즈");
		dog.add("보더콜리");
		dog.add("비숑");
		dog.add("도베르만");

		System.out.print("기존 데이터 Set : ");
		for (String s : dog )
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 기존 데이터 Set : 요크셔테리어 도베르만 비숑 말티즈 보더콜리
		//-- 순서가 의미 없는 자료구조이기 때문에
		//	 데이터 입력 순서 → 자료구조의 요소 격납 순서와
		//	 상관없이 구성되어 있는 것을 확인

		// 데이터(요소) 추가
		dog.add("시추");
		dog.add("포메리안");
		dog.add("웰시코기");
		dog.add("웰시코기");
		dog.add("웰시코기");
		dog.add("웰시코기");
		dog.add("보더콜리");
		dog.add("보더콜리");
		dog.add("보더콜리");
		dog.add("보더콜리");
		dog.add("보더콜리");
		dog.add("시추");
		dog.add("웰시코기");
		dog.add("웰시코기");
		dog.add("웰시코기");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");
		dog.add("진돗개");

		System.out.print("추가 후 데이터 Set : ");
		for(String str : dog)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 추가 후 데이터 Set : 시추 진돗개 요크셔테리어 도베르만 비숑 말티즈 웰시코기 포메리안 보더콜리

		// ※ 데이터가 추가되는 순서와 상관없이 목록이 구성되어 있으며
		//	  같은 데이터가 여러번 반복되어 추가될 경우
		//	  하나만 유효한 데이터로 구성되어 있는 것을 확인할 수 있다.
		//	  (아무리 추가해도 한 번만 출력됨)

		// ※ 또한, 자료구조의 특성 상 중복 데이터를 허용하지 않는다고 해서
		//	  중복 데이터를 추가할 경우 오류가 발생하는 것은 아니다. -->> 중복해서 들어오는애들을 튕겨내는 것이 아니라 덮어쓰는 것임




	}
}