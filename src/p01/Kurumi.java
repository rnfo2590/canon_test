package p01;

import java.util.Random;

public class Kurumi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand3 = new Random();

		int num3 = rand3.nextInt(4);

		switch (num3) {
		case 0:
			System.out.print("りの");
			break;
		case 1:
			System.out.print("かほ");
			break;
		case 2:
			System.out.print("けんた");
			break;
		case 3:
			System.out.print("くるみ");
			break;
		}

		System.out.print("は");

		Random rand2 = new Random();

		int num2 = rand2.nextInt(3);

		switch (num2) {
		case 0:
			System.out.print("ラーメン");
			break;
		case 1:
			System.out.print("カレー");
			break;
		case 2:
			System.out.print("ハンバーグ");
			break;
		}

		System.out.print("屋に行き、");

		Random rand = new Random();

		int num = rand.nextInt(3);

		switch (num) {
		case 0:
			System.out.print("チョコ");
			break;
		case 1:
			System.out.print("プリン");
			break;
		case 2:
			System.out.print("ケーキ");
			break;
		}

		System.out.println("を買って帰った");
	}

}
