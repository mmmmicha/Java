import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	private int[] num = new int[6];

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();

		int cnt =0;

		int n;

		jump:

		while(cnt<6)					// 0	1	2
		{
			n = rd.nextInt(45) +1;		// 10	7	10
			for (int i=0; i<cnt; i++)
			{
				if (num[i]==n)
					continue jump;
			}
			num[cnt++] = n;				// num[0] = 10;
										// num[1] = 7;
		}

		// 정렬 메소드 호출
		sorting();
		
	}

	// 정렬 메소드
	public void sorting()
	{
		Arrays.sort(num);
	}
}

public class Test145_1
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i=1; i<=5; i++)
		{
			lotto.start();
		
			// 결과 출력
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}
}

/*
   3  11  13  17  36  41
   1  12  15  21  34  40
   9  17  23  29  32  43
  20  21  32  41  44  45
   5  14  18  19  28  39
계속하려면 아무 키나 누르십시오 . . .
*/