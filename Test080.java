/*========================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
==========================*/

// ○ 실습 문제
// 임의의 숫자들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.
// 배열을 구성하는 임의의 숫자 = 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8
// 짝수 선택적 출력
// 4 2 6 8
// 3의 배수 선택적 출력
// 9 3 6
// 계속하려면 아무 키나 누르세요...

public class Test080
{
	public static void main(String[] args)
	{

		//int i;
		int[] nums = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		System.out.println("배열 요소 전체 출력");		

		for (int i=0; i<9/*nums.length*/; i++)				//-- 배열 전체 출력
			System.out.printf("%d  ", nums[i]);
		
		System.out.println("\n짝수 선택적 출력");
		for (int j=0; j<9; j++)							//-- 배열 짝수 출력
		{
			if (nums[j]%2!=0)
			{
				continue;		
			}
				System.out.printf("%d  ", nums[j]);	
				// System.out.print(nums[j] + " ");
		}

		System.out.println("\n3의 배수 선택적 출력");
		for (int k=0; k<9; k++)							//-- 배열 3의 배수 출력
		{
			if (nums[k]%3!=0)
			{
				continue;
			}
			System.out.printf("%d  ", nums[k]);
		}
		System.out.println();

		// System.out.println(nums);

		// ※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로느
		//	  배열에 담긴 데이터들을 출력할 수 없다.

		// ※ 배열 arr 의 길이 확인
		// arr.length

		//System.out.println("배열 nums 의 길이 : " + nums.length);
		//--==>> 배열 nums 의 길이 : 9

		
	}
}



// 실행 결과
/*

배열 요소 전체 출력
4  7  9  1  3  2  5  6  8
짝수 선택적 출력
4  2  6  8
3의 배수 선택적 출력
9  3  6
계속하려면 아무 키나 누르십시오 . . .

*/