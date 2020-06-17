package src.javaStudy;
/*=======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
  - 컬렉션(Collection)
  - JCF (Java Collection Framework)
=======================================================*/

// Map → Hashtable, HashMap
// - java.util.Map 인터페이스는
//	 키(key)를 값(value)에 매핑(mapping)하며
//	 동일한 키를 등록할 수 없고, 유일해야 하며,
//	 각 키는 한 개의 값만을 매핑해야 한다.
//	 즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.


/*
○ Hashtable<K, V> 클래스

   - 해시테이블 구조를 객체 모델링한 클래스로
     검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

   - 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
     구분된 데이터 구조이다.

   - 데이터를 저장하고, 검색하기 위해서 키로 접근하며
     이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

   - 또한, Hashtable 클래스는 key 또는 value 의 값으로 ** null 을 허용하지 않는다. **
*/

import java.util.Hashtable;

public class Test170
{
	private static final String[] names
		= {"박종호", "박지혜", "박혜민", "백호진", "성열원", "안준헌"};

	private static final String[] tels
		= {"010-2856-2817", "010-6777-7252", "010-4133-5973"
			, "010-5094-2478", "010-6275-3859", "010-7350-8649"};




	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht 라는 Hashtable 자료구조에 배열(names, tels)에 담겨있는
		// 데이터를 요소로 담아내기
		// → put(k, v)
		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}

		// ht 라는 해시테이블의 값을... key 를 이용하여 검색
		// →get(k)
		String findName1 = "박혜민";
		String str = ht.get(findName1);			// get(키) → 값
		if(str != null)
		{
			System.out.println(findName1 + " 전화번호 : " + str);
		}
		System.out.println();
		//--==>> 박혜민 전화번호 : 010-4133-5973

		// ht 라는 해시테이블 자료구조에... key 가 존재하는지의 여부 확인
		// → containsKey()
		String findName2 = "이원정";
		if (ht.containsKey(findName2))
			System.out.println(findName2 + " 데이터가 존재합니다.");
		else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 이원정 데이터가 존재하지 않습니다.

		String findName3 = "성열원";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " 데이터가 존재합니다.");
		}
		else
		{
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		}
		System.out.println();
		//--==>> 성열원 데이터가 존재합니다.


		// ht 라는 해시테이블 자료구조에... value 가 존재하는지의 여부 확인
		// → contains()
		String findTel1 = "010-6777-7252";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		else
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-6777-7252 데이터가 존재합니다.


		// ht 라는 해시테이블 자료구조에서
		// 『박지혜』 데이터 삭제
		// → remove()
		ht.remove("박지혜");
		//-- 『remove()』 메소드의 인자값으로 key를 넘겨주게 되지만
		//	 이 때, key 만 삭제되는 것이 아니다.
		//	 이 key 와 매핑되어 있는 value 도 함께 remove() 된다.

		// 삭제(remove()) 이후 key 가 존재하는지 확인
		if (ht.containsKey("박지혜"))
			System.out.println("박지혜" + " 데이터가 존재합니다.");
		else
			System.out.println("박지혜" + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> "010-6777-7252"


		// 삭제(remove()) 이후 value 가 존재하는지 확인
		if (ht.contains("010-6777-7252"))
			System.out.println("010-6777-7252" + " 데이터가 존재합니다.");
		else
			System.out.println("010-6777-7252" + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-6777-7252 데이터가 존재하지 않습니다.


		// null 입력 시도
		//ht.put(null, null);				//-- key, value 모두 null	→ 런타임 에러
		//ht.put("오지은", null);			//-- value 가 null			→ 런타임 에러
		//ht.put(null, "010-9015-1428");	//-- key 가 null			→ 런타임 에러

		// 중복된 key 값 입력 → 해당 key 를 가진 value 에 덮어쓰기	
		ht.put("박종호", "010-1111-1111");
		System.out.println(ht.get("박종호"));
		System.out.println();
		//--==>> 010-1111-1111
		//-- 기존 "010-2856-2817" 에서 "010-1111-1111"로 변경되었음을 확인
		//	 (덮어쓰기)

		// 중복된 value 입력 → 기존 데이터에 아무런 영향을 미치지 않음
		ht.put("이성조", "010-6275-3859");
		System.out.println(ht.get("성열원"));
		System.out.println(ht.get("이성조"));
		System.out.println();
		//--==>> 010-6275-3859
		//		 010-6275-3859













	}
}