package src.javaStudy;
/*=====================================
  ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// 다른 예외 다시 던지기

public class Test152
{
	public int getValue(int value) throws Exception // ⑦ 예외 던지기 (파란 폭탄 던지기) 
	{
		int a=0;
	
		try
		{
			a = getData(-2);	// ③ 예외 발생
								//	  (빨간 폭탄)
		}
		catch (Exception e)		// ④ 예외 잡아내기
		{						//    (빨간 폭탄
			

			// ⑤ 예외 처리 (빨간 폭탄)
			System.out.println("printStackTrace......");
			e.printStackTrace();
		

			// ⑥ 예외 발생 (파란 폭탄)
			throw new Exception("value 가 음수 입니다.");
		}
		

		return a;
	}

	public int getData(int data) throws Exception	// ② 예외 던지기
	{												// (빨간 폭탄 던지기)
		if(data<0)
			throw new Exception("data 가 0보다 작습니다.");		// ① 예외 발생
																// (빨간 폭탄)
		return data + 10;

	}





	public static void main(String[] args) 
	{
		Test152 ob = new Test152();

		try
		{
			int a = ob.getValue(-2);	// ⑧ 예외 발생 (파란 폭탄)
			
			System.out.println("a : " + a);
		}
		catch (Exception e)				// ⑨ 예외 잡아내기 (파란 폭탄)
		{
			// ⑩ 예외 처리 (파란 폭탄)
			System.out.println("printStackTrace........");
			e.printStackTrace();
		}


	}
}