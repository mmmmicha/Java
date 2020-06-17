package src.javaStudy;
/*=======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// Set → HashSet, TreeSet
// - 순서 없음
// - 중복 허용하지 않는 구조(기본)


/*
○ TreeSet<E> 클래스

   java.util.TreeSet<E> 클래스는
   Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
   데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.


*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

// VO   → Value Object
// DTO  → Data Transfer Object
// 실무에서는 이 둘을 거의 같은 의미로 써

// DAO  → Data Access Object

class GradeVO //or GradeDTO
{
	// 주요 속성 구성
	private String hak;				//-- 학번
	private String name;			//-- 이름
	private int kor, eng, mat;		//-- 국어점수, 영어점수, 수학점수

	// 생성자(사용자 정의 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 생성자(사용자 정의 생성자 → 매개변수 없는 생성자)
	GradeVO()
	{
	}


	// getter / setter 구성
	public String getHak()
	{
		return hak;
	}

	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}

	public void setMat(int mat)
	{
		this.mat = mat;
	}

	// 추가 메소드 정의 (총점)
	int getTot()
	{
		return kor + eng + mat;
	}


}


class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준
		/*
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		*/
		//	   1911013						   1911025
		//	   -12
		// return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		// 이 경우엔 내림차순으로 정렬됨.

		// 총점 기준
		//return s1.getTot() - s2.getTot();
		//return s2.getTot() - s1.getTot();

		// 이름 기준(오름차순)
		//return s1.getName().compareTo(s2.getName());

		// 이름 기준(내림차순)
		return s2.getName().compareTo(s1.getName());

	}
}



public class Test169
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set에 요소 추가 → add()
		set.add("원피스");
		set.add("포켓몬스터");
		set.add("겨울왕국");
		set.add("톰과제리");
		set.add("원펀맨");
		set.add("라이온킹");
		set.add("짱구는못말려");
		set.add("알라딘");
		set.add("라푼젤");
		set.add("세일러문");
		set.add("나루토");
		set.add("명탐정코난");
		
		// Iterator 를 활용한 set 요소 전체 출력

		Iterator<String> it = set.iterator();

		System.out.print("전체 출력 : ");
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		//--==>> 전체 출력 : 겨울왕국 나루토 라이온킹 라푼젤 명탐정코난 세일러문 알라딘 원펀맨 원피스 짱구는못말려 톰과제리 포켓몬스터

		
		// TreeSet 구조의 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();

		// TreeSet 자료구조 인스턴스 다시 생성
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());




		set2.add(new GradeVO("1911013", "정광현", 50, 60, 70));
		set2.add(new GradeVO("1911025", "정민하", 91, 83, 76));
		set2.add(new GradeVO("1911032", "최창훈", 58, 36, 81));
		set2.add(new GradeVO("1911041", "한현수", 62, 48, 78));
		set2.add(new GradeVO("1911053", "황보영", 82, 68, 90));
		/*
		Iterator<GradeVO> gr = set2.iterator();

		
		System.out.print("전체 출력 : ");
		while(gr.hasNext())
			System.out.print(gr.next() + " ");
		System.out.println();
		*/
		
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
					    , vo.getHak(), vo.getName()
						, vo.getKor(), vo.getEng(), vo.getMat()
						, vo.getTot());
		}
		System.out.println();
		/*
		1911013     정광현   50   60   70    180
		1911025     정민하   91   83   76    250
		1911032     최창훈   58   36   81    175
		1911041     한현수   62   48   78    188
		1911053     황보영   82   68   90    240

		계속하려면 아무 키나 누르십시오 . . .

		1911032     최창훈   58   36   81    175
		1911013     정광현   50   60   70    180
		1911041     한현수   62   48   78    188
		1911053     황보영   82   68   90    240
		1911025     정민하   91   83   76    250


		1911025     정민하   91   83   76    250
		1911053     황보영   82   68   90    240
		1911041     한현수   62   48   78    188
		1911013     정광현   50   60   70    180
		1911032     최창훈   58   36   81    175

		계속하려면 아무 키나 누르십시오 . . .
		*/






	}
}