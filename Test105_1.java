import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test105_1
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 클래스 기반 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받은 주민번호(문자열 형태)
		String str;

		// 곱해지는 수 → 배열 형태로 구성
		int[] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//						---	check~!!!

		// 곱셈 연산 후 누적합
		int tot = 0;

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력오류~!!!");
			return;	//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		// 테스트
		// System.out.println(">> 자릿수 적합");

		// ex) 750615-1262085
		for (int i=0; i<13; i++)
		{
			if (i==6)
			{
				continue;	// 뒷부분(line 42) 무시하고... 계속해라
			}

			tot += chk[i] * Integer.parseInt(str.substring(i,i+1));
			//		2 → chk[0] * 7 → (0,1)
			//		3 → chk[1] * 5 → (1,2)
			//					:


		}

		//-- 여기까지 수행하면 ①과 ②를 모두 끝낸 상황이며
		//	 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//	 변수 tot 에 담겨있는 상황이 된다.

		int su = 11 - tot % 11;

		// 테스트
		// System.out.println(su);

		// 최종 결과 출력 이전에 추가 연산 필요~!!!
		//-- su 에 대한 연산 결과가 두 자리로 나올 경우
		//	 주민 번호 마지막 자리의 숫자와 비교할 수 없는 상황
		su = su % 10;		// su %= 10;

		//-- 여기까지 수행하면 ③과 ④를 모두 끝낸 상황이며
		//	 최종 연산 결과는 변수 su 에 담겨있는 상황이 된다.

		// 최종 결과 출력
		if (su == Integer.parseInt(str.substring(13)))
			System.out.println(">> 정확한 주민번호~!!!");
		else
			System.out.println(">> 잘못된 주민번호~!!!");




	}
}