package practice;

public class PracticeSwitch {

	public static void practiceSwitch() {
		
		int[] numberArray = {1, 2, 3, 4, 5, 1, 3, 5, 2, 4}; //10までの配列設定
		
		for (int i = 0; i < 10; i++) { //ループ
			
			int number = numberArray[i]; //変数にで配列データ代入
			
			switch (number) { //変数に対する処理
			
			case 1: 
				System.out.println("勇者");
				break; //処理から抜ける
				
			case 2:
				System.out.println("バトルマスター");
				break;
				
			case 3:
				System.out.println("パラディン");
				break;
				
			case 4:
				System.out.println("海賊");
				break;
				
			case 5:
				System.out.println("魔法剣士");
				break;
				
			}
		}

	}

}
