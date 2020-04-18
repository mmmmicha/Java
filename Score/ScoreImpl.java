/*======================================
  ScoreImpl.java
  - Score 인터페이스를 구현하는 클래스
======================================*/

// ScoreVO.java
// Score.java
// ScoreMain.java
import java.util.TreeMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Iterator;


public class ScoreImpl implements Score
{
	static int sel = 0;
	static String temp = "";
	static String con = "";
	static int tempN = 0;
	static int i = 0;


	static final int MENU_INSERT = 1;
	static final int MENU_UPDATE = 2;
	static final int MENU_DELETE = 3;
	static final int MENU_LISTALL = 4;
	static final int MENU_SEARCHHAK = 5;
	static final int MENU_SEARCHNAME = 6;
	static final int MENU_EXIT = 7;

	Map<String, ScoreVO> mp = new TreeMap<String, ScoreVO>();


	public void menu()
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\t[Score 어플리케이션]");
		System.out.println("=======================");
		System.out.println("1. 추가");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체출력");
		System.out.println("5. 학번검색");
		System.out.println("6. 이름검색");
		System.out.println("7. 종료");
		System.out.println("=======================");
		System.out.print(">> (1~7) 번호 선택 : ");

		try
		{
			sel = Integer.parseInt(br.readLine());
			switch (sel)
			{
			case MENU_INSERT: insert(); break;
			case MENU_UPDATE: update(); break;
			case MENU_DELETE: delete(); break;
			case MENU_LISTALL: listAll(); break;
			case MENU_SEARCHHAK: searchHak(); break;
			case MENU_SEARCHNAME: searchName(); break;
			case MENU_EXIT: exit();

			
			}
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}// end menu()



	public void exit()
	{
		System.exit(-1);
	}// end exit()


