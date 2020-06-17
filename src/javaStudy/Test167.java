package src.javaStudy;
/*=======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test167
{
	public static void main(String[] args)
	{
		List<String> list1 = new ArrayList<String>();

		list1.add("서울");
		list1.add("부산");
		list1.add("인천");
		list1.add("대구");
		list1.add("광주");
		list1.add("대전");
		list1.add("울산");
		list1.add("세종");

		System.out.println(list1);
		//--==>> [서울, 부산, 인천, 대구, 광주, 대전, 울산, 세종]

		List<String> list2 = new ArrayList<String>();

		list2.add("강원");
		list2.add("경기");
		list2.add("충청");
		list2.add("경상");
		list2.add("전라");
		list2.add("제주");

		// list2 에 list1 의 모든 데이터 추가
		list2.addAll(list1);
		System.out.println("추가 후 : " + list2);
		//--==>> 추가 후 : [강원, 경기, 충청, 경상, 전라, 제주, 서울, 부산, 인천, 대구, 광주, 대전, 울산, 세종]

		// list1(List) → String[]
		String[] ss = list2.toArray(new String[list2.size()]);
		System.out.println("리스트를 배열로 반환 ... ");
		for(String str : ss)
			System.out.print(str + " ");
		System.out.println();
		//--==>>
		/*
		리스트를 배열로 반환 ...
		강원 경기 충청 경상 전라 제주 서울 부산 인천 대구 광주 대전 울산 세종
		*/

		List<String> list3 = new ArrayList<String>(Arrays.asList(ss));
		System.out.println("배열을 리스트로 변환 ... ");

		for (String s : list3 )
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>>
		/*
		배열을 리스트로 변환 ...
		강원 경기 충청 경상 전라 제주 서울 부산 인천 대구 광주 대전 울산 세종
		*/

		// 정렬
		Collections.sort(list1);
		System.out.println("정렬 후 : " + list1);
		//--==>> 정렬 후 : [광주, 대구, 대전, 부산, 서울, 세종, 울산, 인천]

		// 역순 정렬
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("역순정렬 후 : " + list1);
		//--==>> 역순정렬 후 : [인천, 울산, 세종, 서울, 부산, 대전, 대구, 광주]

		// subList(int fromIndex, int, toIndex)
		//-- fromIndex ~ toIndex-1 의 리스트를 반환한다.
		List<String> sList = list1.subList(2, 4);
		System.out.println("추출 데이터 : " + sList);
		//--==>> 추출 데이터 : [세종, 서울]
		// 인덱스 2 ~ 3 의 리스트

		// [인천, 울산, 세종, 서울, 부산, 대전, 대구, 광주] 대상 데이터 중
		//  세종, 서울, 부산 삭제
		list1.subList(2, 5).clear();
		System.out.println("삭제 후 : " + list1);
		//--==>> [인천, 울산, 대전, 대구, 광주]

		// list1 전체 삭제
		list1.clear();
		System.out.println("삭제 후 요소의 갯수 : " + list1.size());
		//--==>> 삭제 후 요소의 갯수 : 0




	}
}