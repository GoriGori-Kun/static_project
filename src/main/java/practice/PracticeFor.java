package practice;

public class PracticeFor {

	public static void practiceFor() {

		int sum = 0; // 総和の初期値を0に設定

		for (int i = 1; i <= 100; i++) { // iは1に設定, iは100以下に設定, 1づつ加算

			sum += i; // sum + iの値を加算
		}

		System.out.println("1から100までの整数を足した総和：" + sum);
		// forループした結果の総和を表示
	}

}