	@Override
	public void insert()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 3;
		ScoreVO[] sc = new ScoreVO[n];

		
		System.out.println("\n\t[1. 추가]");
		
		
		do
		{
			try
			{

				
				sc[i] = new ScoreVO();
				System.out.print(">> 학번을 입력해주세요 : ");
				temp = br.readLine();
				sc[i].setHak(temp);

				if (mp.containsKey(temp) == true)
				{
					System.out.println("이미 존재하는 학번입니다.");
					System.out.println();
					System.out.println();
					return;
				}
				
				System.out.print(">> 이름을 입력해주세요 : ");
				temp = br.readLine();
				sc[i].setName(temp);

				System.out.print(">> 생년월일을 입력해주세요 : ");
				temp = br.readLine();
				sc[i].setBirth(temp);

				System.out.print(">> 국어점수를 입력해주세요 : ");
				tempN = Integer.parseInt(br.readLine());
				sc[i].setKor(tempN);

				System.out.print(">> 영어점수를 입력해주세요 : ");
				tempN = Integer.parseInt(br.readLine());
				sc[i].setEng(tempN);

				System.out.print(">> 수학점수를 입력해주세요 : ");
				tempN = Integer.parseInt(br.readLine());
				sc[i].setMat(tempN);

				sc[i].setTot(sc[i].getKor() + sc[i].getEng() + sc[i].getMat());

				mp.put(sc[i].getHak(), sc[i]);

				
				

				i++;

				if (mp.size() == i)
				{
					System.out.println("정상적으로 입력되었습니다.");
				}
				else
				{
					System.out.println("문제가 있습니다.");
				}
	
				
				
				/*
				for (String str : tempArr)
				{
					System.out.print(str + " ");
				}
				*/
				
				//mp.put(tempArr[0], new ScoreVO());
				
				
				System.out.print("\n계속해서 입력하시겠습니까?(Y/N) : ");
				con = br.readLine();
				System.out.println();
				System.out.println();
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}

			
		}
		while (con.equals("y") || con.equals("Y"));
		
		




	}
	
	@Override
	public void update()
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("\n\t[2. 수정]");
		System.out.print("수정할 데이터의 학번을 입력하세요. : ");

		try
		{
			temp = br.readLine();

			if (!mp.containsKey(temp))
			{
				System.out.println("수정할 데이터의 학번이 존재하지 않습니다.");
				System.out.println();
				System.out.println();
				return;
			}

			
			
			System.out.println("\n\n===========");
			System.out.println("1. 학번");
			System.out.println("2. 이름");
			System.out.println("3. 생년월일");
			System.out.println("4. 국어점수");
			System.out.println("5. 영어점수");
			System.out.println("6. 수학점수");
			System.out.println("===========");
			System.out.print(">> (1~6) 선택 : ");

			sel = Integer.parseInt(br.readLine());

			switch (sel)
			{
			case 1: 
				{
					System.out.print("변경할 내용을 입력해주세요. : ");
					con = br.readLine();
					mp.get(temp).setHak(con);
					break;
				}

			case 2:
				{
					System.out.print("변경할 내용을 입력해주세요. : ");
					con = br.readLine();
					mp.get(temp).setName(con);
					break;
				}
			case 3:
				{
					System.out.print("변경할 내용을 입력해주세요. : ");
					con = br.readLine();
					mp.get(temp).setBirth(con);
					break;
				}
			case 4:
				{
					System.out.print("변경할 내용을 입력해주세요. : ");
					sel = Integer.parseInt(br.readLine());
					mp.get(temp).setKor(sel);
					mp.get(temp).setTot(mp.get(temp).getKor() + mp.get(temp).getEng() + mp.get(temp).getMat());
					break;
				}
			case 5:
				{
					System.out.print("변경할 내용을 입력해주세요. : ");
					sel = Integer.parseInt(br.readLine());
					mp.get(temp).setEng(sel);
					mp.get(temp).setTot(mp.get(temp).getKor() + mp.get(temp).getEng() + mp.get(temp).getMat());
					break;
				}
			case 6:
				{
					System.out.print("변경할 내용을 입력해주세요. : ");
					sel = Integer.parseInt(br.readLine());
					mp.get(temp).setMat(sel);
					mp.get(temp).setTot(mp.get(temp).getKor() + mp.get(temp).getEng() + mp.get(temp).getMat());
					break;
				}
			
			}

		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

		System.out.println();
		System.out.println();
		
		
	}


	@Override
	public void delete()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n\t[3. 삭제]");
		System.out.print("삭제할 데이터의 학번을 입력하세요. : ");

		try
		{
			temp = br.readLine();

			if (!mp.containsKey(temp))
			{
				System.out.println("삭제할 데이터의 학번이 존재하지 않습니다.");
				System.out.println();
				System.out.println();
				return;
			}

			mp.remove(temp);
			if (mp.containsKey(temp))
			{
				System.out.println("삭제되지 않았습니다.");
			}
			else
			{
				System.out.println("정상적으로 삭제되었습니다.");
			}

			System.out.println();
			System.out.println();

		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}


	}

	@Override
	public void listAll()
	{
		
		System.out.println("\n\t[4. 전체출력]");
		System.out.println("===============================================");

		Iterator<String> it = mp.keySet().iterator();
		

		while(it.hasNext())
		{
			String str = it.next();
			System.out.printf("%7s %7s %7s %4d %4d %4d %4d\n", str, mp.get(str).getName(), mp.get(str).getBirth(), mp.get(str).getKor(), mp.get(str).getEng(), mp.get(str).getMat(), mp.get(str).getTot());
		}
		System.out.println("===============================================");
		System.out.println();
		System.out.println();
	}

	@Override
	public void searchHak()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n\t[5. 학번검색]");
		System.out.print("학번을 입력하세요. : ");

		//mp.subMap(mp.firstKey(), mp.lastKey());

		try
		{
			temp = br.readLine();

			if (!mp.containsKey(temp))
			{
				System.out.println("학번이 존재하지 않습니다.");
				System.out.println();
				System.out.println();
				return;
			}
			else if (mp.containsKey(temp))
			{
				Iterator<String> it = mp.keySet().iterator();
		
				System.out.println("===============================================");
				while(it.hasNext())
				{
					String str = it.next();
					System.out.printf("%7s %7s %7s %4d %4d %4d %4d\n", str, mp.get(str).getName(), mp.get(str).getBirth(), mp.get(str).getKor(), mp.get(str).getEng(), mp.get(str).getMat(), mp.get(str).getTot());
				}
				System.out.println("===============================================");
				System.out.println();
				System.out.println();
				System.out.println("학번이 존재합니다.");
			}


			System.out.println();
			System.out.println();

		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}

	}

	@Override
	public void searchName()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n\t[6. 이름검색]");
		System.out.print("이름을 입력하세요. : ");

		Iterator<String> it = mp.keySet().iterator();

		try
		{
			temp = br.readLine();
			while (it.hasNext())
			{
				String str = it.next();
				if (mp.get(str).getName().equals(temp))
				{
					System.out.printf("%3s 라는 이름이 존재합니다.", mp.get(str).getName());
					System.out.println();
					System.out.println();
					return;
				}
			}
			System.out.println("이름이 존재하지 않습니다.");
			System.out.println();
			System.out.println();
			
			

		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			
		}

	}

}