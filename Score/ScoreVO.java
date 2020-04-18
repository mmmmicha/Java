/*=========================
  ScoreVO.java
  - Value Object
    (사용자 정의 자료형으로 활용)
=========================*/

// ScoreImpl.java
// Score.java
// ScoreMain.java

public class ScoreVO
{
	// 주요 속성 구성
	private String name, hak, birth;			//-- 이름, 학번, 생일
	private int kor, eng, mat, tot;				//-- 국어점수, 영어점수, 수학점수, 총점

	public void ScoreVO(String hak, String name, String birth, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.birth = birth;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//this.tot = tot;
	}

	public void ScoreVO()
	{
		
	}

	// getter / setter 구성
	
	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}

	String getHak()
	{
		return hak;
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getBirth()
	{
		return birth;
	}

	void setBirth(String birth)
	{
		this.birth = birth;
	}

	int getKor()
	{
		return kor;
	}

	void setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}
	
	
	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}
	
	int getTot()
	{
		return tot;
	}

	void setTot(int tot)
	{
		this.tot = tot;
	}
	


}