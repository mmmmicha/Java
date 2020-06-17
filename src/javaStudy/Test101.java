package src.javaStudy;
/*====================
  ■■■ 배열 ■■■
  - 배열의 복사
====================*/

// ※ 배열 변수의 복사는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
//	  주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
//					 (배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)
//	  데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//								  원본을 수정하더라도 복사본에 영향을 미치지 않는 복사 방법.

// Test102.java 파일과 비교~!!!

// reference 변수 == 참조 변수

// 주소값 복사


public class Test101
{
	public static void main(String[] args)
	{
		int[] nums = {10,20,30,40,50};		//-- 배열 원본
		int[] copys;						//-- 복사본으로 만들 배열

		int temp;							//-- 실습 진행(테스트)을 위한 임시 변수

		// check~!!!
		copys = nums;						//-- 복사~!!!

		temp = nums[0];						// temp ← 10

		nums[0] = 1500;						// 1500 20 30 40 50

		for (int i=0; i<copys.length; i++)
		{
			System.out.printf("%d\t", copys[i]);
		}
		System.out.println();

		System.out.println("temp : " + temp);
	}
}