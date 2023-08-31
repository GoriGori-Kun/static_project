package practice;

public class PracticeForEach {

	public static void practiceForEach() {
		
		String nameList[] = { //stringはクラス, そこにデータを格納
				
				"前原", "美咲", "加布里", "一貴山", "深江",
				"大入", "福吉", "鹿家", "浜崎", "松原"
		};
		//拡張for文
		for (String employees : nameList) { //ループ処理 配列データを順番に取り出し
			
			System.out.println(employees);
		}
		

	}

}
