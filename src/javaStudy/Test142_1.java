package src.javaStudy;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test142_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar cal = new GregorianCalendar();

		int y, m;
		int w;
		int i;

		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// 사용자로부터 입력받은 연(y), 월(m)을 이용하여
		// 달력의 날짜 세팅;
		cal.set(y, m-1, 1);
		//-- 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//	 입력값에서 1일 뺀 값으로 월을 설정해야 한다.
		//-- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.

		// 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);


		// 테스트
		// System.out.println(w);
		//--==>> 연도 입력 : 2019
		//		 월 입력   : 8
		//   	 5 → 2019년 8월 기준 → 목요일 → 2019년 8월 1일 → 목요일

		// 결과 출력 → 달력 그리기
		System.out.println();
		System.out.println("\t[ "+y+"년 "+m+"월 ]\n");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");
		for (i=1; i<w; i++)
			System.out.print("    ");

		// 테스트
		// System.out.printf("%4d", 1);

		// Calendar 클래스의 『getActualMaximum()』 메소드 check~!!!
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;		//-- 반복문을 수행하며 날짜가 증가할 때 마다
						//	 요일도 함께 증가할 수 있도록 처리
			cal.set(y, m-1, i);

			if (cal.get(Calendar.DAY_OF_WEEK)==1)	//-- 증가한 요일이 일요일이 될 때 마다 개행 후 출력
				System.out.println();	// 개행
		}

		if(w%7!=1)
			System.out.println();

		System.out.println("=============================");


	}
}