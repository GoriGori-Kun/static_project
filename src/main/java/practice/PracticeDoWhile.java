package practice;

public class PracticeDoWhile {

	public static void practiceDoWhile() {
		
		int number = 100; //初期値を100に設定
		
		do { //numberの値を表示して、その後1減算する
			System.out.println(number);
			
			number--;
		}
		while (number >= 0); //上の条件が正しければnumberが0以上の場合繰り返し
		
	}
	
}
