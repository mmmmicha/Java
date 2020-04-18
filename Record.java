/*==========================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
============================================================*/

// 1. Record 클래스
//	  - 속성만 존재하는 클래스로 설계할 것~!!!

public class Record
{
	// 학생 1명을 표현할 수 있는 속성들로 구성 check~!!!

	String name;
	int[] score = new int[3]; // int kor, eng, mat;
	int tot;
	double avg;
	int rank;				  // 석차 check~!!!


	/*	
	private String name;
	private int[] score = new int[3]; // int kor, eng, mat;
	private int tot;
	private double avg;
	private int rank;

	// getter
	public String getName()
	{
		return name;
	}

	// setter
	public void setName(String name)
	{
		this.name = name;
	}
	*/
	
}