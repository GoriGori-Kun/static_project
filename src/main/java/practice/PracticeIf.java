package practice;

public class PracticeIf {

	public static void practiceIf() {

		for (int i = 1; i <= 100; i++) { //ループ処理と初期設定 iは1, iは100以下, 1づづ加算
			
			//条件式
			if (i % 3 == 0 && i % 5 == 0) { //iが3と5で割れる時 （i%3==0は割った余りが0）
				System.out.println("FizzBuzz");
				
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
				
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
				
			} else {
				System.out.println(i);
				
			}
			
			
		}

	}

}
