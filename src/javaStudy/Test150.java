package src.javaStudy;
/*=====================================
  ■■■ 예외(Exception) 처리 ■■■
=====================================*/

// Test149.java 파일과 비교~!!!

// ※ throw

class Demo2
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if (value<=0)
		{
			// throws랑 다름!
			// br.readLine() 처럼 폭탄을 안고 있는 격
			throw new Exception("value 는 0 보다 작거나 같을 수 없습니다.");
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test150
{
	public static void main(String[] args) //hrows Exception
	{
		Demo2 ob = new Demo2();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}