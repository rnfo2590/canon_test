package p01;

import java.util.Random;

public class Kurumi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();

		int num = rand.nextInt(3);

		switch (num) {
		case 0:
			System.out.println("プリン");
			break;
		case 1:
			System.out.println("チョコ");
			break;
		case 2:
			System.out.println("ケーキ");
			break;
		}

	}

}
