package practice.no1;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	//
	// Javaはmainメソッドを実行することでアプリケーションとして動作する
	//
	public static void main(String[] args) {
		///////////////////////////
		// 型について
		///////////////////////////

		// 型はプリミティブとクラスオブジェクトの2種類がある

		// プリミティブはそのまま値を設定すれば使える
		// int, long, double, byte等
		int number = 1;
		System.out.println("number : " + number);

		// クラスオブジェクトはインスタンス化が必要
		// インスタンス化するためにはコンストラクタを呼び出す
		Book book = new Book();

		// コンストラクタ呼び出し時に初期値を設定するのがセオリー
		Book jump = new Book("週刊誌", 300, 290);

		// Integer, Long, Doubleはプリミティブのラッパークラス
		// クラスオブジェクトだけど、autoboxingするのでプリミティブと互換性がある
		Integer num = 1;

		///////////////////////////
		// if文とloop文について
		///////////////////////////

		// if文は if(boolean) で出来る
		int count = 0;
		count++;
		if (count == 1) {
			//
		} else if (count == 2) {
			//
		} else {
			//
		}

		// forは普通のfor文、拡張for文、streamのfor文がある
		
		// 普通のfor文
		for(int i = 0; i < 10; i ++) {
			// これほとんど使わない
		}
		
		// Listはリストのinterfaceクラス、ArrayListは実装クラス
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		// 拡張for文
		for(String str : list) {
			// これめちゃよく使う
		}

		// streamのfor文
		list.forEach(v -> {
			// Java8以降だとほとんどこれ
		}); 
	}
}
