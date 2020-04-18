/*====================
  ■■■ 배열 ■■■
  - 배열의 복사
====================*/

// ※ 배열 변수의 복사는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.
//	  주소값 복사 → 얕은 복사 → 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법.
//					 (배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)
//	  데이터 복사 → 깊은 복사 → 실제 요소로 들어있는 값에 대한 복사로
//								  원본을 수정하더라도 복사본에 영향을 미치지 않는 복사 방법.

// Test101.java 파일과 비교~!!!

// 데이터 복사
//-- int형 배열에 대한 깊은 의미의 복사를 처리하는
//	 메소드를 정의하는 형태로 실습을 진행한다.

public class Test102
{
	public static void main(String[] args)
	{
		int[] nums = {10,20,30,40,50};		//-- 배열 원본

		int[] copys1 = nums;				//-- 얕은 의미의 배열 복사 수행
											//	 (주소값 복사)

		int[] copys2 = copyArray(nums);		//-- 깊은 의미의 배열 복사 수행
											//	 (사용자 정의 메소드 호출)

		int[] copys3 = nums.clone();		//-- 깊은 의미의 배열 복사 수행
											//	 (자바 제공 → 배열.clone() 메소드)


		// 원본 배열 요소의 수정 발생~!!!
		nums[1] = 2;


		// 결과 확인
		System.out.println(nums[1]);
		System.out.println(copys1[1]);
		System.out.println(copys2[1]);
		System.out.println(copys3[1]);
	}

	public static int[] copyArray(int[] os)
	{
		// 매개변수로 넘겨받은 배열(os)
		// 즉, 원본 배열 만큼의 배열방(메모리 공간)을 확보한
		// 복사할 배열방을 생성하겠다.
		int[] temp = new int[os.length];



		// 각각의 원본 배열(os)에 담겨있는 요소들을 복사 배열(temp)에 담아내기
		for (int i=0; i<os.length; i++)
		{
			temp[i] = os[i];
		}
		// 복사한 배열(temp) 반환
		return temp;





	}







}